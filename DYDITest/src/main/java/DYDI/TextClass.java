package DYDI;

/**
 * Created by vera on 18-11-26.
 */
public class TextClass {
    private TextService textService;

    public TextClass(TextService textService) {
        this.textService = textService;
    }

    public void doSomethingWithText() {
        textService.doSomethingWithText();
    }

    public void doSomethingElseWithText() {
        textService.doSomethingElseWithText();
    }
}
