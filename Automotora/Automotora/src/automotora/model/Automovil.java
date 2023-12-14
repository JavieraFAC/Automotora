
package automotora.model;


public class Automovil {
    private String patente;
    private String nummotor;
    private String marca;
    private String modelo;
    private int anno;
    private String tipoCombustible;

    // Constructores
    public Automovil() {
    }

    public Automovil(String patente, String nummotor, String marca, String modelo, int anno, String tipoCombustible) {
        this.patente = patente;
        this.nummotor = nummotor;
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
        this.tipoCombustible = tipoCombustible;
    }

    // Get y Set

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNummotor() {
        return nummotor;
    }

    public void setNummotor(String nummotor) {
        this.nummotor = nummotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    
    
    
}
