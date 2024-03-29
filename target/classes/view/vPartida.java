/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.AlphaComposite;
import javax.swing.Icon;

/**
 *
 * @author Sara
 */
public class vPartida extends javax.swing.JFrame {

    /**
     * Creates new form vPartida
     */
    public vPartida(){
        setTitle("Partida de tejo");
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
        jLabel2 = new javax.swing.JLabel();
        btnSalirP = new javax.swing.JButton();
        btnLanzartejo = new javax.swing.JButton();
        panel2 = new java.awt.Panel();
        jLabel1B = new javax.swing.JLabel();
        jLabel2B = new javax.swing.JLabel();
        jLabel3B = new javax.swing.JLabel();
        jLabel4B = new javax.swing.JLabel();
        pEquipo2 = new javax.swing.JLabel();
        jLabelFondoB = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jLabel1A = new javax.swing.JLabel();
        jLabel2A = new javax.swing.JLabel();
        jLabel3A = new javax.swing.JLabel();
        jLabel4A = new javax.swing.JLabel();
        pEquipo1 = new javax.swing.JLabel();
        jLabelFondoA = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Perpetua", 1, 34)); // NOI18N
        jLabel2.setText("CAMPEONATO NACIONAL DE TEJO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        btnSalirP.setBackground(new java.awt.Color(255, 255, 153));
        btnSalirP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalirP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/SALIRBTN.jpg"))); // NOI18N
        btnSalirP.setText("SALIR");
        jPanel1.add(btnSalirP, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 110, 50));

        btnLanzartejo.setBackground(new java.awt.Color(153, 0, 0));
        btnLanzartejo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLanzartejo.setForeground(new java.awt.Color(255, 255, 255));
        btnLanzartejo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/LANZARBTN.jpg"))); // NOI18N
        btnLanzartejo.setText("LANZAR TEJO");
        jPanel1.add(btnLanzartejo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 130, 50));

        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1B.setText("jLabel3");
        panel2.add(jLabel1B, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 240, -1));

        jLabel2B.setText("jLabel3");
        panel2.add(jLabel2B, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 220, -1));

        jLabel3B.setText("jLabel3");
        panel2.add(jLabel3B, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 200, -1));

        jLabel4B.setText("jLabel3");
        panel2.add(jLabel4B, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 200, -1));

        pEquipo2.setText("Puntaje: 0");
        panel2.add(pEquipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 120, 20));

        jLabelFondoB.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFondoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/equipo b.jpg"))); // NOI18N
        panel2.add(jLabelFondoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 400, 350));

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 390, 310));

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1A.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1A.setText("XD");
        panel1.add(jLabel1A, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 190, 20));

        jLabel2A.setText("jLabel5");
        panel1.add(jLabel2A, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 170, 20));

        jLabel3A.setText("jLabel5");
        panel1.add(jLabel3A, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 180, -1));

        jLabel4A.setText("jLabel3");
        panel1.add(jLabel4A, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 200, -1));

        pEquipo1.setText("Puntaje: 0");
        panel1.add(pEquipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 20, 80, -1));

        jLabelFondoA.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFondoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/equipo a.jpg"))); // NOI18N
        panel1.add(jLabelFondoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 310));

        jPanel1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 390, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/ventanapartida.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnLanzartejo;
    public javax.swing.JButton btnSalirP;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel1A;
    public javax.swing.JLabel jLabel1B;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel2A;
    public javax.swing.JLabel jLabel2B;
    public javax.swing.JLabel jLabel3A;
    public javax.swing.JLabel jLabel3B;
    public javax.swing.JLabel jLabel4A;
    public javax.swing.JLabel jLabel4B;
    public javax.swing.JLabel jLabelFondoA;
    public javax.swing.JLabel jLabelFondoB;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel pEquipo1;
    public javax.swing.JLabel pEquipo2;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
    public void mostrarMensaje(String nJugador, int puntaje){
        JOptionPane.showMessageDialog(null, "El jugador "+nJugador+ " obtuvo como resultado: "+puntaje, "LANZAMIENTO", JOptionPane.INFORMATION_MESSAGE);
    }
    public void mostrarResultado(String jugadores){
        JOptionPane.showMessageDialog(null, jugadores, "EQUIPO GANADOR", JOptionPane.INFORMATION_MESSAGE);
    }

    public ImageIcon cambiarOpacidad(Icon imagenO ,float opacidad ){

       //comentario random

       int ancho = imagenO.getIconWidth();
       int alto = imagenO.getIconHeight();
   
       BufferedImage nuevaImagen = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_ARGB);
   
       // Obtener una instancia de Graphics2D para dibujar en la nueva imagen
       Graphics2D g2d = nuevaImagen.createGraphics();
   
       // Configurar la composición alfa para aplicar la opacidad
       AlphaComposite alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacidad);
       g2d.setComposite(alphaComposite);
   
       // Dibujar el Icon en la nueva imagen
       imagenO.paintIcon(null, g2d, 0, 0);
   
       // Liberar los recursos del Graphics2D
       g2d.dispose();
   
       // Crear un nuevo ImageIcon con la imagen modificada y devolverlo
       return new ImageIcon(nuevaImagen);
    }

    public void ponerOpaco1(float f){
        try {
            Icon iconoModificadoA= cambiarOpacidad(getImageIcon1(), f); // 50% de opacidad
            // Establecer el icono modificado en el JLabel
            jLabelFondoA.setIcon(iconoModificadoA);
            jLabelFondoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/equipo b.jpg")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void ponerOpaco2(float f){
        try {
            Icon iconoModificadoB = cambiarOpacidad(getImageIcon2(), f); // 50% de opacidad

            // Establecer el icono modificado en el JLabel
            jLabelFondoB.setIcon(iconoModificadoB);
            jLabelFondoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/equipo a.jpg")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Icon getImageIcon1(){
        return jLabelFondoA.getIcon(); 
    }
    public Icon getImageIcon2(){
        return jLabelFondoB.getIcon(); 
    }

    public void terminado(){
        JOptionPane.showMessageDialog(null, "Ya jugaste las 2 partidas, vuelve pronto", "PROGRAMA FINALIZADO", JOptionPane.INFORMATION_MESSAGE);
    }
}
