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
public class Isosceles implements figuras{
     private double lado1;
    private double lado2;

    //Constructor
    public Isosceles(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularPerimetro() {
        
        double perimetro = ((2*lado1)+lado2);
            
        return perimetro;
    
    }

    @Override
    public double calcularArea() {
      
        double area = ((lado2)*Math.sqrt((lado1*lado1)-((lado2*lado2)/4.0))/2.0);
    
        return area;
    }

    @Override
    public double calcularAltura() {
     
        double altura = Math.sqrt((lado1*lado1)-((lado2*lado2)/4.0));
        
        return altura;
    }
    
    
    
    
}
