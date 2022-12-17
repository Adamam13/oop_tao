/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.PaymentGUI;

import GUI.PaymentGUI.Components.Button;
import GUI.PaymentGUI.Components.PaymentMainWindowCashButton;
import GUI.PaymentGUI.Components.PaymentMainWindowQrCodeButton;
import GUI.PaymentGUI.Components.PaymentMainWindowTrueButton;
import java.awt.Label;
import javax.swing.JLabel;

/**
 *
 * @author admin
 */
public class PaymentMainWindow extends javax.swing.JPanel {

    /**
     * Creates new form PaymentMainWindow
     */
    public PaymentMainWindow() {
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

        BackButton1 = new javax.swing.JLabel();
        panelBorder1 = new GUI.PaymentGUI.Components.PanelBorder();
        ButtonCash = new GUI.PaymentGUI.Components.PaymentMainWindowCashButton();
        ButtonQrCode = new GUI.PaymentGUI.Components.PaymentMainWindowQrCodeButton();
        ButtonTrue = new GUI.PaymentGUI.Components.PaymentMainWindowTrueButton();
        ButtonCancel = new GUI.PaymentGUI.Components.Button();
        jLabel = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        ProductName = new java.awt.Label();
        ProductValue = new java.awt.Label();
        ProductImg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(66, 56, 63));
        setPreferredSize(new java.awt.Dimension(720, 830));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BackButton1.setForeground(new java.awt.Color(255, 255, 255));
        BackButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/Vector (3).png"))); // NOI18N
        BackButton1.setText("BACK");
        add(BackButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        panelBorder1.setMinimumSize(new java.awt.Dimension(720, 730));
        panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelBorder1.add(ButtonCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 299, -1, -1));
        panelBorder1.add(ButtonQrCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 299, -1, -1));
        panelBorder1.add(ButtonTrue, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 464, -1, -1));

        ButtonCancel.setBackground(new java.awt.Color(163, 43, 43));

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText("Cancel Order");

        javax.swing.GroupLayout ButtonCancelLayout = new javax.swing.GroupLayout(ButtonCancel);
        ButtonCancel.setLayout(ButtonCancelLayout);
        ButtonCancelLayout.setHorizontalGroup(
            ButtonCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
            .addGroup(ButtonCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ButtonCancelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        ButtonCancelLayout.setVerticalGroup(
            ButtonCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
            .addGroup(ButtonCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ButtonCancelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        panelBorder1.add(ButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 640, -1, -1));

        label1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        label1.setText("Choose Your Payment Method");
        panelBorder1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 28, -1, -1));

        ProductName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ProductName.setText("Product Name");
        panelBorder1.add(ProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 251, -1, -1));

        ProductValue.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ProductValue.setForeground(new java.awt.Color(238, 114, 0));
        ProductValue.setText("0 ฿");
        panelBorder1.add(ProductValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 90, -1));

        ProductImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProductImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/imgPayment.png"))); // NOI18N
        panelBorder1.add(ProductImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, 720, -1));

        add(panelBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 730));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButton1;
    private GUI.PaymentGUI.Components.Button ButtonCancel;
    private GUI.PaymentGUI.Components.PaymentMainWindowCashButton ButtonCash;
    private GUI.PaymentGUI.Components.PaymentMainWindowQrCodeButton ButtonQrCode;
    private GUI.PaymentGUI.Components.PaymentMainWindowTrueButton ButtonTrue;
    private javax.swing.JLabel ProductImg;
    private java.awt.Label ProductName;
    private java.awt.Label ProductValue;
    private javax.swing.JLabel jLabel;
    private java.awt.Label label1;
    private GUI.PaymentGUI.Components.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables

    
    
    public JLabel getBackButton() {
        return BackButton1;
    }

    public PaymentMainWindowCashButton getButtonCash() {
        return ButtonCash;
    }

    public Button getButtonPanel() {
        return ButtonCancel;
    }

    public PaymentMainWindowQrCodeButton getButtonQrCode() {
        return ButtonQrCode;
    }

    public PaymentMainWindowTrueButton getButtonTrue() {
        return ButtonTrue;
    }

    public Button getButtonCancel() {
        return ButtonCancel;
    }

    public JLabel getProductImg() {
        return ProductImg;
    }

    public Label getProductName() {
        return ProductName;
    }

    public Label getProductValue() {
        return ProductValue;
    }
    
    

}
