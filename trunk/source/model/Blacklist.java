/*
 * C�DIGO GERADO PELO RAPDIS
 * www.geti.dcc.ufrj.br
 * Data da gera��o 06/05/2008
 * Hora da gera��o 09:54 AM
 * 
 * Nome Nome do Programa
 * E-mail Seu Email
 * Autor Nome do Autor
 * Vers�o Vers�o do Programa
 */
package model;

import java.util.List;

public class Blacklist extends DomainDB {

    /**
     * Construtor dessa classe
     */
    public Blacklist(){
    }


    public void blacklist(){
    }


    public String getMotivo(String id){
    	int idCliente,i;
    	String motivo= null;
    	idCliente = Integer.parseInt(id);
    	List<umBlacklist> blacklist = (List<umBlacklist>) this.findAll(new umBlacklist());
    	
    	
    	for (i=1;i<blacklist.size();i++){
    		if ( idCliente == blacklist.get(i).getIdCliente() ){
    			motivo = blacklist.get(i).getMotivo();
    			return motivo;
    		}
    		
    	}
    	return motivo;
    }

}
