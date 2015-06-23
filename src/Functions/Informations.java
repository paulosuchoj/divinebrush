package Functions;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Informations {

  public BufferedImage Histogram(BufferedImage img) {
    BufferedImage result = new BufferedImage(256, 256, img.getType());
    
    Graphics g = result.getGraphics();
    g.setColor(Color.white);
    g.fill3DRect(0, 0, img.getWidth(), img.getHeight(), true);
    
    int[] histograma = new int[256];
    
    for (int j = 0; j < img.getHeight(); j++) {
      for (int i = 0; i < img.getWidth(); i++) {
        int c;
        c = img.getRGB(i, j) & 0xff;
        histograma[c]++;
      }
    }
    
    int m = 0;
    for (int i = 0; i < 256; i++) {

      if (m < histograma[i]) {
        m = histograma[i];
      }
    }
    
    for (int i = 0; i < histograma.length; i++) {
      int y = (int) ((256 * histograma[i]) / m);

      if (y > 255) {
        y = 255;
      }
      
      for (int j = 255 - y; j <= 255; j++) {
        result.setRGB(i, j, Color.BLACK.getRGB());
      }
    }
    
    return result;
  }

  public BufferedImage GrayScale(BufferedImage originalImg) {
    BufferedImage grayImage = new BufferedImage(
            originalImg.getWidth(),
            originalImg.getHeight(),
            BufferedImage.TYPE_BYTE_GRAY);

    for (int j = 0; j < grayImage.getHeight(); j++) {
      for (int i = 0; i < grayImage.getWidth(); i++) {

        Color color = new Color(originalImg.getRGB(i, j));
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();

        red = green = blue = (int) (red * 0.299 + green * 0.587 + blue * 0.114);
        color = new Color(red, green, blue);

        int rgb = color.getRGB();
        grayImage.setRGB(i, j, rgb);
      }
    }

    return grayImage;
  }
}
