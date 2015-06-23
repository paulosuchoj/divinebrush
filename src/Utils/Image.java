package Utils;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;

public final class Image extends Component {

  public BufferedImage buffImg = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);

  public Image(BufferedImage img) {
    this.buffImg = img;
  }

  public Image(File f) {
    buffImg = LoadImage(f);
  }

  public BufferedImage LoadImage(File f) {

    BufferedImage result = null;
    try {
      result = ImageIO.read(f);
    } catch (FileNotFoundException fnf) {
    } catch (IOException e) {
    }
    return result;
  }

  @Override
  public void paint(Graphics g) {
    g.drawImage(buffImg, 0, 0, null);

  }
}
