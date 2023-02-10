/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consola;

import java.util.Scanner;

public class Consola {
    public static void main(String[] args){
        ProcesosCalculadora consola= new ProcesosCalculadora();
        Scanner leer= new Scanner(System.in);
        int opcion;
        boolean opc=true;
        while(opc){
            System.out.println("Menu");
            System.out.println("1)Suma");
            System.out.println("2)resta");
            System.out.println("3)multiplicaion");
            System.out.println("4)division");
            System.out.println("5)potencia enesima");
            System.out.println("6)raiz enesiam");
            System.out.println("7)seno");
            System.out.println("8)coseno");
            System.out.println("9)tangente");
            System.out.println("10)iva");
            System.out.println("11)salir");
            opcion= leer.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println("Sumando");
                        System.out.println("Ingrese el primer numero");
                        consola.setNum1(leer.nextInt());
                        System.out.println("Ingrese el segundo numero");
                        consola.setNum2(leer.nextInt());
                        System.out.println("El resultado es " + consola.sumar());
                        break;
                    case 2:
                        System.out.println("Restando");
                        System.out.println("Ingrese el primer numero");
                        consola.setNum1(leer.nextInt());
                        System.out.println("Ingrese el segundo numero");
                        consola.setNum2(leer.nextInt());
                        System.out.println("El resultado es " + consola.restar());
                        break;
                    case 3:
                        System.out.println("Multiplicando");
                        System.out.println("Ingrese el primer numero");
                        consola.setNum1(leer.nextInt());
                        System.out.println("Ingrese el segundo numero");
                        consola.setNum2(leer.nextInt());
                        System.out.println("El resultado es " + consola.multiplicar());
                        break;
                    case 4:
                        System.out.println("Dividir");
                        System.out.println("Ingrese el primer numero");
                        consola.setNum1(leer.nextInt());
                        System.out.println("Ingrese el segundo numero");
                        consola.setNum2(leer.nextInt());
                        System.out.println("El resultado es " + consola.dividir());
                        break;
                    case 5:
                        System.out.println("Potencia");
                        System.out.println("Ingrese el primer numero");
                        consola.setNum1(leer.nextInt());
                        System.out.println("Ingrese el segundo numero");
                        consola.setNum2(leer.nextInt());
                        System.out.println("El resultado es " + consola.potencia());
                        break;
                    case 6:
                        System.out.println("Raiz");
                        System.out.println("Ingrese el primer numero");
                        consola.setNum1(leer.nextInt());
                        System.out.println("Ingrese el segundo numero");
                        consola.setNum2(leer.nextInt());
                        System.out.println("El resultado es " + consola.raiz());
                        break;
                    case 7:
                        System.out.println("Seno");
                        System.out.println("Ingrese el numero");
                        consola.setNum1(leer.nextInt());
                        System.out.println("El resultado es " + consola.seno());
                        break;
                    case 8:
                        System.out.println("Coseno");
                        System.out.println("Ingrese el numero");
                        consola.setNum1(leer.nextInt());
                        System.out.println("El resultado es " + consola.coseno());
                        break;
                    case 9:
                        System.out.println("Tangente");
                        System.out.println("Ingrese el numero");
                        consola.setNum1(leer.nextInt());
                        System.out.println("El resultado es " + consola.tangente());
                        break;
                    case 10:
                        System.out.println("Calcular IVA");
                        System.out.println("Ingrese valor a sacar iva");
                        consola.setNum1(leer.nextInt());
                        System.out.println("Ingrese el porcentaje del iva");
                        consola.setNum2(leer.nextInt());
                        System.out.println("El resultado es " + consola.iva());
                        break;
                    case 11:
                        opc=false;
                        break;
                }
            }
        }
    }
