package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.vBienvenida;
import view.vJugador;
import view.vPartida;

public class controlMain implements ActionListener {

    private controlArchivos cArchivos;
    private controlPlayers cPlayers;
    private vBienvenida vb;
    private vJugador vj;
    private vPartida vp;
    

    public controlMain() {
        //Instanciacion de la vista
        this.vb = new vBienvenida();
        this.vj = new vJugador();
        this.vp = new vPartida();
        //Escucha botones de la vista
        this.vb.btnContinuar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.vb.btnContinuar){
            vb.setVisible(false);
            vj.setVisible(true);  
        }
    }

}
