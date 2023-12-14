
package automotora.model;

public class VendedorOb {
    
    private String runV;
    private String nombreV;
    private String apellidosV;
    private int telefonoV;
    private String direccionV;
    private String correo;

    // constructores

    public VendedorOb() {
    }

    public VendedorOb(String runV, String nombreV, String apellidosV, int telefonoV, String direccionV, String correo) {
        this.runV = runV;
        this.nombreV = nombreV;
        this.apellidosV = apellidosV;
        this.telefonoV = telefonoV;
        this.direccionV = direccionV;
        this.correo = correo;
    }
    // GET Y SET

    public String getRunV() {
        return runV;
    }

    public void setRunV(String runV) {
        this.runV = runV;
    }

    public String getNombreV() {
        return nombreV;
    }

    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }

    public String getApellidosV() {
        return apellidosV;
    }

    public void setApellidosV(String apellidosV) {
        this.apellidosV = apellidosV;
    }

    public int getTelefonoV() {
        return telefonoV;
    }

    public void setTelefonoV(int telefonoV) {
        this.telefonoV = telefonoV;
    }

    public String getDireccionV() {
        return direccionV;
    }

    public void setDireccionV(String direccionV) {
        this.direccionV = direccionV;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    public void mostrarVendedor(){
        
    }
    
}
