package calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(3, 2);
        calc.println.accept(a);

        int b = calc.minus.apply(3, 2);
        calc.println.accept(b);

        int c = calc.divide.apply(3, 2);
        calc.println.accept(c);

        calc.println.accept(calc.multiply.apply(3, 2));

        for (int i = -3; i <= 3; i++)
            calc.println.accept(calc.isPositive.test(i));

        for (int i = -3; i <= 3; i++)
            calc.println.accept(calc.abs.apply(i));

        calc.println.accept(calc.sqr.apply(3));

    }
}
