package View;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.Date;

public class AddCarGUI extends javax.swing.JFrame {

    public AddCarGUI() {
        initComponents();
        ArabaOzellikleri_TextArea.setComponentPopupMenu(Sil_PopupMenu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yakıt_buttonGroup = new javax.swing.ButtonGroup();
        Sil_PopupMenu = new javax.swing.JPopupMenu();
        Temizle_MenuItem = new javax.swing.JMenuItem();
        Renk_ColorChooser = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        Tarih_FormattedTextField = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Model_Tree = new javax.swing.JTree();
        jScrollPane3 = new javax.swing.JScrollPane();
        AracTürü_List = new javax.swing.JList<>();
        İl_ComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        benzinLpg_CheckBox = new javax.swing.JCheckBox();
        benzin_CheckBox = new javax.swing.JCheckBox();
        dizel_CheckBox = new javax.swing.JCheckBox();
        hybrid_CheckBox = new javax.swing.JCheckBox();
        elektrik_CheckBox = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        manuel_CheckBox = new javax.swing.JCheckBox();
        otomatik_CheckBox = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Renk_Btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ArabaOzellikleri_TextArea = new javax.swing.JTextArea();
        Ilerleme_ProgressBar = new javax.swing.JProgressBar();
        Onizleme_Btn = new javax.swing.JButton();
        IlanVer_Btn1 = new javax.swing.JButton();
        Renk_ComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Fiyat_FormattedTextField = new javax.swing.JFormattedTextField();

        Temizle_MenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Temizle_MenuItem.setText("Temizle");
        Temizle_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Temizle_MenuItemActionPerformed(evt);
            }
        });
        Sil_PopupMenu.add(Temizle_MenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tarih_FormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y"))));
        Tarih_FormattedTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tarih_FormattedTextField.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jPanel1.add(Tarih_FormattedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 170, 40));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Yıl:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Modeller");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 120, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Kasa Tipi");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 120, 30));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Mercedes-Benz");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("A Serisi");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("B Serisi");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("C Serisi");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("CLA");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("BMW");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("i Serisi");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("M Serisi");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Z Serisi");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ford");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("B-Max");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Fiesta");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Galaxy");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Fusion");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Volvo");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("C 30");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("C 70");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("S 40");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("V40");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Auidi");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("A3");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("A6");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("R8");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("S Serisi");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        Model_Tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        Model_Tree.setRootVisible(false);
        jScrollPane2.setViewportView(Model_Tree);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, 290));

        AracTürü_List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Hatchback", "Sedan", "Station Wagon", "Convertible / Cabrio", "Coupe", "Pick-Up", "SUV", "MPV" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        AracTürü_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(AracTürü_List);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 130, 290));

        İl_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "adana", "adiyaman", "afyonkarahisar", "agri", "aksaray", "amasya", "ankara", "antalya", "ardahan", "artvin", "aydin", "balikesir", "bartin", "batman", "bayburt", "bilecik", "bingol", "bitlis", "bolu", "burdur", "bursa", "canakkale", "cankiri", "corum", "denizli", "diyarbakir", "duzce", "edirne", "elazig", "erzincan", "erzurum", "eskisehir", "gaziantep", "giresun", "gumushane", "hakkâri", "hatay", "igdir", "isparta", "istanbul", "izmir", "kahramanmaras", "karabuk", "karaman", "kars", "kastamonu", "kayseri", "kilis", "kirikkale", "kirklareli", "kirsehir", "kocaeli", "konya", "kutahya", "malatya", "manisa", "mardin", "mersin", "mugla", "mus", "nevsehir", "nigde", "ordu", "osmaniye", "rize", "sakarya", "samsun", "sanliurfa", "siirt", "sinop", "sivas", "sirnak", "tekirdag", "tokat", "trabzon", "tunceli", "usak", "van", "yalova", "yozgat", "zonguldak" }));
        jPanel1.add(İl_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 250, 40));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("  Adres");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 250, 40));

        jPanel2.setLayout(new java.awt.GridLayout(5, 0));

        yakıt_buttonGroup.add(benzinLpg_CheckBox);
        benzinLpg_CheckBox.setText("Benzin & LPG");
        jPanel2.add(benzinLpg_CheckBox);

        yakıt_buttonGroup.add(benzin_CheckBox);
        benzin_CheckBox.setText("Benzin");
        jPanel2.add(benzin_CheckBox);

        yakıt_buttonGroup.add(dizel_CheckBox);
        dizel_CheckBox.setText("Dizel");
        jPanel2.add(dizel_CheckBox);

        yakıt_buttonGroup.add(hybrid_CheckBox);
        hybrid_CheckBox.setText("Hybrid");
        jPanel2.add(hybrid_CheckBox);

        yakıt_buttonGroup.add(elektrik_CheckBox);
        elektrik_CheckBox.setText("Elektrik");
        jPanel2.add(elektrik_CheckBox);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 120, 140));

        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        manuel_CheckBox.setText("Manuel");
        jPanel3.add(manuel_CheckBox);

        otomatik_CheckBox.setText("Otomatik");
        jPanel3.add(otomatik_CheckBox);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 130, 60));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Renk Seç");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 120, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Yakıt");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 120, 25));

        Renk_Btn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        Renk_Btn.setText("Renk Seç");
        Renk_Btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Renk_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Renk_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Renk_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 120, 70));

        ArabaOzellikleri_TextArea.setEditable(false);
        ArabaOzellikleri_TextArea.setColumns(20);
        ArabaOzellikleri_TextArea.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        ArabaOzellikleri_TextArea.setRows(5);
        ArabaOzellikleri_TextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(ArabaOzellikleri_TextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 760, 330));
        jPanel1.add(Ilerleme_ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 760, 50));

        Onizleme_Btn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        Onizleme_Btn.setText("Önizleme");
        Onizleme_Btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Onizleme_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Onizleme_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Onizleme_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 240, 60));

        IlanVer_Btn1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        IlanVer_Btn1.setText("İLAN VER");
        IlanVer_Btn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        IlanVer_Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IlanVer_Btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(IlanVer_Btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 240, 60));

        Renk_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beyaz", "Gri", "Mavi", "Siyah", "Kırmızı", "Turuncu", "Yeşil", "Kahverengi", "Sarı", "Diğer" }));
        jPanel1.add(Renk_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 582, 120, 40));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Vites");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 120, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Fiyat");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 70, 40));

        Fiyat_FormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y"))));
        Fiyat_FormattedTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Fiyat_FormattedTextField.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jPanel1.add(Fiyat_FormattedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String[] Bilgileri_Getir() {
        String[] metin;
        metin = ArabaOzellikleri_TextArea.getText().split("\n");
        String[] eklenecek = new String[9];
        int i = 0;
        for (String s : metin) {
            eklenecek[i] = s.split(":")[1];
            eklenecek[i] = eklenecek[i].trim();
            i++;
        }
        return eklenecek;
    }

    private String Yakıt_Getir() {
        String yakıt = "";
        if (benzin_CheckBox.isSelected()) {
            yakıt += benzin_CheckBox.getText();
        }
        if (benzinLpg_CheckBox.isSelected()) {
            yakıt += benzinLpg_CheckBox.getText();
        }
        if (dizel_CheckBox.isSelected()) {
            yakıt += dizel_CheckBox.getText();
        }
        if (hybrid_CheckBox.isSelected()) {
            yakıt += hybrid_CheckBox.getText();
        }
        if (elektrik_CheckBox.isSelected()) {
            yakıt += elektrik_CheckBox.getText();
        }
        return yakıt;
    }

    private String Model_Getir() {
        String model = "";
        DefaultMutableTreeNode seciliNode = (DefaultMutableTreeNode) Model_Tree.getLastSelectedPathComponent();
        if (seciliNode != null) {
            if (seciliNode.isLeaf()) {
                model += seciliNode.toString();
            }
        }
        return model;
    }

    private String Marka_Getir() {
        String marka = "";
        DefaultMutableTreeNode seciliNode = (DefaultMutableTreeNode) Model_Tree.getLastSelectedPathComponent();
        if (seciliNode != null) {
            if (!seciliNode.isLeaf()) {
                marka += seciliNode.toString();
            } else {
                marka += seciliNode.getParent().toString();
            }
        }
        return marka;
    }

    private String AracTuru_Getir() {
        String tur = "";
        if (!AracTürü_List.isSelectionEmpty()) {
            tur += AracTürü_List.getSelectedValue();
        }
        return tur;
    }

    private String Tarih_Getir() {
        String yil = "";
        Date d = new Date();
        int currentYear = d.getYear() + 1900;
        if (!Tarih_FormattedTextField.getText().isEmpty()) {
            if (Integer.parseInt(Tarih_FormattedTextField.getText()) <= currentYear) {
                if (Integer.parseInt(Tarih_FormattedTextField.getText()) >= 1950)
                    yil += Tarih_FormattedTextField.getText();
            }

        }
        return yil;
    }

    private String Vites_Getir() {
        String vites = "";
        if (manuel_CheckBox.isSelected()) {
            vites += manuel_CheckBox.getText() + " ";
        }
        if (otomatik_CheckBox.isSelected()) {
            vites += otomatik_CheckBox.getText() + " ";
        }

        return vites;
    }

    private void Renk_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Renk_BtnActionPerformed
        // TODO add your handling code here:

        ArabaOzellikleri_TextArea.setForeground(Renk_ColorChooser.showDialog(null, "Renk seçin", Color.BLACK));

    }//GEN-LAST:event_Renk_BtnActionPerformed

    private int ilerle(int val) {
        val++;
        Ilerleme_ProgressBar.setValue(val);
        Ilerleme_ProgressBar.setString("% " + val);
        Ilerleme_ProgressBar.update(Ilerleme_ProgressBar.getGraphics());
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "İlerleme hatası" + ex.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
        }
        return val;
    }

    private void Onizleme_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Onizleme_BtnActionPerformed
        // TODO add your handling code here:

        ArabaOzellikleri_TextArea.setText("");
        String marka = Marka_Getir();
        String model = Model_Getir();
        String tur = AracTuru_Getir();
        String yil = Tarih_Getir();
        String yakıt = Yakıt_Getir();
        String vites = Vites_Getir();
        String il = İl_ComboBox.getSelectedItem().toString();
        String renk = Renk_ComboBox.getSelectedItem().toString();
        String fiyat = Fiyat_FormattedTextField.getText();
        int val = 0, min = 0, max = 9;
        Ilerleme_ProgressBar.setMinimum(min);
        Ilerleme_ProgressBar.setMaximum(max);
        Ilerleme_ProgressBar.setValue(val);
        Ilerleme_ProgressBar.setBackground(Color.red);

        if (!marka.isEmpty()) {
            val = ilerle(0);
            if (!model.isEmpty()) {

                val = ilerle(1);
                if (!tur.isEmpty()) {

                    val = ilerle(2);
                    if (!yil.isEmpty()) {

                        val = ilerle(3);
                        if (!yakıt.isEmpty()) {

                            val = ilerle(4);
                            if (!vites.isEmpty()) {

                                val = ilerle(5);
                                if (!il.isEmpty()) {

                                    val = ilerle(6);
                                    if (!renk.isEmpty()) {
                                        val = ilerle(7);
                                        if (!fiyat.isEmpty()) {
                                            val = ilerle(8);
                                            ArabaOzellikleri_TextArea.append("Marka : " + marka);
                                            ArabaOzellikleri_TextArea.append("\nModel : " + model);
                                            ArabaOzellikleri_TextArea.append("\nKasa tipi : " + tur);
                                            ArabaOzellikleri_TextArea.append("\nUretim yili : " + yil);
                                            ArabaOzellikleri_TextArea.append("\nYakit turu : " + yakıt);
                                            ArabaOzellikleri_TextArea.append("\nVites : " + vites);
                                            ArabaOzellikleri_TextArea.append("\nFiyat : " + fiyat);
                                            ArabaOzellikleri_TextArea.append("\nRenk : " + renk);
                                            ArabaOzellikleri_TextArea.append("\nIl : " + il + "\n");
                                        } else {
                                            JOptionPane.showMessageDialog(this, "Fiyat bilgisi girilmemiş.");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(this, "Renk seçili değil.");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(this, "İl seçili değil.");
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "Vites tipi seçili değil.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Yakıt tipi seçili değil.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Yıl alanı boş veya geçersiz bir tarih girilmiş.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Kasa tipi seçili değil.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Model seçili değil.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Marka seçili değil.");
        }


    }//GEN-LAST:event_Onizleme_BtnActionPerformed

    private void IlanVer_Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IlanVer_Btn1ActionPerformed
        // TODO add your handling code here:
        if(!ArabaOzellikleri_TextArea.getText().isEmpty()){
            String eklenecek[] = Bilgileri_Getir();
            for (String s : eklenecek) {
                System.out.print(s);
            }
            parent.Tabloya_Ekle(eklenecek);
        }else{
            JOptionPane.showMessageDialog(null, "Önce önizleme yapın.");
        }
    }//GEN-LAST:event_IlanVer_Btn1ActionPerformed

    private void Temizle_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Temizle_MenuItemActionPerformed
        // TODO add your handling code here:
        ArabaOzellikleri_TextArea.setText("");
    }//GEN-LAST:event_Temizle_MenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(AddCarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCarGUI().setVisible(true);
            }
        });
    }
    public AppGUI parent;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ArabaOzellikleri_TextArea;
    private javax.swing.JList<String> AracTürü_List;
    private javax.swing.JFormattedTextField Fiyat_FormattedTextField;
    private javax.swing.JButton IlanVer_Btn1;
    private javax.swing.JProgressBar Ilerleme_ProgressBar;
    private javax.swing.JTree Model_Tree;
    private javax.swing.JButton Onizleme_Btn;
    private javax.swing.JButton Renk_Btn;
    private javax.swing.JColorChooser Renk_ColorChooser;
    private javax.swing.JComboBox<String> Renk_ComboBox;
    private javax.swing.JPopupMenu Sil_PopupMenu;
    private javax.swing.JFormattedTextField Tarih_FormattedTextField;
    private javax.swing.JMenuItem Temizle_MenuItem;
    private javax.swing.JCheckBox benzinLpg_CheckBox;
    private javax.swing.JCheckBox benzin_CheckBox;
    private javax.swing.JCheckBox dizel_CheckBox;
    private javax.swing.JCheckBox elektrik_CheckBox;
    private javax.swing.JCheckBox hybrid_CheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBox manuel_CheckBox;
    private javax.swing.JCheckBox otomatik_CheckBox;
    private javax.swing.ButtonGroup yakıt_buttonGroup;
    private javax.swing.JComboBox<String> İl_ComboBox;
    // End of variables declaration//GEN-END:variables
}
