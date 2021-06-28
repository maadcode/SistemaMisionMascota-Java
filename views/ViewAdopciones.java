
package views;

public class ViewAdopciones extends javax.swing.JPanel {

    /**
     * Creates new form ViewAdopciones
     */
    public ViewAdopciones() {
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

        btnEliminarAdopcion = new javax.swing.JButton();
        btnBuscarAdopcion = new javax.swing.JButton();
        btnEditarAdopcion = new javax.swing.JButton();
        btnAgregarAdopcion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdopciones = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAdoptanteResult = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoAdoptante = new javax.swing.JTextField();
        btnBuscarAdoptante = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMascotaResult = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtCodigoMascota = new javax.swing.JTextField();
        btnBuscarMascota = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoAdopcion = new javax.swing.JTextField();
        txtFechaAdopcion = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        btnEliminarAdopcion.setBackground(new java.awt.Color(84, 56, 220));
        btnEliminarAdopcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminarAdopcion.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarAdopcion.setText("Eliminar");
        btnEliminarAdopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAdopcionActionPerformed(evt);
            }
        });
        add(btnEliminarAdopcion);
        btnEliminarAdopcion.setBounds(560, 470, 170, 31);

        btnBuscarAdopcion.setBackground(new java.awt.Color(84, 56, 220));
        btnBuscarAdopcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscarAdopcion.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarAdopcion.setText("Buscar");
        btnBuscarAdopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAdopcionActionPerformed(evt);
            }
        });
        add(btnBuscarAdopcion);
        btnBuscarAdopcion.setBounds(380, 470, 170, 31);

        btnEditarAdopcion.setBackground(new java.awt.Color(84, 56, 220));
        btnEditarAdopcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditarAdopcion.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarAdopcion.setText("Editar");
        btnEditarAdopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAdopcionActionPerformed(evt);
            }
        });
        add(btnEditarAdopcion);
        btnEditarAdopcion.setBounds(200, 470, 170, 31);

        btnAgregarAdopcion.setBackground(new java.awt.Color(84, 56, 220));
        btnAgregarAdopcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregarAdopcion.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAdopcion.setText("Agregar");
        btnAgregarAdopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAdopcionActionPerformed(evt);
            }
        });
        add(btnAgregarAdopcion);
        btnAgregarAdopcion.setBounds(20, 470, 170, 31);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        tblAdopciones.setAutoCreateRowSorter(true);
        tblAdopciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblAdopciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "ADOPTANTE", "MASCOTA", "FECHA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblAdopciones.setGridColor(new java.awt.Color(255, 255, 255));
        tblAdopciones.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jScrollPane1.setViewportView(tblAdopciones);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 320, 710, 130);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtAdoptanteResult.setColumns(20);
        txtAdoptanteResult.setRows(5);
        jScrollPane3.setViewportView(txtAdoptanteResult);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(84, 56, 220));
        jLabel7.setText("Código de Adoptante");
        jLabel7.setPreferredSize(new java.awt.Dimension(120, 20));

        txtCodigoAdoptante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCodigoAdoptante.setPreferredSize(new java.awt.Dimension(220, 20));
        txtCodigoAdoptante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoAdoptanteActionPerformed(evt);
            }
        });

        btnBuscarAdoptante.setBackground(new java.awt.Color(84, 56, 220));
        btnBuscarAdoptante.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscarAdoptante.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarAdoptante.setText("Buscar");
        btnBuscarAdoptante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAdoptanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarAdoptante, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoAdoptante, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoAdoptante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarAdoptante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(0, 10, 750, 120);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtMascotaResult.setColumns(20);
        txtMascotaResult.setRows(5);
        jScrollPane2.setViewportView(txtMascotaResult);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(84, 56, 220));
        jLabel8.setText("Código de Mascota");
        jLabel8.setPreferredSize(new java.awt.Dimension(120, 20));

        txtCodigoMascota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCodigoMascota.setPreferredSize(new java.awt.Dimension(220, 20));
        txtCodigoMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoMascotaActionPerformed(evt);
            }
        });

        btnBuscarMascota.setBackground(new java.awt.Color(84, 56, 220));
        btnBuscarMascota.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscarMascota.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarMascota.setText("Buscar");
        btnBuscarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMascotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarMascota)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2);
        jPanel2.setBounds(0, 140, 750, 120);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(84, 56, 220));
        jLabel9.setText("Fecha de Adopción");
        jLabel9.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel9);
        jLabel9.setBounds(390, 280, 156, 20);

        txtCodigoAdopcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCodigoAdopcion.setPreferredSize(new java.awt.Dimension(220, 20));
        txtCodigoAdopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoAdopcionActionPerformed(evt);
            }
        });
        add(txtCodigoAdopcion);
        txtCodigoAdopcion.setBounds(190, 280, 180, 20);
        add(txtFechaAdopcion);
        txtFechaAdopcion.setBounds(550, 280, 180, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(84, 56, 220));
        jLabel10.setText("Código de Adopción");
        jLabel10.setPreferredSize(new java.awt.Dimension(120, 20));
        add(jLabel10);
        jLabel10.setBounds(20, 280, 156, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarAdopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAdopcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarAdopcionActionPerformed

    private void btnBuscarAdopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAdopcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarAdopcionActionPerformed

    private void btnEditarAdopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAdopcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarAdopcionActionPerformed

    private void btnAgregarAdopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAdopcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarAdopcionActionPerformed

    private void txtCodigoAdoptanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoAdoptanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoAdoptanteActionPerformed

    private void txtCodigoMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoMascotaActionPerformed

    private void txtCodigoAdopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoAdopcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoAdopcionActionPerformed

    private void btnBuscarAdoptanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAdoptanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarAdoptanteActionPerformed

    private void btnBuscarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMascotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarAdopcion;
    public javax.swing.JButton btnBuscarAdopcion;
    public javax.swing.JButton btnBuscarAdoptante;
    public javax.swing.JButton btnBuscarMascota;
    public javax.swing.JButton btnEditarAdopcion;
    public javax.swing.JButton btnEliminarAdopcion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable tblAdopciones;
    public javax.swing.JTextArea txtAdoptanteResult;
    public javax.swing.JTextField txtCodigoAdopcion;
    public javax.swing.JTextField txtCodigoAdoptante;
    public javax.swing.JTextField txtCodigoMascota;
    public com.toedter.calendar.JDateChooser txtFechaAdopcion;
    public javax.swing.JTextArea txtMascotaResult;
    // End of variables declaration//GEN-END:variables
}
