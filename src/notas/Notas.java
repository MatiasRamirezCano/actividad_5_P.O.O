package notas;

public class Notas {
    
    double[] lista_notas;
    
    public Notas(){
        lista_notas = new double[5];
    }
    
    double calcular_promedio(){
        double suma = 0;
        for(int i = 0; i < lista_notas.length; i++){
            suma = suma + lista_notas[i];
        }
        return(suma/lista_notas.length);
    }
    
    double calcular_desviacion(){
        double promedio = calcular_promedio();
        double suma = 0;
        for(int i = 0; i < lista_notas.length; i++){
            suma = suma + Math.pow(lista_notas[i] - promedio, 2);
        }
        return Math.sqrt(suma/lista_notas.length);
    }
    
    double calcular_menor(){
        double menor = lista_notas[0];
        for(int i = 0; i < lista_notas.length; i++){
            if(lista_notas[i] < menor){
                menor = lista_notas[i];
            }
        }
        return menor;
    }
    
    double calcular_mayor(){
        double mayor = lista_notas[0];
        for(int i = 0; i < lista_notas.length; i++){
            if(lista_notas[i] > mayor){
                mayor = lista_notas[i];
            }
        }
        return mayor;
    }
    
}