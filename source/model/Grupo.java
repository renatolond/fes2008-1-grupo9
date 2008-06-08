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

public class Grupo extends DomainDB {

    /**
     * Construtor dessa classe
     */
    public Grupo(){
    }


    

    public String getGrupo(int id){
    	int i =1;
        
    	List<umGrupo> listGrupo = (List<umGrupo>) this.findAll(new umGrupo());
    	 
    	
    	
    	for (i=1;i<listGrupo.size();i++){
    		if (id == listGrupo.get(i).getIdgrupo()){
    			
    			return listGrupo.get(i).getDescricaoGrupo();
    		}
    			
    			
    	   		
    	}
    	
    	return null;
    	
    	
    }

}
