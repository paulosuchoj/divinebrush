package UI;

import Functions.*;
import Utils.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MainMenu extends javax.swing.JFrame {

  public Manager imgManager = new Manager();
  public Image loadedImage;
  public JFileChooser imgChooser = new JFileChooser();

  /**Poderia ter sido feito um dicionário contendo códigos de operação
   * como chaves e os métodos como valores.
   */
  String operationId;

  Arithmetics arithFunctions = new Arithmetics();
  Geometrics geoFunctions = new Geometrics();
  Informations infoFunctions = new Informations();
  Filters filterFunctions = new Filters();

  DefaultListModel imgListModel = new DefaultListModel();
  DefaultComboBoxModel cmbFirstListModel = new DefaultComboBoxModel();
  DefaultComboBoxModel cmbSecondListModel = new DefaultComboBoxModel();

  int imgCounter = 1;

  public MainMenu() {
    initComponents();

    pnlLista.setVisible(false);
    pnlSeletor.setVisible(false);
    pnlBlending.setVisible(false);
    pnlScale.setVisible(false);
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDivineKanji = new javax.swing.JLabel();
        pnlLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstImages = new javax.swing.JList();
        btnOKLista = new javax.swing.JButton();
        pnlSeletor = new javax.swing.JPanel();
        cmbFirstImage = new javax.swing.JComboBox();
        cmbSecondImage = new javax.swing.JComboBox();
        btnOKCombo = new javax.swing.JButton();
        pnlBlending = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFirstBlend = new javax.swing.JTextField();
        txtSecondBlend = new javax.swing.JTextField();
        btnBlendingOK = new javax.swing.JButton();
        cmbFstImageBlend = new javax.swing.JComboBox();
        cmbSecondImgBlend = new javax.swing.JComboBox();
        pnlScale = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstEscala = new javax.swing.JList();
        txtConstanteEscala = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnOKScale = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mniAbrir = new javax.swing.JMenuItem();
        jspArquivo = new javax.swing.JPopupMenu.Separator();
        mniSair = new javax.swing.JMenuItem();
        mnuAritmeticas = new javax.swing.JMenu();
        mniSoma = new javax.swing.JMenuItem();
        mniSubtracao = new javax.swing.JMenuItem();
        mniMultiplicacao = new javax.swing.JMenuItem();
        mniDivisao = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniBlending = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniAnd = new javax.swing.JMenuItem();
        mniOr = new javax.swing.JMenuItem();
        mniNot = new javax.swing.JMenuItem();
        mniXor = new javax.swing.JMenuItem();
        mnuGeometricas = new javax.swing.JMenu();
        mniEscala = new javax.swing.JMenuItem();
        mnuInformacoes = new javax.swing.JMenu();
        mniEscalaCinza = new javax.swing.JMenuItem();
        mniHistograma = new javax.swing.JMenuItem();
        mnuFilters = new javax.swing.JMenu();
        mniConvolution = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Divine Brush");
        setName("frmDivineBrush"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(674, 360));
        setResizable(false);

        lblDivineKanji.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDivineKanji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Divine Brush.png"))); // NOI18N
        lblDivineKanji.setToolTipText("");
        lblDivineKanji.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        pnlLista.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lista de Imagens"));

        jScrollPane1.setViewportView(lstImages);

        btnOKLista.setText("OK");
        btnOKLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlListaLayout = new javax.swing.GroupLayout(pnlLista);
        pnlLista.setLayout(pnlListaLayout);
        pnlListaLayout.setHorizontalGroup(
            pnlListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListaLayout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addComponent(btnOKLista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlListaLayout.setVerticalGroup(
            pnlListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOKLista)
                .addContainerGap())
        );

        pnlSeletor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Seletor de Imagens"));

        btnOKCombo.setText("OK");
        btnOKCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSeletorLayout = new javax.swing.GroupLayout(pnlSeletor);
        pnlSeletor.setLayout(pnlSeletorLayout);
        pnlSeletorLayout.setHorizontalGroup(
            pnlSeletorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeletorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSeletorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbFirstImage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbSecondImage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSeletorLayout.createSequentialGroup()
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addComponent(btnOKCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlSeletorLayout.setVerticalGroup(
            pnlSeletorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeletorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbFirstImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbSecondImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnOKCombo)
                .addContainerGap())
        );

        pnlBlending.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Blending"));

        jLabel1.setText("Proporção #1:");

        jLabel2.setText("Proporção #2:");

        btnBlendingOK.setText("OK");
        btnBlendingOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlendingOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBlendingLayout = new javax.swing.GroupLayout(pnlBlending);
        pnlBlending.setLayout(pnlBlendingLayout);
        pnlBlendingLayout.setHorizontalGroup(
            pnlBlendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBlendingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBlendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBlendingLayout.createSequentialGroup()
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addComponent(btnBlendingOK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBlendingLayout.createSequentialGroup()
                        .addGroup(pnlBlendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlBlendingLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSecondBlend, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                            .addGroup(pnlBlendingLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFirstBlend))
                            .addComponent(cmbFstImageBlend, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbSecondImgBlend, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlBlendingLayout.setVerticalGroup(
            pnlBlendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBlendingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbFstImageBlend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbSecondImgBlend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBlendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFirstBlend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBlendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSecondBlend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBlendingOK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlScale.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Escala"));

        jScrollPane2.setViewportView(lstEscala);

        jLabel3.setText("Constante:");

        btnOKScale.setText("OK");
        btnOKScale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKScaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlScaleLayout = new javax.swing.GroupLayout(pnlScale);
        pnlScale.setLayout(pnlScaleLayout);
        pnlScaleLayout.setHorizontalGroup(
            pnlScaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScaleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlScaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlScaleLayout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addComponent(btnOKScale, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlScaleLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConstanteEscala)))
                .addContainerGap())
        );
        pnlScaleLayout.setVerticalGroup(
            pnlScaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScaleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlScaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConstanteEscala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOKScale)
                .addContainerGap())
        );

        mnuArquivo.setText("Arquivo");
        mnuArquivo.setToolTipText("");

        mniAbrir.setText("Abrir");
        mniAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAbrirActionPerformed(evt);
            }
        });
        mnuArquivo.add(mniAbrir);
        mnuArquivo.add(jspArquivo);

        mniSair.setText("Sair");
        mniSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSairActionPerformed(evt);
            }
        });
        mnuArquivo.add(mniSair);

        jMenuBar1.add(mnuArquivo);

        mnuAritmeticas.setText("Aritméticas");

        mniSoma.setText("Soma");
        mniSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSomaActionPerformed(evt);
            }
        });
        mnuAritmeticas.add(mniSoma);

        mniSubtracao.setText("Subtração");
        mniSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSubtracaoActionPerformed(evt);
            }
        });
        mnuAritmeticas.add(mniSubtracao);

        mniMultiplicacao.setText("Multiplicação");
        mniMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMultiplicacaoActionPerformed(evt);
            }
        });
        mnuAritmeticas.add(mniMultiplicacao);

        mniDivisao.setText("Divisão");
        mniDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDivisaoActionPerformed(evt);
            }
        });
        mnuAritmeticas.add(mniDivisao);
        mnuAritmeticas.add(jSeparator2);

        mniBlending.setText("Blending");
        mniBlending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBlendingActionPerformed(evt);
            }
        });
        mnuAritmeticas.add(mniBlending);
        mnuAritmeticas.add(jSeparator1);

        mniAnd.setText("AND");
        mniAnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAndActionPerformed(evt);
            }
        });
        mnuAritmeticas.add(mniAnd);

        mniOr.setText("OR");
        mniOr.setToolTipText("");
        mniOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniOrActionPerformed(evt);
            }
        });
        mnuAritmeticas.add(mniOr);

        mniNot.setText("NOT");
        mniNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNotActionPerformed(evt);
            }
        });
        mnuAritmeticas.add(mniNot);

        mniXor.setText("XOR");
        mniXor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniXorActionPerformed(evt);
            }
        });
        mnuAritmeticas.add(mniXor);

        jMenuBar1.add(mnuAritmeticas);

        mnuGeometricas.setText("Geométricas");

        mniEscala.setText("Escala");
        mniEscala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEscalaActionPerformed(evt);
            }
        });
        mnuGeometricas.add(mniEscala);

        jMenuBar1.add(mnuGeometricas);

        mnuInformacoes.setText("Informações");

        mniEscalaCinza.setText("Escala de Cinza");
        mniEscalaCinza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEscalaCinzaActionPerformed(evt);
            }
        });
        mnuInformacoes.add(mniEscalaCinza);

        mniHistograma.setText("Histograma");
        mniHistograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHistogramaActionPerformed(evt);
            }
        });
        mnuInformacoes.add(mniHistograma);

        jMenuBar1.add(mnuInformacoes);

        mnuFilters.setText("Filtros");

        mniConvolution.setText("Convolução");
        mniConvolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConvolutionActionPerformed(evt);
            }
        });
        mnuFilters.add(mniConvolution);

        jMenuBar1.add(mnuFilters);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSeletor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlBlending, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlScale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(lblDivineKanji)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlScale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlSeletor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlBlending, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDivineKanji, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void mniSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSairActionPerformed
    System.exit(0);
  }//GEN-LAST:event_mniSairActionPerformed

  private void mniAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAbrirActionPerformed

    final JFileChooser fileChooser = new JFileChooser();
    int returnVal = fileChooser.showOpenDialog(mniAbrir);

    if (returnVal == JFileChooser.APPROVE_OPTION) {
      File file = fileChooser.getSelectedFile();

      try {
        loadedImage = new Image(fileChooser.getSelectedFile().getAbsoluteFile());

        Infos imgInfo = new Infos();
        imgInfo.setImgPath(fileChooser.getSelectedFile().getAbsoluteFile().toString());
        imgInfo.setImgData(loadedImage.buffImg);

        imgManager.AddImage(imgInfo);

        BufferedImage image = ImageIO.read(file);

        imgListModel.addElement(fileChooser.getSelectedFile().getName());

        cmbFirstListModel.addElement(fileChooser.getSelectedFile().getName());
        cmbSecondListModel.addElement(fileChooser.getSelectedFile().getName());

        imgManager.SetImageToFrame(loadedImage, "Imagem " + imgCounter);
      } catch (IOException ioEx) {
      }
    }

    lstImages.setModel(imgListModel);
    lstEscala.setModel(imgListModel);

    cmbFirstImage.setModel(cmbFirstListModel);
    cmbSecondImage.setModel(cmbSecondListModel);

    cmbFstImageBlend.setModel(cmbFirstListModel);
    cmbSecondImgBlend.setModel(cmbSecondListModel);

    imgCounter++;
  }//GEN-LAST:event_mniAbrirActionPerformed

  private void mniHistogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHistogramaActionPerformed
    operationId = "HIST";
    pnlLista.setVisible(true);
    pnlBlending.setVisible(false);
    pnlSeletor.setVisible(false);
    pnlScale.setVisible(false);
  }//GEN-LAST:event_mniHistogramaActionPerformed

  private void mniSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSomaActionPerformed
    operationId = "SUM";
    pnlSeletor.setVisible(true);
    pnlLista.setVisible(false);
    pnlBlending.setVisible(false);
    pnlScale.setVisible(false);
  }//GEN-LAST:event_mniSomaActionPerformed

  private void btnOKComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKComboActionPerformed
    String fstImage = imgManager.FindByIndex(cmbFirstImage.getSelectedIndex());
    Infos fstInfo = imgManager.SearchImage(fstImage);

    try {
      imgManager.AddImage(fstInfo);
    } catch (FileNotFoundException ex) {
      Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
    }

    String sndImage = imgManager.FindByIndex(cmbSecondImage.getSelectedIndex());
    Infos sndInfo = imgManager.SearchImage(sndImage);

    try {
      imgManager.AddImage(sndInfo);
    } catch (FileNotFoundException ex) {
      Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
    }

    //------------------------------------------------------------------------------------------
    //FUNÇÕES ARITMÉTICAS
    //------------------------------------------------------------------------------------------
    if (operationId.equals("SUM")) {
      loadedImage = new Image(arithFunctions.Add(fstInfo.getImgData(), sndInfo.getImgData()));
      imgManager.SetImageToFrame(loadedImage, "Soma");
      pnlSeletor.setVisible(false);
    }

    if (operationId.equals("SUB")) {
      loadedImage = new Image(arithFunctions.Sub(fstInfo.getImgData(), sndInfo.getImgData()));
      imgManager.SetImageToFrame(loadedImage, "Subtração");
      pnlSeletor.setVisible(false);
    }

    if (operationId.equals("MULTI")) {
      loadedImage = new Image(arithFunctions.Multi(fstInfo.getImgData(), sndInfo.getImgData()));
      imgManager.SetImageToFrame(loadedImage, "Multiplicação");
      pnlSeletor.setVisible(false);
    }

    if (operationId.equals("DIV")) {
      loadedImage = new Image(arithFunctions.Div(fstInfo.getImgData(), sndInfo.getImgData()));
      imgManager.SetImageToFrame(loadedImage, "Divisão");
      pnlSeletor.setVisible(false);
    }

    //------------------------------------------------------------------------------------------
    //FUNÇÕES LÓGICAS
    //------------------------------------------------------------------------------------------
    if (operationId.equals("AND")) {
      loadedImage = new Image(arithFunctions.AND(fstInfo.getImgData(), sndInfo.getImgData()));
      imgManager.SetImageToFrame(loadedImage, "AND");
      pnlSeletor.setVisible(false);
    }

    if (operationId.equals("OR")) {
      loadedImage = new Image(arithFunctions.OR(fstInfo.getImgData(), sndInfo.getImgData()));
      imgManager.SetImageToFrame(loadedImage, "OR");
      pnlSeletor.setVisible(false);
    }

    if (operationId.equals("NOT")) {
      loadedImage = new Image(arithFunctions.NOT(fstInfo.getImgData(), sndInfo.getImgData()));
      imgManager.SetImageToFrame(loadedImage, "NOT");
      pnlSeletor.setVisible(false);
    }

    if (operationId.equals("XOR")) {
      loadedImage = new Image(arithFunctions.XOR(fstInfo.getImgData(), sndInfo.getImgData()));
      imgManager.SetImageToFrame(loadedImage, "XOR");
      pnlSeletor.setVisible(false);
    }
  }//GEN-LAST:event_btnOKComboActionPerformed

  private void mniSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSubtracaoActionPerformed
    operationId = "SUB";
    pnlSeletor.setVisible(true);
    pnlLista.setVisible(false);
    pnlBlending.setVisible(false);
    pnlScale.setVisible(false);
  }//GEN-LAST:event_mniSubtracaoActionPerformed

  private void mniMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMultiplicacaoActionPerformed
    operationId = "MULTI";
    pnlSeletor.setVisible(true);
    pnlLista.setVisible(false);
    pnlBlending.setVisible(false);
    pnlScale.setVisible(false);
  }//GEN-LAST:event_mniMultiplicacaoActionPerformed

  private void mniDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDivisaoActionPerformed
    operationId = "DIV";
    pnlSeletor.setVisible(true);
    pnlLista.setVisible(false);
    pnlBlending.setVisible(false);
    pnlScale.setVisible(false);
  }//GEN-LAST:event_mniDivisaoActionPerformed

  private void btnOKListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKListaActionPerformed
    String listImage = imgManager.FindByIndex(lstImages.getSelectedIndex());
    Infos listInfo = imgManager.SearchImage(listImage);

    try {
      imgManager.AddImage(listInfo);
    } catch (FileNotFoundException ex) {
      Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
    }

    //------------------------------------------------------------------------------------------
    //FUNÇÕES DE INFORMAÇÃO
    //------------------------------------------------------------------------------------------
    if (operationId.equals("HIST")) {
      loadedImage = new Image(infoFunctions.Histogram(listInfo.getImgData()));
      imgManager.SetImageToFrame(loadedImage, "Histograma");
      pnlLista.setVisible(false);
    }

    if (operationId.equals("GRAY")) {
      loadedImage = new Image(infoFunctions.GrayScale(listInfo.getImgData()));
      imgManager.SetImageToFrame(loadedImage, "Escala de Cinza");
      pnlLista.setVisible(false);
    }

    //------------------------------------------------------------------------------------------
    //FILTROS
    //------------------------------------------------------------------------------------------
    if (operationId.equals("CONV")) {
      loadedImage = new Image(filterFunctions.Convolution(listInfo.getImgData()));
      imgManager.SetImageToFrame(loadedImage, "Convolução");
      pnlLista.setVisible(false);
    }
  }//GEN-LAST:event_btnOKListaActionPerformed

  private void mniEscalaCinzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEscalaCinzaActionPerformed
    operationId = "GRAY";
    pnlLista.setVisible(true);
    pnlBlending.setVisible(false);
    pnlSeletor.setVisible(false);
    pnlScale.setVisible(false);
  }//GEN-LAST:event_mniEscalaCinzaActionPerformed

  private void mniBlendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBlendingActionPerformed
    operationId = "BLEND";
    pnlBlending.setVisible(true);
    pnlSeletor.setVisible(false);
    pnlLista.setVisible(false);
    pnlScale.setVisible(false);
  }//GEN-LAST:event_mniBlendingActionPerformed

  private void btnBlendingOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlendingOKActionPerformed
    String fstImage = imgManager.FindByIndex(cmbFirstImage.getSelectedIndex());
    Infos fstInfo = imgManager.SearchImage(fstImage);

    try {
      imgManager.AddImage(fstInfo);
    } catch (FileNotFoundException ex) {
      Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
    }

    String sndImage = imgManager.FindByIndex(cmbSecondImage.getSelectedIndex());
    Infos sndInfo = imgManager.SearchImage(sndImage);

    try {
      imgManager.AddImage(sndInfo);
    } catch (FileNotFoundException ex) {
      Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
    }

    if (operationId.equals("BLEND")) {
      loadedImage = new Image(arithFunctions.Blending(fstInfo.getImgData(), sndInfo.getImgData(), Double.valueOf(txtFirstBlend.getText()), Double.valueOf(txtSecondBlend.getText())));
      imgManager.SetImageToFrame(loadedImage, "Blending");
    }
  }//GEN-LAST:event_btnBlendingOKActionPerformed

  private void mniAndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAndActionPerformed
    operationId = "AND";
    pnlSeletor.setVisible(true);
    pnlLista.setVisible(false);
    pnlBlending.setVisible(false);
    pnlScale.setVisible(false);
  }//GEN-LAST:event_mniAndActionPerformed

  private void mniOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniOrActionPerformed
    operationId = "OR";
    pnlSeletor.setVisible(true);
    pnlLista.setVisible(false);
    pnlBlending.setVisible(false);
    pnlScale.setVisible(false);
  }//GEN-LAST:event_mniOrActionPerformed

  private void mniNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNotActionPerformed
    operationId = "NOT";
    pnlSeletor.setVisible(true);
    pnlLista.setVisible(false);
    pnlBlending.setVisible(false);
    pnlScale.setVisible(false);
  }//GEN-LAST:event_mniNotActionPerformed

  private void mniXorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniXorActionPerformed
    operationId = "XOR";
    pnlSeletor.setVisible(true);
    pnlLista.setVisible(false);
    pnlBlending.setVisible(false);
    pnlScale.setVisible(false);
  }//GEN-LAST:event_mniXorActionPerformed

  private void mniEscalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEscalaActionPerformed
    operationId = "SCALE";
    pnlScale.setVisible(true);
    pnlLista.setVisible(false);
    pnlBlending.setVisible(false);
    pnlSeletor.setVisible(false);
  }//GEN-LAST:event_mniEscalaActionPerformed

  private void btnOKScaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKScaleActionPerformed
    String listImage = imgManager.FindByIndex(lstEscala.getSelectedIndex());
    Infos listInfo = imgManager.SearchImage(listImage);

    try {
      imgManager.AddImage(listInfo);
    } catch (FileNotFoundException ex) {
      Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
    }

    //------------------------------------------------------------------------------------------
    //FUNÇÕES GEOMÉTRICAS
    //------------------------------------------------------------------------------------------
    if (operationId.equals("SCALE")) {
      loadedImage = new Image(geoFunctions.Scale(listInfo.getImgData(), Integer.valueOf(txtConstanteEscala.getText())));
      imgManager.SetImageToFrame(loadedImage, "Escala");
      pnlScale.setVisible(false);
    }
  }//GEN-LAST:event_btnOKScaleActionPerformed

  private void mniConvolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConvolutionActionPerformed
    operationId = "CONV";
    pnlLista.setVisible(true);
    pnlBlending.setVisible(false);
    pnlSeletor.setVisible(false);
    pnlScale.setVisible(false);
  }//GEN-LAST:event_mniConvolutionActionPerformed

  public static void main(String args[]) {
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        new MainMenu().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlendingOK;
    private javax.swing.JButton btnOKCombo;
    private javax.swing.JButton btnOKLista;
    private javax.swing.JButton btnOKScale;
    private javax.swing.JComboBox cmbFirstImage;
    private javax.swing.JComboBox cmbFstImageBlend;
    private javax.swing.JComboBox cmbSecondImage;
    private javax.swing.JComboBox cmbSecondImgBlend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jspArquivo;
    private javax.swing.JLabel lblDivineKanji;
    private javax.swing.JList lstEscala;
    private javax.swing.JList lstImages;
    private javax.swing.JMenuItem mniAbrir;
    private javax.swing.JMenuItem mniAnd;
    private javax.swing.JMenuItem mniBlending;
    private javax.swing.JMenuItem mniConvolution;
    private javax.swing.JMenuItem mniDivisao;
    private javax.swing.JMenuItem mniEscala;
    private javax.swing.JMenuItem mniEscalaCinza;
    private javax.swing.JMenuItem mniHistograma;
    private javax.swing.JMenuItem mniMultiplicacao;
    private javax.swing.JMenuItem mniNot;
    private javax.swing.JMenuItem mniOr;
    private javax.swing.JMenuItem mniSair;
    private javax.swing.JMenuItem mniSoma;
    private javax.swing.JMenuItem mniSubtracao;
    private javax.swing.JMenuItem mniXor;
    private javax.swing.JMenu mnuAritmeticas;
    private javax.swing.JMenu mnuArquivo;
    private javax.swing.JMenu mnuFilters;
    private javax.swing.JMenu mnuGeometricas;
    private javax.swing.JMenu mnuInformacoes;
    private javax.swing.JPanel pnlBlending;
    private javax.swing.JPanel pnlLista;
    private javax.swing.JPanel pnlScale;
    private javax.swing.JPanel pnlSeletor;
    private javax.swing.JTextField txtConstanteEscala;
    private javax.swing.JTextField txtFirstBlend;
    private javax.swing.JTextField txtSecondBlend;
    // End of variables declaration//GEN-END:variables
}
