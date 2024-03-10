package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import model.Team;

public class controlArchivos {
    private ArrayList<Team> equipos;
    private Properties prop = new Properties();

    public controlArchivos(){
        this.equipos = new ArrayList<>();
    }

    public void obtenerEquipos(String ruta) throws IOException{
        try {
            prop.load(new FileInputStream("data/teams.properties"));
        } catch (IOException e) {
            e.getStackTrace();        
        }
    }
    
}
