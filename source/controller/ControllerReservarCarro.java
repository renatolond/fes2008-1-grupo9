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
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

import model.Blacklist;
import model.Carro;
import model.Cliente;
import model.Filial;
import model.Funcionario;
import model.Grupo;
import model.Locacoes;
import model.Modelo;
import model.Reserva;
import view.Confirmar;
import view.ViewReservarCarro;

public class ControllerReservarCarro implements ActionListener,ItemListener{

    public ControllerReservarCarro(){
    
    }
    
	private int currentState;
    private ViewReservarCarro viewReservarCarro;

    private Carro carro;

    private Filial filial;

    private Funcionario funcionario;

    private Grupo grupo;

    private Modelo modelo;

    private Blacklist blacklist;

    private Cliente cliente;

    private Reserva reserva;

    private Locacoes locacoes;
    
    private Confirmar confirma;
    
    private int idCliente;
    
    private String vModelos[];



	/**
	 * Implementação dos diagrama de sequência associado ao controle
	 */
	public void beginCase(){
        // Seqüência referente aos diagramas: Sequencia ReservarCarro

		modelo = new Modelo();
		vModelos = modelo.getModelos();
        viewReservarCarro = new ViewReservarCarro(vModelos);
        cliente = new Cliente();
        blacklist = new Blacklist();
        grupo = new Grupo();
        
        carro = new Carro();
        reserva = new Reserva();
        
        confirma = new Confirmar();
        
        //Associa a classe ControllerReservarCarro a esse controle
        viewReservarCarro.setListener(this);
        viewReservarCarro.setItemListener(this);
        
         
		viewReservarCarro.setSize(400, 400);

        viewReservarCarro.setVisible(true);
        
        
	}

