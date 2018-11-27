package CDI.Produces;

import CDI.beans.ImageFileEditor;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by vera on 18-11-26.
 */

// Constructor injection
public class ImageFileProcessor {
    private ImageFileEditor imageFileEditor;
    TimeLogger timeLogger;

    @Inject
    public ImageFileProcessor(@Named("JpgFileEditor") ImageFileEditor imageFileEditor, TimeLogger timeLogger){
        this.imageFileEditor = imageFileEditor;
        this.timeLogger = timeLogger;
    }

    public String openFile(String fileName){
        return imageFileEditor.openFile(fileName) + " at: " + timeLogger.getTime();
    }
}


/*
// Field injection (must have a constructor with no parameters, or a constructor annotated @Inject)
public class ImageFileProcessor {
    @Inject
    private @Named("JpgFileEditor") ImageFileEditor imageFileEditor;
    @Inject
    private TimeLogger timeLogger;

    public ImageFileProcessor(){
    }

    public String openFile(String fileName){
        return imageFileEditor.openFile(fileName) + " at: " + timeLogger.getTime();
    }
}
*/

/*
// Setter injection (must have a constructor with no parameters, or a constructor annotated @Inject)
public class ImageFileProcessor {
    private ImageFileEditor imageFileEditor;
    private TimeLogger timeLogger;

    public ImageFileProcessor(){
    }

    @Inject
    public void setImageFileEditor(@Named("JpgFileEditor")ImageFileEditor imageFileEditor) {
        this.imageFileEditor = imageFileEditor;
        this.timeLogger = timeLogger;
    }

    @Inject
    public void setTimeLogger(TimeLogger timeLogger){
        this.timeLogger = timeLogger;
    }

    public String openFile(String fileName){
        return imageFileEditor.openFile(fileName) + " at: " + timeLogger.getTime();
    }
}
*/