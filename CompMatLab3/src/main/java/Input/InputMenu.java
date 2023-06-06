package Input;

import Data.Data;

import java.util.Scanner;

public interface InputMenu {
    Data data = new Data();

    Scanner scanner = new Scanner(System.in);

    void getUserInput();

    boolean inputChecker(String input);
}
