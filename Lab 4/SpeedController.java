public class SpeedController {
    public void checkSpeed(int speed) {
        if (speed > 100) {
            throw new ArithmeticException("Speed limit exceeded!");
        } else {
            System.out.println("Speed is normal.");
        }
    }

    public static void main(String[] args) {
        SpeedController controller = new SpeedController();

        try {
            controller.checkSpeed(80); 
            controller.checkSpeed(120);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
