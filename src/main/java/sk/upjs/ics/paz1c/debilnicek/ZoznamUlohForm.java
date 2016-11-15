/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.debilnicek;

import java.util.List;

/**
 *
 * @author kriza
 */
public class ZoznamUlohForm extends javax.swing.JFrame {

    //private ZoznamUloh zoznamUloh = new ZoznamUloh();

    private UlohaDao zoznamUloh = new SuborovyUlohaDao();
    
    /**
     * Creates new form ZoznamUlohForm
     */
    public ZoznamUlohForm() {
        initComponents();

        aktualizujZoznamUloh();
    }

    private void aktualizujZoznamUloh() {
        //zizkaj model
        UlohaTabModel model = (UlohaTabModel) ulohyTable.getModel();
        //aktualizuj ho
        model.aktualizovat();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        popisUlohyTextField = new javax.swing.JTextField();
        PridajUlohuButton = new javax.swing.JButton();
        ZmazatUlohuButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ulohyTable = new javax.swing.JTable();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        popisUlohyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popisUlohyTextFieldActionPerformed(evt);
            }
        });

        PridajUlohuButton.setText("Pridať");
        PridajUlohuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PridajUlohuButtonActionPerformed(evt);
            }
        });

        ZmazatUlohuButton.setText("Zmazať");
        ZmazatUlohuButton.setEnabled(false);
        ZmazatUlohuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZmazatUlohuButtonActionPerformed(evt);
            }
        });

        ulohyTable.setModel(new UlohaTabModel());
        jScrollPane2.setViewportView(ulohyTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(popisUlohyTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PridajUlohuButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ZmazatUlohuButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(popisUlohyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PridajUlohuButton)
                    .addComponent(ZmazatUlohuButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void popisUlohyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popisUlohyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popisUlohyTextFieldActionPerformed

    private void PridajUlohuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PridajUlohuButtonActionPerformed
        String popisUlohy = popisUlohyTextField.getText();
        Uloha novaUloha = new Uloha();
        novaUloha.setPopis(popisUlohy);
        zoznamUloh.pridaj(novaUloha);
        aktualizujZoznamUloh();
    }//GEN-LAST:event_PridajUlohuButtonActionPerformed

    private void ZmazatUlohuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZmazatUlohuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZmazatUlohuButtonActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ZoznamUlohForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZoznamUlohForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZoznamUlohForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZoznamUlohForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZoznamUlohForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PridajUlohuButton;
    private javax.swing.JButton ZmazatUlohuButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField popisUlohyTextField;
    private javax.swing.JTable ulohyTable;
    // End of variables declaration//GEN-END:variables
}
