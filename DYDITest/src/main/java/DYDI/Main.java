package DYDI;

/**
 * Created by vera on 18-11-26.
 */
public class Main {
    public static void main(String[] args){
        TextClass textClass_1 = new TextClass(new SpecializeTextService()); //dependency inject
        textClass_1.doSomethingWithText();

        TextClassFactory textClassFactory = new TextClassFactory(); //using factory
        TextClass textClass_2 = textClassFactory.getTextClass();
        textClass_2.doSomethingElseWithText();
    }
}
