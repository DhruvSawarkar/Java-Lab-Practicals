import java.util.LinkedList;
import java.util.Queue;

class OrderCounter {
    private final Queue<String> orders = new LinkedList<>();
    private final int capacity;
    private boolean open = true;

    public OrderCounter(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void placeOrder(String order) throws InterruptedException {
        while (orders.size() == capacity) {
            System.out.println("Chef waiting... Counter is full.");
            wait();
        }
        orders.add(order);
        System.out.println("Chef placed order: " + order);
        notifyAll();
    }

    public synchronized String serveOrder() throws InterruptedException {
        while (orders.isEmpty() && open) {
            System.out.println("Waiter waiting... No orders to serve.");
            wait();
        }
        if (!open && orders.isEmpty()) return null;
        String order = orders.poll();
        System.out.println("Waiter served order: " + order);
        notifyAll();
        return order;
    }

    public synchronized void closeCounter() {
        open = false;
        notifyAll();
    }
}

class Chef implements Runnable {
    private final OrderCounter counter;
    private final int maxOrders;

    public Chef(OrderCounter counter, int maxOrders) {
        this.counter = counter;
        this.maxOrders = maxOrders;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= maxOrders; i++) {
                String order = "Order#" + i;
                counter.placeOrder(order);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Chef interrupted.");
        } finally {
            System.out.println("Chef finished all orders.");
            counter.closeCounter();
        }
    }
}

class Waiter implements Runnable {
    private final OrderCounter counter;

    public Waiter(OrderCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String order = counter.serveOrder();
                if (order == null) break;
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Waiter interrupted.");
        } finally {
            System.out.println("Waiter done for the day.");
        }
    }
}

public class RestaurantSimulation {
    public static void main(String[] args) {
        OrderCounter counter = new OrderCounter(5);
        Thread chefThread = new Thread(new Chef(counter, 20));
        Thread waiterThread = new Thread(new Waiter(counter));
        chefThread.start();
        waiterThread.start();
        try {
            chefThread.join();
            waiterThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Restaurant closed after 20 orders.");
    }
}
