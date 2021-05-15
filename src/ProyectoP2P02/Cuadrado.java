/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoP2P02;

import java.util.Scanner;

/**
 *
 * @author lo397
 */
public class Cuadrado extends Cuadrilatero{
    Scanner sc = new Scanner(System.in);
    boolean valido1 = false;

    public Cuadrado() {
    }

    public Cuadrado(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4, double area, double lado1, double lado2, double lado3, double lado4) {
        super(x1, x2, x3, x4, y1, y2, y3, y4, area, lado1, lado2, lado3, lado4);
    }
    
   
    @Override
    public void CalcularArea(){
        System.out.println("---------- Calcular el area del Cuadrado ----------");
        System.out.println(" ");
        System.out.println("--------X2Y2--------X1Y1------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("--------X3Y3--------X4Y4------");
        System.out.println("");
        
        System.out.print("Ingresa la Coordenada de X1: ");
        do {
            try {
                x1 = Double.parseDouble(sc.nextLine());
                valido1 = true;
            } catch (Exception e) {
                System.out.println("Error en la captura del numero -- Intentalo Nuevamente");
                System.out.print("Ingresa la Coordenada de X1: ");
                valido1 = false;
            }

        }while (valido1 == false);
        
        System.out.print("Ingresa la Coordenada de Y1: ");
        do{
            try{
                y1 = Double.parseDouble(sc.nextLine());
                valido1 = true;
        }catch (Exception e) {
                System.out.println("Error en la captura del numero -- Intentalo Nuevamente");
                System.out.print("Ingresa la Coordenada de Y1: ");
                valido1 = false;
            }
        
        }while(valido1 == false);
        System.out.print("Ingresa la Coordenada de X2: ");
        do {
            try {
                x2 = Double.parseDouble(sc.nextLine());
                valido1 = true;
            } catch (Exception e) {
                System.out.println("Error en la captura del numero -- Intentalo Nuevamente");
                System.out.print("Ingresa la Coordenada de X2: ");
                valido1 = false;
            }

        }while (valido1 == false);
        
        System.out.print("Ingresa la Coordenada de Y2: ");
        do{
            try{
                y2 = Double.parseDouble(sc.nextLine());
                valido1 = true;
        }catch (Exception e) {
                System.out.println("Error en la captura del numero -- Intentalo Nuevamente");
                System.out.print("Ingresa la Coordenada de Y2: ");
                valido1 = false;
            }
        
        }while(valido1 == false);
        
        System.out.print("Ingresa la Coordenada de X3: ");
        do {
            try {
                x3 = Double.parseDouble(sc.nextLine());
                valido1 = true;
            } catch (Exception e) {
                System.out.println("Error en la captura del numero -- Intentalo Nuevamente");
                System.out.print("Ingresa la Coordenada de X3: ");
                valido1 = false;
            }

        }while (valido1 == false);
        
        System.out.print("Ingresa la Coordenada de Y3: ");
        do{
            try{
                y3 = Double.parseDouble(sc.nextLine());
                valido1 = true;
        }catch (Exception e) {
                System.out.println("Error en la captura del numero -- Intentalo Nuevamente");
                System.out.print("Ingresa la Coordenada de Y3: ");
                valido1 = false;
            }
        
        }while(valido1 == false);
        
        System.out.print("Ingresa la Coordenada de X4: ");
        do {
            try {
                x4 = Double.parseDouble(sc.nextLine());
                valido1 = true;
            } catch (Exception e) {
                System.out.println("Error en la captura del numero -- Intentalo Nuevamente");
                System.out.print("Ingresa la Coordenada de X4: ");
                valido1 = false;
            }

        }while (valido1 == false);
        
        System.out.print("Ingresa la Coordenada de Y4: ");
        do{
            try{
                y4 = Double.parseDouble(sc.nextLine());
                valido1 = true;
        }catch (Exception e) {
                System.out.println("Error en la captura del numero -- Intentalo Nuevamente");
                System.out.print("Ingresa la Coordenada de Y4: ");
                valido1 = false;
            }
        
        }while(valido1 == false);
        
        
       
        
        //Distancia = Raiz((x2-x1)2 + (y2-y1)2);    x1 ------- x2
        //                                          x3---------x4
       
        lado1 = Math.sqrt((Math.pow((x1-(x2)), 2))+ (Math.pow((y1-(y2)), 2)));
        lado2 = Math.sqrt((Math.pow((x2-(x3)), 2))+ (Math.pow((y2-(y3)), 2)));
        lado3 = Math.sqrt((Math.pow((x3-(x4)), 2))+ (Math.pow((y3-(y4)), 2)));
        lado4 = Math.sqrt((Math.pow((x1-(x4)), 2))+ (Math.pow((y1-(y4)), 2)));
        if(lado1!=lado2 || lado1!=lado3 || lado1!=lado4){
            System.out.println("----- Lamentablemente NO es Un Cuadrado ------");
            System.out.println("");
        }else{
        System.out.println("LADO 1: "+lado1+" u");
        System.out.println("LADO 2: "+lado2+" u");
        System.out.println("LADO 3: "+lado3+" u");
        System.out.println("LADO 4: "+lado4+" u");
        
        area = Math.pow(lado1, 2);
        
        System.out.println("El Area del Cuadrado es: "+area+" u2");
    }
        
        }
    }
    

