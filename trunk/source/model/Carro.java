/*
 * CÓDIGO GERADO PELO RAPDIS
 * www.geti.dcc.ufrj.br
 * Data da geração 06/05/2008
 * Hora da geração 09:54 AM
 * 
 * Nome Nome do Programa
 * E-mail Seu Email
 * Autor Nome do Autor
 * Versão Versão do Programa
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class Carro extends DomainDB {

    /**
     * Construtor dessa classe
     */
    public Carro(){
    }


    


    public void getDisponibilidade(){
    }

    public List<Integer> getIDCarro(int idModelo){
    	int i =1;
    	
    	List<umCarro> listCarro = (List<umCarro>) this.findAll(new umCarro());
    	List<Integer> possiveisCarros = new ArrayList<Integer>();
    	
    	
    	for (i=1;i<listCarro.size();i++){
    		if ( idModelo == listCarro.get(i).getIdModelo()){
    			possiveisCarros.add(listCarro.get(i).getIdCarro());
    		}
    		
    	}
    	return possiveisCarros;
    }
    
    public String[] getDadosCarro(int id){
    	int i =1;
    	String v[]= {null,null,null};
    	List<umCarro> listCarro = (List<umCarro>) this.findAll(new umCarro());
    	
    	
    	for (i=1;i<listCarro.size();i++){
    		if ( id == listCarro.get(i).getIdCarro()  ){
    			v[0]= Integer.toString(listCarro.get(i).getIdCarro());
    			v[1]= listCarro.get(i).getAno();
    			v[2]= listCarro.get(i).getPlaca();
    			
    			return v;
    		}
    		
    	}
    	return v;
    }
    

}
