package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import model.Player;
import model.Team;
import model.Result;
import view.Final;
import view.vBienvenida;
import view.vJugador;
import view.vJugador2;
import view.vPartida;
/**
 * Clase controladora principal
 */
public class controlMain implements ActionListener {

    private controlArchivos cArchivos;
    private controlPlayers cPlayers;
    private vBienvenida vb;
    private vJugador vj;
    private vJugador2 vj2;
    private vPartida vp;
    private Final vf;
    private Player p1, p2, p3, p4, p5, p6, p7, p8;
    private ArrayList<Player> players;
    private boolean primerapartida = false;
    private ArrayList<Result> resultados;

    private int x = 0; // Turnos jugadores
    private int turnos = 1; // Turnos equpos
    private int puntaje1 = 0;
    private int puntaje2 = 0;

    public controlMain() throws IOException {
        // Instanciacion de la vista
        this.vb = new vBienvenida();
        this.vj = new vJugador();
        this.vj2 = new vJugador2();
        this.vp = new vPartida();
        this.vf = new Final();
        // Escucha botones de la vista
        this.vb.btnContinuar.addActionListener(this);
        this.vb.btnSalir1.addActionListener(this);
        this.vj.btnRegistrarJ.addActionListener(this);
        this.vj.btnSalirvJ.addActionListener(this);
        this.vj2.btnSalirvJv2.addActionListener(this);
        this.vj2.btnRegistrarJv2.addActionListener(this);
        this.vp.btnSalirP.addActionListener(this);
        this.vp.btnLanzartejo.addActionListener(this);
        this.vf.jOtra.addActionListener(this);
        this.vf.jSalir.addActionListener(this);
        // Controladores
        this.cArchivos = new controlArchivos();
        this.vb.fProp.showOpenDialog(this.vb.fProp);
        this.cArchivos.setProp(this.vb.fProp.getSelectedFile());
        this.vb.fResult.showOpenDialog(this.vb.fResult);
        this.cArchivos.setArchivo(this.vb.fResult.getSelectedFile());
        this.cPlayers = new controlPlayers(this.cArchivos);
        // Instanciacion del arraylist de los jugadores que se registran
        this.players = new ArrayList<Player>();
        this.resultados = new ArrayList<>();
        iniciar();

    }

    private void iniciar() {
        vb.setVisible(true);
    }

    private void crearJugadores() {
        this.p1 = new Player();
        this.p2 = new Player();
        this.p3 = new Player();
        this.p4 = new Player();
        this.p5 = new Player();
        this.p6 = new Player();
        this.p7 = new Player();
        this.p8 = new Player();
    }

