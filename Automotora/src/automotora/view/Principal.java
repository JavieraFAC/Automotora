
package automotora.view;

import automotora.model.AutomotoraData;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Principal extends javax.swing.JFrame {
    
    AutomotoraData datos;

    public Principal() {
        initComponents();
        Bienvenida hola = new Bienvenida();
        mostrarPanel(hola);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAgregar = new javax.swing.JMenu();
        Cliente = new javax.swing.JMenuItem();
        Vehiculo = new javax.swing.JMenuItem();
        Vendedor = new javax.swing.JMenuItem();
        Arriendo = new javax.swing.JMenuItem();
        jMenuListar = new javax.swing.JMenu();
        ListarVendedores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        jMenuAgregar.setText("Agregar");

        Cliente.setText("Cliente");
        Cliente.setToolTipText("");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        jMenuAgregar.add(Cliente);

        Vehiculo.setText("Vehiculo");
        Vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehiculoActionPerformed(evt);
            }
        });
        jMenuAgregar.add(Vehiculo);

        Vendedor.setText("Vendedor");
        Vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendedorActionPerformed(evt);
            }
        });
        jMenuAgregar.add(Vendedor);

        Arriendo.setText("Arriendo");
        Arriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArriendoActionPerformed(evt);
            }
        });
        jMenuAgregar.add(Arriendo);

        jMenuBar1.add(jMenuAgregar);

        jMenuListar.setText("Listar");

        ListarVendedores.setText("Vendedores");
        ListarVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarVendedoresActionPerformed(evt);
            }
        });
        jMenuListar.add(ListarVendedores);

        jMenuBar1.add(jMenuListar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
            Cliente agCliente = new Cliente(datos);
            mostrarPanel(agCliente);
    }//GEN-LAST:event_ClienteActionPerformed

    private void VendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendedorActionPerformed
            Vendedor agVendedor = new Vendedor(datos);
            mostrarPanel(agVendedor);
    }//GEN-LAST:event_VendedorActionPerformed

    private void VehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehiculoActionPerformed
            Vehiculo agVehiculo = new Vehiculo(datos);
            mostrarPanel(agVehiculo);
    }//GEN-LAST:event_VehiculoActionPerformed

    private void ArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArriendoActionPerformed
            Arriendo agArriendo = new Arriendo();
            mostrarPanel(agArriendo);
    }//GEN-LAST:event_ArriendoActionPerformed

    private void ListarVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarVendedoresActionPerformed
            ListaVendedores listaV = new ListaVendedores(datos);
            mostrarPanel(listaV);
    }//GEN-LAST:event_ListarVendedoresActionPerformed


    
    public static void mostrarPanel (JPanel visible){
        visible.setSize(400,450);
        visible.setLocation(0,0);
        contenedor.removeAll();
        contenedor.add(visible, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();

        
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Arriendo;
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JMenuItem ListarVendedores;
    private javax.swing.JMenuItem Vehiculo;
    private javax.swing.JMenuItem Vendedor;
    private static javax.swing.JPanel contenedor;
    private javax.swing.JMenu jMenuAgregar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuListar;
    // End of variables declaration//GEN-END:variables
}
