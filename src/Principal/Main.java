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
 * @author Christian Diaz y Camilo Medina
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        //variables 
        byte influencia;
        //variables de precio acumulados dependiendo el voto a las campañas politicas
        int tele=200_000;
        int radio=150_000;
        int internet=10_000;
        
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
        
        do{
            //menu principal de opciones
        byte menu;
        System.out.println("_______________________________");
        System.out.println("1.Informacion Electoral");
        System.out.println("2.Votar");
        System.out.println("3.Informacion Campañas");
        System.out.println("_______________________________");
        menu=dato.nextByte();
        while(menu<=0 || menu>3){
            //ciclo para validacion de datos ingresados, sean correctos
        System.out.println("_______________________________");
        System.out.println("1.Informacion Electoral");
        System.out.println("2.Votar");
        System.out.println("3.Informacion Campañas");
        System.out.println("_______________________________");
        menu=dato.nextByte();
        }
        switch(menu){
            case 1:
                //impresion por pantalla de los datos de los politicos y tambien de sus partidos correspondientes
                System.out.println("_____________________________________________________________________");
                System.out.println("                  Total Votos                                ");
                System.out.println("_____________________________________________________________________");
                 System.out.println("1=Nombre: "+polo1.getNombre()+" Apellido "+polo1.getApellido()+" Edad: "+polo1.getEdad()+" votos "+polo1.getVoto(0));
                System.out.println("2=Nombre: "+polo2.getNombre()+" Apellido "+polo2.getApellido()+" Edad: "+polo2.getEdad()+" votos "+polo2.getVoto(0));
                System.out.println("3=Nombre: "+polo3.getNombre()+" Apellido "+polo3.getApellido()+" Edad: "+polo3.getEdad()+" votos "+polo3.getVoto(0));
                System.out.println("4=Nombre: "+liberal1.getNombre()+" Apellido "+liberal1.getApellido()+" Edad: "+liberal1.getEdad()+" votos "+liberal1.getVoto(0));
                System.out.println("5=Nombre: "+liberal2.getNombre()+" Apellido "+liberal2.getApellido()+" Edad: "+liberal2.getEdad()+" votos "+liberal2.getVoto(0));
                System.out.println("6=Nombre: "+verde1.getNombre()+" Apellido "+verde1.getApellido()+" Edad: "+verde1.getEdad()+" votos "+verde1.getVoto(0));
                System.out.println("7=Nombre: "+verde2.getNombre()+" Apellido "+verde2.getApellido()+" Edad: "+verde2.getEdad()+" votos "+verde2.getVoto(0));
                System.out.println("8=Nombre: "+mira1.getNombre()+" Apellido "+mira1.getApellido()+" Edad: "+mira1.getEdad()+" votos "+mira1.getVoto(0));
                System.out.println("9=Nombre: "+mira2.getNombre()+" Apellido "+mira2.getApellido()+" Edad: "+mira2.getEdad()+" votos "+mira2.getVoto(0));
                System.out.println("______________________________________________________________________");
                System.out.println("              Por partido Politico");
                System.out.println("______________________________________________________________________");
                //lamado a get referente a cada partido politico por voto
                int votosPolo=polo1.getVoto(0)+polo2.getVoto(0)+polo3.getVoto(0);
                int votosLiberal=liberal1.getVoto(0)+liberal2.getVoto(0);
                int votosVerde=verde1.getVoto(0)+verde2.getVoto(0);
                int votosMira=mira1.getVoto(0)+mira2.getVoto(0);
                System.out.println(" Partdio Polo :   "+votosPolo);
                System.out.println(" Partido Liberal : "+votosLiberal);
                System.out.println(" Partdio Verde:   "+votosVerde);
                System.out.println(" Partido Mira: "+votosMira);
                System.out.println("______________________________________________________________________");
                   
                break;
                //***************************************************************
            case 2:
                //votacion por teclado de cantidatos segun la opcion.
                short pregunta;
                System.out.println("_____________________________________________________________________");
                System.out.println("                Vote por los representantes                           ");
                System.out.println("_____________________________________________________________________");
                System.out.println("1=Nombre: "+polo1.getNombre()+" Apellido "+polo1.getApellido()+" Edad: "+polo1.getEdad());
                System.out.println("2=Nombre: "+polo2.getNombre()+" Apellido "+polo2.getApellido()+" Edad: "+polo2.getEdad());
                System.out.println("3=Nombre: "+polo3.getNombre()+" Apellido "+polo3.getApellido()+" Edad: "+polo3.getEdad());
                System.out.println("4=Nombre: "+liberal1.getNombre()+" Apellido "+liberal1.getApellido()+" Edad: "+liberal1.getEdad());
                System.out.println("5=Nombre: "+liberal2.getNombre()+" Apellido "+liberal2.getApellido()+" Edad: "+liberal2.getEdad());
                System.out.println("6=Nombre: "+verde1.getNombre()+" Apellido "+verde1.getApellido()+" Edad: "+verde1.getEdad());
                System.out.println("7=Nombre: "+verde2.getNombre()+" Apellido "+verde2.getApellido()+" Edad: "+verde2.getEdad());
                System.out.println("8=Nombre: "+mira1.getNombre()+" Apellido "+mira1.getApellido()+" Edad: "+mira1.getEdad());
                System.out.println("9=Nombre: "+mira2.getNombre()+" Apellido "+mira2.getApellido()+" Edad: "+mira2.getEdad());
                pregunta=dato.nextShort();
                while(pregunta<=0 && pregunta>9){
                    //para volver a pedir un valor si este es erroneo
                System.out.println("_____________________________________________________________________");
                System.out.println("                Vote por los representantes                           ");
                System.out.println("_____________________________________________________________________");
                System.out.println("1=Nombre: "+polo1.getNombre()+" Apellido "+polo1.getApellido()+" Edad: "+polo1.getEdad());
                System.out.println("2=Nombre: "+polo2.getNombre()+" Apellido "+polo2.getApellido()+" Edad: "+polo2.getEdad());
                System.out.println("3=Nombre: "+polo3.getNombre()+" Apellido "+polo3.getApellido()+" Edad: "+polo3.getEdad());
                System.out.println("4=Nombre: "+liberal1.getNombre()+" Apellido "+liberal1.getApellido()+" Edad: "+liberal1.getEdad());
                System.out.println("5=Nombre: "+liberal2.getNombre()+" Apellido "+liberal2.getApellido()+" Edad: "+liberal2.getEdad());
                System.out.println("6=Nombre: "+verde1.getNombre()+" Apellido "+verde1.getApellido()+" Edad: "+verde1.getEdad());
                System.out.println("7=Nombre: "+verde2.getNombre()+" Apellido "+verde2.getApellido()+" Edad: "+verde2.getEdad());
                System.out.println("8=Nombre: "+mira1.getNombre()+" Apellido "+mira1.getApellido()+" Edad: "+mira1.getEdad());
                System.out.println("9=Nombre: "+mira2.getNombre()+" Apellido "+mira2.getApellido()+" Edad: "+mira2.getEdad());
                pregunta=dato.nextShort();
                }
                switch(pregunta){
                    case 1:
                        //segun el tipo de la publicidad
                        int congreso1=0;
                        congreso1++;
                        System.out.println("________________________________________________________");
                        System.out.println(" Como fue influenciado para votar por "+polo1.getNombre());
                        System.out.println("________________________________________________________");
                        System.out.println("1.Voto influenciado por publicidad en Televisión");
                        System.out.println("2.Voto influenciado por publicidad en Radio");
                        System.out.println("3.Voto influenciado por publicidad en Internet");
                        System.out.println("________________________________________________________");
                        //el voto se acumula y se va sumando segun la cantidad de votos a este candidato
                        polo1.getVoto(congreso1);
                        influencia = dato.nextByte();
                        while(influencia<=0 && influencia>3 ){
                            System.out.println("________________________________________________________");
                            System.out.println(" Como fue influenciado para votar por "+polo1.getNombre());
                            System.out.println("________________________________________________________");
                            System.out.println("1.Voto influenciado por publicidad en Televisión");
                            System.out.println("2.Voto influenciado por publicidad en Radio");
                            System.out.println("3.Voto influenciado por publicidad en Internet");
                            System.out.println("________________________________________________________");
                        }
                        //metodos para el precio de la campaña total
                        if (influencia==1){
                            Persona.sumaPolo(tele);
                        }
                        if (influencia==2){
                            Persona.sumaPolo(radio);
                        } 
                        if (influencia==3){
                            Persona.sumaPolo(internet);
                        }
                        System.out.println("___________________");
                        System.out.println(" Gracias por votar");
                        System.out.println("___________________");
                        break;
                    case 2:
                        
                        int congreso2=0;
                        congreso2++;
                        System.out.println("________________________________________________________");
                        System.out.println(" Como fue influenciado para votar por "+polo2.getNombre());
                        System.out.println("________________________________________________________");
                        System.out.println("1.Voto influenciado por publicidad en Televisión");
                        System.out.println("2.Voto influenciado por publicidad en Radio");
                        System.out.println("3.Voto influenciado por publicidad en Internet");
                        System.out.println("________________________________________________________");
                        //el voto se acumula y se va sumando segun la cantidad de votos a este candidato
                        polo2.getVoto(congreso2);
                        influencia = dato.nextByte();
                        while(influencia<=0 && influencia>3 ){
                            System.out.println("________________________________________________________");
                            System.out.println(" Como fue influenciado para votar por "+polo2.getNombre());
                            System.out.println("________________________________________________________");
                            System.out.println("1.Voto influenciado por publicidad en Televisión");
                            System.out.println("2.Voto influenciado por publicidad en Radio");
                            System.out.println("3.Voto influenciado por publicidad en Internet");
                            System.out.println("________________________________________________________");
                        }
                        //metodos para el precio de la campaña total
                         if (influencia==1){
                            Persona.sumaPolo(tele);
                        }
                        if (influencia==2){
                            Persona.sumaPolo(radio);
                        } 
                        if (influencia==3){
                            Persona.sumaPolo(internet);
                        }
                        System.out.println("___________________");
                        System.out.println(" Gracias por votar");
                        System.out.println("___________________");
                        break;
                    case 3:
                        int congreso3=0;
                        congreso3++;
                        System.out.println("________________________________________________________");
                        System.out.println(" Como fue influenciado para votar por "+polo3.getNombre());
                        System.out.println("________________________________________________________");
                        System.out.println("1.Voto influenciado por publicidad en Televisión");
                        System.out.println("2.Voto influenciado por publicidad en Radio");
                        System.out.println("3.Voto influenciado por publicidad en Internet");
                        System.out.println("________________________________________________________");
                        //el voto se acumula y se va sumando segun la cantidad de votos a este candidato
                        polo3.getVoto(congreso3);
                        influencia = dato.nextByte();
                        while(influencia<=0 && influencia>3 ){
                            System.out.println("________________________________________________________");
                            System.out.println(" Como fue influenciado para votar por "+polo3.getNombre());
                            System.out.println("________________________________________________________");
                            System.out.println("1.Voto influenciado por publicidad en Televisión");
                            System.out.println("2.Voto influenciado por publicidad en Radio");
                            System.out.println("3.Voto influenciado por publicidad en Internet");
                            System.out.println("________________________________________________________");
                        }
                        //metodos para el precio de la campaña total
                          if (influencia==1){
                            Persona.sumaPolo(tele);
                        }
                        if (influencia==2){
                            Persona.sumaPolo(radio);
                        } 
                        if (influencia==3){
                            Persona.sumaPolo(internet);
                        }
                        System.out.println("___________________");
                        System.out.println(" Gracias por votar");
                        System.out.println("___________________");
                        break;
                    case 4:
                         int congreso4=0;
                        congreso4++;
                        System.out.println("________________________________________________________");
                        System.out.println(" Como fue influenciado para votar por "+liberal1.getNombre());
                        System.out.println("________________________________________________________");
                        System.out.println("1.Voto influenciado por publicidad en Televisión");
                        System.out.println("2.Voto influenciado por publicidad en Radio");
                        System.out.println("3.Voto influenciado por publicidad en Internet");
                        System.out.println("________________________________________________________");
                        //el voto se acumula y se va sumando segun la cantidad de votos a este candidato
                        liberal1.getVoto(congreso4);
                        influencia = dato.nextByte();
                        while(influencia<=0 && influencia>3 ){
                            System.out.println("________________________________________________________");
                            System.out.println(" Como fue influenciado para votar por "+liberal1.getNombre());
                            System.out.println("________________________________________________________");
                            System.out.println("1.Voto influenciado por publicidad en Televisión");
                            System.out.println("2.Voto influenciado por publicidad en Radio");
                            System.out.println("3.Voto influenciado por publicidad en Internet");
                            System.out.println("________________________________________________________");
                        }
                        if (influencia==1){
                            Persona.sumaLiberal(tele);
                        }
                        if (influencia==2){
                            Persona.sumaLiberal(radio);
                        } 
                        if (influencia==3){
                            Persona.sumaLiberal(internet);
                        }
                        System.out.println("___________________");
                        System.out.println(" Gracias por votar");
                        System.out.println("___________________");
                        break;
                    case 5:
                         int congreso5=0;
                        congreso5++;
                        System.out.println("________________________________________________________");
                        System.out.println(" Como fue influenciado para votar por "+liberal2.getNombre());
                        System.out.println("________________________________________________________");
                        System.out.println("1.Voto influenciado por publicidad en Televisión");
                        System.out.println("2.Voto influenciado por publicidad en Radio");
                        System.out.println("3.Voto influenciado por publicidad en Internet");
                        System.out.println("________________________________________________________");
                        //el voto se acumula y se va sumando segun la cantidad de votos a este candidato
                        liberal2.getVoto(congreso5);
                        influencia = dato.nextByte();
                        while(influencia<=0 && influencia>3 ){
                            System.out.println("________________________________________________________");
                            System.out.println(" Como fue influenciado para votar por "+liberal2.getNombre());
                            System.out.println("________________________________________________________");
                            System.out.println("1.Voto influenciado por publicidad en Televisión");
                            System.out.println("2.Voto influenciado por publicidad en Radio");
                            System.out.println("3.Voto influenciado por publicidad en Internet");
                            System.out.println("________________________________________________________");
                        }
                        if (influencia==1){
                            Persona.sumaLiberal(tele);
                        }
                        if (influencia==2){
                            Persona.sumaLiberal(radio);
                        } 
                        if (influencia==3){
                            Persona.sumaLiberal(internet);
                        }
                        System.out.println("___________________");
                        System.out.println(" Gracias por votar");
                        System.out.println("___________________");
                        break;
                    case 6:
                         int congreso6=0;
                        congreso6++;
                        System.out.println("________________________________________________________");
                        System.out.println(" Como fue influenciado para votar por "+verde1.getNombre());
                        System.out.println("________________________________________________________");
                        System.out.println("1.Voto influenciado por publicidad en Televisión");
                        System.out.println("2.Voto influenciado por publicidad en Radio");
                        System.out.println("3.Voto influenciado por publicidad en Internet");
                        System.out.println("________________________________________________________");
                        //el voto se acumula y se va sumando segun la cantidad de votos a este candidato
                        verde1.getVoto(congreso6);
                        influencia = dato.nextByte();
                        while(influencia<=0 && influencia>3 ){
                            System.out.println("________________________________________________________");
                            System.out.println(" Como fue influenciado para votar por "+verde1.getNombre());
                            System.out.println("________________________________________________________");
                            System.out.println("1.Voto influenciado por publicidad en Televisión");
                            System.out.println("2.Voto influenciado por publicidad en Radio");
                            System.out.println("3.Voto influenciado por publicidad en Internet");
                            System.out.println("________________________________________________________");
                        }
                        if (influencia==1){
                            Persona.sumaVerde(tele);
                        }
                        if (influencia==2){
                            Persona.sumaVerde(radio);
                        } 
                        if (influencia==3){
                            Persona.sumaVerde(internet);
                        }
                        System.out.println("___________________");
                        System.out.println(" Gracias por votar");
                        System.out.println("___________________");
                        break;
                    case 7:
                         int congreso7=0;
                        congreso7++;
                        System.out.println("________________________________________________________");
                        System.out.println(" Como fue influenciado para votar por "+verde2.getNombre());
                        System.out.println("________________________________________________________");
                        System.out.println("1.Voto influenciado por publicidad en Televisión");
                        System.out.println("2.Voto influenciado por publicidad en Radio");
                        System.out.println("3.Voto influenciado por publicidad en Internet");
                        System.out.println("________________________________________________________");
                        verde2.getVoto(congreso7);
                        influencia = dato.nextByte();
                        while(influencia<=0 && influencia>3 ){
                            System.out.println("________________________________________________________");
                            System.out.println(" Como fue influenciado para votar por "+verde2.getNombre());
                            System.out.println("________________________________________________________");
                            System.out.println("1.Voto influenciado por publicidad en Televisión");
                            System.out.println("2.Voto influenciado por publicidad en Radio");
                            System.out.println("3.Voto influenciado por publicidad en Internet");
                            System.out.println("________________________________________________________");
                        }
                        //metodos para el precio de la campaña total
                       if (influencia==1){
                            Persona.sumaVerde(tele);
                        }
                        if (influencia==2){
                            Persona.sumaVerde(radio);
                        } 
                        if (influencia==3){
                            Persona.sumaVerde(internet);
                        }
                        System.out.println("___________________");
                        System.out.println(" Gracias por votar");
                        System.out.println("___________________");
                        break;
                    case 8:
                         int congreso8=0;
                        congreso8++;
                        System.out.println("________________________________________________________");
                        System.out.println(" Como fue influenciado para votar por "+mira1.getNombre());
                        System.out.println("________________________________________________________");
                        System.out.println("1.Voto influenciado por publicidad en Televisión");
                        System.out.println("2.Voto influenciado por publicidad en Radio");
                        System.out.println("3.Voto influenciado por publicidad en Internet");
                        System.out.println("________________________________________________________");
                        mira1.getVoto(congreso8);
                        influencia = dato.nextByte();
                        while(influencia<=0 && influencia>3 ){
                            System.out.println("________________________________________________________");
                            System.out.println(" Como fue influenciado para votar por "+mira1.getNombre());
                            System.out.println("________________________________________________________");
                            System.out.println("1.Voto influenciado por publicidad en Televisión");
                            System.out.println("2.Voto influenciado por publicidad en Radio");
                            System.out.println("3.Voto influenciado por publicidad en Internet");
                            System.out.println("________________________________________________________");
                        }
                        //metodos para el precio de la campaña total
                        if (influencia==1){
                            Persona.sumaMira(tele);
                        }
                        if (influencia==2){
                            Persona.sumaMira(radio);
                        } 
                        if (influencia==3){
                            Persona.sumaMira(internet);
                        }
                        System.out.println("___________________");
                        System.out.println(" Gracias por votar");
                        System.out.println("___________________");
                        break;
                    case 9:
                         int congreso9=0;
                        congreso9++;
                        System.out.println("________________________________________________________");
                        System.out.println(" Como fue influenciado para votar por "+mira2.getNombre());
                        System.out.println("________________________________________________________");
                        System.out.println("1.Voto influenciado por publicidad en Televisión");
                        System.out.println("2.Voto influenciado por publicidad en Radio");
                        System.out.println("3.Voto influenciado por publicidad en Internet");
                        System.out.println("________________________________________________________");
                        mira2.getVoto(congreso9);
                        influencia = dato.nextByte();
                        while(influencia<=0 && influencia>3 ){
                            System.out.println("________________________________________________________");
                            System.out.println(" Como fue influenciado para votar por "+mira2.getNombre());
                            System.out.println("________________________________________________________");
                            System.out.println("1.Voto influenciado por publicidad en Televisión");
                            System.out.println("2.Voto influenciado por publicidad en Radio");
                            System.out.println("3.Voto influenciado por publicidad en Internet");
                            System.out.println("________________________________________________________");
                        }
                        if (influencia==1){
                            Persona.sumaMira(tele);
                        }
                        if (influencia==2){
                            Persona.sumaMira(radio);
                        } 
                        if (influencia==3){
                            Persona.sumaMira(internet);
                        }
                        System.out.println("___________________");
                        System.out.println(" Gracias por votar");
                        System.out.println("___________________");
                        break;
                
                }
                break;
                //**********************************++
            case 3:
                //costo de la campaña + los votos en precio correspondiente
                System.out.println("____________________________________________________________");
                System.out.println("                   Costo de las Campañas " );
                System.out.println("____________________________________________________________");
                System.out.println(" Partido Polo  :  "+Persona.valorPolo);
                System.out.println("____________________________________________________________");
                System.out.println(" Partido Liberal  :  "+Persona.valorLiberal);
                System.out.println("____________________________________________________________");
                System.out.println(" Partido Verde  :  "+Persona.valorVerde);
                System.out.println("____________________________________________________________");
                System.out.println(" Partido Mira  :  "+Persona.valorMira);
                System.out.println("____________________________________________________________");
                break;
        }
        
        
        }while(true==true);
        
    }
    
}
