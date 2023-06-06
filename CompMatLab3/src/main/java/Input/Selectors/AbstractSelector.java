package Input.Selectors;

import Services.Printer;

public abstract class AbstractSelector {

    public final Printer printer = new Printer();

    public abstract void printChoices();

}
