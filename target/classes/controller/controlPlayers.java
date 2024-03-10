package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import model.Player;

public class controlPlayers {
    private controlArchivos cArchivos;
    private File f;
    private JFileChooser fc;

    public controlPlayers() throws IOException{
        cArchivos = new controlArchivos();
        fc= new JFileChooser(System.getProperty("user.dir"));
        fc.showOpenDialog(fc);
        f=fc.getSelectedFile();
        iniciar();
    }

    public void iniciar(){
        try{
        cArchivos.setProp(f);
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(fc, e, null, 0);
        }
    }

    public void randomTeams(){
        Random rand = new Random();
        int numRand = rand.nextInt(cArchivos.getEquipos().size());
    }


    public void randomPlayers(ArrayList<Player> players){
        Random rand = new Random();
        int numRand = rand.nextInt(cArchivos.getEquipos().size());
         for(Player pl:players){
            for(int i=0; i<cArchivos.getEquipos().size(); i++){
                if(cArchivos.getEquipos().get(i).scrollPlayers(pl)){
                    cArchivos.getEquipos().get(numRand).getPlayers().add(pl);
                }
            }
        }
    }
}
