package figuras;

public class Piramide extends FiguraGeometrica {
    
    private double base;
    private double altura;
    private double apotema;

    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
    }
    
    public double calcularVolumen(){
        double volumen = (Math.pow(base, 2) * altura) / 3;
        return volumen;
    }
    
    public double calcularSuperficie(){
        double areaBase = Math.pow(base, 2);
        double areaLados = 2 * base * apotema;
        return areaBase + areaLados;
    }
    
}