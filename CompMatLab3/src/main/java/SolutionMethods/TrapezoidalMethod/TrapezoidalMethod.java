package SolutionMethods.TrapezoidalMethod;

import SolutionMethods.AbstractMethod;

public class TrapezoidalMethod extends AbstractMethod {

    public TrapezoidalMethod() {
        super("Метод трапеций");
        k = 2;
    }

    @Override
    public double calculateValue(double step, double partitions) {
        double sum = 0;

        sum += (data.getFunction().solution(data.getBottomLimit()) + data.getFunction().solution(data.getTopLimit()));

        sum += 2 * getLocalSum(step, partitions);

        return rounding((step/2) * sum);
    }

    private double getLocalSum(double step, double partitions) {
        double localSum = 0;

        for (int i = 1; i < partitions; i++) {
            localSum += data.getFunction().solution(data.getBottomLimit() + step * i);
        }

        return rounding(localSum);
    }
}
