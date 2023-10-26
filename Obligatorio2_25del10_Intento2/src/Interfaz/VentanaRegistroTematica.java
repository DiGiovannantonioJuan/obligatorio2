package Interfaz;

public class VentanaRegistroTematica extends javax.swing.JFrame {

    
    public VentanaRegistroTematica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPanelRegistroTematica = new javax.swing.JPanel();
        lblEtiquetaTituloRegTem = new javax.swing.JLabel();
        lblEtiquetaNombreRegTem = new javax.swing.JLabel();
        lblEtiquetaDescripcionRegTem = new javax.swing.JLabel();
        txtTextoNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaTextoDescripcion = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 300));

        lblEtiquetaTituloRegTem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEtiquetaTituloRegTem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEtiquetaTituloRegTem.setText("Registro de temática");
        lblEtiquetaTituloRegTem.setToolTipText("");
        lblEtiquetaTituloRegTem.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblEtiquetaNombreRegTem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEtiquetaNombreRegTem.setText("Nombre:");

        lblEtiquetaDescripcionRegTem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEtiquetaDescripcionRegTem.setText("Descripción:");

        txtTextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTextoNombreActionPerformed(evt);
            }
        });

        txtaTextoDescripcion.setColumns(20);
        txtaTextoDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtaTextoDescripcion);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPanelRegistroTematicaLayout = new javax.swing.GroupLayout(pnlPanelRegistroTematica);
        pnlPanelRegistroTematica.setLayout(pnlPanelRegistroTematicaLayout);
        pnlPanelRegistroTematicaLayout.setHorizontalGroup(
            pnlPanelRegistroTematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanelRegistroTematicaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlPanelRegistroTematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPanelRegistroTematicaLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(pnlPanelRegistroTematicaLayout.createSequentialGroup()
                        .addGroup(pnlPanelRegistroTematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEtiquetaNombreRegTem)
                            .addComponent(lblEtiquetaDescripcionRegTem))
                        .addGap(36, 36, 36)
                        .addGroup(pnlPanelRegistroTematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEtiquetaTituloRegTem)
                            .addComponent(txtTextoNombre)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnlPanelRegistroTematicaLayout.setVerticalGroup(
            pnlPanelRegistroTematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanelRegistroTematicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEtiquetaTituloRegTem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPanelRegistroTematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEtiquetaNombreRegTem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPanelRegistroTematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPanelRegistroTematicaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(pnlPanelRegistroTematicaLayout.createSequentialGroup()
                        .addComponent(lblEtiquetaDescripcionRegTem)
                        .addGap(67, 67, 67)
                        .addComponent(jButton1)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPanelRegistroTematica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPanelRegistroTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTextoNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEtiquetaDescripcionRegTem;
    private javax.swing.JLabel lblEtiquetaNombreRegTem;
    private javax.swing.JLabel lblEtiquetaTituloRegTem;
    private javax.swing.JPanel pnlPanelRegistroTematica;
    private javax.swing.JTextField txtTextoNombre;
    private javax.swing.JTextArea txtaTextoDescripcion;
    // End of variables declaration//GEN-END:variables
}
