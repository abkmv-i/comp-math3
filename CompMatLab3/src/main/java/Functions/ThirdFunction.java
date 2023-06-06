package Functions;

public class ThirdFunction extends AbstractFunction {

    ThirdFunction() {
        super("5x^4 - x^2 -15x + 24");
    }

    @Override
    public double solution(double arg) {
        return (5*Math.pow(arg, 4) - Math.pow(arg, 2) -15*arg + 24);
    }
}
