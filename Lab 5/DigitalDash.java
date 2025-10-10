import java.util.Random;

class RunnerThread extends Thread {
    private String name;

    public RunnerThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int distance = 10; distance <= 100; distance += 10) {
            System.out.println("Runner " + name + ": " + distance + "m" + (distance == 100 ? " - Finished!" : ""));
            try {
                Thread.sleep(rand.nextInt(151) + 50);
            } catch (InterruptedException e) {
                System.out.println("Runner " + name + " was interrupted.");
            }
        }
    }
}

class RunnerRunnable implements Runnable {
    private String name;

    public RunnerRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int distance = 10; distance <= 100; distance += 10) {
            System.out.println("Runner " + name + ": " + distance + "m" + (distance == 100 ? " - Finished!" : ""));
            try {
                Thread.sleep(rand.nextInt(151) + 50);
            } catch (InterruptedException e) {
                System.out.println("Runner " + name + " was interrupted.");
            }
        }
    }
}

public class DigitalDash {
    public static void main(String[] args) {

        RunnerThread runner1 = new RunnerThread("Bolt");

        Thread runner2 = new Thread(new RunnerRunnable("Flash"));
        Thread runner3 = new Thread(new RunnerRunnable("Zoom"));

        runner1.start();
        runner2.start();
        runner3.start();
    }
}