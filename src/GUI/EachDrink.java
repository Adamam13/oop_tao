/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import javax.swing.JLabel;

/**
 *
 * @author Adam
 */
public class EachDrink extends javax.swing.JPanel {

    /**
     * Creates new form EachDrink
     */
    public EachDrink() {
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

        jPanel1 = new javax.swing.JPanel();
        BackButton = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        typeOfDrink = new GUI.MenuComponent.TypeOfDrink();
        sweetnessLevel = new GUI.MenuComponent.SweetnessLevel();
        toppings = new GUI.MenuComponent.Toppings();
        purchasingButton = new GUI.MenuComponent.PurchasingButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(66, 56, 63));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 830));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/Vector (3).png"))); // NOI18N
        BackButton.setText("BACK");
        jPanel1.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, 720, -1));

        name.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        name.setForeground(new java.awt.Color(247, 230, 230));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Soda");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 79, 720, -1));
        jPanel1.add(typeOfDrink, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 143, -1, -1));
        jPanel1.add(sweetnessLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 282, -1, -1));
        jPanel1.add(toppings, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 421, -1, -1));
        jPanel1.add(purchasingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 560, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 830));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButton;
    private javax.swing.JLabel image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private GUI.MenuComponent.PurchasingButton purchasingButton;
    private GUI.MenuComponent.SweetnessLevel sweetnessLevel;
    private GUI.MenuComponent.Toppings toppings;
    private GUI.MenuComponent.TypeOfDrink typeOfDrink;
    // End of variables declaration//GEN-END:variables

    public JLabel getBackButton() {
        return BackButton;
    }
    
    
}
