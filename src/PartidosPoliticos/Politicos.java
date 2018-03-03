/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PartidosPoliticos;

/**
 *
 * @author Familia Díaz Rendón
 */
public class Politicos {
    
   
    private String partidoPolitico;
    private int voto;
    
    
    
    public Politicos(String _partidoPolitico, int _voto){
       this.partidoPolitico=_partidoPolitico;
       this.voto=_voto;

    }
    public void setpartidoPolitico(String _partidoPolitico){
        this.partidoPolitico=_partidoPolitico;
    }
    
    public String getpartidoPolitico(){
        return this.partidoPolitico;
    }
    
    
    public void setVoto(int _voto){
        this.voto=_voto;
                
    }
    public int getVoto(){
        return this.voto;
    }
    
}
