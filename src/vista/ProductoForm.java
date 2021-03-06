package vista;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.ProductoDAO;

public class ProductoForm extends javax.swing.JInternalFrame {

    ProductoDAO productoDAO = new ProductoDAO();
    Producto producto = new Producto();

    DefaultTableModel defaultTableModel = new DefaultTableModel();

    int id;

    public ProductoForm() {
        initComponents();
        listarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFormulario = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelStock = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jTextFieldStock = new javax.swing.JTextField();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jButtonAgregar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jPanelProducto = new javax.swing.JPanel();
        jScrollPaneProducto = new javax.swing.JScrollPane();
        jTableProducto = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Producto");

        jPanelFormulario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNombre.setText("Nombre");

        jLabelPrecio.setText("Precio");

        jLabelStock.setText("Stock");

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

        javax.swing.GroupLayout jPanelFormularioLayout = new javax.swing.GroupLayout(jPanelFormulario);
        jPanelFormulario.setLayout(jPanelFormularioLayout);
        jPanelFormularioLayout.setHorizontalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPrecio)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelEstado)
                    .addComponent(jLabelStock))
                .addGap(27, 27, 27)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldStock, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxEstado, 0, 168, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLimpiar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFormularioLayout.setVerticalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregar)
                    .addComponent(jLabelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActualizar)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar)
                    .addComponent(jLabelStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstado)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(328, 328, 328))
        );

        jPanelProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio", "Stock", "Estado"
            }
        ));
        jTableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductoMouseClicked(evt);
            }
        });
        jScrollPaneProducto.setViewportView(jTableProducto);

        javax.swing.GroupLayout jPanelProductoLayout = new javax.swing.GroupLayout(jPanelProducto);
        jPanelProducto.setLayout(jPanelProductoLayout);
        jPanelProductoLayout.setHorizontalGroup(
            jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelProductoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPaneProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelProductoLayout.setVerticalGroup(
            jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
            .addGroup(jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelProductoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPaneProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jTableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductoMouseClicked
        int fila = jTableProducto.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            id = Integer.parseInt(jTableProducto.getValueAt(fila, 0).toString());
            String nombre_producto = jTableProducto.getValueAt(fila, 1).toString();
            String precio_producto = jTableProducto.getValueAt(fila, 2).toString();
            String stock_producto = jTableProducto.getValueAt(fila, 3).toString();
            String estado_Producto = jTableProducto.getValueAt(fila, 4).toString();
            jTextFieldNombre.setText(nombre_producto);
            jTextFieldPrecio.setText(precio_producto);
            jTextFieldStock.setText(stock_producto);
            jComboBoxEstado.setSelectedItem(estado_Producto);
        }
    }//GEN-LAST:event_jTableProductoMouseClicked

    void agregar() {
        String nombre_producto = jTextFieldNombre.getText();
        String precio_producto = jTextFieldPrecio.getText();
        String stock_producto = jTextFieldStock.getText();
        String estado_Producto = jComboBoxEstado.getSelectedItem().toString();
        if (nombre_producto.equals("") || precio_producto.equals("") || stock_producto.equals("")) {
            JOptionPane.showMessageDialog(this, "Falta completar");
        } else {
            Object[] object = new Object[4];
            object[0] = nombre_producto;
            object[1] = precio_producto;
            object[2] = stock_producto;
            object[3] = estado_Producto;
            productoDAO.agregar(object);
        }
    }

    void listarTabla() {
        List<Producto> lista = productoDAO.listar();
        defaultTableModel = (DefaultTableModel) jTableProducto.getModel();
        Object[] object = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId_producto();
            object[1] = lista.get(i).getNombre_producto();
            object[2] = lista.get(i).getPrecio_producto();
            object[3] = lista.get(i).getStock_producto();
            object[4] = lista.get(i).getEstado_producto();
            defaultTableModel.addRow(object);
        }
        jTableProducto.setModel(defaultTableModel);
    }

    void actualizar() {
        int fila = jTableProducto.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            String nombre_producto = jTextFieldNombre.getText();
            String precio_producto = jTextFieldPrecio.getText();
            String stock_producto = jTextFieldStock.getText();
            String estado_Producto = jComboBoxEstado.getSelectedItem().toString();
            Object[] object = new Object[5];
            object[0] = nombre_producto;
            object[1] = precio_producto;
            object[2] = stock_producto;
            object[3] = estado_Producto;
            object[4] = id;
            productoDAO.actualizar(object);
        }
    }

    void eliminar() {
        int fila = jTableProducto.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            productoDAO.eliminar(id);
        }
    }

    void limpiarFormulario() {
        jTextFieldNombre.setText("");
        jTextFieldPrecio.setText("");
        jTextFieldStock.setText("");
        jComboBoxEstado.setSelectedIndex(0);
        jTextFieldNombre.requestFocus();
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelStock;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JPanel jPanelProducto;
    private javax.swing.JScrollPane jScrollPaneProducto;
    private javax.swing.JTable jTableProducto;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldStock;
    // End of variables declaration//GEN-END:variables
}
