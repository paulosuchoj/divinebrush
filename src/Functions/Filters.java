package Functions;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class Filters {

  public static int Padding(int coord, int max) {
    if (coord < 0) {
      return 1;
    }
    if (coord >= max) {
      return max - 2;
    }
    return coord;
  }

  public static int Saturation(int color) {
    if (color < 0) {
      return 0;
    }
    if (color > 255) {
      return 255;
    }
    return color;
  }

  public BufferedImage Convolution(BufferedImage originalImg) {
    BufferedImage finalImage = new BufferedImage(originalImg.getWidth(), originalImg.getHeight(), BufferedImage.TYPE_INT_RGB);

    double[][] convKernel = {
      {1 / 9.0f, 1 / 9.0f, 1 / 9.0f}, {1 / 9.0f, 1 / 9.0f, 1 / 9.0f}, {1 / 9.0f, 1 / 9.0f, 1 / 9.0f}};

    for (int py = 0; py < originalImg.getHeight(); py++) {
      for (int px = 0; px < originalImg.getWidth(); px++) {
        int[] rgb = {0, 0, 0};
        for (int ky = 0; ky < convKernel.length; ky++) {
          for (int kx = 0; kx < convKernel.length; kx++) {
            int y = Padding(py - ky - 1, originalImg.getHeight());
            int x = Padding(px - kx - 1, originalImg.getWidth());
            rgb[0] += new Color(originalImg.getRGB(x, y)).getRed() * convKernel[kx][ky];
            rgb[1] += new Color(originalImg.getRGB(x, y)).getGreen() * convKernel[kx][ky];
            rgb[2] += new Color(originalImg.getRGB(x, y)).getBlue() * convKernel[kx][ky];
          }
        }
        finalImage.setRGB(px, py, new Color(
                Saturation(rgb[0]), Saturation(rgb[1]), Saturation(rgb[2])).getRGB());
      }
    }
    return finalImage;
  }
}
