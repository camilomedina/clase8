/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import java.util.Scanner;
import PartidosPoliticos.Politicos;
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
        Politicos polo1= new Politicos("Juan", "Benitez", 123456789,33, numTelefono,"carre 15 #20-02","Bogota","Polo");
        BigDecimal numTelefono2 = new BigDecimal("3223123241");
        Politicos polo2= new Politicos("Camilo", "Medina", 234567890, 24, numTelefono2,"calle 40 #13-22","Tolima","Polo");
        BigDecimal numTelefono3 = new BigDecimal("3196795802");
        Politicos polo3= new Politicos("Christian", "Diaz", 1073179018, 20, numTelefono3,"Diagonal 86 #05c","Bogota","Polo");
        BigDecimal numTelefono4 = new BigDecimal("3223123241");
        Politicos liberal1= new Politicos("Camilo", "Medina", 234567890, 24, numTelefono4,"calle 40 #13-22","Tolima","Liberal");
        BigDecimal numTelefono5 = new BigDecimal("3223123241");
        Politicos liberal2= new Politicos("Camilo", "Medina", 234567890, 24, numTelefono5,"calle 40 #13-22","Tolima","Liberal");
        BigDecimal numTelefono6 = new BigDecimal("3223123241");
        Politicos verde1= new Politicos("Camilo", "Medina", 234567890, 24, numTelefono6,"calle 40 #13-22","Tolima","Verde");
        BigDecimal numTelefono7 = new BigDecimal("3223123241");
        Politicos verde2= new Politicos("Camilo", "Medina", 234567890, 24, numTelefono7,"calle 40 #13-22","Tolima","Verda");
        BigDecimal numTelefono8 = new BigDecimal("3223123241");
        Politicos mira1= new Politicos("Camilo", "Medina", 234567890, 24, numTelefono8,"calle 40 #13-22","Tolima","Polo");
        BigDecimal numTelefono9 = new BigDecimal("3223123241");
        Politicos mira2= new Politicos("Camilo", "Medina", 234567890, 24, numTelefono9,"calle 40 #13-22","Tolima","Polo");
        
        int menu;
        System.out.println("_______________________________");
        System.out.println("1.Informacion Electoral");
        System.out.println("2.Votar");
        System.out.println("_______________________________");
        
        
        
    }
    
}
