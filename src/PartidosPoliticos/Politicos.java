/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PartidosPoliticos;
import java.math.BigDecimal;
/**
 *
 * @author Familia Díaz Rendón
 */
public class Politicos {
    
    public String nombre;
    public String apellido;
    public int documento;
    public int edad;
    public BigDecimal telefono;
    private String direccion;
    private String ciudadNacimiento;
    public String partidoPolitico;
    
    public Politicos(){
    
    }
    public Politicos(String nombre,String apellido,int documento,int edad,BigDecimal telefono,String direccion,String ciudadNacimiento,String partidoPolitico){
       this();
        this.nombre=nombre;
        this.apellido=apellido;
        this.documento=documento;
        this.edad=edad;
        this.telefono=telefono;
        this.direccion=direccion;
        this.ciudadNacimiento=ciudadNacimiento;
        this.partidoPolitico=partidoPolitico;
    }
}
