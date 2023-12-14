
package automotora.model;

import java.util.ArrayList;
import java.util.Date;

public class ClienteOb {
    
    private String run;
    private String nombre;
    private String apellidos;
    private int telefono;
    private String direccion;
    private String correo;
    private Date fechaNac;
    private ArrayList<Automovil> automovil;
    
    // Lista Automovil
    public ArrayList<Automovil> getAutomovil(){
        return automovil;
    }
    public void seAutomovil(ArrayList<Automovil> automovil){
        this.automovil = automovil;
    }

    public ClienteOb() {
        this.automovil = new ArrayList<Automovil>();
    }

    public ClienteOb(String run, String nombre, String apellidos, int telefono, String direccion, String correo, Date fechaNac) {
        this.run = run;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.fechaNac = fechaNac;
    }
    
    // GETY SET

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
}
