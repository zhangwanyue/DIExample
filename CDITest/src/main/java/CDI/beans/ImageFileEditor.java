package CDI.beans;

/**
 * Created by vera on 18-11-26.
 */

public interface ImageFileEditor {
    String openFile(String fileName);
    String editFile(String fileName);
    String writeFile(String fileName);
    String saveFile(String fileName);
}
