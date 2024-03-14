package controller;

import java.io.IOException;

import javax.swing.JFileChooser;

public class Launcher {
    public static void main(String[] args)  throws IOException{
        controlArchivos a= new controlArchivos();
        JFileChooser fc= new JFileChooser(System.getProperty("user.dir"));
        fc.showOpenDialog(fc);
        a.setArchivo(fc.getSelectedFile());
        a.leerTodo();
    }
    
}
