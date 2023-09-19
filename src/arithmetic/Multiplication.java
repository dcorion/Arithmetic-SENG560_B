package arithmetic;

public class Multiplication implements ArithmeticExecutor {
    @Override
    public int calculate(int num1, int num2) {
        return num1 * num2;
    }
    @Override
    public float calculate(float num1, float num2) {
        return num1 * num2;
    }
    @Override
    public float calculate(float num1, int num2) {
        return num1 * num2;
    }
    @Override
    public String calculateBinary(String num1, String num2) {
        int first = Integer.parseInt(num1, 2);
        int second = Integer.parseInt(num2, 2);
        int product = calculate(first, second);
        return Integer.toBinaryString(product);
        //return Integer.toBinaryString(multiply(Integer.parseInt(num1, 2), Integer.parseInt(num2, 2)));
    }
    public String calculateHex(String num1, String num2) {
        int first = Integer.parseInt(num1, 16);
        int second = Integer.parseInt(num2, 16);
        int product = calculate(first, second);
        return Integer.toHexString(product);
    }
}