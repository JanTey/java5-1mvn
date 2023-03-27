public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long expected = 499;
        long actual = service.calculate(16_666, true);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 500;
        actual = service.calculate(16_667, true);
        System.out.println("2. " + expected + " == ? == " + actual);

        expected = 499;
        actual = service.calculate(49_999, false);
        System.out.println("3. " + expected + " == ? == " + actual);

        expected = 500;
        actual = service.calculate(50_000, false);
        System.out.println("4. " + expected + " == ? == " + actual);

        expected = 500;
        actual = service.calculate(50_001, false);
        System.out.println("5. " + expected + " == ? == " + actual);

        expected = 500;
        actual = service.calculate(500_000, false);
        System.out.println("6. " + expected + " == ? == " + actual);

    }

}
