package CDI.beans;

import javax.inject.Named;

/**
 * Created by vera on 18-11-26.
 */

//@Default
@Named("PngFileEditor")
public class PngFileEditor implements ImageFileEditor {
    @Override
    public String openFile(String fileName) {
        return "Opening PNG file " + fileName;
    }

    @Override
    public String editFile(String fileName) {
        return "Editing PNG file " + fileName;
    }

    @Override
    public String writeFile(String fileName) {
        return "Writing PNG file " + fileName;
    }

    @Override
    public String saveFile(String fileName) {
        return "Saving PNG file " + fileName;
    }
}
