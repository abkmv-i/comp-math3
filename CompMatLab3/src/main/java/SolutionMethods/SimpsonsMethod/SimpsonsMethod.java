package SolutionMethods.SimpsonsMethod;

import SolutionMethods.AbstractMethod;

public class SimpsonsMethod extends AbstractMethod {

    public SimpsonsMethod() {
        super("Метод Симпсона");
        k = 4;
    }

    @Override
    public double calculateValue(double step, double partitions) {
        double sum = 0;

        sum += (data.getFunction().solution(data.getBottomLimit())
                        + data.getFunction().solution(data.getTopLimit()));

        sum += 4*(getLocalSum(step, 1, partitions));
        sum += 2*(getLocalSum(step, 2, partitions));

        return rounding((step/3) * sum);
    }

    private double getLocalSum(double step, int startIndex, double partitions) {
        double localSum = 0;

        for (int i = startIndex; i <= (partitions-startIndex); i = i + 2) {
            localSum += data.getFunction().solution(data.getBottomLimit() + step * i);
        }

        return localSum;
    }
}
