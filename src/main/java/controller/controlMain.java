package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.vBienvenida;
import view.vJugador;

public class controlMain implements ActionListener {

    private vBienvenida vb;
    private vJugador vj;
    private controlArchivos cArchivos;
    private controlPlayers cPlayers;

    public controlMain() {
        //Instanciacion de la vista
        this.vb = new vBienvenida();
        this.vj = new vJugador();
        //Escucha botones de la vista
        this.vb.btnContinuar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.vb.btnContinuar){
            
        }
    }

}
