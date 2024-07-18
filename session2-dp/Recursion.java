class Recursion {
    public static void main(String[] args) {
        hello(5);
    }

    static void hello(int n) {
        if (n == 0)
            return;
        System.out.println("hello");
        hello(n - 1);
    }
}