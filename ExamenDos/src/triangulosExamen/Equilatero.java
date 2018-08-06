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
public class Equilatero implements figuras{
     double lado1;

    public Equilatero(double lado1) {
        this.lado1 = lado1;
    }
    
    
      @Override
    public double calcularPerimetro() {
        
        double perimetro = 3*(lado1);
            
        return perimetro;
    
    }

    @Override
    public double calcularArea() {
      
      
        double area = ((Math.sqrt(3)*lado1)/2)*(lado1*lado1);
    
        return area;
    }

    @Override
    public double calcularAltura() {
     
     
        double altura = ((Math.sqrt(3)*lado1)/2);
        
        return altura;
    }
    
    
    
}
