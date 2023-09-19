package arithmetic;

interface ArithmeticExecutor {

    int calculate (int num1, int num2);
    float calculate (float num1, float num2);
    float calculate (float num1, int num2);
    String calculateBinary (String num1, String num2);
    String calculateHex (String num1, String num2);
}
