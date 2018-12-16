/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danbrost
 */
public class DataAnalysis extends javax.swing.JFrame {

    /**
     * Creates new form DataAnalysis
     */
    public DataAnalysis() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        label1 = new java.awt.Label();
        Bombardier = new java.awt.Button();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Manulife = new java.awt.Button();
        jTable2 = new javax.swing.JTable();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Highest Opening Value");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Open", "High", "Low", "Close", "sAdjt Close", "Volume"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        label1.setText("Choose Stock to View");

        Bombardier.setLabel("Bombardier");
        Bombardier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BombardierActionPerformed(evt);
            }
        });

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Highest Opening"));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lowest Closing"));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Highest Closing"));

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lowest Opening"));

        Manulife.setLabel("Manulife Financial Corporation");
        Manulife.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManulifeActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Open", "High", "Low", "Close", "sAdjt Close", "Volume"
            }
        ));

        button1.setLabel("Exit");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setLabel("Clear Calculation");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Manulife, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                    .addComponent(Bombardier, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(373, 373, 373))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(285, 285, 285))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bombardier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(Manulife, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(423, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BombardierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BombardierActionPerformed
       {
				System.out.println("\nPrint dataArray");
				System.out.println("****************************");
				// .csv file where data is coming from
				String fileName = "/Users/danbrost/Desktop/Georgian/Java/JavaFX/StockMarket1/newBBD.csv";
				// Creates a new file to store date from .csv file
				File file = new File(fileName);
				/****************lookup file******************/ 
				// Headings
				int lineNumber = 0;
			try
			{
				
				//create Scanner to read the file
				Scanner inputStream = new Scanner(file);
				while(inputStream.hasNext()&& lineNumber <20)
				{
					lineNumber++;
					//reads whole line
					String info = inputStream.next();
					// splits each row into columns when a comma is reached
					String[] data = info.split(",");
                                        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                                        model.addRow(data);
					
				}
				
				inputStream.close();
				
			} catch(FileNotFoundException | NumberFormatException e)
			{
				System.out.println("Exception while reading csv file: " + e);			
			}
	}
               
    }//GEN-LAST:event_BombardierActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        {
                    List<Double> highestOpening = new ArrayList<>();
                    List<Double> highestClosing = new ArrayList<>();
                    List<Double> lowestOpening = new ArrayList<>();
                    List<Double> lowestClosing = new ArrayList<>();
                    List<List> entries = new ArrayList();
                    
                    double maxValue = 0;
                    double minValue = 10000000;
	
			try
			{
				//.csv file where data is coming from
				String csvFile = "/Users/danbrost/Desktop/Georgian/Java/JavaFX/StockMarket1/newBBD.csv";
			
				//create BufferedReader to read the file
				BufferedReader bufferedReader = new BufferedReader( new FileReader(csvFile));
                               
				String line = "";
				int lineNumber = 0;
				int tokenNumber = 0;
			
				//read file line by line
				while( (line = bufferedReader.readLine()) != null && lineNumber <20)
				{
					lineNumber++;
					// Initializing ArrayList
					ArrayList<String> csvArray = new ArrayList<>();
					// break up data into tokens/ pieces
					StringTokenizer z = new StringTokenizer(line, ","); 
					while(z.hasMoreTokens())
					{
						// assigns token number for each values from csv File
						tokenNumber++;
						String token = z.nextToken();
						//add each token to the Array list
						csvArray.add(token);	
					
					}
						//prints data
                                               // double open = Double.parseDouble(data[1]);
                                              //  double high = Double.parseDouble(data[2]);
                                               // double low = Double.parseDouble(data[3]);
                                               // double close =Double.parseDouble(data[4]);
                                               // double sAdjClose = Double.parseDouble(data[5]);
                                               // int volume = Integer.parseInt(data[6]);
						
						//Highest Opening and Closing
						highestOpening.add(Double.parseDouble(csvArray.get(1)));
						highestClosing.add(Double.parseDouble(csvArray.get(4)));
						//Lowest Opening and Closing
						lowestOpening.add(Double.parseDouble(csvArray.get(1)));
						lowestClosing.add(Double.parseDouble(csvArray.get(4)));
                                                entries.add(csvArray);
					
						tokenNumber = 0;
				}	
				
			}
			catch(Exception e)
			{
				System.out.println("Exception while reading csv file: " + e);			
			}
                       
                        // Highest opening value
                        System.out.println("Basic Calculations");
                        System.out.println("******************");
			for(double value: highestOpening) {
				if(value > maxValue) {
					maxValue = value;
				}
                        }
                        final double finalMaxOpeningValue = maxValue;
                        // final variable (value is unchangable) created to pass maxValue into the lambda filter expression. This variable is then used to find the entry where the open is equal to max value.
                        List<String> maxOpening = entries.stream().filter(entry -> finalMaxOpeningValue == Double.parseDouble((String) entry.get(1))).findAny().orElse(null);
			jLabel6.setText(maxOpening.get(0) + " at $" + maxValue );
                        
                        // Lowest Closing
                        for(double value: lowestClosing) {
				if(value < minValue) {
					minValue = value;
				}
			}
                         final double finalMinClosingValue = minValue;
                        // final variable (value is unchangable) created to pass minValue into the lambda filter expression. This variable is then used to find the entry where the open is equal to max value.
                        List<String> minClosing = entries.stream().filter(entry -> finalMinClosingValue == Double.parseDouble((String) entry.get(4))).findAny().orElse(null);
			jLabel2.setText(minClosing.get(0) + " at $" + minValue );
                        
                        // Highest closing value
			for(double value: highestClosing) {
				if(value > maxValue) {
					maxValue = value;
				}
                        }
			 final double finalMaxClosingValue = maxValue;
                        // final variable (value is unchangable) created to pass maxValue into the lambda filter expression. This variable is then used to find the entry where the open is equal to max value.
                        List<String> maxClosing = entries.stream().filter(entry -> finalMaxClosingValue == Double.parseDouble((String) entry.get(4))).findAny().orElse(null);
			jLabel1.setText(maxClosing.get(0) + " at $" + maxValue );
                        
                        // lowest opening value
			for(double value: lowestOpening) {
				if(value < minValue) {
					minValue = value;
				}
			}
			 final double finalMinOpeningValue = minValue;
                        // final variable (value is unchangable) created to pass maxValue into the lambda filter expression. This variable is then used to find the entry where the open is equal to max value.
                        List<String> minOpening = entries.stream().filter(entry -> finalMinOpeningValue == Double.parseDouble((String) entry.get(1))).findAny().orElse(null);
			jLabel3.setText(minOpening.get(0) + " at $" + minValue );
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ManulifeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManulifeActionPerformed
    {
				System.out.println("\nPrint dataArray");
				System.out.println("****************************");
				// .csv file where data is coming from
				String fileName = "/Users/danbrost/Desktop/Georgian/Java/JavaFX/StockMarket1/newMFC.numbers";
				// Creates a new file to store date from .csv file
				File file = new File(fileName);
				/****************lookup file******************/ 
				// Headings
				int lineNumber = 0;
			try
			{
				
				//create Scanner to read the file
				Scanner inputStream = new Scanner(file);
				while(inputStream.hasNext()&& lineNumber <20)
				{
					lineNumber++;
					//reads whole line
					String info = inputStream.next();
					// splits each row into columns when a comma is reached
					String[] data = info.split(",");
                                        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                                        model.addRow(data);
					
				}
				
				inputStream.close();
				
			} catch(FileNotFoundException | NumberFormatException e)
			{
				System.out.println("Exception while reading csv file: " + e);			
			}
	}
               
                                 
	
               
                       
    }//GEN-LAST:event_ManulifeActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       model.setRowCount(0);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
       jLabel6.setText("   ");
       jLabel2.setText("   ");
       jLabel1.setText("   ");
       jLabel3.setText("   ");
    }//GEN-LAST:event_button2ActionPerformed

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
            java.util.logging.Logger.getLogger(DataAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataAnalysis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataAnalysis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Bombardier;
    private java.awt.Button Manulife;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}