package q6;

import java.awt.Color;
import stdlib.*;

public class ImageEditor1 {
    public static double luminance(Color color) {
        return 0.299 * color.getRed() + 0.587 * color.getGreen() + 0.114 * color.getBlue();
    }

    public static Color toGrey(Color color) {
        int value = (int) Math.round(luminance(color));
        return new Color(value, value, value);
    }

    public static Picture makeGreyscale(Picture pic) {
        int width = pic.width();
        int height = pic.height();
        Picture greyPic = new Picture(width, height);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                greyPic.set(i, j, toGrey(pic.get(i, j)));
            }
        }
        return greyPic;
    }

    public static void main(String[] args) {
        Picture p = new Picture("lion1.jpg"); // or use any other colour image
        Picture greyscale = ImageEditor1.makeGreyscale(p);
        greyscale.show();
    }
}