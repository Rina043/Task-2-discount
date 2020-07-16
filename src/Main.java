public class Main {
    public static void main(String[] args) {
        int current = 200;
        int transfer = 1800;
        int coefficient = 100;
        int bound = 1000;
        int bonus;
        if (transfer > bound) {
            bonus = transfer / coefficient;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
    }
}