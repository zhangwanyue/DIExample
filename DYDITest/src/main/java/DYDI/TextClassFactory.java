package DYDI;

/**
 * Created by vera on 18-11-26.
 */
public class TextClassFactory {
    public TextClass getTextClass(){
        return new TextClass(new SpecializeTextService()); //dependency inject
    }
}
