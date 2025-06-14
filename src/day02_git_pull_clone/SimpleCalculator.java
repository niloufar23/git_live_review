package day02_git_pull_clone;

public class SimpleCalculator {
    public static int add(int a, int b) {Add commentMore actions
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int x = 10, y = 5;
        System.out.println("Add: " + add(x, y));
        System.out.println("Subtract: " + subtract(x, y));
    }
}
