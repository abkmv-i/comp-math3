package Functions;

public abstract class AbstractFunction {

    private final String stringRepresentation;

    AbstractFunction(String representation) {
        stringRepresentation = representation;
    }

    public abstract double solution(double arg);

    public String getStringRepresentation() {
        return stringRepresentation;
    }

}
