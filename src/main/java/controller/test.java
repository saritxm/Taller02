package controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;

import model.*;

public class test {
    public static void main(String[] args) throws IOException{
        Team ganadores = new Team("Pedro Papa","Quillami", 12);
        Player wj1 = new Player();
        wj1.setNombre("juan");
        Player wj2 = new Player();
        wj2.setNombre("sara");
        Player wj3 = new Player();
        wj3.setNombre("camilo");
        Player wj4 = new Player();
        wj4.setNombre("xd");
        ganadores.Iniciar(wj1, wj2, wj3, wj4);
        Team perdedores = new Team("Pepo","Quillami", 12);
        Player pj1 = new Player();
        pj1.setNombre("Pedro");
        Player pj2 = new Player();
        pj2.setNombre("Pedro");
        Player pj3 = new Player();
        pj3.setNombre("Pedro");
        Player pj4 = new Player();
        pj4.setNombre("Pedro");
        perdedores.Iniciar(pj1, pj2, pj3, pj4);

        Team ganadores2 = new Team("Pedro","Quillami", 12);
        Player wj12 = new Player();
        wj12.setNombre("Pedro");
        Player wj22 = new Player();
        wj22.setNombre("Pedro");
        Player wj32 = new Player();
        wj32.setNombre("Pedro");
        Player wj42 = new Player();
        wj42.setNombre("Pedro");
        ganadores2.Iniciar(wj12, wj22, wj32, wj42);
        Team perdedores2 = new Team("Pedro","Quillami", 12);
        Player pj12 = new Player();
        pj12.setNombre("Pedro");
        Player pj22 = new Player();
        pj22.setNombre("Pedro");
        Player pj32 = new Player();
        pj32.setNombre("Pedro");
        Player pj42 = new Player();
        pj42.setNombre("Pedro");
        perdedores2.Iniciar(pj12, pj22, pj32, pj42);

        JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
        fc.showOpenDialog(fc);
        File f = fc.getSelectedFile();

        Result r = new Result(ganadores, perdedores);
        Result r2  = new Result(ganadores2,perdedores2);
        ArrayList<Result> cositas = new ArrayList<>();
        cositas.add(r);
        cositas.add(r2);

        for (Result aux : cositas) {
            System.out.println(aux.getEquipoWin().getName());
            System.out.println(aux.getEquipoLose().getName());

        }
        

        controlArchivos prueba = new controlArchivos();
        prueba.guardarResultado(cositas, f);
        prueba.leerTodo();
    }
    
}
