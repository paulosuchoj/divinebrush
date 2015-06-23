package Functions;

import Utils.Converters;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class Arithmetics {

  /**
   * @param firstImage: Primeira imagem usada na operacao
   * @param secondImage: Segunda imagem usada na operacao
   * @return A imagem resultante da operacao executada
   */
  public BufferedImage Add(BufferedImage firstImage, BufferedImage secondImage) {
    BufferedImage finalImage = new BufferedImage(
            Math.max(firstImage.getWidth(), secondImage.getWidth()),
            Math.max(firstImage.getHeight(), secondImage.getHeight()),
            BufferedImage.TYPE_INT_RGB);

    Color fstColor, sndColor, rstColor;

    for (int j = 0; j < finalImage.getHeight(); j++) {
      for (int i = 0; i < finalImage.getWidth(); i++) {

        if (j < firstImage.getWidth() && i < firstImage.getHeight()) {
          fstColor = new Color(firstImage.getRGB(i, j));
        } else {
          fstColor = new Color(0, 0, 0);
        }

        if (j < secondImage.getWidth() && i < secondImage.getHeight()) {
          sndColor = new Color(secondImage.getRGB(i, j));
        } else {
          sndColor = new Color(0, 0, 0);
        }

        int[] rgbFstImage = Converters.IntToRGB(firstImage.getRGB(i, j));
        int[] rgbSndImage = Converters.IntToRGB(secondImage.getRGB(i, j));

        int rColor = (rgbFstImage[0] + rgbSndImage[0]);

        if (rColor > 255) {
          rColor = 255;
        }

        int gColor = (rgbFstImage[1] + rgbSndImage[1]);

        if (gColor > 255) {
          gColor = 255;
        }

        int bColor = (rgbFstImage[2] + rgbSndImage[2]);

        if (bColor > 255) {
          bColor = 255;
        }

        finalImage.setRGB(i, j, Converters.RGBToInt(rColor, gColor, bColor));
      }
    }
    return finalImage;
  }

  /**
   * @param firstImage: Primeira imagem usada na operacao
   * @param secondImage: Segunda imagem usada na operacao
   * @return A imagem resultante da operacao executada
   */
  public BufferedImage Sub(BufferedImage firstImage, BufferedImage secondImage) {
    BufferedImage finalImage = new BufferedImage(
            Math.max(firstImage.getWidth(), secondImage.getWidth()),
            Math.max(firstImage.getHeight(), secondImage.getHeight()),
            BufferedImage.TYPE_INT_RGB);

    Color fstColor, sndColor, rstColor;

    for (int j = 0; j < finalImage.getHeight(); j++) {
      for (int i = 0; i < finalImage.getWidth(); i++) {

        if (j < firstImage.getWidth() && i < firstImage.getHeight()) {
          fstColor = new Color(firstImage.getRGB(i, j));
        } else {
          fstColor = new Color(0, 0, 0);
        }

        if (j < secondImage.getWidth() && i < secondImage.getHeight()) {
          sndColor = new Color(secondImage.getRGB(i, j));
        } else {
          sndColor = new Color(0, 0, 0);
        }

        int[] rgbFstImage = Converters.IntToRGB(firstImage.getRGB(i, j));
        int[] rgbSndImage = Converters.IntToRGB(secondImage.getRGB(i, j));

        int rColor = (rgbFstImage[0] - rgbSndImage[0]);

        if (rColor > 255) {
          rColor = 255;
        }

        int gColor = (rgbFstImage[1] - rgbSndImage[1]);

        if (gColor > 255) {
          gColor = 255;
        }

        int bColor = (rgbFstImage[2] - rgbSndImage[2]);

        if (bColor > 255) {
          bColor = 255;
        }

        finalImage.setRGB(i, j, Converters.RGBToInt(rColor, gColor, bColor));
      }
    }
    return finalImage;
  }

  /**
   * @param firstImage: Primeira imagem usada na operacao
   * @param secondImage: Segunda imagem usada na operacao
   * @return A imagem resultante da operacao executada
   */
  public BufferedImage Div(BufferedImage firstImage, BufferedImage secondImage) {
    BufferedImage finalImage = new BufferedImage(
            Math.max(firstImage.getWidth(), secondImage.getWidth()),
            Math.max(firstImage.getHeight(), secondImage.getHeight()),
            BufferedImage.TYPE_INT_RGB);

    Color fstColor, sndColor, rstColor;

    for (int j = 0; j < finalImage.getHeight(); j++) {
      for (int i = 0; i < finalImage.getWidth(); i++) {

        if (j < firstImage.getWidth() && i < firstImage.getHeight()) {
          fstColor = new Color(firstImage.getRGB(i, j));
        } else {
          fstColor = new Color(0, 0, 0);
        }

        if (j < secondImage.getWidth() && i < secondImage.getHeight()) {
          sndColor = new Color(secondImage.getRGB(i, j));
        } else {
          sndColor = new Color(0, 0, 0);
        }

        double[] rgbFstImage = Converters.IntToRGBDiv(firstImage.getRGB(i, j));
        double[] rgbSndImage = Converters.IntToRGBDiv(secondImage.getRGB(i, j));

        double rColor = (rgbFstImage[0] / rgbSndImage[0]);

        if (rColor < 0) {
          rColor = 0;
        }

        double gColor = (rgbFstImage[1] / rgbSndImage[1]);

        if (gColor < 0) {
          gColor = 0;
        }

        double bColor = (rgbFstImage[2] / rgbSndImage[2]);

        if (bColor < 0) {
          bColor = 0;
        }

        finalImage.setRGB(i, j, Converters.RGBToInt((int) rColor, (int) gColor, (int) bColor));
      }
    }

    return finalImage;
  }

  /**
   * @param firstImage: Primeira imagem usada na operacao
   * @param secondImage: Segunda imagem usada na operacao
   * @return A imagem resultante da operacao executada
   */
  public BufferedImage Multi(BufferedImage firstImage, BufferedImage secondImage) {
    int maxWidth = Math.max(firstImage.getWidth(), secondImage.getWidth());
    int maxHeight = Math.max(firstImage.getHeight(), secondImage.getHeight());

    BufferedImage finalImage = new BufferedImage(maxWidth, maxHeight, BufferedImage.TYPE_INT_RGB);

    Color fstColor, sndColor, rstColor;

    for (int j = 0; j < finalImage.getHeight(); j++) {
      for (int i = 0; i < finalImage.getWidth(); i++) {

        if (j < firstImage.getWidth() && i < firstImage.getHeight()) {
          fstColor = new Color(firstImage.getRGB(i, j));
        } else {
          fstColor = new Color(0, 0, 0);
        }

        if (j < secondImage.getWidth() && i < secondImage.getHeight()) {
          sndColor = new Color(secondImage.getRGB(i, j));
        } else {
          sndColor = new Color(0, 0, 0);
        }

        int[] rgbFstImage = Converters.IntToRGB(firstImage.getRGB(i, j));
        int[] rgbSndImage = Converters.IntToRGB(secondImage.getRGB(i, j));

        int rColor = (rgbFstImage[0] * rgbSndImage[0]);

        if (rColor > 255) {
          rColor = 255;
        }

        int gColor = (rgbFstImage[1] * rgbSndImage[1]);

        if (gColor > 255) {
          gColor = 255;
        }

        int bColor = (rgbFstImage[2] * rgbSndImage[2]);

        if (bColor > 255) {
          bColor = 255;
        }

        finalImage.setRGB(i, j, Converters.RGBToInt(rColor, gColor, bColor));
      }
    }
    return finalImage;
  }

  /**
   * @param firstImage: Primeira imagem usada na operacao
   * @param secondImage
   * @param fstImgPct
   * @param sndImgPct
   * @return A imagem resultante da operacao executada
   */
  public static BufferedImage Blending(BufferedImage firstImage, BufferedImage secondImage, double fstImgPct, double sndImgPct) {
    BufferedImage finalImage = new BufferedImage(
            Math.max(firstImage.getWidth(), secondImage.getWidth()),
            Math.max(firstImage.getHeight(), secondImage.getHeight()),
            BufferedImage.TYPE_INT_RGB);

    Color fstColor, sndColor, rstColor;

    for (int j = 0; j < finalImage.getHeight(); j++) {
      for (int i = 0; i < finalImage.getWidth(); i++) {

        if (j < firstImage.getWidth() && i < firstImage.getHeight()) {
          fstColor = new Color(firstImage.getRGB(i, j));
        } else {
          fstColor = new Color(0, 0, 0);
        }

        if (j < secondImage.getWidth() && i < secondImage.getHeight()) {
          sndColor = new Color(secondImage.getRGB(i, j));
        } else {
          sndColor = new Color(0, 0, 0);
        }

        int[] rgbFstImage = Converters.IntToRGB(firstImage.getRGB(i, j));
        int[] rgbSndImage = Converters.IntToRGB(secondImage.getRGB(i, j));

        int rColor = (int) ((rgbFstImage[0] * fstImgPct) + (rgbSndImage[0] * sndImgPct));

        if (rColor > 255) {
          rColor = 255;
        }

        int gColor = (int) ((rgbFstImage[1] * fstImgPct) + (rgbSndImage[1] * sndImgPct));

        if (gColor > 255) {
          gColor = 255;
        }

        int bColor = (int) ((rgbFstImage[2] * fstImgPct) + (rgbSndImage[2] * sndImgPct));

        if (bColor > 255) {
          bColor = 255;
        }

        finalImage.setRGB(i, j, Converters.RGBToInt(rColor, gColor, bColor));
      }
    }
    return finalImage;
  }

  public BufferedImage AND(BufferedImage firstImage, BufferedImage secondImage) {
    BufferedImage finalImage = new BufferedImage(
            Math.max(firstImage.getWidth(), secondImage.getWidth()),
            Math.max(firstImage.getHeight(), secondImage.getHeight()),
            BufferedImage.TYPE_INT_RGB);

    for (int j = 0; j < finalImage.getHeight(); j++) {
      for (int i = 0; i < finalImage.getWidth(); i++) {

        finalImage.setRGB(i, j, firstImage.getRGB(i, j) & secondImage.getRGB(i, j));
      }
    }
    return finalImage;
  }

  public BufferedImage OR(BufferedImage firstImage, BufferedImage secondImage) {
    BufferedImage finalImage = new BufferedImage(
            Math.max(firstImage.getWidth(), secondImage.getWidth()),
            Math.max(firstImage.getHeight(), secondImage.getHeight()),
            BufferedImage.TYPE_INT_RGB);

    for (int j = 0; j < finalImage.getHeight(); j++) {
      for (int i = 0; i < finalImage.getWidth(); i++) {

        finalImage.setRGB(i, j, firstImage.getRGB(i, j) | secondImage.getRGB(i, j));
      }
    }
    return finalImage;
  }

  public BufferedImage NOT(BufferedImage firstImage, BufferedImage secondImage) {
    BufferedImage finalImage = new BufferedImage(
            Math.max(firstImage.getWidth(), secondImage.getWidth()),
            Math.max(firstImage.getHeight(), secondImage.getHeight()),
            BufferedImage.TYPE_INT_RGB);

    for (int j = 0; j < finalImage.getHeight(); j++) {
      for (int i = 0; i < finalImage.getWidth(); i++) {
        int pixelA = firstImage.getRGB(i, j);
        int pixelB = secondImage.getRGB(i, j);
        int pixelXOR = pixelA & ~pixelB;
        finalImage.setRGB(i, j, pixelXOR);
      }
    }

    return finalImage;
  }

  public BufferedImage XOR(BufferedImage firstImage, BufferedImage secondImage) {
    BufferedImage finalImage = new BufferedImage(
            Math.max(firstImage.getWidth(), secondImage.getWidth()),
            Math.max(firstImage.getHeight(), secondImage.getHeight()),
            BufferedImage.TYPE_INT_RGB);

    for (int j = 0; j < finalImage.getHeight(); j++) {
      for (int i = 0; i < finalImage.getWidth(); i++) {
        int pixelA = firstImage.getRGB(i, j);
        int pixelB = secondImage.getRGB(i, j);
        int pixelXOR = pixelA ^ pixelB;
        finalImage.setRGB(i, j, pixelXOR);
      }
    }

    return finalImage;
  }
}
