package figuras;

public class Cilindro extends FiguraGeometrica {
    
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
    
    public double calcularVolumen(){
        double volumen = Math.PI * altura * Math.pow(radio, 2);
        return volumen;
    }
    
    public double calcularSuperficie(){
        double superficie = (2* Math.PI * radio * altura) + (2 * Math.PI * Math.pow(radio, 2));
        return superficie;
    }
            
}