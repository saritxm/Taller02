/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JFileChooser;

/**
 *
 * @author Sara
 */
public class vBienvenida extends javax.swing.JFrame {

    public JFileChooser fProp;
    public JFileChooser fResult;

    /**
     * Creates new form vBienvenida
     */
    public vBienvenida() {
        setTitle("Campeonato Nacional de Tejo");
        fProp= new JFileChooser(System.getProperty("user.dir"));
        fProp.setDialogTitle("Seleccionar el archivo de propiedades");
        fResult= new JFileChooser(System.getProperty("user.dir"));
        fResult.setDialogTitle("Seleccionar el archivo de resultados");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textoTitulo = new javax.swing.JLabel();
        TextovBienvenida = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoTitulo.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 26)); // NOI18N
        textoTitulo.setText("Campeonato Nacional de Tejo");
        jPanel1.add(textoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 330, 50));

        TextovBienvenida.setFont(new java.awt.Font("Microsoft Uighur", 0, 28)); // NOI18N
        TextovBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        TextovBienvenida.setText("¡Demuestra tu habilidad en el tejo y conviértete en el campeón! ");
        jPanel1.add(TextovBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        btnContinuar.setBackground(new java.awt.Color(255, 255, 102));
        btnContinuar.setText("CONTINUAR");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 150, 40));

        btnSalir1.setBackground(new java.awt.Color(255, 153, 153));
        btnSalir1.setText("SALIR");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/ventanabienv.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalir1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TextovBienvenida;
    public javax.swing.JButton btnContinuar;
    public javax.swing.JButton btnSalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoTitulo;
    // End of variables declaration//GEN-END:variables
}
