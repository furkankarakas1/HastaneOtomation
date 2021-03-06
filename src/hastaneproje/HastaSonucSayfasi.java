/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastaneproje;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Furkan
 */
public class HastaSonucSayfasi extends javax.swing.JFrame {

    /**
     * Creates new form HastaSonucSayfasi
     */
    public HastaSonucSayfasi() {
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

        SonucOgren = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_hasta = new javax.swing.JTable();
        btn_sncAdd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SonucOgren.setBackground(java.awt.Color.cyan);
        SonucOgren.setText("Sonuc Ogren");
        SonucOgren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SonucOgrenActionPerformed(evt);
            }
        });

        tbl_hasta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SonucID", "DepartmanID", "DoktorID", "HastaID", "Tahlil Sonucu", "Tahlil Turu"
            }
        ));
        jScrollPane1.setViewportView(tbl_hasta);

        btn_sncAdd.setBackground(java.awt.Color.cyan);
        btn_sncAdd.setText("Sonuc Ekle");
        btn_sncAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sncAddActionPerformed(evt);
            }
        });

        jButton1.setBackground(java.awt.Color.cyan);
        jButton1.setText("Guncelle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.Color.cyan);
        jButton2.setText("Sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(SonucOgren, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_sncAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SonucOgren, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sncAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SonucOgrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SonucOgrenActionPerformed

        try {
            FileReader fileReader = new FileReader("Hastalar.txt");

            BufferedReader br = new BufferedReader(fileReader);//dosyay?? olu??tur
            
            DefaultTableModel tableModel = (DefaultTableModel) tbl_hasta.getModel();
  
            Object[] tableLines = br.lines().toArray();

            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                tableModel.addRow(dataRow);
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_SonucOgrenActionPerformed

    private void btn_sncAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sncAddActionPerformed
        
         HastaneEkleSf hasta = new HastaneEkleSf();
            
            hasta.setVisible(true);
        
        
    }//GEN-LAST:event_btn_sncAddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       DefaultTableModel model = (DefaultTableModel) tbl_hasta.getModel();
        // get selected row index
        try {
            int SelectedRowIndex = tbl_hasta.getSelectedRow();
            model.removeRow(SelectedRowIndex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }


        try
        {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Hastalar.txt"));
            PrintWriter fileWriter = new PrintWriter(bufferedWriter);

            for(int i=0; i<model.getRowCount(); ++i)
            {
                for(int j=0; j<model.getColumnCount(); ++j)
                {
                    String s = model.getValueAt(i,j).toString();
                    fileWriter.print(s);
                    fileWriter.print("/");
                }
                fileWriter.println("");
            }
            fileWriter.close();
            JOptionPane.showMessageDialog(null, "Silindi");
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Hata");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      DefaultTableModel model = (DefaultTableModel) tbl_hasta.getModel();
           try
        {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Hastalar.txt"));
            PrintWriter fileWriter = new PrintWriter(bufferedWriter);




            for(int i=0; i<model.getRowCount(); ++i)
            {
                for(int j=0; j<model.getColumnCount(); ++j)
                {
                    String s = model.getValueAt(i,j).toString();
                    fileWriter.print(s);
                    fileWriter.print("/");
                }
                fileWriter.println("");
            }
            fileWriter.close();
            JOptionPane.showMessageDialog(null, "G??ncelleme ????lemi Ba??ar??l??.");
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "G??ncelleme ????lemi Yap??l??rkem Hata!");
        }

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
            java.util.logging.Logger.getLogger(HastaSonucSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HastaSonucSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HastaSonucSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HastaSonucSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HastaSonucSayfasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SonucOgren;
    private javax.swing.JButton btn_sncAdd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_hasta;
    // End of variables declaration//GEN-END:variables
}
