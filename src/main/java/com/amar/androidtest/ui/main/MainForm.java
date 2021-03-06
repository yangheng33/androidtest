/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.androidtest.ui.main;

import com.amar.androidtest.ui.record.RecordForm;
import com.amar.androidtest.ui.use.UseTestForm;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;

/**
 *
 * @author amar
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
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

        contentTabbedPane = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        recordTestMenuItem = new javax.swing.JMenuItem();
        useTestMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentTabbedPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        contentTabbedPane.setMinimumSize(new java.awt.Dimension(0, 0));

        jMenu1.setText("开始");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("测试");

        recordTestMenuItem.setText("录制测试脚本");
        recordTestMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                recordTestMenuItemMouseReleased(evt);
            }
        });
        jMenu2.add(recordTestMenuItem);

        useTestMenuItem.setText("应用测试脚本");
        useTestMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                useTestMenuItemMouseReleased(evt);
            }
        });
        jMenu2.add(useTestMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int tabIndex = 0;
    RecordForm recordForm;
    Map<JPanel,Integer> tabMap = new HashMap<JPanel,Integer>();
    private void recordTestMenuItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordTestMenuItemMouseReleased
        
        if(recordForm==null){    
            recordForm = new RecordForm();
            contentTabbedPane.add("录制测试脚本",recordForm);
            contentTabbedPane.setSelectedIndex(tabIndex);
            tabMap.put(recordForm, tabIndex++);
            
        }
        else{
            int index = tabMap.get(recordForm);
            contentTabbedPane.setSelectedIndex(index);
        }
    }//GEN-LAST:event_recordTestMenuItemMouseReleased

    UseTestForm useTestForm;
    private void useTestMenuItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_useTestMenuItemMouseReleased
        if(useTestForm==null){    
            useTestForm = new UseTestForm();
            contentTabbedPane.add("使用测试脚本",useTestForm);
            contentTabbedPane.setSelectedIndex(tabIndex);
            tabMap.put(useTestForm, tabIndex++);
            
        }
        else{
            int index = tabMap.get(useTestForm);
            contentTabbedPane.setSelectedIndex(index);
        }
        
    }//GEN-LAST:event_useTestMenuItemMouseReleased

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane contentTabbedPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem recordTestMenuItem;
    private javax.swing.JMenuItem useTestMenuItem;
    // End of variables declaration//GEN-END:variables
}
