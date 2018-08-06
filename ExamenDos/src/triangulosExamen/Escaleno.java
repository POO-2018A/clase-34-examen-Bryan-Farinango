/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulosExamen;

/**
 *
 * @author ESFOT
 */
public class Escaleno implements figuras{
     private double lado1;
    private double lado2;
    private double lado3;

    public Escaleno(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    @Override
    public double calcularPerimetro() {
        
        double perimetro = (lado1+lado2+lado3);
            
        return perimetro;
    
    }

    @Override
    public double calcularArea() {
      
        double semiPerimetro = ((lado1+lado2+lado3)/2.0);
        double area = Math.sqrt(semiPerimetro*(semiPerimetro-lado1)*(semiPerimetro-lado2)*(semiPerimetro-lado3));
    
        return area;
    }

    @Override
    public double calcularAltura() {
     
          double semiPerimetro = ((lado1+lado2+lado3)/2.0);
        double altura = (2/lado1)*Math.sqrt(semiPerimetro*(semiPerimetro-lado1)*(semiPerimetro-lado2)*(semiPerimetro-lado3));
        
        return altura;
    }
    
    
    
    
    
}
