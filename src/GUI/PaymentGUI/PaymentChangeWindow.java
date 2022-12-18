/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.PaymentGUI;

import GUI.PaymentGUI.Components.ButtonConfirm;
import java.awt.Label;
import javax.swing.JLabel;


/**
 *
 * @author admin
 */
public class PaymentChangeWindow extends javax.swing.JPanel {
   
    
    /**
     * Creates new form TEST
     */
    public PaymentChangeWindow() {
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

        panelBorder1 = new GUI.PaymentGUI.Components.PanelBorder();
        buttonComfirm = new GUI.PaymentGUI.Components.ButtonConfirm();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        Received = new javax.swing.JLabel();
        Change = new javax.swing.JLabel();

        setBackground(new java.awt.Color(66, 56, 63));
        setPreferredSize(new java.awt.Dimension(720, 830));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorder1.setSize(new java.awt.Dimension(720, 830));
        panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonComfirm.setBackground(new java.awt.Color(246, 230, 230));
        buttonComfirm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Continue");
        buttonComfirm.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 630, 50));

        panelBorder1.add(buttonComfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 651, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/glasshour.png"))); // NOI18N
        panelBorder1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 208, 720, -1));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label2.setForeground(new java.awt.Color(161, 65, 65));
        label2.setText("Please wait for a moment ");
        panelBorder1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 720, -1));

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label3.setForeground(new java.awt.Color(184, 184, 184));
        label3.setName(""); // NOI18N
        label3.setText("Please click continue in ");
        panelBorder1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 121, 720, -1));

        Received.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Received.setForeground(new java.awt.Color(184, 184, 184));
        Received.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Received.setText("Received amount : 40 ฿");
        panelBorder1.add(Received, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 432, 720, 61));

        Change.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Change.setForeground(new java.awt.Color(0, 0, 0));
        Change.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Change.setText("Change : 5 ฿");
        panelBorder1.add(Change, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 535, 720, -1));

        add(panelBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 720, 730));
    }// </editor-fold>//GEN-END:initComponents
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Change;
    private javax.swing.JLabel Received;
    private GUI.PaymentGUI.Components.ButtonConfirm buttonComfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private GUI.PaymentGUI.Components.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
   
    public ButtonConfirm getButtonConfirm() {
        return buttonComfirm;
    }

    public Label getLabel3() {
        return label3;
    }  

    public JLabel getChange() {
        return Change;
    }

    public JLabel getReceived() {
        return Received;
    }

    
    
    
}
