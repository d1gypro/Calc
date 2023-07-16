public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);

        // А = 1 + 2 = 3, Б = 1 - 1 = 0,  С = 3 / 0, делим на 0, делить на 0 нельзя, добавил в функ. интерфейс проверку
        // делителя на 0, если он не равен 0, то выполняется деление, иначе возвращаем 0
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);

    }
}