package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import model.Player;

public class controlPlayers {
    private controlArchivos cArchivos;

    public controlPlayers() throws IOException{
        cArchivos = new controlArchivos();
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
