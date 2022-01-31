public class Calculo {

    private static double total = 0.0D;

    public static double soma(double number1, double number2) {
        total = number1 + number2;
        return total;
    }

    public static double subtracao(double number1, double number2) {
        total = number1 - number2;
        return total;
    }

    public static double multiplicacao(double number1, double number2) {
        total = number1 * number2;
        return total;
    }

    public static double divisao(double number1, double number2) {
        total = number1 / number2;
        return total;
    }

    public static double resto(double number1, double number2) {
        total = number1 % number2;
        return total;
    }

}
