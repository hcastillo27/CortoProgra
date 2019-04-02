/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corto;

import javax.swing.JOptionPane;

/**
 *
 * @author Clara Rojas Martìnez
 */
public class Estudiante {
    //parametros nombre, apellido, grado y carnet
    
    private String nombre="";
    private String apellido="";
    private String grado="";
    private String carnet="";
    
    public Estudiante (){
    }        

    public String obtenerNombre() {
       return nombre;
        
    }

    public void asignarNombre(String nombre) {
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, " Nombre esta vacio");
        } else{  
        this.nombre = nombre;
        }
    }

    public String obtenerApellido() {
         return apellido;
        
    }

    public void asignarApellido(String apellido) {
        if (apellido.isEmpty()) {
            JOptionPane.showMessageDialog(null, " Apellido esta vacio");
        } else{  
        this.apellido = apellido;
        }
    }

    public String obtenerGrado() {
        return grado;
    
    }
    public void asignarGrado(String grado){
        if (grado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Grado esta vacio");
        } else{  
        this.grado = grado;
        }
    }

    public String obtenerCarnet() {
        return carnet;
    }
    
    public void asignarCarnet(String carnet) {
        if (carnet.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Carnet esta vacio");
        } else{  
        this.carnet = carnet;
        }
    }
    
    
}
