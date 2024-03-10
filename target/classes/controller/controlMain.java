package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.vBienvenida;
import view.vJugador;
import view.vJugador2;
import view.vPartida;

public class controlMain implements ActionListener {

    private controlArchivos cArchivos;
    private controlPlayers cPlayers;
    private vBienvenida vb;
    private vJugador vj;
    private vJugador2 vj2;
    private vPartida vp;
    
    

    public controlMain() {
        //Instanciacion de la vista
        this.vb = new vBienvenida();
        this.vj = new vJugador();
        this.vj2 = new vJugador2();
        this.vp = new vPartida();
        //Escucha botones de la vista
        this.vb.btnContinuar.addActionListener(this);
        this.vb.btnSalir1.addActionListener(this);

        iniciar();
    }
    private void iniciar() {
        vb.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.vb.btnContinuar){
            vb.setVisible(false);
            vj.setVisible(true);  
        }
         //Botones para salir
         else if (e.getSource() == this.vb.btnSalir1|| e.getSource() == this.vj.btnSalirvJ|| e.getSource() == this.vj2.btnSalirvJv2){
            this.vb.dispose();
            this.vj.dispose();
            this.vj2.dispose();
        }
    }

}
