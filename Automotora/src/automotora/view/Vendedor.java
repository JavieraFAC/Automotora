
package automotora.view;

import automotora.model.AutomotoraData;
import automotora.model.VendedorOb;
import javax.swing.JOptionPane;

public class Vendedor extends javax.swing.JPanel {

    AutomotoraData datoslocal;

    public Vendedor(AutomotoraData datos) {
        initComponents();
        this.datoslocal = datos;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        agregarCliente = new javax.swing.JLabel();
        jPanelContenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldRunV = new javax.swing.JTextField();
        jTextFieldNombreV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldApellidosV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTelefonoV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDireccionV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCorreoV = new javax.swing.JTextField();
        AgregarVendedor = new javax.swing.JButton();

        jPanelTitulo.setBackground(new java.awt.Color(0, 153, 153));
        jPanelTitulo.setForeground(new java.awt.Color(0, 204, 153));

        agregarCliente.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        agregarCliente.setForeground(new java.awt.Color(0, 0, 0));
        agregarCliente.setText("AGREGAR VENDEDOR");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(agregarCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(agregarCliente)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanelContenido.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("RUN :");

        jTextFieldRunV.setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldNombreV.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE:");

        jTextFieldApellidosV.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("APELLIDOS :");

        jTextFieldTelefonoV.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TELEFONO :");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DIRECCION :");

        jTextFieldDireccionV.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CORREO ;");

        jTextFieldCorreoV.setBackground(new java.awt.Color(255, 255, 255));

        AgregarVendedor.setBackground(new java.awt.Color(0, 153, 153));
        AgregarVendedor.setForeground(new java.awt.Color(0, 0, 0));
        AgregarVendedor.setText("AGREGAR");
        AgregarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContenidoLayout = new javax.swing.GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDireccionV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTelefonoV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldApellidosV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombreV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRunV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgregarVendedor)
                            .addComponent(jTextFieldCorreoV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(105, 105, 105))
        );
        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldRunV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNombreV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldApellidosV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldTelefonoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldDireccionV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCorreoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AgregarVendedor)
                .addContainerGap(109, Short.MAX_VALUE))
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

    private void AgregarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVendedorActionPerformed
        // tirar por pantalla 
        System.out.println("Run :" + jTextFieldRunV.getText());
        System.out.println("Nombre: " + jTextFieldNombreV.getText());
        System.out.println("Apellidos: " + jTextFieldApellidosV.getText());
        System.out.println("Telefono: " +jTextFieldTelefonoV.getText());
        System.out.println("Direccion: " +jTextFieldDireccionV.getText());
        System.out.println("Direccion: " +jTextFieldCorreoV.getText());
        
        // Datos vacios
            if (jTextFieldRunV.getText().isEmpty()
                || jTextFieldNombreV.getText().isEmpty()
                || jTextFieldApellidosV.getText().isEmpty()
                || jTextFieldTelefonoV.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se deben rellenar los datos obligatorios", "error", JOptionPane.ERROR_MESSAGE);

        } else {
            // Agregar Duenno 
           VendedorOb nuevoVendedor= new VendedorOb();
 
        nuevoVendedor.setRunV(jTextFieldRunV.getText());
        nuevoVendedor.setNombreV(jTextFieldNombreV.getText());
        nuevoVendedor.setApellidosV(jTextFieldApellidosV.getText());
        nuevoVendedor.setTelefonoV(Integer.parseInt(jTextFieldTelefonoV.getText()));
        nuevoVendedor.setDireccionV(jTextFieldDireccionV.getText());
        nuevoVendedor.setCorreo(jTextFieldCorreoV.getText());
       
        JOptionPane.showMessageDialog(null, "Se agregó Cliente nuevo:  " + nuevoVendedor.getNombreV());
            
        }
    }//GEN-LAST:event_AgregarVendedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarVendedor;
    private javax.swing.JLabel agregarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JTextField jTextFieldApellidosV;
    private javax.swing.JTextField jTextFieldCorreoV;
    private javax.swing.JTextField jTextFieldDireccionV;
    private javax.swing.JTextField jTextFieldNombreV;
    private javax.swing.JTextField jTextFieldRunV;
    private javax.swing.JTextField jTextFieldTelefonoV;
    // End of variables declaration//GEN-END:variables
}
