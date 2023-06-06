package Functions;

public class SecondFunction extends AbstractFunction {

    SecondFunction() {
        super("4x^3 + 6x^2 + 15x - 23");
    }

    @Override
    public double solution(double arg) {
        return (4*Math.pow(arg, 3) + 6*Math.pow(arg, 2) + 15*arg - 23);
    }
}
