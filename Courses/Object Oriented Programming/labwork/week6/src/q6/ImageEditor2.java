package q6;
import java.awt.Color;

import stdlib.*;

public class ImageEditor2 {
    public static Picture threshold(Picture pic, int thresh) {
        int width = pic.width();
        int height = pic.height();
        Picture thresholdPic = new Picture(width, height);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                double luminance = ImageEditor1.luminance(pic.get(i, j));
                if(luminance < thresh) {
                    thresholdPic.set(i, j, Color.BLACK);
                } else {
                    thresholdPic.set(i, j, ImageEditor1.toGrey(pic.get(i, j)));
                }
            }
        }
        return thresholdPic;
    }
    public static void main(String[] args) {
        Picture t = threshold(new Picture("lion1.jpg"), 200);
        t.show();
    }
}