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

/**
 * Esta clase se encarga de toda la persistencia del programa
 */
public class controlArchivos {
    //Atributos
    private ArrayList<Team> equipos;    //Equipos obtenidos del archivo de propiedades
    private Properties prop;            //Archivo de propiedades
    private RandomAccessFile archivo;   //Archivo de acceso aleatorio para guardar los resultados
    private long tamreg = 270;          // 4(Clave) 4(3 Equipo) 5x25x2(Nombre - Equipo y jugadores) 6x2(Resultado) ---> Tam de un registro para los resultados

    public controlArchivos() throws IOException {
        this.equipos = new ArrayList<>();   //Instanciar la lista para los equipos
        this.prop   = new Properties();     //Instanciacion para el archivo de propiedades
    }

    //Setter para los archivos pre y post carga
    public void setProp(File f) throws IOException {
        this.prop.load(new FileInputStream(f));
    }

    public void setArchivo(File f) throws IOException{
        this.archivo = new RandomAccessFile(f,"rw");
    }

    /**
     * Clase para obtener los equipos y almacenarlos en la lista
     * @param f
     * @throws IOException
     */
    public void obtenerEquipos() throws IOException {
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
    }

    /**
     * Getter para la lista de los equipos
     * @return
     */
    public ArrayList<Team> getEquipos() {
        return this.equipos;
    }

    /**
     * Metodo para guardar todos los resultados traidos en el archivo de accedo aleatorio
     * @param resultados
     */
    public void guardarResultado(ArrayList<Result> resultados) {
        try { 
            int clave = buscarUltimo();
            for (Result aux : resultados) {
                clave++;
                guardarCampo(aux.getEquipoWin(), true, clave);  //Guardar el equipo ganador
                clave++;
                guardarCampo(aux.getEquipoLose(), false, clave);//Guardar el equipo perdedor
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Metodo privado para almacenar un registro, es decir, el equipo, sus jugadores y el resultado
     * @param datos
     * @param win
     * @param clave
     */
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

    /**
     * Metodo para obtener el ultimo registro y su respectiva clave para escribir nuevos registros
     * @return
     */
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

    /**
     * Metodo para llenar el ingreso de un String con espacio para que tenga un tamaño especifico, o en caso contrario, cortar la palabra
     * @param x
     * @return
     */
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

    /**
     * Metodo para motrar todos los registros del archivo
     * @throws IOException
     */
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
                            +nombrej1+" |  Jugador #2: "+nombrej2+" |  Jugador #3: "+nombrej3+" |  Jugador #4: "+nombrej4+" | Resultado: "+resultado);

            }
        } catch (FileNotFoundException fnfe) {/* Archivo no encontrado */
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }    

    //Quitar espcios innecesarios
    private String quitarEspacios(String x){
        return x.split("\\  ")[0];
    } 

}
