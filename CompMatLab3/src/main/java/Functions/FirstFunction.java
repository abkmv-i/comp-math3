package Functions;

public class FirstFunction extends AbstractFunction {

    FirstFunction() {
        super("2x^5 - 3x^2 + 6x - 7");
    }

    @Override
    public double solution(double arg) {
        return (2*Math.pow(arg, 5) - 3*Math.pow(arg, 2) + 6*arg - 7);
    }
}
