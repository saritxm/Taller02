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
    private long tamreg = 270; // 4(Clave) 4(3 Equipo) 5x25(Nombre - Equipo y jugadores) 12(Resultado) =

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
            this.archivo = new RandomAccessFile(f,"rw");
            int clave = buscarUltimo();
            for (Result aux : resultados) {
                clave++;
                guardarCampo(aux.getEquipoWin(), true, clave);
                clave++;
                guardarCampo(aux.getEquipoLose(), false, clave);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void leerTodo() throws IOException {
        System.out.println("\nMostrando todos los Registros");;
        try {
            archivo.seek(0);
            long canreg = archivo.length() / tamreg;
            for (int r = 0; r < canreg; r++) {
                int clave = archivo.readInt();
                int numE = archivo.readInt();
                String nombreE = "";
                String nombrej1 = "";
                String nombrej2 = "";
                String nombrej3 = "";
                String nombrej4 = "";
                String resultado = "";
                for (int i = 0; i < 25; ++i) {
                    nombreE += archivo.readChar();
                }
                for (int i = 0; i < 25; ++i) {
                    nombrej1 += archivo.readChar();
                }
                for (int i = 0; i < 25; ++i) {
                    nombrej2 += archivo.readChar();
                }
                for (int i = 0; i < 25; ++i) {
                    nombrej3 += archivo.readChar();
                }
                for (int i = 0; i < 25; ++i) {
                    nombrej4 += archivo.readChar();
                }
                for (int i = 0; i < 6; ++i) {
                    resultado += archivo.readChar();
                }

                nombreE = quitarEspacios(nombreE);
                nombrej1 = quitarEspacios(nombrej1);
                nombrej2 = quitarEspacios(nombrej2);
                nombrej3 = quitarEspacios(nombrej3);
                nombrej4 = quitarEspacios(nombrej4);

                System.out.println("Clave: "+clave+" |  # de Equipo: "+numE+" |  Nombre de equipo: "+nombreE+" |  Jugador #1: "+ nombrej1+" |  Jugador #1: "
                            +nombrej1+" |  Jugador #2: "+nombrej2+" |  Jugador #3: "+nombrej3+" |  Jugador #4: "+nombrej4);

            }
        } catch (FileNotFoundException fnfe) {/* Archivo no encontrado */
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    public ArrayList<Team> getEquipos() {
        return this.equipos;
    }

    private void guardarCampo(Team datos, boolean win, int clave){
        try{
            if (archivo.length() != 0) {
                archivo.seek(archivo.length());
            }
            archivo.writeInt(clave);

            int numWin = datos.getTeamNumber();
            archivo.writeInt(numWin);

            String nombreEquipo = llenarEspacios(datos.getName());
            archivo.writeChars(nombreEquipo);

            ArrayList<Player> players = datos.getPlayers();
            for (Player p : players) {
                String j = llenarEspacios(p.getNombre());
                archivo.writeChars(j);
            }
            
            if(win) archivo.writeChars("Gano  ");
            else    archivo.writeChars("Perdio");
            
        }catch(IOException ex){
            ex.printStackTrace();
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

    private String llenarEspacios(String x){
        if (x.length() < 25) {
            for (int i = x.length(); i < 25; i++) {
                x = x + " ";
            }
        } else {
            x = x.substring(0, 25);
        }
        return x;
    }

    private String quitarEspacios(String x){
        return x.split("\\  ")[0];
    } 

}
