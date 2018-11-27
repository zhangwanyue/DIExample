package DYDI;

/**
 * Created by vera on 18-11-26.
 */
public class SpecializeTextService implements TextService {
    @Override
    public String doSomethingWithText() {
        System.out.println("SpecializeTextService doSomethingWithText");
        return null;
    }

    @Override
    public String doSomethingElseWithText() {
        System.out.println("SpecializeTextService doSomethingElseWithText");
        return null;
    }
}
