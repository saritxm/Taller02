/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author nahin
 */
public class Final extends javax.swing.JFrame {

    /**
     * Creates new form Final
     */
    public Final() {
        initComponents();
        transparencia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOtra = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jOtra.setBackground(null);
        getContentPane().add(jOtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 260, 50));

        jSalir.setBackground(null);
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 260, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/jugarotra.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSalirActionPerformed

    private void transparencia(){
        jOtra.setOpaque(false);
		jOtra.setContentAreaFilled(false);
		jOtra.setBorderPainted(false);
        jSalir.setOpaque(false);
		jSalir.setContentAreaFilled(false);
		jSalir.setBorderPainted(false);
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JButton jOtra;
    public javax.swing.JButton jSalir;
    // End of variables declaration//GEN-END:variables
}
