public class Editor4 {

import java.awt.Color;

/**
 * Morphs a colored image into its grayscale version.
 * Usage example:
 * java Editor4 thor.ppm 50
 */
public class Editor4 {

    public static void main(String[] args) {

        String filename = args[0];
        int n = Integer.parseInt(args[1]);

        Color[][] source = Runigram.read(filename);
        Color[][] gray = Runigram.grayScaled(source);

        Runigram.setCanvas(source);
        Runigram.morph(source, gray, n);
    }
}

}