	/**
	 *  Responsável pelo tratamentos dos eventos vindos
	 *  da interface,implementa a lógica do caso de uso.
	 * @param Msg
	 */
	
	                   
	private void eventHandler(String msg){
		String v[];
		String situacao;
		List<Integer> possiveisCarros;
		
		try{
		if (msg =="cadastrar"){
			v = cliente.verificaCadastro(viewReservarCarro.getcpf());
			if (v[0]!=null){
				viewReservarCarro.setNomeCliente(v[1]);
				situacao = blacklist.getMotivo(v[0]);
				if (situacao==null){
					viewReservarCarro.setVisibleVerificarCadastro(false);
					viewReservarCarro.setVisibleCancelarVerificarCadastro(true);
					viewReservarCarro.setSituacaoDoPedido("Aceito!");
					viewReservarCarro.setEditabletxtCpf(false);
					viewReservarCarro.setEditabletxtInicio(true);
					viewReservarCarro.setEditabletxtTermino(true);
					viewReservarCarro.setEditableVerificaDisponibilidade(true);
				}else{
					viewReservarCarro.setSituacaoDoPedido("Recusado!"+ situacao);
				}
				
			}else {
				viewReservarCarro.setVisiblePergunta(true);
				viewReservarCarro.setVisibleCadastrarNovo(true);
				viewReservarCarro.setVisibleNaoCadastrar(true);
				viewReservarCarro.setNomeCliente("");
				viewReservarCarro.setEditableVerificaCadastro(false);
			}
			
		}else if (msg=="disponivel"){
			if (viewReservarCarro.getgrupo().equals("")){
				viewReservarCarro.mensagem("Selecione um Modelo");
			}else if (viewReservarCarro.getInicio().equals("")){
				viewReservarCarro.mensagem("Insira uma data de Inicio");
			}else if (viewReservarCarro.getTermino().equals("")){
				viewReservarCarro.mensagem("Insira uma data de Termino");
			}else {
				
				possiveisCarros = carro.getIDCarro(modelo.getIdModeloAtual());
				if (possiveisCarros==null){
					viewReservarCarro.mensagem("Não há carros disponíveis");
				}else{
					try {
						if (reserva.getDisponibilidade(possiveisCarros, viewReservarCarro.getInicio(), viewReservarCarro.getTermino() ) ){
							viewReservarCarro.setEditableEfetuaCadastro(true);
							viewReservarCarro.setEditabletxtInicio(false);
							viewReservarCarro.setEditabletxtTermino(false);
							viewReservarCarro.setEditableVerificaDisponibilidade(false);
							viewReservarCarro.setEditableCancelarVerificarCadastro(false);
							viewReservarCarro.setVisibleAlterarReserva(true);
														
						}else {
							viewReservarCarro.mensagem("Não existe modelo disponível para o período");
						}
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						String erro = e.getMessage();
						viewReservarCarro.mensagem(erro);
					} catch (Exception e){
						String erro = e.getMessage();
						viewReservarCarro.mensagem(erro);
					}
				}
			
			}
					
		}else if (msg=="reservar"){
			confirma.setListener(this);
			confirma.setSize(300, 350);
			confirma.setVisible(true);
			confirma.setDadosCliente(cliente.getDadosCliente());
			confirma.setDadosCarro(viewReservarCarro.getgrupo(),carro.getDadosCarro( reserva.getIdCarro() ),modelo.getDadosModelo() );
			confirma.setPeriodoAluguel(viewReservarCarro.getInicio(), viewReservarCarro.getTermino());
			
			
		}else if (msg=="cadastrarNovo"){
			ControllerCadastrarCliente novoCadastro = new ControllerCadastrarCliente();
			
		}else if (msg=="naoCadastrar"){
			viewReservarCarro.setVisiblePergunta(false);
			viewReservarCarro.setVisibleCadastrarNovo(false);
			viewReservarCarro.setVisibleNaoCadastrar(false);
			viewReservarCarro.setEditableVerificaCadastro(true);
			
		}else if (msg=="cancelarCadastro"){
			viewReservarCarro.setVisibleVerificarCadastro(true);
			viewReservarCarro.setVisibleCancelarVerificarCadastro(false);
			viewReservarCarro.setSituacaoDoPedido("");
			viewReservarCarro.setEditabletxtCpf(true);
			viewReservarCarro.setEditabletxtInicio(false);
			viewReservarCarro.setEditabletxtTermino(false);
			viewReservarCarro.setEditableVerificaDisponibilidade(false);
		}else if (msg=="alterar"){
			
			viewReservarCarro.setEditableEfetuaCadastro(false);
			viewReservarCarro.setEditabletxtInicio(true);
			viewReservarCarro.setEditabletxtTermino(true);
			viewReservarCarro.setEditableVerificaDisponibilidade(true);
			viewReservarCarro.setEditableCancelarVerificarCadastro(false);
			viewReservarCarro.setVisibleAlterarReserva(false);
			viewReservarCarro.setEditableCancelarVerificarCadastro(true);
			
		}else if (msg=="confirma"){
			reserva.efetuarReserva(viewReservarCarro.getInicio(),viewReservarCarro.getTermino(),cliente.getIdCliente());
			viewReservarCarro.setVisibleCancelarVerificarCadastro(false);
			viewReservarCarro.setEditableEfetuaCadastro(false);
			
			viewReservarCarro.setInicio("");
			viewReservarCarro.setTermino("");
			viewReservarCarro.setGrupo("");
			viewReservarCarro.setSituacaoDoPedido("");
			viewReservarCarro.setNomeCliente("");
			viewReservarCarro.setCpf("");
			viewReservarCarro.setEditabletxtCpf(true);
			viewReservarCarro.setVisibleVerificarCadastro(true);
			viewReservarCarro.setVisibleCancelarVerificarCadastro(false);
			viewReservarCarro.setVisibleAlterarReserva(false);
			confirma.setVisible(false);
			viewReservarCarro.mensagem("Reserva efetuada com sucesso");
			
			
			
		}else if (msg=="cancelaReserva"){
			confirma.setVisible(false);
		}
		}catch (NumberFormatException e){
			viewReservarCarro.mensagem("Formato de CPF Inválido!\n" + e.getMessage());
		}
	
	}

	/**
	 * Recebe os eventos da interface e repassa para
	 * o EventHandler para serem tratados
	 * @param evt
	 */
	public void actionPerformed(ActionEvent evt) {
		eventHandler(evt.getActionCommand());
	}

	@Override
	public void itemStateChanged(ItemEvent event) {
		String grupoCerto=null;
		if (event.getStateChange() == ItemEvent.SELECTED){
			grupoCerto = grupo.getGrupo(modelo.getIdGrupo(vModelos[viewReservarCarro.getModelo()] ) );
			viewReservarCarro.setGrupo(grupoCerto);
		}
		
	}

}
