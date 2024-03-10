package controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFileChooser;

import model.Player;
import model.Team;

public class controlPlayers {
    private controlArchivos cArchivos;
    private File f;

    public controlPlayers() throws IOException{
        this.cArchivos = new controlArchivos();
        JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
        fc.showOpenDialog(fc);
        f = fc.getSelectedFile();
        this.cArchivos.setProp(f);
        this.cArchivos.obtenerEquipos();
    }

    public void randomPlayers(ArrayList<Player> players){
        Random rand = new Random();
        System.out.println((cArchivos.getEquipos().size()));
        int numRand = rand.nextInt(cArchivos.getEquipos().size());
         for(Player pl:players){
            for(int i=0; i<cArchivos.getEquipos().size(); i++){
                if(cArchivos.getEquipos().get(i).scrollPlayers(pl)){
                    cArchivos.getEquipos().get(numRand).getPlayers().add(pl);
                }
            }
        }

    }

    public void prueba(){
        for(Team i : cArchivos.getEquipos()){
            for(Player j : i.getPlayers()){
                System.out.println(j.getNombre());
            }
        }
    }
}
