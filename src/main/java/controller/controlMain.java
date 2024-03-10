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

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
