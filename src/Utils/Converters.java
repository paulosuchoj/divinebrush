package Utils;

public class Converters {

  public static int[] IntToRGB(int cor) {
    int[] colorResult = new int[3];

    colorResult[0] = cor >> 16 & 0xff;
    colorResult[1] = cor >> 8 & 0xff;
    colorResult[2] = cor & 0xff;

    return colorResult;
  }

  public static double[] IntToRGBDiv(int cor) {
    double[] colorResult = new double[3];

    colorResult[0] = cor >> 16 & 0xff;
    colorResult[1] = cor >> 8 & 0xff;
    colorResult[2] = cor & 0xff;

    return colorResult;
  }

  public static int RGBToInt(int r, int g, int b) {
    int color = r << 16 | g << 8 | b;

    return color;
  }
}
