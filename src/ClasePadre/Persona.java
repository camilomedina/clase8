/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasePadre;

import java.math.BigDecimal;

/**
 *
 * @author Familia Díaz Rendón
 */
public class Persona extends Politicos{
    private String nombre;//Nombre de la persona
    private String apellido;//
    private int documento;
    private int edad;
    private BigDecimal telefono;
    private String direccion;
    private String ciudadNacimiento;
    //Constructor Clase Hija
    Persona(String _nombre,String _apellido,int _documento,int _edad,BigDecimal _telefono,String _direccion,String _ciudadNacimiento,String _partidoPolitico){
        this.nombre=_nombre;
        this.apellido=_apellido;
        this.documento=_documento;
        this.edad=_edad;
        this.telefono=_telefono;
        this.direccion=_direccion;
        this.ciudadNacimiento=_ciudadNacimiento;   
    }
    //*****************Nombre**************
    public void setNombre(String _nombre){
        this.nombre=_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
      //*****************Apellido**************
    public void setApellido(String _apellido){
        this.apellido=_apellido;
    }
    public String getApellido(){
        return this.apellido;
    }
      //*****************Documento**************
    public void setDocumento(int _documento){
        this.documento=_documento;
    }
    public int getDocumento(){
        return this.documento;
    }
     //*****************Edad**************
    public void setEdad(int _edad){
        this.edad=_edad;
    }
    public int getEdad(){
        return this.edad;
    }
     //*****************Telefono**************
    public void setTelefono(BigDecimal _telefono){
        this.telefono=_telefono;
    }
    public BigDecimal getTelefono(){
        return this.telefono;
    }
     //*****************Direccion**************
    public void setDireccion(String _direccion){
        this.direccion=_direccion;
    }
    public String getDireccion(){
        return this.direccion;
    }
     //*****************CiudadNacimiento**************
    public void setCiudad(String _ciudadNacimiento){
        this.ciudadNacimiento=_ciudadNacimiento;
    }
    public String getCiudad(){
        return this.ciudadNacimiento;
    }
}
