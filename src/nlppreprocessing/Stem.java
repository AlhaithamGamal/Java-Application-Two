/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nlppreprocessing;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HaithamGamal
 */
public class Stem extends javax.swing.JFrame {

    /**
     * Creates new form Stem
     */
    public Stem() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stopsent = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        res = new javax.swing.JTextArea();
        stem = new javax.swing.JButton();
        showup = new javax.swing.JButton();
        shup = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        rdtxt = new javax.swing.JTextArea();
        pri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("Type Your Sentence here");

        stopsent.setColumns(20);
        stopsent.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        stopsent.setForeground(new java.awt.Color(51, 204, 0));
        stopsent.setRows(5);
        jScrollPane1.setViewportView(stopsent);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 0));
        jLabel2.setText("Result");

        res.setColumns(20);
        res.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        res.setForeground(new java.awt.Color(51, 204, 0));
        res.setRows(5);
        jScrollPane2.setViewportView(res);

        stem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        stem.setForeground(new java.awt.Color(51, 204, 0));
        stem.setText("Stem");
        stem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stemActionPerformed(evt);
            }
        });

        showup.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showup.setForeground(new java.awt.Color(102, 204, 0));
        showup.setText("Show Upload");
        showup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showupActionPerformed(evt);
            }
        });

        shup.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        shup.setForeground(new java.awt.Color(255, 51, 0));
        shup.setEnabled(false);

        rdtxt.setColumns(20);
        rdtxt.setRows(5);
        jScrollPane3.setViewportView(rdtxt);

        pri.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pri.setForeground(new java.awt.Color(0, 204, 0));
        pri.setText("ReadFileAndPrint");
        pri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(showup)
                            .addComponent(stem)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(pri)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shup, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(stem)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showup)
                    .addComponent(shup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pri)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showupActionPerformed
        // TODO add your handling code here:
        shup.setEnabled(true);
    }//GEN-LAST:event_showupActionPerformed

    private void stemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stemActionPerformed
        // TODO add your handling code here:
         LinkedList<String> fileData =new LinkedList<String>();
           LinkedList<String> dataAfterStop =new LinkedList<String>();
         LinkedList<String[]> dataAfterTokinization2=new LinkedList<String[]>();
        try {
            dataAfterTokinization2= new FileOperations(null).readSentenceFromTheUser(stopsent.getText().toString(), fileData);//where null is the filename
            Stemming stem=new Stemming();
            dataAfterStop= stem.recieveStem(dataAfterTokinization2);
            for (int i = 0; i < dataAfterStop.size(); i++) {
                res.append("  "+dataAfterStop.get(i));
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StartTokenizeTwo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stemActionPerformed

    private void priActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priActionPerformed
        // TODO add your handling code here:
         LinkedList<String> fileData =new LinkedList<String>();
         LinkedList<String[]> dataAfterTokinization2=new LinkedList<String[]>();
          LinkedList<String> dataAfterStop =new LinkedList<String>();
        try {
            dataAfterTokinization2= new FileOperations("DataRead.txt").readSentenceFromTheUser(null, fileData);//where null is the filename
              Stemming stem=new Stemming();
             dataAfterStop= stem.recieveStem(dataAfterTokinization2);
             for (int i = 0; i < dataAfterStop.size(); i++) {
                rdtxt.append("  "+dataAfterStop.get(i));
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StartTokenizeTwo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_priActionPerformed

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
            java.util.logging.Logger.getLogger(Stem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton pri;
    private javax.swing.JTextArea rdtxt;
    private javax.swing.JTextArea res;
    private javax.swing.JButton showup;
    private javax.swing.JTextField shup;
    private javax.swing.JButton stem;
    private javax.swing.JTextArea stopsent;
    // End of variables declaration//GEN-END:variables
}