
package views;

public class ViewAdoptantes extends javax.swing.JPanel {

    /**
     * Creates new form ViewAdoptantes
     */
    public ViewAdoptantes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdoptantes = new javax.swing.JTable();
        txtDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoAdoptante = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        cbxPermiso = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbxPropietario = new javax.swing.JComboBox<>();
        btnEliminarAdoptante = new javax.swing.JButton();
        btnAgregarAdoptante = new javax.swing.JButton();
        btnEditarAdoptante = new javax.swing.JButton();
        btnBuscarAdoptante = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNombreAdoptante = new javax.swing.JTextField();
        txtApellidoAdoptante = new javax.swing.JTextField();
        txtFechaNac = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(84, 56, 220));
        jLabel6.setText("Dirección");
        jLabel6.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel6);
        jLabel6.setBounds(390, 140, 120, 20);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        tblAdoptantes.setAutoCreateRowSorter(true);
        tblAdoptantes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblAdoptantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOMBRE", "APELLIDO", "DNI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblAdoptantes.setGridColor(new java.awt.Color(255, 255, 255));
        tblAdoptantes.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jScrollPane1.setViewportView(tblAdoptantes);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 240, 710, 210);

        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDireccion.setPreferredSize(new java.awt.Dimension(220, 20));
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        add(txtDireccion);
        txtDireccion.setBounds(510, 140, 220, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(84, 56, 220));
        jLabel7.setText("Código");
        jLabel7.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel7);
        jLabel7.setBounds(20, 20, 120, 20);

        txtCodigoAdoptante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCodigoAdoptante.setPreferredSize(new java.awt.Dimension(220, 20));
        txtCodigoAdoptante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoAdoptanteActionPerformed(evt);
            }
        });
        add(txtCodigoAdoptante);
        txtCodigoAdoptante.setBounds(140, 20, 220, 20);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(84, 56, 220));
        jLabel8.setText("Correo");
        jLabel8.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel8);
        jLabel8.setBounds(390, 20, 120, 20);

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCorreo.setPreferredSize(new java.awt.Dimension(220, 20));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        add(txtCorreo);
        txtCorreo.setBounds(510, 20, 220, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(84, 56, 220));
        jLabel9.setText("DNI");
        jLabel9.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel9);
        jLabel9.setBounds(20, 100, 120, 20);

        txtDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDNI.setPreferredSize(new java.awt.Dimension(220, 20));
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        add(txtDNI);
        txtDNI.setBounds(140, 100, 220, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(84, 56, 220));
        jLabel10.setText("Fecha de nacimiento");
        jLabel10.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel10);
        jLabel10.setBounds(390, 100, 140, 20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(84, 56, 220));
        jLabel11.setText("¿El dueño permite mascota?");
        jLabel11.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel11);
        jLabel11.setBounds(390, 180, 200, 20);

        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefono.setPreferredSize(new java.awt.Dimension(220, 20));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        add(txtTelefono);
        txtTelefono.setBounds(140, 140, 220, 20);

        cbxPermiso.setBackground(new java.awt.Color(84, 56, 220));
        cbxPermiso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxPermiso.setForeground(new java.awt.Color(255, 255, 255));
        cbxPermiso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        cbxPermiso.setPreferredSize(new java.awt.Dimension(120, 20));
        add(cbxPermiso);
        cbxPermiso.setBounds(610, 180, 120, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(84, 56, 220));
        jLabel12.setText("Teléfono");
        jLabel12.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel12);
        jLabel12.setBounds(20, 140, 120, 20);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(84, 56, 220));
        jLabel13.setText("¿Es propietario de la casa?");
        jLabel13.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel13);
        jLabel13.setBounds(20, 180, 180, 20);

        cbxPropietario.setBackground(new java.awt.Color(84, 56, 220));
        cbxPropietario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxPropietario.setForeground(new java.awt.Color(255, 255, 255));
        cbxPropietario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        cbxPropietario.setPreferredSize(new java.awt.Dimension(120, 20));
        add(cbxPropietario);
        cbxPropietario.setBounds(240, 180, 120, 30);

        btnEliminarAdoptante.setBackground(new java.awt.Color(84, 56, 220));
        btnEliminarAdoptante.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminarAdoptante.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarAdoptante.setText("Eliminar");
        btnEliminarAdoptante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAdoptanteActionPerformed(evt);
            }
        });
        add(btnEliminarAdoptante);
        btnEliminarAdoptante.setBounds(560, 470, 170, 31);

        btnAgregarAdoptante.setBackground(new java.awt.Color(84, 56, 220));
        btnAgregarAdoptante.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregarAdoptante.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAdoptante.setText("Agregar");
        btnAgregarAdoptante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAdoptanteActionPerformed(evt);
            }
        });
        add(btnAgregarAdoptante);
        btnAgregarAdoptante.setBounds(20, 470, 170, 31);

        btnEditarAdoptante.setBackground(new java.awt.Color(84, 56, 220));
        btnEditarAdoptante.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditarAdoptante.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarAdoptante.setText("Editar");
        btnEditarAdoptante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAdoptanteActionPerformed(evt);
            }
        });
        add(btnEditarAdoptante);
        btnEditarAdoptante.setBounds(200, 470, 170, 31);

        btnBuscarAdoptante.setBackground(new java.awt.Color(84, 56, 220));
        btnBuscarAdoptante.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscarAdoptante.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarAdoptante.setText("Buscar");
        btnBuscarAdoptante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAdoptanteActionPerformed(evt);
            }
        });
        add(btnBuscarAdoptante);
        btnBuscarAdoptante.setBounds(380, 470, 170, 31);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(84, 56, 220));
        jLabel14.setText("Nombres");
        jLabel14.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel14);
        jLabel14.setBounds(20, 60, 120, 20);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(84, 56, 220));
        jLabel15.setText("Apellidos");
        jLabel15.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel15);
        jLabel15.setBounds(390, 60, 120, 20);

        txtNombreAdoptante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreAdoptante.setPreferredSize(new java.awt.Dimension(220, 20));
        txtNombreAdoptante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAdoptanteActionPerformed(evt);
            }
        });
        add(txtNombreAdoptante);
        txtNombreAdoptante.setBounds(140, 60, 220, 20);

        txtApellidoAdoptante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApellidoAdoptante.setPreferredSize(new java.awt.Dimension(220, 20));
        txtApellidoAdoptante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoAdoptanteActionPerformed(evt);
            }
        });
        add(txtApellidoAdoptante);
        txtApellidoAdoptante.setBounds(510, 60, 220, 20);
        add(txtFechaNac);
        txtFechaNac.setBounds(540, 100, 190, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtCodigoAdoptanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoAdoptanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoAdoptanteActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnEliminarAdoptanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAdoptanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarAdoptanteActionPerformed

    private void btnAgregarAdoptanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAdoptanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarAdoptanteActionPerformed

    private void btnEditarAdoptanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAdoptanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarAdoptanteActionPerformed

    private void btnBuscarAdoptanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAdoptanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarAdoptanteActionPerformed

    private void txtNombreAdoptanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAdoptanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAdoptanteActionPerformed

    private void txtApellidoAdoptanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoAdoptanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoAdoptanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarAdoptante;
    public javax.swing.JButton btnBuscarAdoptante;
    public javax.swing.JButton btnEditarAdoptante;
    public javax.swing.JButton btnEliminarAdoptante;
    public javax.swing.JComboBox<String> cbxPermiso;
    public javax.swing.JComboBox<String> cbxPropietario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblAdoptantes;
    public javax.swing.JTextField txtApellidoAdoptante;
    public javax.swing.JTextField txtCodigoAdoptante;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDNI;
    public javax.swing.JTextField txtDireccion;
    public com.toedter.calendar.JDateChooser txtFechaNac;
    public javax.swing.JTextField txtNombreAdoptante;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
