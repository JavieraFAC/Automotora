
package automotora.view;

import automotora.model.AutomotoraData;
import automotora.model.Automovil;
import automotora.model.ClienteOb;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Vehiculo extends javax.swing.JPanel {
    AutomotoraData datoslocal;

    public Vehiculo(AutomotoraData datos) {
        initComponents();
        this.datoslocal = datos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        agregarCliente = new javax.swing.JLabel();
        jPanelContenido = new javax.swing.JPanel();
        jTextFieldRunV = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BuscarDuenno = new javax.swing.JButton();
        jTextFieldPatente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNumMotor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAnno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCombustible = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AgregarVehiculo = new javax.swing.JButton();

        jPanelTitulo.setBackground(new java.awt.Color(136, 122, 177));
        jPanelTitulo.setForeground(new java.awt.Color(0, 204, 153));

        agregarCliente.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        agregarCliente.setForeground(new java.awt.Color(0, 0, 0));
        agregarCliente.setText("AGREGAR VEHICULO");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(agregarCliente)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(agregarCliente)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanelContenido.setBackground(new java.awt.Color(204, 204, 204));

        jTextFieldRunV.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("RUN DUEÑO :");

        BuscarDuenno.setText("BUSCAR");
        BuscarDuenno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarDuennoActionPerformed(evt);
            }
        });

        jTextFieldPatente.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PATENTE :");

        jTextFieldNumMotor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NUM MOTOR :");

        jTextFieldMarca.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("MARCA :");

        jTextFieldModelo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("MODELO :");

        jTextFieldAnno.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("AÑO :");

        jTextFieldCombustible.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("COMBUSTIBLE :");

        AgregarVehiculo.setText("AGREGAR");
        AgregarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContenidoLayout = new javax.swing.GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRunV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgregarVehiculo)
                            .addComponent(jTextFieldCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuscarDuenno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldRunV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarDuenno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNumMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AgregarVehiculo)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarVehiculoActionPerformed

    private void BuscarDuennoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarDuennoActionPerformed
        

                ClienteOb clienteBusca = new ClienteOb();
                clienteBusca.setRun(jTextFieldRunV.getText());
                System.out.println(jTextFieldRunV.getText());
        
               
      
            boolean flag = this.datoslocal.existeCliente(jTextFieldRunV.getText());
            if (flag == true){
                JOptionPane.showMessageDialog(null,"Cliente Existe" + clienteBusca.getRun());
                
                Automovil autoNuevo = new Automovil();
                autoNuevo.setPatente(jTextFieldPatente.getText());
                autoNuevo.setNummotor(jTextFieldNumMotor.getText());
                autoNuevo.setMarca(jTextFieldMarca.getText());
                autoNuevo.setModelo(jTextFieldModelo.getText());
                autoNuevo.setAnno(Integer.parseInt(jTextFieldAnno.getText()));
                autoNuevo.setTipoCombustible(jTextFieldCombustible.getText());
                
                // clienteBusca.agregarAutomovil(autoNuevo);     
   

            }else{
                JOptionPane.showMessageDialog(null, "Cliente no esta registrado "+clienteBusca.getRun());
            }

    }//GEN-LAST:event_BuscarDuennoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarVehiculo;
    private javax.swing.JButton BuscarDuenno;
    private javax.swing.JLabel agregarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JTextField jTextFieldAnno;
    private javax.swing.JTextField jTextFieldCombustible;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldNumMotor;
    private javax.swing.JTextField jTextFieldPatente;
    private javax.swing.JTextField jTextFieldRunV;
    // End of variables declaration//GEN-END:variables
}
