/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.MenuComponent;

import GUI.Components.pnlBorder;
import java.awt.Color;

/**
 *
 * @author Adam
 */
public class TypeOfDrinkButton extends javax.swing.JPanel {

    /**
     * Creates new form FlowLayoutButton
     */
    public TypeOfDrinkButton() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hotButton = new GUI.Components.pnlBorder();
        hotText = new javax.swing.JLabel();
        icedButton = new GUI.Components.pnlBorder();
        icedText = new javax.swing.JLabel();
        smoothieButton = new GUI.Components.pnlBorder();
        smoothieText = new javax.swing.JLabel();

        hotButton.setBackground(new java.awt.Color(144, 111, 118));
        hotButton.setPreferredSize(new java.awt.Dimension(175, 35));
        hotButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hotText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        hotText.setForeground(new java.awt.Color(255, 255, 255));
        hotText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hotText.setText("Hot");
        hotButton.add(hotText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 160, -1));

        icedButton.setBackground(new java.awt.Color(144, 111, 118));
        icedButton.setPreferredSize(new java.awt.Dimension(175, 35));
        icedButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icedText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        icedText.setForeground(new java.awt.Color(255, 255, 255));
        icedText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icedText.setText("Iced(+฿5)");
        icedButton.add(icedText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 160, -1));

        smoothieButton.setBackground(new java.awt.Color(144, 111, 118));
        smoothieButton.setPreferredSize(new java.awt.Dimension(175, 35));
        smoothieButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        smoothieText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        smoothieText.setForeground(new java.awt.Color(255, 255, 255));
        smoothieText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        smoothieText.setText("Smoothie(+฿10)");
        smoothieButton.add(smoothieText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 160, -1));

        setPreferredSize(new java.awt.Dimension(574, 45));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.Components.pnlBorder hotButton;
    private javax.swing.JLabel hotText;
    private GUI.Components.pnlBorder icedButton;
    private javax.swing.JLabel icedText;
    private GUI.Components.pnlBorder smoothieButton;
    private javax.swing.JLabel smoothieText;
    // End of variables declaration//GEN-END:variables

    public pnlBorder getHotButton() {
        return hotButton;
    }

    public pnlBorder getIcedButton() {
        return icedButton;
    }

    public pnlBorder getSmoothieButton() {
        return smoothieButton;
    }

}
