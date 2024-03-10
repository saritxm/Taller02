package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import javax.swing.JFileChooser;

import model.Team;

public class controlArchivos {
    private ArrayList<Team> equipos;
    private Properties prop = new Properties();

    public controlArchivos() throws IOException{
        this.equipos = new ArrayList<>();
    }

    public void obtenerEquipos(File f) throws IOException{
        try {
            prop.load(new FileInputStream(f));
            ArrayList<String> listaEq = new ArrayList<>();
            for(String key : prop.stringPropertyNames()){
                if(key.startsWith("team")){
                    if(!listaEq.contains(key.split("\\.")[0])) listaEq.add(key.split("\\.")[0]);                  
                }
            }
            for(String i : listaEq){
                String nombre = prop.getProperty(i+".name");
                String dep = prop.getProperty(i+".name");
                int num = Integer.parseInt(prop.getProperty(i+".num"));
                equipos.add(new Team(nombre, dep, num));
            }

        } catch (IOException e) {
            e.getStackTrace();        
        }
    }

    public ArrayList<Team> getEquipos() {
        return this.equipos;
    }
    
}
