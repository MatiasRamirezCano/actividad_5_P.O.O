package figuras;

import javax.swing.JOptionPane;

public class VentanaCilindro extends javax.swing.JFrame {

    public VentanaCilindro() {
        initComponents();
        setTitle("Cilindro");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radio = new javax.swing.JLabel();
        altura = new javax.swing.JLabel();
        BtnCalcular = new javax.swing.JButton();
        volumen = new javax.swing.JLabel();
        superficie = new javax.swing.JLabel();
        campoRadio = new javax.swing.JTextField();
        campoAltura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        radio.setText("Radio (cms)");

        altura.setText("Altura (cms)");

        BtnCalcular.setText("Calcular");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });

        volumen.setText("Volumen =");

        superficie.setText("Superficie =");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(volumen)
                            .addComponent(superficie)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio)
                                    .addComponent(altura))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoRadio, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(campoAltura)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(BtnCalcular)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio)
                    .addComponent(campoRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altura)
                    .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnCalcular)
                .addGap(18, 18, 18)
                .addComponent(volumen)
                .addGap(18, 18, 18)
                .addComponent(superficie)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
        boolean error = false;
        try{
            double radio = Double.parseDouble(campoRadio.getText());
            double altura = Double.parseDouble(campoAltura.getText());
            Cilindro cil = new Cilindro(radio, altura);
            volumen.setText("Volumen = " + String.format("%.2f", cil.calcularVolumen()) + " cm3");
            superficie.setText("Superficie = " + String.format("%.2f", cil.calcularSuperficie()) + " cm2");
        }catch(Exception e){
            error = true;
        }finally{
            if(error){
                JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número", "Error", JOptionPane.ERROR_MESSAGE);
            }        
        }
    }//GEN-LAST:event_BtnCalcularActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JLabel altura;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoRadio;
    private javax.swing.JLabel radio;
    private javax.swing.JLabel superficie;
    private javax.swing.JLabel volumen;
    // End of variables declaration//GEN-END:variables
}