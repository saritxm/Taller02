package controller;

import java.awt.color.CMMException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import model.Player;
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
    private Player p1, p2,p3,p4,p5,p6,p7,p8;
    private ArrayList<Player> players; 
    
    

    public controlMain() throws IOException {
        //Instanciacion de la vista
        this.vb = new vBienvenida();
        this.vj = new vJugador();
        this.vj2 = new vJugador2();
        this.vp = new vPartida();
        //Escucha botones de la vista
        this.vb.btnContinuar.addActionListener(this);
        this.vb.btnSalir1.addActionListener(this);
        this.vj.btnRegistrarJ.addActionListener(this);
        this.vj.btnSalirvJ.addActionListener(this);
        this.vj2.btnSalirvJv2.addActionListener(this);
        this.vj2.btnRegistrarJv2.addActionListener(this);
        this.vp.btnSalirP.addActionListener(this);
        this.vp.btnLanzartejo.addActionListener(this);
        
        //Controladores
        cArchivos = new controlArchivos();
        //Instanciacion del arraylist de los jugadores que se registran
        this.players = new ArrayList<Player>();
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
        if(e.getSource() == this.vj.btnRegistrarJ){
            p1.setNombre(vj.cajaNombreJ1.getText());
            p1.setEdad(Integer.parseInt(vj.cajaEdadJ1.getText()));
            p1.setCedula(vj.cajaCedulaJ1.getText());
            p2.setNombre(vj.cajaNombreJ2.getText());
            p2.setEdad(Integer.parseInt(vj.cajaEdadJ2.getText()));
            p2.setCedula(vj.cajaCedulaJ2.getText());
            p3.setNombre(vj.cajaNombreJ3.getText());
            p3.setEdad(Integer.parseInt(vj.cajaEdadJ3.getText()));
            p3.setCedula(vj.cajaCedulaJ3.getText());
            p4.setNombre(vj.cajaNombreJ4.getText());
            p4.setEdad(Integer.parseInt(vj.cajaEdadJ4.getText()));
            p4.setCedula(vj.cajaCedulaJ4.getText());
            p5.setNombre(vj.cajaNombreJ5.getText());
            p5.setEdad(Integer.parseInt(vj.cajaEdadJ5.getText()));
            p5.setCedula(vj.cajaCedulaJ5.getText());
            p6.setNombre(vj.cajaNombreJ6.getText());
            p6.setEdad(Integer.parseInt(vj.cajaEdadJ6.getText()));
            p6.setCedula(vj.cajaCedulaJ6.getText());
            p7.setNombre(vj.cajaNombreJ7.getText());
            p7.setEdad(Integer.parseInt(vj.cajaEdadJ7.getText()));
            p7.setCedula(vj.cajaCedulaJ7.getText());
            p8.setNombre(vj.cajaNombreJ8.getText());
            p8.setEdad(Integer.parseInt(vj.cajaEdadJ8.getText()));
            p8.setCedula(vj.cajaCedulaJ8.getText());
            players.add(p1);
            players.add(p2);
            players.add(p3);
            players.add(p4);
            players.add(p5);
            players.add(p6);
            players.add(p7);
            players.add(p8);
            cPlayers.randomPlayers(players);
           }
    }
}
