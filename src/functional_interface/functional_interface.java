package functional_interface;

interface Calc {
    int operate(int a, int b);

    default void showResult(int result) {
        System.out.println("Result: " + result);
    }

    static void printInfo() {
        System.out.println("Calculator info");
    }


}

public class functional_interface {
    public static void main(String[] args) {

        // Lambda expression implementing operate()
        Calc add = (a, b) -> a + b;
        Calc sub = (a, b) -> a - b;

        // Calling static method (via interface name)
        Calc.printInfo();

        // Using addition implementation
        int sum = add.operate(5, 10);
        add.showResult(sum);

        Calc multiply = new Calc() {
            @Override
            public int operate(int a, int b) {
                return a * b;
            }

            @Override
            public void showResult(int result) {
                System.out.println("Multiplication result: " + result);
            }

        };
        int product = multiply.operate(4, 3);
        multiply.showResult(product);

    }
}
