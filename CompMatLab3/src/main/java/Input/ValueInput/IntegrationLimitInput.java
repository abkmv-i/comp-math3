package Input.ValueInput;

import Input.InputMenu;

public class IntegrationLimitInput extends AbstractInput implements InputMenu {

    private final double[] limits = new double[2];

    @Override
    public void getUserInput() {
        boolean check;
        String a, b;

        printer.print("Введите пределы интергрирования(a<b) \na: ");
        while (true){
            a = scanner.nextLine();
            if(isNumber(a)) break;
            else printer.print("Ошибка! Повторите ввод");
        }
        do{
            printer.print("b: ");
            b = scanner.nextLine();
            check = inputChecker(a + " " + b);
        }while (!check);
    }

    @Override
    public boolean inputChecker(String input) {
        String[] values = input.split(" ", 2);
        try {
            for (int i = 0; i < 2; i++) {
                limits[i] = Double.parseDouble(values[i].replace(",", "."));
            }
            if (limits[0] >= limits[1]) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException exception) {
            printer.print("Ошибка! Повторите ввод");
            return false;
        }
        data.setBottomLimit(limits[0]);
        data.setTopLimit(limits[1]);
        return true;
    }

    public boolean isNumber(String a) {
        if (a == null || a.isEmpty()) {
            return false;
        }

        for (char c : a.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }
}