    private void asignarDatosplayers() throws NullPointerException, NumberFormatException{
        players.clear();
        p1.setNombre(vj.cajaNombreJ1.getText());
        p1.setEdad(Integer.parseInt(vj.cajaEdadJ1.getText()));
        p1.setCedula(vj.cajaCedulaJ1.getText());
        p2.setNombre(vj.cajaNombreJ2.getText());
        p2.setEdad(Integer.parseInt(vj.cajaEdadJ2.getText()));
        p2.setCedula(vj.cajaCedulaJ2.getText());
        p3.setNombre(vj.cajaNombreJ3.getText());
        p3.setEdad(Integer.parseInt(vj.cajaEdadJ3.getText()));
        p3.setCedula(vj.cajaCedulaJ3.getText());
        p4.setNombre(vj.cajaNombreJ4.getText());
        p4.setEdad(Integer.parseInt(vj.cajaEdadJ4.getText()));
        p4.setCedula(vj.cajaCedulaJ4.getText());
        p5.setNombre(vj.cajaNombreJ5.getText());
        p5.setEdad(Integer.parseInt(vj.cajaEdadJ5.getText()));
        p5.setCedula(vj.cajaCedulaJ5.getText());
        p6.setNombre(vj.cajaNombreJ6.getText());
        p6.setEdad(Integer.parseInt(vj.cajaEdadJ6.getText()));
        p6.setCedula(vj.cajaCedulaJ6.getText());
        p7.setNombre(vj.cajaNombreJ7.getText());
        p7.setEdad(Integer.parseInt(vj.cajaEdadJ7.getText()));
        p7.setCedula(vj.cajaCedulaJ7.getText());
        p8.setNombre(vj.cajaNombreJ8.getText());
        p8.setEdad(Integer.parseInt(vj.cajaEdadJ8.getText()));
        p8.setCedula(vj.cajaCedulaJ8.getText());
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);
        players.add(p6);
        players.add(p7);
        players.add(p8);
    }

    private void asignarDatosplayers2() throws NullPointerException, NumberFormatException{
        players.clear();
        p1.setNombre(vj2.cajaNombreJ1v2.getText());
        p1.setEdad(Integer.parseInt(vj2.cajaEdadJ1v2.getText()));
        p1.setCedula(vj2.cajaCedulaJ1v2.getText());
        p2.setNombre(vj2.cajaNombreJ2v2.getText());
        p2.setEdad(Integer.parseInt(vj2.cajaEdadJ2v2.getText()));
        p2.setCedula(vj2.cajaCedulaJ2v2.getText());
        p3.setNombre(vj2.cajaNombreJ3v2.getText());
        p3.setEdad(Integer.parseInt(vj2.cajaEdadJ3v2.getText()));
        p3.setCedula(vj2.cajaCedulaJ3v2.getText());
        p4.setNombre(vj2.cajaNombreJ4v2.getText());
        p4.setEdad(Integer.parseInt(vj2.cajaEdadJ4v2.getText()));
        p4.setCedula(vj2.cajaCedulaJ4v2.getText());
        p5.setNombre(vj2.cajaNombreJ5v2.getText());
        p5.setEdad(Integer.parseInt(vj2.cajaEdadJ5v2.getText()));
        p5.setCedula(vj2.cajaCedulaJ5v2.getText());
        p6.setNombre(vj2.cajaNombreJ6v2.getText());
        p6.setEdad(Integer.parseInt(vj2.cajaEdadJ6v2.getText()));
        p6.setCedula(vj2.cajaCedulaJ6v2.getText());
        p7.setNombre(vj2.cajaNombreJ7v2.getText());
        p7.setEdad(Integer.parseInt(vj2.cajaEdadJ7v2.getText()));
        p7.setCedula(vj2.cajaCedulaJ7v2.getText());
        p8.setNombre(vj2.cajaNombreJ8v2.getText());
        p8.setEdad(Integer.parseInt(vj2.cajaEdadJ8v2.getText()));
        p8.setCedula(vj2.cajaCedulaJ8v2.getText());
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);
        players.add(p6);
        players.add(p7);
        players.add(p8);
    }

    private void resultado(Team x) {
        String jugadoresInfo = "Equpo ganador: " + x.toString() + "\nJugadores... \n";
        for (Player i : x.getPlayers()) {
            jugadoresInfo += i.toString() + "\n";
        }
        vp.mostrarResultado(jugadoresInfo);

        vp.setVisible(false);
        vp.dispose();
    }

    private void desabilitar(int turnos) {
        if (turnos % 2 == 0) {
            // Desabilitar panel a
            vp.ponerOpaco1(0.5f);
        } else {
            vp.ponerOpaco2(0.5f);
        }
    }

    private void ganador() {
        if (puntaje1 >= 27) {
            resultado(cPlayers.getEquipo1());
            Team win = cPlayers.getEquipo1();
            Team lose = cPlayers.getEquipo2();
            resultados.add(new Result(win, lose));
        } else if (puntaje2 >= 27) {
            resultado(cPlayers.getEquipo2());
            Team win = cPlayers.getEquipo2();
            Team lose = cPlayers.getEquipo1();
            resultados.add(new Result(win, lose));
        }

        if (puntaje1 >= 27 || puntaje2 >= 27) {
            vp.dispose();
            puntaje1 = 0;
            puntaje2 = 0;
            x = 0;
            turnos = 1;
            vp.pEquipo1.setText("Puntaje: " + 0);
            vp.pEquipo2.setText("Puntaje: " + 0);
            players.clear();
            if (!primerapartida) {
                vf.setVisible(true);
                primerapartida = true;
            } else {
                try {
                    salida();
                    this.vp.terminado();
                    this.vb.dispose();
                    this.vj.dispose();
                    this.vj2.dispose();
                    this.vf.dispose();
                } catch (Exception e) {
                }
            }
        }
    }

    // Poner los nombre de los jugadores
    private void asignarNombres() {
        cPlayers.getEquipo1().getPlayers();
        vp.jLabel1A.setText(cPlayers.getEquipo1().getPlayers().get(0).getNombre());
        vp.jLabel2A.setText(cPlayers.getEquipo1().getPlayers().get(1).getNombre());
        vp.jLabel3A.setText(cPlayers.getEquipo1().getPlayers().get(2).getNombre());
        vp.jLabel4A.setText(cPlayers.getEquipo1().getPlayers().get(3).getNombre());
        cPlayers.getEquipo2().getPlayers();
        vp.jLabel1B.setText(cPlayers.getEquipo2().getPlayers().get(0).getNombre());
        vp.jLabel2B.setText(cPlayers.getEquipo2().getPlayers().get(1).getNombre());
        vp.jLabel3B.setText(cPlayers.getEquipo2().getPlayers().get(2).getNombre());
        vp.jLabel4B.setText(cPlayers.getEquipo2().getPlayers().get(3).getNombre());
    }

    private void salida() {
        try {
            cArchivos.guardarResultado(resultados);
            cArchivos.leerTodo();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    // Actions listeners
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vb.btnContinuar) {
            vb.setVisible(false);
            vj.setVisible(true);
        }
        // Botones para salir
        else if (e.getSource() == this.vb.btnSalir1 || e.getSource() == this.vj.btnSalirvJ
                || e.getSource() == this.vj2.btnSalirvJv2) {
            this.vb.dispose();
            this.vp.dispose();
            this.vj.dispose();
            this.vj2.dispose();
            this.vf.dispose();
        } else if (e.getSource() == this.vj.btnRegistrarJ) {
            try {
                crearJugadores();
                asignarDatosplayers();
                cPlayers.obtenerEquipos();
                cPlayers.randomPlayers(players);
                vp.setVisible(true);
                vj.setVisible(false);
                desabilitar(turnos);
                asignarNombres();
            } catch (NullPointerException e2) {
                vj.camposVacios();
            } catch (NumberFormatException e3){
                vj.edadInvalida();
            }
            
        }
        // Lanzar tejo(jugada)
        else if (e.getSource() == this.vp.btnLanzartejo) {
            turnos++;
            desabilitar(turnos);
            if (turnos % 2 == 0) {
                if (x == 4) {
                    x = 0;
                }
                int aux = cPlayers.getEquipo1().getPlayers().get(x).lanzarTejo();
                puntaje1 += aux;
                vp.mostrarMensaje(cPlayers.getEquipo1().getPlayers().get(x).getNombre() + " del equipo "
                        + cPlayers.getEquipo1().getName(), aux);
                vp.pEquipo1.setText("Puntaje: " + puntaje1);
                ganador();
            } else {
                int aux2 = cPlayers.getEquipo2().getPlayers().get(x).lanzarTejo();
                puntaje2 += aux2;
                vp.mostrarMensaje(cPlayers.getEquipo2().getPlayers().get(x).getNombre() + " del equipo "
                        + cPlayers.getEquipo2().getName(), aux2);
                vp.pEquipo2.setText("Puntaje: " + puntaje2);
                x++;
                ganador();
            }
        } else if (e.getSource() == this.vf.jSalir) {
            try {
                salida();
                this.vp.dispose();
                this.vb.dispose();
                this.vj.dispose();
                this.vj2.dispose();
                this.vf.dispose();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if (e.getSource() == this.vf.jOtra) {
            vf.setVisible(false);
            vj2.setVisible(true);
        } else if (e.getSource() == this.vj2.btnRegistrarJv2) {
            try {
                crearJugadores();
                asignarDatosplayers2();
                cPlayers.reinicio();
                cPlayers.randomPlayers(players);
                vp.setVisible(true);
                vj2.setVisible(false);
                desabilitar(turnos);
                asignarNombres();
            } catch (NullPointerException e2) {
                vj.camposVacios();
            } catch (NumberFormatException e3){
                vj.edadInvalida();
            }
            
            
        }
    }
}
