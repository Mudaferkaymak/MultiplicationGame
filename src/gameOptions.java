
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MÜDAFERKAYMAK
 */
public class gameOptions extends javax.swing.JFrame {
    private int selectedRow =-1;
    private static String userNameinit;
    
    public gameOptions(List<settings> settingsArrr, String userName) {
        initComponents();
        userNameinit = userName;
        fileManager fileManager = new fileManager("settings.ser");
        
        List<settings> settingsArr = fileManager.readSetting();
        List<Float>  rows = readFullGame();
        int counterSet =0;
        //readFullGame fonksioynundan bir oyunda yapılan skorların maxları 3 indekste bulunmak üzere rows dizisine aktarıldı
        // aşağıdaki for döngüsünde settings dosyasına bu max değerler gönderiliyor
        for (settings settings : settingsArr) {
            if (counterSet < rows.size()) {
                settings.setMaxTotalScore(rows.get(counterSet));
                settings.setMaxSpeedScore(rows.get(counterSet + 1));
                settings.setMaxCorrectScore(rows.get(counterSet + 2));
                counterSet += 3;
            }
        }
        //dosya kaydetme
        fileManager.saveSetting();

        
        setTitle("Game Options");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int totalScore = 0;
        int counter = 0;
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new Object[]{"A Başlangıç", "A Bitiş","B Başlangıç",  "B Bitiş", "Soru Sayısı","Rekor Skor"});
        //ekrana yazdırmak için tableModele settingsden çekilen veriler ekleniyor
        for (settings settings : settingsArr) {
              tableModel.addRow(new Object[]{settings.getaMultStartPoint(), settings.getaMultFinishPoint(), settings.getbMultStartPoint(), settings.getbMultFinishPoint(), settings.getNumberOfQuestion(),settings.getMaxTotalScore()});
              counter=counter+3;
        }
        
        jTable1.setModel(tableModel);
        jTable1.repaint();
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    // Seçili satırın indeksini al
                    selectedRow = jTable1.getSelectedRow();

                }
            }
        });   

        System.out.println(userName);
        pack();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/3,Toolkit.getDefaultToolkit().getScreenSize().height/5);

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(102, 0, 102));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Mario Kart DS", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("oyuna basla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 0, 102));
        jButton2.setFont(new java.awt.Font("Mario Kart DS", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("cikis yap");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //oyun ekranına seçilen satır gönderiliyor o satırda hangi egzersiz bulunuyorsa o oyuna göre oyun oynancak
        selectedRow = jTable1.getSelectedRow();
        if(selectedRow != -1){
                    List<Float>  rows = readFullGame();
                    setVisible(false);
                    firstGameScreen frame = new firstGameScreen(selectedRow,userNameinit);
                    frame.setVisible(true);
        }else{
                    JOptionPane.showMessageDialog(this, "Lütfen oyun seçiniz");
        }

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       //çıkış tuşu
        setVisible(false);
        login frame = new login();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param settingsArr
     * @param args the command line arguments
     */


    public static void main(String args[]) throws ParseException {

        fileManager fileManager = new fileManager("settings.ser");
        List<settings> settingsArr = fileManager.readSetting();
        System.out.println(userNameinit);

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
            java.util.logging.Logger.getLogger(gameOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new gameOptions().setVisible(true);
                new gameOptions(settingsArr,userNameinit).setVisible(true);

            }
        });
    }
public List<Float> readFullGame() {
    //bu fonkisyonda oyunların ID değerleri gözetilerek doğruluk skoru, hız skoru ve toplam yüksek skorun değerleri  hesaplanıyor
    //ve bir diziye her bir oyun için 3'er 3'er değer aktarılıyor
        String fileName = "fullGames.csv";
        //int index = 0;
        List<Float> IDS = new ArrayList<>();
        List<Float> highestArr = new ArrayList<>();
        List<Float> highestSpeed = new ArrayList<>();
        List<Float> highestCorrect = new ArrayList<>();
        Float totalScore;
        Float speedScore;
        Float correctScore;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Float gameID = Float.valueOf(values[0]);
                if(IDS.contains(gameID) == false){
                    highestArr.add(0.0f);
                    highestSpeed.add(0.0f);
                    highestCorrect.add(0.0f);
                    IDS.add(gameID);
                    System.out.println("ID"+gameID);
                }

            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        for (Float IDvalue : IDS) {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    int gameID = Integer.parseInt(values[0]);
                    if (IDvalue == gameID) {
                        totalScore = Float.valueOf(values[6]);
                        speedScore = Float.valueOf(values[5]);
                        correctScore = Float.valueOf(values[4]);
                        int index = IDS.indexOf(IDvalue); // IDS listesindeki indeksi al
  
                        if (totalScore > highestArr.get(index)) {
                            highestArr.set(index, totalScore);
                        }
                        if (speedScore > highestSpeed.get(index)) {
                            highestSpeed.set(index, speedScore);
                        }
                        if (correctScore > highestCorrect.get(index)) {
                            highestCorrect.set(index, correctScore);
                        }
                    }
                }
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }


}
  
        List<Float> mergedList = new ArrayList<>();

        int size = highestArr.size();

        for (int i = 0; i < size; i++) {
            mergedList.add(highestArr.get(i));
            mergedList.add(highestSpeed.get(i));
            mergedList.add(highestCorrect.get(i));
        }

        return mergedList;  
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
