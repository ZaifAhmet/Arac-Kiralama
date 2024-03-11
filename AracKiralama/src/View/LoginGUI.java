package View;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class LoginGUI extends javax.swing.JFrame {

    public LoginGUI() {
        initComponents();
        
    }

    DefaultComboBoxModel CModel;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kayıt_Dialog = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        email_txtFieldDialog = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ad_txtField = new javax.swing.JTextField();
        soyad_txtField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Yas_ComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        erkek_RadioBtn = new javax.swing.JRadioButton();
        kadın_RadioBtn = new javax.swing.JRadioButton();
        Kayıt_BtnDialog = new javax.swing.JButton();
        sifre_txtFieldDialog = new javax.swing.JTextField();
        Cinsiyet_buttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Sifre_PasswordField = new javax.swing.JPasswordField();
        email_txtField = new javax.swing.JTextField();
        Giris_Btn = new javax.swing.JButton();
        Kayıt_Btn = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel5.setText("Şifre");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel7.setText("Kayıt Olma Formu");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel8.setText("Ad");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel9.setText("Soyad");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel10.setText("Cinsiyet");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel11.setText("Yaş");

        Cinsiyet_buttonGroup.add(erkek_RadioBtn);
        erkek_RadioBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        erkek_RadioBtn.setText("Erkek");

        Cinsiyet_buttonGroup.add(kadın_RadioBtn);
        kadın_RadioBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        kadın_RadioBtn.setText("Kadın");

        Kayıt_BtnDialog.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        Kayıt_BtnDialog.setText("Kayıt Ol");
        Kayıt_BtnDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kayıt_BtnDialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Kayıt_DialogLayout = new javax.swing.GroupLayout(Kayıt_Dialog.getContentPane());
        Kayıt_Dialog.getContentPane().setLayout(Kayıt_DialogLayout);
        Kayıt_DialogLayout.setHorizontalGroup(
            Kayıt_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Kayıt_DialogLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Kayıt_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Kayıt_DialogLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel7))
                    .addGroup(Kayıt_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(Kayıt_DialogLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(48, 48, 48)
                            .addComponent(ad_txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Kayıt_DialogLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(soyad_txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Kayıt_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(Kayıt_DialogLayout.createSequentialGroup()
                            .addGroup(Kayıt_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(Kayıt_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(email_txtFieldDialog, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                .addComponent(sifre_txtFieldDialog)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Kayıt_DialogLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Yas_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addGroup(Kayıt_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(Kayıt_DialogLayout.createSequentialGroup()
                                    .addComponent(erkek_RadioBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(kadın_RadioBtn))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Kayıt_DialogLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addGap(45, 45, 45))))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(Kayıt_DialogLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(Kayıt_BtnDialog)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Kayıt_DialogLayout.setVerticalGroup(
            Kayıt_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Kayıt_DialogLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(Kayıt_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ad_txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Kayıt_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(soyad_txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(Kayıt_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Kayıt_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Yas_ComboBox)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Kayıt_DialogLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(10, 10, 10)
                        .addGroup(Kayıt_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(erkek_RadioBtn)
                            .addComponent(kadın_RadioBtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Kayıt_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Kayıt_DialogLayout.createSequentialGroup()
                        .addComponent(email_txtFieldDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Kayıt_DialogLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Kayıt_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(sifre_txtFieldDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)))
                .addComponent(Kayıt_BtnDialog)
                .addGap(21, 21, 21))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rent-a Car");
        setBounds(new java.awt.Rectangle(600, 150, 800, 600));
        setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel1.setText("Araç Kiralama Sistemine Hoşgeldiniz");

        jPanel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 368));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel3.setText("Şifre");

        Giris_Btn.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        Giris_Btn.setForeground(new java.awt.Color(255, 0, 102));
        Giris_Btn.setText("Giriş Yap");
        Giris_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Giris_BtnActionPerformed(evt);
            }
        });

        Kayıt_Btn.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        Kayıt_Btn.setForeground(new java.awt.Color(153, 255, 0));
        Kayıt_Btn.setText("Kayıt ol");
        Kayıt_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kayıt_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Sifre_PasswordField)
                            .addComponent(email_txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Giris_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Kayıt_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(email_txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sifre_PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Giris_Btn)
                    .addComponent(Kayıt_Btn))
                .addGap(140, 140, 140))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Connection myAccessConnection() {
        Connection con = null;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); //Bağlantı nesnesi
            String strdatabase = "jdbc:ucanaccess://src/Users.accdb"; //veritabanının ismi
            con = DriverManager.getConnection(strdatabase); //Access-java bağlantısnı sağlayan jdbc sürücüsü ile bağlantı oluşturuluyor
            System.out.println(con);
        } catch (Exception e) {
            System.out.println("bağlantı hatası");
            JOptionPane.showMessageDialog(null, e.toString(), "Bağlantı Hatası", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }

    private boolean EmailKontrol(String email) {

        try {
            Connection con = myAccessConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM KISILER");
            stmt.close();
            con.close();

            while (rs.next()) {
                if (email.equals(rs.getString("EMAIL"))) {
                    return false;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Bağlantı Hatası", JOptionPane.ERROR_MESSAGE);
        }

        return true;
    }

    private void Giris_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Giris_BtnActionPerformed
        // TODO add your handling code here:
        Connection con = myAccessConnection();
        String email = email_txtField.getText();
        String sifre = String.valueOf(Sifre_PasswordField.getPassword());
        boolean giris = false;
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM KISILER");
            con.close();
            stmt.close();
            while (rs.next()) {
                if (rs.getString("EMAIL").equals(email) && rs.getString("SIFRE").equals(sifre)) {
                    JOptionPane.showMessageDialog(null, "Giris Basarili");
                    giris = true;
                    break;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Bağlantı Hatası", JOptionPane.ERROR_MESSAGE);
        }
        if(giris){
            lg.setVisible(false);
            new AppGUI().setVisible(true);
        }
    }//GEN-LAST:event_Giris_BtnActionPerformed

    private void Kayıt_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kayıt_BtnActionPerformed
        // TODO add your handling code here:
        String dizi[] = new String[92];
        int i = 18, j = 0;
        for (; (i < 110 && j < 92); i++, j++) {
            dizi[j] = String.valueOf(i);
        }
        CModel = new DefaultComboBoxModel(dizi);
        Yas_ComboBox.setModel(CModel);
        Kayıt_Dialog.setBounds(150, 100, 500, 500);
        Kayıt_Dialog.setVisible(true);

    }//GEN-LAST:event_Kayıt_BtnActionPerformed

    private void Kayıt_BtnDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kayıt_BtnDialogActionPerformed
        // TODO add your handling code here:

        String ad, soyad, cinsiyet = "", email = "", sifre = "", yas;

        ad = ad_txtField.getText();
        soyad = soyad_txtField.getText();
        sifre = sifre_txtFieldDialog.getText();
        yas = String.valueOf(Yas_ComboBox.getSelectedItem());
        if (erkek_RadioBtn.isSelected()) {
            cinsiyet = "Erkek";
        }
        if (kadın_RadioBtn.isSelected()) {
            cinsiyet = "Kadın";
        }
        if (!email_txtFieldDialog.getText().endsWith("@gmail.com") && !email_txtFieldDialog.getText().endsWith("@hotmail.com")) {
            JOptionPane.showMessageDialog(this, "Email yanlış girildi!");
        } else if (!EmailKontrol(email_txtFieldDialog.getText())) {
            JOptionPane.showMessageDialog(this, "Email zaten kullanılıyor.");
        } else {
            email = email_txtFieldDialog.getText();
            Connection con = myAccessConnection();

            String sorgu = "INSERT INTO KISILER (EMAIL, SIFRE, YAS, CINSIYET, AD, SOYAD) VALUES ('" + email + "', '"
                    + sifre + "', " + yas + ", '" + cinsiyet + "', '" + ad + "', '" + soyad + "')";

            try {
                Statement stmt = con.createStatement();
                stmt.execute(sorgu);
                stmt.close();
                con.close();
                JOptionPane.showMessageDialog(null, "Kaydınız oluşturuldu.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Kaydınız oluşturulamadı." + ex.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
            }
            Kayıt_Dialog.setVisible(false);
        }
        
    }//GEN-LAST:event_Kayıt_BtnDialogActionPerformed
    static LoginGUI lg;
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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                lg = new LoginGUI();
                lg.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Cinsiyet_buttonGroup;
    private javax.swing.JButton Giris_Btn;
    private javax.swing.JButton Kayıt_Btn;
    private javax.swing.JButton Kayıt_BtnDialog;
    private javax.swing.JDialog Kayıt_Dialog;
    private javax.swing.JPasswordField Sifre_PasswordField;
    private javax.swing.JComboBox<String> Yas_ComboBox;
    private javax.swing.JTextField ad_txtField;
    private javax.swing.JTextField email_txtField;
    private javax.swing.JTextField email_txtFieldDialog;
    private javax.swing.JRadioButton erkek_RadioBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton kadın_RadioBtn;
    private javax.swing.JTextField sifre_txtFieldDialog;
    private javax.swing.JTextField soyad_txtField;
    // End of variables declaration//GEN-END:variables
}
