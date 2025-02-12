package figuras;

import javax.swing.JOptionPane;

public class VentanaPiramide extends javax.swing.JFrame {

    public VentanaPiramide() {
        initComponents();
        setTitle("Piramide");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JLabel();
        altura = new javax.swing.JLabel();
        apotema = new javax.swing.JLabel();
        campoBase = new javax.swing.JTextField();
        campoAltura = new javax.swing.JTextField();
        campoApotema = new javax.swing.JTextField();
        BtnCalcular = new javax.swing.JButton();
        volumen = new javax.swing.JLabel();
        superficie = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        base.setText("Lado base (cms)");

        altura.setText("Altura (cms)");

        apotema.setText("Apotema (cms)");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(base)
                        .addGap(18, 18, 18)
                        .addComponent(campoBase, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(altura)
                            .addComponent(apotema))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(campoApotema)))
                    .addComponent(volumen)
                    .addComponent(superficie)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(BtnCalcular)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(base)
                    .addComponent(campoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altura)
                    .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apotema)
                    .addComponent(campoApotema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            double base = Double.parseDouble(campoBase.getText());
            double altura = Double.parseDouble(campoAltura.getText());
            double apotema = Double.parseDouble(campoApotema.getText());
            Piramide piram = new Piramide(base, altura, apotema);
            volumen.setText("Volumen = " + String.format("%.2f", piram.calcularVolumen()) + " cm3");
            superficie.setText("Superficie = " + String.format("%.2f", piram.calcularSuperficie()) + " cm2");
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
    private javax.swing.JLabel apotema;
    private javax.swing.JLabel base;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoApotema;
    private javax.swing.JTextField campoBase;
    private javax.swing.JLabel superficie;
    private javax.swing.JLabel volumen;
    // End of variables declaration//GEN-END:variables
}