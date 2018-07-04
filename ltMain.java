/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estDatos;
import estDatosRep.*;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author JuandeJesus
 */
public class ltMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        ListaToken objeto=new ListaToken();
        Scanner j=new Scanner(System.in);
        do{
            System.out.println("*****************************************");
        System.out.println("¿Que que deseas hacer?");
        System.out.println("1) Crear primeras dos listas");
        System.out.println("2) Crear tercer lista");
        System.out.println("3) Depurar las dos primeras listas");
        System.out.println("4) Salir");
        opcion=j.nextInt();
        
        switch(opcion){
            case 1:
                try{
                    objeto.lectura("EDEdicto.txt");
                }
                catch (IOException e){
                    System.out.println("Alguno de los archivos no existe");;
                }
                System.out.println("Accion completada");
                break;
                
            case 2:
                try{
                    objeto.lectura2("EDSalvedades.txt");
                }
                catch (IOException e){
                    System.out.println("Alguno de los archivos no existe");;
                }
                System.out.println("Accion completada ");
                break;
                
            case 3:
                try{
                    objeto.lectura3("EDObsoleto.txt");
                }
                catch (IOException e){
                    System.out.println("Alguno de los archivos no existe");;
                }
                System.out.println("Accion competada");
                break;
                
            default:
                break;
        }
        }while(opcion!=4);
        
    }
    
}
