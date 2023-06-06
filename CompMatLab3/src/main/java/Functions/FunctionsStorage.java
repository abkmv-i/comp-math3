package Functions;

public class FunctionsStorage {

    private static final AbstractFunction[] FUNCTIONS = {
            new FirstFunction(),
            new SecondFunction(),
            new ThirdFunction(),
           // new Test()
    };

    public static AbstractFunction[] getFUNCTIONS() {
        return FUNCTIONS;
    }

}
