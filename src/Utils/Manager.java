package Utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Classe que gerencia as imagens no Divine Brush. Contém métodos de inserção,
 * exclusão e busca de imagens dentro da lista.
 *
 * @author Paulo
 */
public class Manager {

  private static ArrayList<Infos> imgList;

  public Manager() {
    imgList = new ArrayList<>();
  }

  /**
   * Adiciona uma nova image à lista. Antes de fazer isso, o método chama a
   * função de verificação de caminho da imagem. Se for válido, ele adiciona a
   * imagem.
   *
   * @param newImg Imagem que será adicionada à lista
   * @throws FileNotFoundException
   */
  public void AddImage(Infos newImg) throws FileNotFoundException {
    if (CheckImagePath(newImg.getImgPath())) {
      imgList.add(newImg);
    }
  }

  /**
   * Remove uma imagens da lista do gerenciador. Percorre a lista inteira até
   * encontrar a imagem cujo endereço foi passado à função. Caso encontre a
   * imagem na lista, ela é removida e a função para.
   *
   * @param imgPath Caminho da imagem que será removida da lista
   */
  public void DeleteImage(String imgPath) {
    for (int i = 0; i < imgList.size(); i++) {
      if (imgList.get(i).getImgPath().equals(imgPath)) {
        imgList.remove(i);
        break;
      }
    }
  }

  /**
   * Cria um novo JFrame e insere uma imagem nele.
   *
   * @param buffImage A imagem que será colocada no JFrame
   * @param frmTitle Título do JFrame
   */
  public void SetImageToFrame(Image buffImage, String frmTitle) {
    JLabel imageLabel = new JLabel();
    final JFrame imgFrame = new JFrame(frmTitle);

    imageLabel.setIcon(new ImageIcon(buffImage.buffImg));
    imgFrame.add(imageLabel);
    imgFrame.pack();

    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        imgFrame.setVisible(true);
        imgFrame.setLocationRelativeTo(null);
      }
    });
  }

  /**
   * Busca uma imagens na lista do gerenciador. Percorre a lista inteira até
   * encontrar a imagem cujo endereço foi passado à função. Caso encontre a
   * imagem na lista, ela é retornada.
   *
   * @param imgPath Caminho da imagem que será buscada na lista
   * @return
   */
  public Infos SearchImage(String imgPath) {
    for (int i = 0; i < imgList.size(); i++) {
      if (imgList.get(i).getImgPath().equals(imgPath)) {
        return imgList.get(i);
      }
    }
    return null;
  }

  public String FindByIndex(int imgIndex) {
    return imgList.get(imgIndex).getImgPath();
  }

  /**
   * Verifica se o caminho da imagem que está sendo adicionada à lista é válido.
   * Se for, a imagem é adicionada, caso contrário uma mensagem é mostrada
   * avisando o erro.
   *
   * @param imgPath Caminho da imagem que será adicionada à lista
   * @throws FileNotFoundException
   */
  private boolean CheckImagePath(String imgPath) throws FileNotFoundException {
    if (new File(imgPath).exists()) {
      return true;
    } else {
      JOptionPane.showMessageDialog(null, "Esse caminho não é válido...", "Caminho Inválido", JOptionPane.INFORMATION_MESSAGE);
      return false;
    }
  }
}
