package arithmetic;

public class Arithmetic {

    //To add a new Arithmetic function, a new interface must be created and implemented
    //Prefix an integer with a "0" to use octals

    //=================================================================
    //Addition methods
    public int add (int num1, int num2) {return new Addition().calculate(num1, num2);}
    public float add (float num1, float num2) {return new Addition().calculate(num1, num2);}
    public float add (float num1, int num2) {return new Addition().calculate(num1, num2);}
    public String addBinary (String num1, String num2) {return new Addition().calculateBinary(num1, num2);}
    public String addHex (String num1, String num2) {return new Addition().calculateHex(num1, num2);}

    //=================================================================
    //Subtraction methods
    public int subtract (int num1, int num2) {return new Subtraction().calculate(num1, num2);}
    public float subtract (float num1, float num2) {return new Subtraction().calculate(num1, num2);}
    public float subtract (float num1, int num2) {return new Subtraction().calculate(num1, num2);}
    public String subtractBinary (String num1, String num2) {return new Subtraction().calculateBinary(num1, num2);}
    public String subtractHex (String num1, String num2) {return new Subtraction().calculateHex(num1, num2);}

    //=================================================================
    //Multiplication methods
    public int multiply (int num1, int num2) {return new Multiplication().calculate(num1, num2);}
    public float multiply (float num1, float num2) {return new Multiplication().calculate(num1, num2);}
    public float multiply (float num1, int num2) {return new Multiplication().calculate(num1, num2);}
    public String multiplyBinary (String num1, String num2) {return new Multiplication().calculateBinary(num1, num2);}
    public String multiplyHex (String num1, String num2) {return new Multiplication().calculateHex(num1, num2);}

    //=================================================================
    //Division methods
    public int divide (int num1, int num2) {return new Division().calculate(num1, num2);}
    public float divide (float num1, float num2) {return new Division().calculate(num1, num2);}
    public float divide (float num1, int num2) {return new Division().calculate(num1, num2);}
    public String divideBinary (String num1, String num2) {return new Division().calculateBinary(num1, num2);}
    public String divideHex (String num1, String num2) {return new Division().calculateHex(num1, num2);}
}