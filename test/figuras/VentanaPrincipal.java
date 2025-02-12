package figuras;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        setTitle("Figuras");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCilindro = new javax.swing.JButton();
        btnEsfera = new javax.swing.JButton();
        btnPiramide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCilindro.setText("Cilindro");
        btnCilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCilindroActionPerformed(evt);
            }
        });

        btnEsfera.setText("Esfera");
        btnEsfera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsferaActionPerformed(evt);
            }
        });

        btnPiramide.setText("Piramide");
        btnPiramide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiramideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCilindro)
                .addGap(18, 18, 18)
                .addComponent(btnEsfera)
                .addGap(18, 18, 18)
                .addComponent(btnPiramide)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCilindro)
                    .addComponent(btnEsfera)
                    .addComponent(btnPiramide))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCilindroActionPerformed
        VentanaCilindro vcil = new VentanaCilindro();
        vcil.setVisible(true);
    }//GEN-LAST:event_btnCilindroActionPerformed

    private void btnEsferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsferaActionPerformed
        VentanaEsfera vesf = new VentanaEsfera();
        vesf.setVisible(true);
    }//GEN-LAST:event_btnEsferaActionPerformed

    private void btnPiramideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiramideActionPerformed
        VentanaPiramide vpir = new VentanaPiramide();
        vpir.setVisible(true);
    }//GEN-LAST:event_btnPiramideActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCilindro;
    private javax.swing.JButton btnEsfera;
    private javax.swing.JButton btnPiramide;
    // End of variables declaration//GEN-END:variables
}