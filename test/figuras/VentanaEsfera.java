package figuras;

import javax.swing.JOptionPane;

public class VentanaEsfera extends javax.swing.JFrame {

    public VentanaEsfera() {
        initComponents();
        setTitle("Esfera");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radio = new javax.swing.JLabel();
        campoRadio = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        volumen = new javax.swing.JLabel();
        superficie = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        radio.setText("Radio (cms)");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        volumen.setText("Volumen =");

        superficie.setText("Superficie =");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radio)
                        .addGap(18, 18, 18)
                        .addComponent(campoRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(volumen)
                    .addComponent(superficie)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnCalcular))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio)
                    .addComponent(campoRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addComponent(volumen)
                .addGap(18, 18, 18)
                .addComponent(superficie)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        boolean error = false;
        try{
            double radio = Double.parseDouble(campoRadio.getText());
            Esfera esfera = new Esfera(radio);
            volumen.setText("Volumen = " + String.format("%.2f", esfera.calcularVolumen()) + " cm3");
            superficie.setText("Superficie = " + String.format("%.2f", esfera.calcularSuperficie()) + " cm2");
        }catch(Exception e){
            error = true;            
        }finally{
            if(error){
                JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField campoRadio;
    private javax.swing.JLabel radio;
    private javax.swing.JLabel superficie;
    private javax.swing.JLabel volumen;
    // End of variables declaration//GEN-END:variables
}