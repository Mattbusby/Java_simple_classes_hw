public class Calculator {
    private int num1;
    private int num2;
    private double dec1;
    private double dec2;

    public Calculator(int num1, int num2, double dec1, double dec2){
        this.num1 = num1;
        this.num2 = num2;
        this.dec1 = dec1;
        this.dec2 = dec2;
    }

    public int add(){
        return num1 + num2;
    }

    public int subtract(){
        return num2 - num1;
    }

    public int multiply(){
        return num1 * num2;
    }

    public double divide(){
        return dec1 / dec2;
    }
}
