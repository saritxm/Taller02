package model;

import java.util.Random;

public class Player {
    private String nombre;
    private int edad;
    private String cedula;

    public Player(){}

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.isBlank()) throw new NullPointerException();
        else this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        if(cedula.isBlank()) throw new NullPointerException();
        else this.cedula = cedula;
    }

    public int lanzarTejo(){
        Random rand = new Random();
        int result = rand.nextInt(5);
        int ans = 0;
        if(result == 0){
            ans = 1;
        }
        else if(result == 1){
            ans = 3;
        }
        else if(result == 2){
            ans = 6;
        }
        else if(result == 3){
            ans = 9;
        }
        else if(result == 4){
            ans = 0;
        }
         return ans;
    }

    @Override
    public String toString() {
        return  "Nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula ;
    }
    
    
}
