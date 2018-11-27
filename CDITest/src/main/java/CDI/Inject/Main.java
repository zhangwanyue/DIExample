package CDI.Inject;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Created by vera on 18-11-26.
 */
public class Main {
    // use ./gradlew run
    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        ImageFileProcessor imageFileProcessor = container.select(ImageFileProcessor.class).get();

        System.out.println(imageFileProcessor.openFile("file1.png"));

        container.shutdown();
    }
}
