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
            ArrayList<String> listaEq = new ArrayList<>();
            for(String key : prop.stringPropertyNames()){
                if(key.startsWith("team")){
                    listaEq.add(key);
                }
            }
            for(String i : listaEq){
                String nombre = prop.getProperty(i+".name");
                String dep = prop.getProperty(i+".name");
                int num = Integer.parseInt(prop.getProperty(i+".num"));
                equipos.add(new Team());
            }

        } catch (IOException e) {
            e.getStackTrace();        
        }
    }
    
}
