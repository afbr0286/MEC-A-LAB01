/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consola;

import static java.lang.Math.pow;

/**
 *
 * @author andre
 */
public class ProcesosCalculadora {
    private float num1;
    private float num2;
    public ProcesosCalculadora(){
    }
    
    public ProcesosCalculadora(int num1, int num2){
        this.num1= num1;
        this.num2= num2;
    }
    public float sumar(){
        float suma = this.num1+this.num2;
        return suma;
    }
    
    public float restar(){
        float resta = this.num1-this.num2;
        return resta;
    }
    
    public float multiplicar(){
        float multiplicacion = this.num1*this.num2;
        return multiplicacion;
    }
    
    public float dividir(){
        float division = this.num1/this.num2;
        return division;
    }
    
    public float potencia(){
        float potencia = (float) pow(this.num1,this.num2);
        return potencia;
    }

    public float raiz(){
        float raiz = (float) pow(this.num1,(1/this.num2));
        return raiz;
    }
    
    public float seno(){
        float seno = (float) Math.sin(this.num1);
        return seno;
    }
    
    public float coseno(){
        float coseno = (float) Math.cos(this.num1);
        return coseno;
    }
    
    public float tangente(){
        float tangente = (float) Math.tan(this.num1);
        return tangente;
    }
    
    public float iva(){
        float iva = this.num1*(1+(this.num2/100));
        return iva;
    }
    
    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
}
