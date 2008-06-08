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

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reserva extends DomainDB {

    
	private Date inicio;
	private Date termino;
	private int idCarro;
	/**
     * Construtor dessa classe
     */
    public Reserva(){
    }


    public void reserva(){
    }


    public void efetuarReserva(String dataInicio, String dataTermino, int idCliente){
    	int i =1,atual=0;
    	
    	List<umReserva> listReserva = (List<umReserva>) this.findAll(new umReserva());
    	
    	//--------- Achando ultimo id das Reservas existentes -----------
    	for (i=1;i<listReserva.size();i++){
    		if ( listReserva.get(i).getIdReserva() > atual  ){
    			atual=listReserva.get(i).getIdReserva();
    			
    		}
    		
    	}
    	//---------- Fim Achar id ------------------------------------------
    	umReserva novaReserva = new umReserva();
    	novaReserva.setDataInicio(dataInicio);
    	novaReserva.setDataFim(dataTermino);
    	novaReserva.setIdCarro(this.idCarro);
    	novaReserva.setIdCliente(idCliente);
    	novaReserva.setIdReserva(atual+1);
    	
    	this.insert(novaReserva, this.getOid(novaReserva));
    	
    }

    public boolean getDisponibilidade(List<Integer> listCarros, String dataInicio, String dataTermino) throws Exception{
    	
    	int i =0,j=1;
    	SimpleDateFormat format = new SimpleDateFormat("d/M/yyyy");
    	this.inicio = format.parse(dataInicio);
    	this.termino = format.parse(dataTermino);
    	
    	if ( inicio.after(termino) ){
    		throw new IOException("Intervalo de aluguel inválido!");
    	}
    	List<umReserva> listReserva = (List<umReserva>) this.findAll(new umReserva());
    	 	
    	if (listReserva.size()<=1){
    		this.idCarro= listCarros.get(0);
    		return true;
    	}else{
    		    	
    		for (i=0;i<listCarros.size();i++){
    		
    			for(j=1;j<listReserva.size();j++){
    				if ( (listCarros.get(i) == listReserva.get(j).getIdCarro()) && ( intervalo(inicio,termino,listReserva.get(j).getDataInicio(),listReserva.get(j).getDataFim() ) ) ){
    					this.idCarro = listCarros.get(i);
    					return true;
    			
    				}
    		
    			}	
    		}
    	}	
    		return false;
    		
    }
    
    public boolean intervalo(Date dataInicio, Date dataFim, String inicio1, String termino1) throws ParseException{
    	SimpleDateFormat format = new SimpleDateFormat("d/M/yyyy");
    	
    	Date reservaInicio = format.parse(inicio1);
    	Date reservaTermino = format.parse(termino1);
    	
    	
    	if ( (dataInicio.equals(reservaInicio)) || (dataInicio.equals(reservaTermino)) || 
    			(dataFim.equals(reservaInicio)) || (dataFim.equals(reservaTermino))   ){
    			
    			return false;
    		
    		}else if ( (dataInicio.after(reservaInicio)) && (dataInicio.before(reservaTermino)) ){
    			return false;
    		
    		}else if ( (dataFim.after(reservaInicio)) && (dataFim.before(reservaTermino)) ){
    			return false;
    		}else if ( (dataInicio.before(reservaInicio)) && (dataFim.after(reservaTermino)) ){
    			return false;
    		}else{
    			return true;
    		}
    	
    	
    }
    
    public int getIdCarro(){
    	return this.idCarro;
    }

}
