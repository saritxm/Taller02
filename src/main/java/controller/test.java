package controller;

import java.io.File;

import javax.swing.JFileChooser;

import model.*;

public class test {
    public static void main(String[] args) {
        Team ganadores = new Team("Pedro","Quillami", 12);
        Player wj1 = new Player();
        wj1.setNombre("Pedro");
        Player wj2 = new Player();
        wj2.setNombre("Pedro");
        Player wj3 = new Player();
        wj3.setNombre("Pedro");
        Player wj4 = new Player();
        wj4.setNombre("Pedro");
        ganadores.Iniciar(wj1, wj2, wj3, wj4);
        Team perdedores = new Team("Pedro","Quillami", 12);
        Player pj1 = new Player();
        pj1.setNombre("Pedro");
        Player pj2 = new Player();
        pj2.setNombre("Pedro");
        Player pj3 = new Player();
        pj3.setNombre("Pedro");
        Player pj4 = new Player();
        pj4.setNombre("Pedro");
        perdedores.Iniciar(pj1, pj2, pj3, pj4);
        Result aux = new Result(ganadores, perdedores);

        JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
        File f = fc.getSelectedFile();
    }
    
}
