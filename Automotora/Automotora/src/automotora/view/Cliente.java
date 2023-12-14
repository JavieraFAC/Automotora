
package automotora.view;

import automotora.model.AutomotoraData;
import automotora.model.ClienteOb;
import javax.swing.JOptionPane;

public class Cliente extends javax.swing.JPanel {
    AutomotoraData datoslocal;

    public Cliente(AutomotoraData datos) {
        initComponents();
        this.datoslocal = datos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        agregarCliente = new javax.swing.JLabel();
        jPanelContenido = new javax.swing.JPanel();
        jTextFieldRunC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombreC = new javax.swing.JTextField();
        jTextFieldApellidosC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTelefonoC = new javax.swing.JTextField();
        jTextFieldDireccionC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCorreoC = new javax.swing.JTextField();
        jTextFieldFNac = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AgregarCliente = new javax.swing.JButton();

        jPanelTitulo.setBackground(new java.awt.Color(0, 204, 153));
        jPanelTitulo.setForeground(new java.awt.Color(0, 204, 153));

        agregarCliente.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        agregarCliente.setForeground(new java.awt.Color(0, 0, 0));
        agregarCliente.setText("AGREGAR CLIENTE");

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

        jTextFieldRunC.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldRunC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRunCActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("RUN :");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE:");

        jTextFieldNombreC.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreCActionPerformed(evt);
            }
        });

        jTextFieldApellidosC.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldApellidosC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidosCActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("APELLIDOS :");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TELEFONO :");

        jTextFieldTelefonoC.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTelefonoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoCActionPerformed(evt);
            }
        });

        jTextFieldDireccionC.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDireccionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccionCActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DIRECCION :");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CORREO ;");

        jTextFieldCorreoC.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCorreoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoCActionPerformed(evt);
            }
        });

        jTextFieldFNac.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFNacActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("FECHA NAC :");

        AgregarCliente.setBackground(new java.awt.Color(0, 153, 153));
        AgregarCliente.setForeground(new java.awt.Color(0, 0, 0));
        AgregarCliente.setText("AGREGAR");
        AgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContenidoLayout = new javax.swing.GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDireccionC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldApellidosC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRunC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCorreoC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgregarCliente)
                            .addComponent(jTextFieldFNac, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldRunC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldApellidosC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldDireccionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCorreoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AgregarCliente)
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
                .addComponent(jPanelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFNacActionPerformed

    private void AgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarClienteActionPerformed
        
                // tirar por pantalla 
        System.out.println("Run :" + jTextFieldRunC.getText());
        System.out.println("Nombre: " + jTextFieldNombreC.getText());
        System.out.println("Apellidos: " + jTextFieldApellidosC.getText());
        System.out.println("Telefono: " +jTextFieldTelefonoC.getText());
        System.out.println("Direccion: " +jTextFieldDireccionC.getText());
        System.out.println("Direccion: " +jTextFieldCorreoC.getText());
        System.out.println("Fecha Nacimiento: "+jTextFieldFNac.getText());
        
// Datos vacios
        if (jTextFieldRunC.getText().isEmpty()
                || jTextFieldNombreC.getText().isEmpty()
                || jTextFieldApellidosC.getText().isEmpty()
                || jTextFieldTelefonoC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Se deben rellenar los datos obligatorios", "error", JOptionPane.ERROR_MESSAGE);

        } else {
            // Agregar Cliente
            ClienteOb nuevoCliente = new ClienteOb();
            nuevoCliente.setRun(jTextFieldRunC.getText());
            nuevoCliente.setNombre(jTextFieldNombreC.getText());
            nuevoCliente.setApellidos(jTextFieldApellidosC.getText());
            nuevoCliente.setTelefono(Integer.parseInt(jTextFieldTelefonoC.getText()));
            nuevoCliente.setDireccion(jTextFieldDireccionC.getText());
            nuevoCliente.setCorreo(jTextFieldCorreoC.getText());
            // nuevoCliente.setFechaNac(jTextFieldFNac.getText());
            
            this.datoslocal.agregarCliente(nuevoCliente);

            JOptionPane.showMessageDialog(null, "Se agregó Cliente nuevo:  " + nuevoCliente.getNombre());
            

        }
    }//GEN-LAST:event_AgregarClienteActionPerformed

    private void jTextFieldRunCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRunCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRunCActionPerformed

    private void jTextFieldNombreCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreCActionPerformed

    private void jTextFieldApellidosCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidosCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidosCActionPerformed

    private void jTextFieldTelefonoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoCActionPerformed

    private void jTextFieldDireccionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccionCActionPerformed

    private void jTextFieldCorreoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarCliente;
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
    private javax.swing.JTextField jTextFieldApellidosC;
    private javax.swing.JTextField jTextFieldCorreoC;
    private javax.swing.JTextField jTextFieldDireccionC;
    private javax.swing.JTextField jTextFieldFNac;
    private javax.swing.JTextField jTextFieldNombreC;
    private javax.swing.JTextField jTextFieldRunC;
    private javax.swing.JTextField jTextFieldTelefonoC;
    // End of variables declaration//GEN-END:variables
}
