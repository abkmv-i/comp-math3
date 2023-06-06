package Input;

import Input.Selectors.FunctionSelector;
import Input.Selectors.MethodSelector;
import Input.ValueInput.AccuracyInput;
import Input.ValueInput.IntegrationLimitInput;

public class SelectorLifecycle {

    private final InputMenu[] selectors = {
            new FunctionSelector(),
            new IntegrationLimitInput(),
            new AccuracyInput(),
            new MethodSelector()
    };


    public void lifecycle() {
        for (InputMenu selector: selectors) {
            selector.getUserInput();
        }
        InputMenu.data.getMethod().data = InputMenu.data;
        InputMenu.data.getMethod().iterationCycle();
    }

}
