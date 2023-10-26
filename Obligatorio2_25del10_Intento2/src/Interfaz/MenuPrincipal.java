package Interfaz;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        menuOpciones = new javax.swing.JMenu();
        itmRegistroTematica = new javax.swing.JMenuItem();
        itmAltaPostulante = new javax.swing.JMenuItem();
        itmBajaPostulante = new javax.swing.JMenuItem();
        itmRegistroEvaluador = new javax.swing.JMenuItem();
        itmIngresoEntrevista = new javax.swing.JMenuItem();
        itmRegistroPuesto = new javax.swing.JMenuItem();
        itmConsultaPuesto = new javax.swing.JMenuItem();
        itmHistoriaPostulante = new javax.swing.JMenuItem();
        itmConsultaTematica = new javax.swing.JMenuItem();
        itmFin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuOpciones.setMnemonic('f');
        menuOpciones.setText("Opciones");

        itmRegistroTematica.setMnemonic('o');
        itmRegistroTematica.setText("Registro de temática");
        itmRegistroTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistroTematicaActionPerformed(evt);
            }
        });
        menuOpciones.add(itmRegistroTematica);

        itmAltaPostulante.setMnemonic('s');
        itmAltaPostulante.setText("Alta de postulante");
        menuOpciones.add(itmAltaPostulante);

        itmBajaPostulante.setMnemonic('a');
        itmBajaPostulante.setText("Baja de postulante");
        itmBajaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmBajaPostulanteActionPerformed(evt);
            }
        });
        menuOpciones.add(itmBajaPostulante);

        itmRegistroEvaluador.setMnemonic('x');
        itmRegistroEvaluador.setText("Registro de evaluador");
        itmRegistroEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistroEvaluadorActionPerformed(evt);
            }
        });
        menuOpciones.add(itmRegistroEvaluador);

        itmIngresoEntrevista.setText("Ingreso de entrevista");
        menuOpciones.add(itmIngresoEntrevista);

        itmRegistroPuesto.setText("Registro de puesto");
        menuOpciones.add(itmRegistroPuesto);

        itmConsultaPuesto.setText("Consulta para puesto");
        menuOpciones.add(itmConsultaPuesto);

        itmHistoriaPostulante.setText("Historia de postulante");
        menuOpciones.add(itmHistoriaPostulante);

        itmConsultaTematica.setText("Consulta por temática");
        menuOpciones.add(itmConsultaTematica);

        itmFin.setText("Fin");
        menuOpciones.add(itmFin);

        menuBar.add(menuOpciones);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmRegistroEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistroEvaluadorActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itmRegistroEvaluadorActionPerformed

    private void itmRegistroTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistroTematicaActionPerformed
       VentanaRegistroTematica ventanaRegistro = new VentanaRegistroTematica();
        ventanaRegistro.setVisible(true);
    }//GEN-LAST:event_itmRegistroTematicaActionPerformed
private void itmAltaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {                                                    
       VentanaAltaPostulante ventanaAlta = new VentanaAltaPostulante();
        ventanaAlta.setVisible(true);
    } 
    
    private void itmBajaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmBajaPostulanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmBajaPostulanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAltaPostulante;
    private javax.swing.JMenuItem itmBajaPostulante;
    private javax.swing.JMenuItem itmConsultaPuesto;
    private javax.swing.JMenuItem itmConsultaTematica;
    private javax.swing.JMenuItem itmFin;
    private javax.swing.JMenuItem itmHistoriaPostulante;
    private javax.swing.JMenuItem itmIngresoEntrevista;
    private javax.swing.JMenuItem itmRegistroEvaluador;
    private javax.swing.JMenuItem itmRegistroPuesto;
    private javax.swing.JMenuItem itmRegistroTematica;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuOpciones;
    // End of variables declaration//GEN-END:variables

}

