public class Calc {

    // Method overloading -> same method name with different parameters
    // differentiate the methods w.r.t number of parameters, type of parameters,
    // order of parameters
    // method without any parameters
    int add() {
        return 0;
    }

    // method with one parameter
    int add(int a) {
        System.out.println("int");
        return a;
    }

    double add(double a) {
        System.out.println("double");
        return a;
    }

    // method with two parameters
    int add(int a, int b) {
        System.out.println("int int");
        return a + b;
    }

    double add(double a, double b) {
        System.out.println("double double");
        return a + b;
    }

    double add(int a, double b) {
        System.out.println("int double");
        return a + b;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.add(6.5, 5));
    }
}
