package SolutionMethods.RectangleMethod;

public class RectangleMethodLeftModification extends RectangleMethod {

    public RectangleMethodLeftModification() {
        super("Метод левых прямоугольников");
        k = 1;
    }

    @Override
    public double calculateValue(double step, double partitions) {
        double sum = 0;
        double currentStartValue = data.getBottomLimit();

        for (int i = 0; i < partitions; i++) {
            sum += rounding(data.getFunction().solution(currentStartValue + step * i));
        }

        return rounding(sum * step);
    }
}
