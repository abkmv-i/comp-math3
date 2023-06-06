package Data;

import Functions.AbstractFunction;
import SolutionMethods.AbstractMethod;

public class Data {

    public static final int PARTITIONS_NUMBER = 4;

    private double topLimit;

    private double bottomLimit;

    private double accuracy;

    private AbstractFunction function;

    private AbstractMethod method;

    public double getTopLimit() {
        return topLimit;
    }

    public void setTopLimit(double topLimit) {
        this.topLimit = topLimit;
    }

    public double getBottomLimit() {
        return bottomLimit;
    }

    public void setBottomLimit(double bottomLimit) {
        this.bottomLimit = bottomLimit;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public AbstractFunction getFunction() {
        return function;
    }

    public void setFunction(AbstractFunction function) {
        this.function = function;
    }

    public AbstractMethod getMethod() {
        return method;
    }

    public void setMethod(AbstractMethod method) {
        this.method = method;
    }
}
