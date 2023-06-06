package SolutionMethods;

import SolutionMethods.RectangleMethod.RectangleMethodCenterModification;
import SolutionMethods.RectangleMethod.RectangleMethodLeftModification;
import SolutionMethods.RectangleMethod.RectangleMethodRightModification;
import SolutionMethods.SimpsonsMethod.SimpsonsMethod;
import SolutionMethods.TrapezoidalMethod.TrapezoidalMethod;

public class MethodsStorage {

    private static final AbstractMethod[] METHODS = {
            new RectangleMethodRightModification(),
            new RectangleMethodLeftModification(),
            new RectangleMethodCenterModification(),
            new SimpsonsMethod(),
            new TrapezoidalMethod(),
    };

    public static AbstractMethod[] getMETHODS() {
        return METHODS;
    }

}
