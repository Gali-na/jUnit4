public class Calculete {

    private double memberOne;
    private double memberTwo;

    public Calculete() {
        memberOne = 0.0;
        memberTwo = 0.0;
    }

    public double sum(double memberOne, double memberTwo) {
        return memberOne + memberTwo;
    }

    public double minus(double memberOne, double memberTwo) {
        return memberOne - memberTwo;
    }

    public double multiplied(double memberOne, double memberTwo) {
        return memberOne * memberTwo;
    }

    public double division(double memberOne, double memberTwo) {
        if (memberTwo == 0.0) {
            throw new ArithmeticException();
        } else {
return memberOne/memberTwo;
        }
    }
}

