package SolutionMethods.RectangleMethod;

public class RectangleMethodRightModification extends RectangleMethod {

    public RectangleMethodRightModification() {
        super("Метод правых прямоугольников");
        k = 1;
    }

    @Override
    public double calculateValue(double step, double partitions) {
        double sum = 0;
        double currentStartValue = data.getTopLimit();

        for (int i = 0; i < partitions; i++) {
            sum += rounding(data.getFunction().solution(currentStartValue - step * i));
        }

        return rounding(sum * step);
    }
}
