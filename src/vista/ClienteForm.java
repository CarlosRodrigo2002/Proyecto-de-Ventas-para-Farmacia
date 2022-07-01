package vista;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ClienteDAO;

public class ClienteForm extends javax.swing.JInternalFrame {

    ClienteDAO clienteDAO = new ClienteDAO();
    Cliente cliente = new Cliente();

    DefaultTableModel defaultTableModel = new DefaultTableModel();

    int id;

    public ClienteForm() {
        initComponents();
        listarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFormulario = new javax.swing.JPanel();
        jLabelDUI = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldDUI = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCelular = new javax.swing.JTextField();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jButtonAgregar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanelCliente = new javax.swing.JPanel();
        jScrollPaneCliente = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cliente");

        jPanelFormulario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelDUI.setText("DUI");

        jLabelNombre.setText("Nombre");

        jLabelCelular.setText("Celular");

        jLabelEstado.setText("Estado");

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "0" }));

        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/add.png"))); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/actualizar.png"))); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/salir.png"))); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/cancelar.png"))); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanelFormularioLayout = new javax.swing.GroupLayout(jPanelFormulario);
        jPanelFormulario.setLayout(jPanelFormularioLayout);
        jPanelFormularioLayout.setHorizontalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelDUI)
                    .addComponent(jLabelEstado)
                    .addComponent(jLabelCelular))
                .addGap(27, 27, 27)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldCelular, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDUI, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxEstado, 0, 187, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelFormularioLayout.setVerticalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAgregar)
                            .addComponent(jLabelDUI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonActualizar)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEliminar)
                            .addComponent(jLabelCelular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEstado)
                            .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonLimpiar))))
                    .addComponent(jLabel1))
                .addGap(390, 390, 390))
        );

        jPanelCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DUI", "Nombre", "Celular", "Estado"
            }
        ));
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPaneCliente.setViewportView(jTableCliente);

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelClienteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPaneCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 163, Short.MAX_VALUE)
            .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPaneCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        agregar();
        limpiarTabla();
        listarTabla();
        limpiarFormulario();
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        actualizar();
        limpiarTabla();
        listarTabla();
        limpiarFormulario();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        eliminar();
        limpiarTabla();
        listarTabla();
        limpiarFormulario();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiarTabla();
        listarTabla();
        limpiarFormulario();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        int fila = jTableCliente.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            id = Integer.parseInt(jTableCliente.getValueAt(fila, 0).toString());
            String dui_cliente = jTableCliente.getValueAt(fila, 1).toString();
            String nombre_cliente = jTableCliente.getValueAt(fila, 2).toString();
            String celular_cliente = jTableCliente.getValueAt(fila, 3).toString();
            String estado_cliente = jTableCliente.getValueAt(fila, 4).toString();
            jTextFieldDUI.setText(dui_cliente);
            jTextFieldNombre.setText(nombre_cliente);
            jTextFieldCelular.setText(celular_cliente);
            jComboBoxEstado.setSelectedItem(estado_cliente);
        }
    }//GEN-LAST:event_jTableClienteMouseClicked

    void agregar() {
        String dui_cliente = jTextFieldDUI.getText();
        String nombre_cliente = jTextFieldNombre.getText();
        String celular_cliente = jTextFieldCelular.getText();
        String estado_cliente = jComboBoxEstado.getSelectedItem().toString();
        if (dui_cliente.equals("") || nombre_cliente.equals("") || celular_cliente.equals("")) {
            JOptionPane.showMessageDialog(this, "Falta completar");
        } else {
            Object[] object = new Object[4];
            object[0] = dui_cliente;
            object[1] = nombre_cliente;
            object[2] = celular_cliente;
            object[3] = estado_cliente;
            clienteDAO.agregar(object);
        }
    }

    void listarTabla() {
        List<Cliente> lista = clienteDAO.listar();
        defaultTableModel = (DefaultTableModel) jTableCliente.getModel();
        Object[] object = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId_cliente();
            object[1] = lista.get(i).getDui_cliente();
            object[2] = lista.get(i).getNombre_cliente();
            object[3] = lista.get(i).getCelular_cliente();
            object[4] = lista.get(i).getEstado_cliente();
            defaultTableModel.addRow(object);
        }
        jTableCliente.setModel(defaultTableModel);
    }

    void actualizar() {
        int fila = jTableCliente.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            String dui_cliente = jTextFieldDUI.getText();
            String nombre_cliente = jTextFieldNombre.getText();
            String celular_cliente = jTextFieldCelular.getText();
            String estado_cliente = jComboBoxEstado.getSelectedItem().toString();
            Object[] object = new Object[5];
            object[0] = dui_cliente;
            object[1] = nombre_cliente;
            object[2] = celular_cliente;
            object[3] = estado_cliente;
            object[4] = id;
            clienteDAO.actualizar(object);
        }
    }

    void eliminar() {
        int fila = jTableCliente.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            clienteDAO.eliminar(id);
        }
    }

    void limpiarFormulario() {
        jTextFieldDUI.setText("");
        jTextFieldNombre.setText("");
        jTextFieldCelular.setText("");
        jComboBoxEstado.setSelectedIndex(0);
        jTextFieldDUI.requestFocus();
    }

    void limpiarTabla() {
        for (int i = (defaultTableModel.getRowCount() - 1); i >= 0; i--) {
            defaultTableModel.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelDUI;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JScrollPane jScrollPaneCliente;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldDUI;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
