package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.vBienvenida;

public class controlMain implements ActionListener {

    private vBienvenida vb;
    private controlArchivos cArchivos;
    private controlPlayers cPlayers;

    public controlMain() {
        this.vb = new vBienvenida();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
