package Input.Selectors;

import Functions.AbstractFunction;
import Functions.FunctionsStorage;
import Input.InputMenu;

public class FunctionSelector extends AbstractSelector implements InputMenu {

    @Override
    public void getUserInput() {
        boolean check;
        do {
            printChoices();
            printer.print("Введите номер функции:");
            check = inputChecker(scanner.nextLine().trim());
            if (!check) {
                printer.print("Ошибка! Попробуйте ещё раз");
            }
        }
        while (!check);
    }

    @Override
    public boolean inputChecker(String input) {
        switch (input) {
            case "1":
                data.setFunction(FunctionsStorage.getFUNCTIONS()[0]);
                return true;
            case "2":
                data.setFunction(FunctionsStorage.getFUNCTIONS()[1]);
                return true;
            case "3":
                data.setFunction(FunctionsStorage.getFUNCTIONS()[2]);
                return true;
            default:
                return false;
        }
    }

    @Override
    public void printChoices() {
        AbstractFunction[] functions = FunctionsStorage.getFUNCTIONS();
        for (int i = 0; i < functions.length; i++) {
            printer.print((i+1) + " - " + functions[i].getStringRepresentation());
        }
    }
}
