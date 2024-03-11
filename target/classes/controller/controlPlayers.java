package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.io.File;

import javax.swing.JFileChooser;

import model.Player;
import model.Team;

/**
 * Clase encargada de ejegir aleatoreamente los equipos y asignarle los jugadores de la misma manera
 */
public class controlPlayers {
    private controlArchivos cArchivos;
    private File f;
    private JFileChooser fc;
    //Lista de equipos traidas del properties
    private ArrayList<Team> equipos;
    //Lista de jugadores traidos del usuarios
    private ArrayList<Player> players;
    //Equipos a jugar
    private Team equipo1;
    private Team equipo2;
    
    /**
     * Metodo constructor para instanciar todo lo necesario 
     * @throws IOException
     */
    public controlPlayers() throws IOException{
        fc= new JFileChooser(System.getProperty("user.dir"));
        fc.showOpenDialog(fc);
        f=fc.getSelectedFile();
        this.cArchivos = new controlArchivos();
        this.cArchivos.setProp(f);
        this.cArchivos.obtenerEquipos();
        this.equipos = new ArrayList<>(this.cArchivos.getEquipos());
    }

    /**
     * De los equipos traidos del gestor de archivos elegir 2 aleatoriamente
     */
    public void obtenerEquipos(){
        Random nuRandom = new Random();                 //Random    
        int x = nuRandom.nextInt(equipos.size());       //Generar un numero random
        this.equipo1 = equipos.get(x);                  //Elegir el equpo que esta en esa posicion aletoria
        while(true){                                    //Ciclo
            int x2 = nuRandom.nextInt(equipos.size());  //Generar otro numero aleatorio
            if(x2!=x){                                  //Si el numero generado no es el mismo que el primero
                this.equipo2 = equipos.get(x2);         //Elegir el equipo en esa posicion
                break;                                  //Salir del bucle
            }                                           //En caso de que sea el mismo numero, se vuelve a ejecutar
        }
    }

    /**
     * Asignar los jugadores a los equipos
     * @param jugadores
     */
    public void randomPlayers(ArrayList<Player> jugadores){
        this.players = new ArrayList<>(jugadores);
        Collections.shuffle(players);   //Desorganizar la lista de jugadores

        this.equipo1.iniciar(players.get(0),players.get(1),players.get(2),players.get(3));
        this.equipo2.iniciar(players.get(4),players.get(5),players.get(6),players.get(7));
    }

    //Getters para los equipos a jugar
    public Team getEquipo1() {
        return this.equipo1;
    }

    public Team getEquipo2() {
        return this.equipo2;
    }
}
