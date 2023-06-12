
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MÜDAFERKAYMAK
 */
public class pieChartBars extends javax.swing.JFrame {

    private DefaultPieDataset pieDataset;
    private JFreeChart pieChart;
    private PiePlot piePlot;
    private ChartPanel ChartPanel;
    private DefaultCategoryDataset dataset;
    private JFreeChart chart;
    private CategoryPlot categoryPlot;
    private ChartPanel chartPanelBars;
    
    private int correctCounter = 0;
    private int wrongCounter = 0;
    /**
     * Creates new form pieChartBars
     * @param ID
     */
    public pieChartBars(int ID) {
        //Aytrılı raporun gösterildiği ekrandan gelen ID bilgisi ile dosyadan veriler okunarak 
        // doğru yanlış sayısı oranlamaları ve hangi sorunun kaç saniyede çözdüğü bilgisi grafiksel olarak ekrana yazdırılrı
        initComponents();

        showPieChart(ID);
        showBarChart(ID);
    }
    public void showPieChart(int ID){
        //Doğru yanlış soruların birbirine oranları  ekranda gösterilir
            String fileName = "gameDetails.csv";

            //dosyadan ilgili ID'ye sahip oyunun bilgileri okunu
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {

                    String[] values = line.split(",");
                    int gameID = Integer.parseInt(values[7]);
                    // Yeni Record nesnesini oluştur ve tabloya ekle
                    if(gameID == ID){

                            String question = values[3];
                            String truth = values[5];
                           
                            if(truth.equals("\"Doğru\"")){
                                
                                correctCounter++;
                            }else if(truth.equals("\"Yanlış\"")){
                                wrongCounter++;
                            }
                            int time = Integer.parseInt(values[6]);

                    }


                }
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
        
            //doğru ve yanlış sayıları pie verisine eklenir
            pieDataset = new DefaultPieDataset();
            if(correctCounter>0)
                pieDataset.setValue("Doğru", correctCounter);
            if(wrongCounter>0)
                pieDataset.setValue("Yanlış", wrongCounter);

            //Ekleneen veriler ile pie oluşturulur
            pieChart = ChartFactory.createPieChart3D("Doğru Yanlış oransal karşılaştırma",pieDataset,true,true,false );
            piePlot = (PiePlot) pieChart.getPlot();
            piePlot.setBackgroundPaint(new Color(102,0,102));
            ChartPanel = new ChartPanel(pieChart);
            pieChartPanel.removeAll();
            pieChartPanel.add(ChartPanel, BorderLayout.CENTER);
            ChartPanel.validate();
        
        
        
         }
    public void showBarChart(int ID){
        //Hangi sorunun kaç saniyede çözdüğü bilgisi barlar halinde ekrana yazdırılır
        dataset = new DefaultCategoryDataset();
        String fileName = "gameDetails.csv";
        int counter = 0;
        //İlgili ID'ye sahip oyundan bilgiler dosyadan okunur
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {

                    String[] values = line.split(",");
                    int gameID = Integer.parseInt(values[7]);
                    // Yeni Record nesnesini oluştur ve tabloya ekle
                    if(gameID == ID){
                            counter++;
                           int totalTime = Integer.parseInt(values[6]);
                           //dosyadan okunan veriler datasete eklenir
                           dataset.addValue(totalTime,"Süre","Soru " + counter);
                    }


                }
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }

  
            //datasete aktarılan veriler ile bar grafiği oluşturulup Ekrana yazdırılır
            chart = ChartFactory.createBarChart("Soruların çözüm süreleri","","Saniye",dataset, PlotOrientation.VERTICAL,true,true,false);
            categoryPlot = chart.getCategoryPlot();
            categoryPlot.setBackgroundPaint(new Color(102,0,102));
            chartPanelBars = new ChartPanel(chart);
            jPanel1.removeAll();
            jPanel1.add(chartPanelBars, BorderLayout.CENTER);
            jPanel1.validate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        pieChartPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/3,Toolkit.getDefaultToolkit().getScreenSize().height/5);

        panel1.setBackground(new java.awt.Color(153, 102, 255));
        panel1.setPreferredSize(new java.awt.Dimension(900, 528));

        pieChartPanel.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Mario Kart DS", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("geri don");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pieChartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 403, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pieChartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        recordTable frame = new recordTable();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(pieChartBars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pieChartBars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pieChartBars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pieChartBars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pieChartBars(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel pieChartPanel;
    // End of variables declaration//GEN-END:variables
}
