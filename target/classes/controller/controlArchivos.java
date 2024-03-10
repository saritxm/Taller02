package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Properties;

import model.Player;
import model.Team;
import model.Result;

public class controlArchivos {
    private ArrayList<Team> equipos;
    private Properties prop = new Properties();
    private RandomAccessFile archivo;
    private long tamreg = 145; //4(Clave) 4(3 Equipo) 5x25(Nombre - Equipo y jugadores) 12(Resultado) = 

    public controlArchivos() throws IOException {
        this.equipos = new ArrayList<>();
    }

    public void obtenerEquipos(File f) throws IOException {
        try {
            prop.load(new FileInputStream(f));
            ArrayList<String> listaEq = new ArrayList<>();
            for (String key : prop.stringPropertyNames()) {
                if (key.startsWith("team")) {
                    if (!listaEq.contains(key.split("\\.")[0]))
                        listaEq.add(key.split("\\.")[0]);
                }
            }
            for (String i : listaEq) {
                String nombre = prop.getProperty(i + ".name");
                String dep = prop.getProperty(i + ".name");
                int num = Integer.parseInt(prop.getProperty(i + ".num"));
                equipos.add(new Team(nombre, dep, num));
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public void guardarResultado(ArrayList<Result> resultados, File f) {
        try {
            archivo = new RandomAccessFile(f, "rw");
            for (Result aux : resultados) {
                // Datos ganadores
                archivo.writeInt(buscarUltimo()+1);

                int numWin = aux.getEquipoWin().getTeamNumber();
                archivo.writeInt(numWin);

                String nWin = aux.getEquipoWin().getName();
                if (nWin.length() < 25) {
                    for (int i = nWin.length(); i < 25; i++) {
                        nWin = nWin + " ";
                    }
                } else {
                    nWin = nWin.substring(0, 25);
                }
                archivo.writeChars(nWin);

                ArrayList<Player> playersWin = aux.getEquipoWin().getPlayers();
                for (Player p : playersWin) {
                    String j = p.getNombre();
                    if (j.length() < 25) {
                        for (int i = j.length(); i < 25; i++) {
                            j = j + " ";
                        }
                    } else {
                        j = j.substring(0, 25);
                    }
                    archivo.writeChars(j);
                }
                String r1 = "Gano  ";
                archivo.writeChars(r1);

                // Datos perdedores
                archivo.writeInt(buscarUltimo()+1);

                int numLose = aux.getEquipoLose().getTeamNumber();
                archivo.writeInt(numLose);

                String nLose = aux.getEquipoLose().getName();
                if (nLose.length() < 25) {
                    for (int i = nLose.length(); i < 25; i++) {
                        nLose = nLose + " ";
                    }
                } else {
                    nLose = nLose.substring(0, 25);
                }
                archivo.writeChars(nLose);

                ArrayList<Player> playersLose = aux.getEquipoLose().getPlayers();
                for (Player p : playersLose) {
                    String j = p.getNombre();
                    if (j.length() < 25) {
                        for (int i = j.length(); i < 25; i++) {
                            j = j + " ";
                        }
                    } else {
                        j = j.substring(0, 25);
                    }
                    archivo.writeChars(j);
                }
                String r2 = "Perdio";
                archivo.writeChars(r2);
            }

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    private int buscarUltimo() {
        int clave = 0;
        try {
            archivo.seek(archivo.length() - tamreg);
            clave = archivo.readInt();
        } catch (FileNotFoundException fnfe) {/* Archivo no encontrado */
        } catch (IOException ioe) {
            /* Error al escribir */
        }
        return clave;
    }

    public ArrayList<Team> getEquipos() {
        return this.equipos;
    }

}
