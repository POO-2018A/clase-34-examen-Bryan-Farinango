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
public class Rectangulo implements figuras{
    
    private double lado1;
    private double lado2;
    private double lado3;

    public Rectangulo(double lado1, double lado2, double lado3) {
        
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    
    //Setters y Getters
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    
    
    //

    @Override
    public double calcularPerimetro() {
    
        double perimetro = lado1+lado2+lado3;
        
        return perimetro;
    
    }

    @Override
    public double calcularArea() {
        
        double area = ((lado1*lado2)/2.0);
    
        return area;
    }

    @Override
    public double calcularAltura() {
       
        double altura = ((lado1*lado2)/lado3);
        
        return altura;
    }


}
