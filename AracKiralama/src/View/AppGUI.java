package View;

import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AppGUI extends javax.swing.JFrame {

    public AppGUI() {
        initComponents();
        myModel = (DefaultTableModel) Araba_Table.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kaydet_FileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Araba_Table = new javax.swing.JTable();
        filtreKaldır_Btn = new javax.swing.JButton();
        İl_ComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ilFiltrele_Btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Marka_ComboBox = new javax.swing.JComboBox<>();
        MarkaFiltrele_Btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Kasatipi_ComboBox = new javax.swing.JComboBox<>();
        KasatipiFiltrele_Btn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Arabaİlanı_MenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        DosyaKayıt_Menu = new javax.swing.JMenu();
        CıkısYap_Menu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RENT A CAR");
        setBounds(new java.awt.Rectangle(400, 100, 1000, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Araba_Table.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        Araba_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Volvo", "C 70", "Sedan", "Benzin", "Otomatik", "2005", "800000", "Beyaz", "konya"},
                {"Mercedes-Benz", "CLA", "Hatchback", "Dizel", "Manuel", "2016", "650000", "Siyah", "ankara"}
            },
            new String [] {
                "Marka", "Model", "Kasa tipi", "Yakıt", "Vites", "Yıl", "Fiyat", "Renk", "İl"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Araba_Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(Araba_Table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1040, 410));

        filtreKaldır_Btn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        filtreKaldır_Btn.setText("FİLTREYİ KALDIR");
        filtreKaldır_Btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        filtreKaldır_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtreKaldır_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(filtreKaldır_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 550, 220, 70));

        İl_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "adana", "adiyaman", "afyonkarahisar", "agri", "aksaray", "amasya", "ankara", "antalya", "ardahan", "artvin", "aydin", "balikesir", "bartin", "batman", "bayburt", "bilecik", "bingol", "bitlis", "bolu", "burdur", "bursa", "canakkale", "cankiri", "corum", "denizli", "diyarbakir", "duzce", "edirne", "elazig", "erzincan", "erzurum", "eskisehir", "gaziantep", "giresun", "gumushane", "hakkâri", "hatay", "igdir", "isparta", "istanbul", "izmir", "kahramanmaras", "karabuk", "karaman", "kars", "kastamonu", "kayseri", "kilis", "kirikkale", "kirklareli", "kirsehir", "kocaeli", "konya", "kutahya", "malatya", "manisa", "mardin", "mersin", "mugla", "mus", "nevsehir", "nigde", "ordu", "osmaniye", "rize", "sakarya", "samsun", "sanliurfa", "siirt", "sinop", "sivas", "sirnak", "tekirdag", "tokat", "trabzon", "tunceli", "usak", "van", "yalova", "yozgat", "zonguldak" }));
        jPanel1.add(İl_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 240, 40));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("  Adres");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, 240, 40));

        ilFiltrele_Btn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        ilFiltrele_Btn.setText("İLE GÖRE FİLTRELE");
        ilFiltrele_Btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ilFiltrele_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilFiltrele_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(ilFiltrele_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 240, 70));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Marka");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 240, 40));

        Marka_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mercedes-Benz", "BMW", "Ford", "Volvo", "Auidi" }));
        jPanel1.add(Marka_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 240, 40));

        MarkaFiltrele_Btn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        MarkaFiltrele_Btn.setText("MARKAYA GÖRE FİLTRELE");
        MarkaFiltrele_Btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MarkaFiltrele_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarkaFiltrele_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(MarkaFiltrele_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 240, 70));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Kasa tipi");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 240, 40));

        Kasatipi_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hatchback", "Sedan", "Station Wagon", "Convertible / Cabrio", "Coupe", "Pick-Up", "SUV", "MPV" }));
        jPanel1.add(Kasatipi_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 240, 40));

        KasatipiFiltrele_Btn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        KasatipiFiltrele_Btn.setText("KASATİPİNE GÖRE FİLTRELE");
        KasatipiFiltrele_Btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        KasatipiFiltrele_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KasatipiFiltrele_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(KasatipiFiltrele_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 240, 70));

        jMenu1.setText("İlan Ver");

        Arabaİlanı_MenuItem.setText("Araba");
        Arabaİlanı_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Arabaİlanı_MenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(Arabaİlanı_MenuItem);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        DosyaKayıt_Menu.setText("Dosyaya Kaydet");
        DosyaKayıt_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DosyaKayıt_MenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(DosyaKayıt_Menu);

        CıkısYap_Menu.setText("Çıkış Yap");
        CıkısYap_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CıkısYap_MenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(CıkısYap_Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Tabloya_Ekle(String[] eklenecek) {

        int col = 0;
        int row = myModel.getRowCount() - 1;

        myModel.insertRow(row, eklenecek);

    }


    private void CıkısYap_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CıkısYap_MenuMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CıkısYap_MenuMouseClicked

    private void filtreKaldır_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtreKaldır_BtnActionPerformed
        // TODO add your handling code here:
        Araba_Table.setModel(myModel);
    }//GEN-LAST:event_filtreKaldır_BtnActionPerformed

    private void Arabaİlanı_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Arabaİlanı_MenuItemActionPerformed
        // TODO add your handling code here:
        AddCarGUI ilan_pencere = new AddCarGUI();
        ilan_pencere.parent = this;
        ilan_pencere.setVisible(true);

    }//GEN-LAST:event_Arabaİlanı_MenuItemActionPerformed

    private void DosyaKayıt_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DosyaKayıt_MenuMouseClicked
        // TODO add your handling code here:
        if (Araba_Table.getSelectedRow() >= 0) {
            if (Kaydet_FileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                try {
                    FileWriter wr = new FileWriter(Kaydet_FileChooser.getSelectedFile().getAbsolutePath(), true);
                    int row = Araba_Table.getSelectedRow();
                    String s;
                    for (int i = 1; i <= 8; i++) {
                        s = String.valueOf(myModel.getValueAt(row, i));
                        wr.write(s + "\n");
                    }
                    wr.close();
                    JOptionPane.showMessageDialog(this, "Dosyaya Yazıldı", "", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_DosyaKayıt_MenuMouseClicked

    private void ilFiltrele_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilFiltrele_BtnActionPerformed
        // TODO add your handling code here:
        myModel2 = new DefaultTableModel();
        String sutun[] = new String[9];

        for (int i = 0; i < 9; i++) {
            sutun[i] = myModel.getColumnName(i);
        }
        myModel2.setColumnIdentifiers(sutun);
        
        String il = İl_ComboBox.getSelectedItem().toString();
        int indeks2 = 0;
        String[] s = {"","","","","","","","",""};
        try {
            for (int i = 0; i < myModel.getRowCount(); i++) {
                if (myModel.getValueAt(i, 8).toString().equals(il)) {
                    myModel2.addRow(s);
                    myModel2.setValueAt(myModel.getValueAt(i, 0), indeks2, 0);
                    myModel2.setValueAt(myModel.getValueAt(i, 1), indeks2, 1);
                    myModel2.setValueAt(myModel.getValueAt(i, 2), indeks2, 2);
                    myModel2.setValueAt(myModel.getValueAt(i, 3), indeks2, 3);
                    myModel2.setValueAt(myModel.getValueAt(i, 4), indeks2, 4);
                    myModel2.setValueAt(myModel.getValueAt(i, 5), indeks2, 5);
                    myModel2.setValueAt(myModel.getValueAt(i, 6), indeks2, 6);
                    myModel2.setValueAt(myModel.getValueAt(i, 7), indeks2, 7);
                    myModel2.setValueAt(myModel.getValueAt(i, 8), indeks2, 8);
                    indeks2++;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Araba_Table.setModel(myModel2);

    }//GEN-LAST:event_ilFiltrele_BtnActionPerformed

    private void MarkaFiltrele_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarkaFiltrele_BtnActionPerformed
        // TODO add your handling code here:
        myModel2 = new DefaultTableModel();
        String sutun[] = new String[9];

        for (int i = 0; i < 9; i++) {
            sutun[i] = myModel.getColumnName(i);
        }
        myModel2.setColumnIdentifiers(sutun);
        
        String marka = Marka_ComboBox.getSelectedItem().toString();
        int indeks2 = 0;
        String[] s = {"","","","","","","","",""};
        try {
            for (int i = 0; i < myModel.getRowCount(); i++) {
                if (myModel.getValueAt(i, 0).toString().equals(marka)) {
                    myModel2.addRow(s);
                    myModel2.setValueAt(myModel.getValueAt(i, 0), indeks2, 0);
                    myModel2.setValueAt(myModel.getValueAt(i, 1), indeks2, 1);
                    myModel2.setValueAt(myModel.getValueAt(i, 2), indeks2, 2);
                    myModel2.setValueAt(myModel.getValueAt(i, 3), indeks2, 3);
                    myModel2.setValueAt(myModel.getValueAt(i, 4), indeks2, 4);
                    myModel2.setValueAt(myModel.getValueAt(i, 5), indeks2, 5);
                    myModel2.setValueAt(myModel.getValueAt(i, 6), indeks2, 6);
                    myModel2.setValueAt(myModel.getValueAt(i, 7), indeks2, 7);
                    myModel2.setValueAt(myModel.getValueAt(i, 8), indeks2, 8);
                    indeks2++;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        Araba_Table.setModel(myModel2);

    }//GEN-LAST:event_MarkaFiltrele_BtnActionPerformed

    private void KasatipiFiltrele_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KasatipiFiltrele_BtnActionPerformed
        // TODO add your handling code here:
        myModel2 = new DefaultTableModel();
        String sutun[] = new String[9];

        for (int i = 0; i < 9; i++) {
            sutun[i] = myModel.getColumnName(i);
        }
        myModel2.setColumnIdentifiers(sutun);
        
        String tip = Kasatipi_ComboBox.getSelectedItem().toString();
        int indeks2 = 0;
        String[] s = {"","","","","","","","",""};
        try {
            for (int i = 0; i < myModel.getRowCount(); i++) {
                if (myModel.getValueAt(i, 2).toString().equals(tip)) {
                    myModel2.addRow(s);
                    myModel2.setValueAt(myModel.getValueAt(i, 0), indeks2, 0);
                    myModel2.setValueAt(myModel.getValueAt(i, 1), indeks2, 1);
                    myModel2.setValueAt(myModel.getValueAt(i, 2), indeks2, 2);
                    myModel2.setValueAt(myModel.getValueAt(i, 3), indeks2, 3);
                    myModel2.setValueAt(myModel.getValueAt(i, 4), indeks2, 4);
                    myModel2.setValueAt(myModel.getValueAt(i, 5), indeks2, 5);
                    myModel2.setValueAt(myModel.getValueAt(i, 6), indeks2, 6);
                    myModel2.setValueAt(myModel.getValueAt(i, 7), indeks2, 7);
                    myModel2.setValueAt(myModel.getValueAt(i, 8), indeks2, 8);
                    indeks2++;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Araba_Table.setModel(myModel2);

    }//GEN-LAST:event_KasatipiFiltrele_BtnActionPerformed

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
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppGUI().setVisible(true);
            }
        });
    }
    public DefaultTableModel myModel2;
    public DefaultTableModel myModel;
    //public AddCarGUI parent;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Araba_Table;
    private javax.swing.JMenuItem Arabaİlanı_MenuItem;
    private javax.swing.JMenu CıkısYap_Menu;
    private javax.swing.JMenu DosyaKayıt_Menu;
    private javax.swing.JButton KasatipiFiltrele_Btn;
    private javax.swing.JComboBox<String> Kasatipi_ComboBox;
    private javax.swing.JFileChooser Kaydet_FileChooser;
    private javax.swing.JButton MarkaFiltrele_Btn;
    private javax.swing.JComboBox<String> Marka_ComboBox;
    private javax.swing.JButton filtreKaldır_Btn;
    private javax.swing.JButton ilFiltrele_Btn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JComboBox<String> İl_ComboBox;
    // End of variables declaration//GEN-END:variables
}
