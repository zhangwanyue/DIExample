package CDI.Inject;

import CDI.beans.ImageFileEditor;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by vera on 18-11-26.
 */

// Constructor injection
public class ImageFileProcessor {
    private ImageFileEditor imageFileEditor;

    @Inject
    public ImageFileProcessor(@Named("JpgFileEditor") ImageFileEditor imageFileEditor){
        this.imageFileEditor = imageFileEditor;
    }

    public String openFile(String fileName){
        return imageFileEditor.openFile(fileName);
    }
}

/*
// Field injection (must have a constructor with no parameters, or a constructor annotated @Inject)
public class ImageFileProcessor {
    @Inject
    private ImageFileEditor imageFileEditor;

    public ImageFileProcessor(){
    }

    public String openFile(String fileName){
        return imageFileEditor.openFile(fileName);
    }
}
*/

/*
// Setter injection (must have a constructor with no parameters, or a constructor annotated @Inject)
public class ImageFileProcessor {
    private ImageFileEditor imageFileEditor;

    public ImageFileProcessor(){
    }

    @Inject
    public void setImageFileEditor(ImageFileEditor imageFileEditor) {
        this.imageFileEditor = imageFileEditor;
    }

    public String openFile(String fileName){
        return imageFileEditor.openFile(fileName);
    }
}
*/