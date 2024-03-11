package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.io.File;

import javax.swing.JFileChooser;

import model.Player;
import model.Team;

public class controlPlayers {
    private controlArchivos cArchivos;
    private File f;
    private JFileChooser fc;
    private ArrayList<Team> equipos;
    private Team equipo1;
    private Team equipo2;
    private ArrayList<Player> players;

    public controlPlayers() throws IOException{
        fc= new JFileChooser(System.getProperty("user.dir"));
        fc.showOpenDialog(fc);
        f=fc.getSelectedFile();
        this.cArchivos = new controlArchivos();
        this.cArchivos.setProp(f);
        this.cArchivos.obtenerEquipos();
        this.equipos = new ArrayList<>(this.cArchivos.getEquipos());
    }

    public void obtenerEquipos(){
        Random nuRandom = new Random();
        int x = nuRandom.nextInt(equipos.size());
        this.equipo1 = equipos.get(x);
        while(true){
            int x2 = nuRandom.nextInt(equipos.size());
            if(x2!=x){
                this.equipo2 = equipos.get(x2);
                break;
            }
        }
    }

    public void randomPlayers(ArrayList<Player> jugadores){
        this.players = new ArrayList<>(jugadores);
        Collections.shuffle(players);

        this.equipo1.iniciar(players.get(0),players.get(1),players.get(2),players.get(3));
        this.equipo2.iniciar(players.get(4),players.get(5),players.get(6),players.get(7));
    }

    public Team getEquipo1() {
        return this.equipo1;
    }

    public Team getEquipo2() {
        return this.equipo2;
    }
}
