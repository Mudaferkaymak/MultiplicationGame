
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MÜDAFERKAYMAK
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    private fileManager fileManager;
    public login() {
        //kayıtların tutulacağı dosyalar ilk girişte oluşturuluyor
        createCsvFile("fullGames.csv");

        createCsvFile("gameDetails.csv");
        initComponents();
        fileManager = new fileManager("children.ser");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jFileChooser3 = new javax.swing.JFileChooser();
        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        userNameInput = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        passwordInput = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/3,Toolkit.getDefaultToolkit().getScreenSize().height/5);

        jPanel2.setBackground(new java.awt.Color(153, 102, 255));
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
        });

        userNameInput.setBackground(new java.awt.Color(153, 102, 255));
        userNameInput.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userNameInput.setForeground(new java.awt.Color(255, 255, 255));
        userNameInput.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userNameInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userNameInputKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Mario Kart DS", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GIRIS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        passwordInput.setBackground(new java.awt.Color(153, 102, 255));
        passwordInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordInput.setForeground(new java.awt.Color(255, 255, 255));
        passwordInput.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        passwordInput.setMinimumSize(new java.awt.Dimension(64, 24));
        passwordInput.setPreferredSize(new java.awt.Dimension(64, 24));
        passwordInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordInputKeyPressed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(153, 102, 255));
        jTextField2.setFont(new java.awt.Font("Mario Kart DS", 1, 42)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 0, 102));
        jTextField2.setText("CARPIM TABLOSU OGRENIYORUZ");
        jTextField2.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Mario Kart DS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("KULLANICI ADI");

        jLabel2.setFont(new java.awt.Font("Mario Kart DS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("SIFRE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(130, 130, 130)
                        .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(67, 67, 67)
                        .addComponent(userNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(322, 322, 322))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2KeyPressed

    private void passwordInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordInputKeyPressed
        // TODO add your handling code here:
        //giriş yapılan değerler dosyada var mı varsa ebeveyn mi cocuk mu diye bakılıyor
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String username = userNameInput.getText();
            String password = new String(passwordInput.getPassword());
            if(username.equals("mudafer") && password.equals("123")){
                setVisible(false);
                parentMainUI frame = new parentMainUI();
                frame.setVisible(true);
            }
            else if (checkIfExist(username, password)) {
                setVisible(false);
                fileManager fileManager = new fileManager("settings.ser");
                List<settings> settingsArr = fileManager.readSetting();
                gameOptions frame = new gameOptions(settingsArr,username);
                frame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Kullanıcı adı veya şifre hatalı!");
            }
        }
    }//GEN-LAST:event_passwordInputKeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //giriş yapılan değerler dosyada var mı varsa ebeveyn mi cocuk mu diye bakılıyor
        String username = userNameInput.getText();
        String password = new String(passwordInput.getPassword());
        if(username.equals("mudafer") && password.equals("123")){
            setVisible(false);
            parentMainUI frame = new parentMainUI();
            frame.setVisible(true);
        }
        else if (checkIfExist(username, password)) {
            setVisible(false);
            fileManager fileManager = new fileManager("settings.ser");
            List<settings> settingsArr = fileManager.readSetting();
            gameOptions frame = new gameOptions(settingsArr,username);
            frame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Kullanıcı adı veya şifre hatalı!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userNameInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameInputKeyPressed
        // TODO add your handling code here:
        //giriş yapılan değerler dosyada var mı varsa ebeveyn mi cocuk mu diye bakılıyor
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String username = userNameInput.getText();
            String password = new String(passwordInput.getPassword());
            if(username.equals("mudafer") && password.equals("123")){
                setVisible(false);
                parentMainUI frame = new parentMainUI();
                frame.setVisible(true);
            }
            else if (checkIfExist(username, password)) {
                setVisible(false);
                fileManager fileManager = new fileManager("settings.ser");
                List<settings> settingsArr = fileManager.readSetting();
                gameOptions frame = new gameOptions(settingsArr,username);
                frame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Kullanıcı adı veya şifre hatalı!");
            }
        }
    }//GEN-LAST:event_userNameInputKeyPressed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    private boolean checkIfExist(String username, String password) {
        fileManager.readChildren();
        List<Child> children = fileManager.getChildren();
        
        for (Child child : children) {
            if (child.getUserName().equals(username) && child.getPassword().equals(password) && !child.getUserName().equals("") ){
                return true;
            }
        }

        return false;
    }
    private static void createCsvFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu: " + fileName);
            } else {
                System.out.println("Dosya zaten var: " + fileName);
            }
        } catch (IOException e) {
            System.out.println("Dosya oluşturulurken bir hata oluştu: " + e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JFileChooser jFileChooser3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JTextField userNameInput;
    // End of variables declaration//GEN-END:variables
}
