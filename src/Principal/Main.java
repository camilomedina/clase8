/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import java.util.Scanner;
import PartidosPoliticos.Politicos;
import ClasePadre.Persona;
import java.math.BigDecimal;
/**
 *
 * @author Familia Díaz Rendón
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        
        BigDecimal numTelefono = new BigDecimal("3045809796");
        Persona polo1 =new Persona("Juan", "Benitez", 123456789,33, numTelefono,"carrera 15 #20-02","Bogota","Polo",0);
        BigDecimal numTelefono2 = new BigDecimal("3223123241");
        Persona polo2 =new Persona("Camilo", "Medina", 234567890, 24, numTelefono2,"calle 40 #13-22","Tolima","Polo",0);
        BigDecimal numTelefono3 = new BigDecimal("3196795802");
        Persona polo3= new Persona("Christian", "Diaz", 1073179018, 20, numTelefono3,"Diagonal 86 #05c","Bogota","Polo",0);
        BigDecimal numTelefono4 = new BigDecimal("3231973211");
        Persona liberal1= new Persona("Hernando", "Petro", 345678901, 40, numTelefono4,"calle 32 #13-22sur" ,"Manizales","Liberal",0);
        BigDecimal numTelefono5 = new BigDecimal("3324820112");
        Persona liberal2= new Persona("Gustavo", "Santos", 456789012, 33, numTelefono5,"carrera 40 #3a-1norte","Medellin","Liberal",0);
        BigDecimal numTelefono6 = new BigDecimal("3038492212");
        Persona verde1= new Persona("Elvio", "Lao", 567890123, 29, numTelefono6,"calle 3 #13-22","Tolima","Madrid",0);
        BigDecimal numTelefono7 = new BigDecimal("3397432834");
        Persona verde2= new Persona("Rosa", "Mendez", 678901234, 27, numTelefono7,"carrea 10 #45d ","Bogota","Facatativa",0);
        BigDecimal numTelefono8 = new BigDecimal("3983772212");
        Persona mira1= new Persona("Amparo", "Grisales", 89012345, 50, numTelefono8,"av cali #6-22","Cali","Polo",0);
        BigDecimal numTelefono9 = new BigDecimal("3736363612");
        Persona mira2= new Persona("Bob", "Marley", 90123456, 52, numTelefono9,"vereda el charquito" ,"Bucaramanga","Polo",0);
        
      
        byte menu;
        System.out.println("_______________________________");
        System.out.println("1.Informacion Electoral");
        System.out.println("2.Votar");
        System.out.println("3.Salir");
        System.out.println("_______________________________");
        menu=dato.nextByte();
        while(menu<=0 || menu>3){
        System.out.println("_______________________________");
        System.out.println("1.Informacion Electoral");
        System.out.println("2.Votar");
        System.out.println("3.Salir");
        System.out.println("_______________________________");
        menu=dato.nextByte();
        }
        switch(menu){
            case 1:
                System.out.println("_____________________________________________________________________");
                System.out.println("                  Partidos Politicos                                 ");
                System.out.println("_____________________________________________________________________");
                
                break;
            case 2:
                System.out.println("_____________________________________________________________________");
                System.out.println("                Vote por los representantes                           ");
                System.out.println("_____________________________________________________________________");
                System.out.println("1= Nombre: "+"Apellido");
                System.out.println("2=Nombre: "+"Apellido");
                System.out.println("3=Nombre: "+"Apellido");
                System.out.println("4=Nombre: "+"Apellido");
                System.out.println("5=Nombre: "+"Apellido");
                System.out.println("6=Nombre: "+"Apellido");
                System.out.println("7=Nombre: "+"Apellido");
                System.out.println("8=Nombre: "+"Apellido");
                System.out.println("9=Nombre: "+"Apellido");
                break;
            case 3:
                break;
        }
        
        
        
        
    }
    
}
