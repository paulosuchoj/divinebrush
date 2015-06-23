package Functions;

import java.awt.image.BufferedImage;

public class Geometrics {

  public BufferedImage Scale(BufferedImage originalImg, int imgSize) {

    if (imgSize <= 0) {
      if (imgSize == 0) {
        imgSize = -1;
      }

      imgSize = imgSize * -1;

      BufferedImage result;
      result = new BufferedImage(originalImg.getWidth() / imgSize, originalImg.getHeight() / imgSize, BufferedImage.TYPE_INT_RGB);

      for (int j = 0; j < originalImg.getHeight(); j++) {
        for (int i = 0; i < originalImg.getWidth(); i++) {
          if ((i % imgSize == 0) && (j % imgSize == 0)) {
            int a = i / imgSize;
            int b = j / imgSize;
            if ((a < result.getWidth()) && (b < result.getHeight())) {
              result.setRGB(a, b, originalImg.getRGB(i, j));
            }
          }
        }
      }

      return result;
    } else {
      int w = imgSize * originalImg.getWidth();
      int h = imgSize * originalImg.getHeight();

      BufferedImage enlargedImage
              = new BufferedImage(w, h, originalImg.getType());

      for (int y = 0; y < h; ++y) {
        for (int x = 0; x < w; ++x) {
          enlargedImage.setRGB(x, y, originalImg.getRGB(x / imgSize, y / imgSize));
        }
      }

      return enlargedImage;
    }
  }
}
