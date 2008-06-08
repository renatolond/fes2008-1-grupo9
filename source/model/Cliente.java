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

import java.lang.reflect.Array;
import java.util.List;

public class Cliente extends DomainDB {

	
	private int idCliente;
    /**
     * Construtor dessa classe
     */
    public Cliente(){
    }


    public void cliente(){
    }


    public String[] verificaCadastro(String cpf){
    	
    	int i =1;
    	String v[]= {null,null};
    	List<umCliente> listCliente = (List<umCliente>) this.findAll(new umCliente());
    	
    	
    	for (i=1;i<listCliente.size();i++){
    		if ( cpf.equals( listCliente.get(i).getCpf() ) ){
    			this.idCliente = listCliente.get(i).getIdCliente();
    			v[0]=Integer.toString(listCliente.get(i).getIdCliente());
    			v[1]=listCliente.get(i).getNome();
    			return v;
    		}
    		
    	}
    	return v;
    }

    public String[] getDadosCliente(){
    	int i =1;
    	String v[]= {null,null,null,null,null,null};
    	List<umCliente> listCliente = (List<umCliente>) this.findAll(new umCliente());
    	
    	
    	for (i=1;i<listCliente.size();i++){
    		if ( this.idCliente == listCliente.get(i).getIdCliente()  ){
    			v[0]= Integer.toString(listCliente.get(i).getIdCliente());
    			v[1]= listCliente.get(i).getNome();
    			v[2]= listCliente.get(i).getEndereco();
    			v[3]= listCliente.get(i).getCpf();
    			v[4]= listCliente.get(i).getTelefone();
    			v[5]= listCliente.get(i).getCnh();
    			return v;
    		}
    		
    	}
    	return v;
    }
    
    public void efetuaCadastro(String[] vDados){
    	
    	umCliente cliente = new umCliente();
    	
    	cliente.setIdCliente(Integer.parseInt(vDados[0]));
    	cliente.setNome(vDados[1]);
    	cliente.setEndereco(vDados[2]);
    	cliente.setCpf(vDados[3]);
    	cliente.setTelefone(vDados[4]);
    	cliente.setDataNascimento(vDados[5]);
    	cliente.setEstadoCivil(vDados[6]);
    	cliente.setCnh(vDados[7]);
    	
    	this.insert(cliente, this.getOid(cliente));
    	
    	
    }

    public int getLastID(){
    
    	int i =1,last=0;
    	
    	List<umCliente> listCliente = (List<umCliente>) this.findAll(new umCliente());
    	
    	if (listCliente.size()<=1){
    		return 0;
    	}else{
    		
    	
    	
    		for (i=1;i<listCliente.size();i++){
    			if ( listCliente.get(i).getIdCliente() > last ){
    				last = listCliente.get(i).getIdCliente();
    			}
    		
    		}
    		return last;
    	}
    	
    }
    
    
    public int getIdCliente(){
    	return this.idCliente;
    }

}
