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
    private double valorCampaña;
    private int voto;
    public Politicos(){
    
    }
    Politicos(String _partidoPolitico,double _valorCampaña, int _voto){
       this.partidoPolitico=_partidoPolitico;
       this.valorCampaña=_valorCampaña;
       this.voto=_voto;

    }
}
