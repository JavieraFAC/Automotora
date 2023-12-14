
package automotora.model;

import java.util.ArrayList;

public class AutomotoraData {
    
    public ArrayList<ClienteOb> listaCliente;
    public ArrayList<VendedorOb> listaVendedor;
   // private ArrayList<Prestamo> listaPrestamo;

    public AutomotoraData() {
        this.listaCliente = new ArrayList<ClienteOb>();
        this.listaVendedor = new ArrayList<VendedorOb>();
        // this.listaPrestamo = new ArrayList<Prestamo>();
    }
    
    
   
    public boolean agregarCliente(ClienteOb clienteNuevo){
        return listaCliente.add(clienteNuevo);
    }
    
    public boolean agregarVendedor(VendedorOb vendedorNuevo){
        return listaVendedor.add(vendedorNuevo);
    }
    
    // Validaciones por run
    
    public boolean existeCliente(String run){
        for (ClienteOb clienteActual : this.listaCliente) {
            if (clienteActual.getRun().equals(run)) {
            }
        }
        return false;
    }
    
        public boolean existeVendedor(String runV){
        for (VendedorOb vendedorActual : this.listaVendedor) {
            if (vendedorActual.getRunV().equals(runV)) {
            }
        }
        return false;
    }
        
        // listar
        public void listarClientes(){
            for(ClienteOb clienteActual : this.listaCliente){
                System.out.println(clienteActual.toString());
            }
        }
        public void listarVendedores(){
            for(VendedorOb vendedorActual : this.listaVendedor){
                System.out.println(vendedorActual.toString());
            }
        }
        
        
}
