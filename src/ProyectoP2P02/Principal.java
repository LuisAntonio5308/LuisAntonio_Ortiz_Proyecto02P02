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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc =0;
        // TODO code application logic here
        System.out.println("Proyecto Segundo Parcial");
        
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("------ BIENVENIDO USUARIO ------");
        System.out.println("--------------------------------");
        System.out.println("");
        
       
        while(opc !=4){
            try{
            System.out.println("---------------MENU PRINCIPAL----------------");
            System.out.println("1) Calcular Area del Cuadrado");
            System.out.println("2) Calcular Area del Rectangulo");
            System.out.println("3) Calcular Area del Trapecio");
            System.out.println("4) Salir");
            System.out.print("Elige una opcion ---> ");
            opc = Integer.parseInt(sc.nextLine());
            
            switch(opc){
                case 1:
                    Cuadrado cuadrado = new Cuadrado();
                    cuadrado.CalcularArea();
                    break;
                    
                case 2:
                    Rectangulo rectangulo = new Rectangulo();
                    rectangulo.CalcularArea();
                    break;
                    
                case 3:
                    Trapecio trapecio = new Trapecio();
                    trapecio.CalcularArea();
                    break;
                    
                case 4:
                    System.out.println("----- Saliste del Sistema -----");
                    System.out.println("---- Pasa un Excelente dia ----");
                    break;
                default:
                    System.out.println("No es opcion del Menu");
                    System.out.println("Intentalo Nuevamente");
            
            
            
            }
            }catch(Exception e){
                System.out.println("Respuesta no Valida -- Intentalo Nuevamente");
                opc =0;
                System.out.println("");
            }
            
        
        
        }
        
    }
    
}
