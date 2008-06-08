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

import java.util.List;

public class Modelo extends DomainDB {

    private int idGrupoAtual;
    private int idModeloAtual;
	/**
     * Construtor dessa classe
     */
    public Modelo(){
    }


   


    public int getIdGrupo(String modelo){
    	int i =1;
        
    	List<umModelo> listModelo = (List<umModelo>) this.findAll(new umModelo());
    	 
    	
    	
    	for (i=1;i<listModelo.size();i++){
    			if (modelo.equals(listModelo.get(i).getMarca() ) ) {
    				this.idGrupoAtual= listModelo.get(i).getIdGrupo();
    				this.idModeloAtual=listModelo.get(i).getIdGrupo();
    				return this.idGrupoAtual;
    			}
    			
    	}
    	return -1;
    }
    
    public String[] getModelos(){
    	int i =1;
    
    	List<umModelo> listModelo = (List<umModelo>) this.findAll(new umModelo());
    	String modelos[] = new String[listModelo.size()-1]; 
    	
    	
    	for (i=1;i<listModelo.size();i++){
    			modelos[i-1] = listModelo.get(i).getMarca();
    			
    			
    	   		
    	}
    	
    	return modelos;
    }

    public int getIdModeloAtual(){
    	return this.idModeloAtual;
    }
    
    public int getIdGrupoAtual(){
    	return this.idGrupoAtual;
    }
    
    public String[] getDadosModelo(){
    	int i =1;
    	String v[]= {null,null,null};
    	List<umModelo> listModelo = (List<umModelo>) this.findAll(new umModelo());
    	
    	
    	for (i=1;i<listModelo.size();i++){
    		if ( this.idModeloAtual == listModelo.get(i).getIdModelo()  ){
    			v[0]= listModelo.get(i).getMarca();
    			v[1]= listModelo.get(i).getFabricante();
    			v[2]= Float.toString(listModelo.get(i).getValor());
    			
    			return v;
    		}
    		
    	}
    	return v;
    }
}
