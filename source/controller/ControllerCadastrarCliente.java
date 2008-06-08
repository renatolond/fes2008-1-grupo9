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
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Cliente;
import view.ViewCadastrarCliente;

public class ControllerCadastrarCliente implements ActionListener{

    public ControllerCadastrarCliente(){
    	 // Seq��ncia referente ao diagrama: Sequencia CadastrarCliente
        cliente = new Cliente();
        
        viewCadastrarCliente = new ViewCadastrarCliente(cliente.getLastID());
        


        //Associa a classe ControllerCadastrarCliente a esse controle
        viewCadastrarCliente.setListener(this);
        viewCadastrarCliente.setSize(400, 400);

        viewCadastrarCliente.setVisible(true);
    }

	private int currentState;
    public ViewCadastrarCliente viewCadastrarCliente;

    public Cliente cliente;



	/**
	 * Implementa��o dos diagrama de sequ�ncia associado ao controle
	 */
	

	/**
	 *  Respons�vel pelo tratamentos dos eventos vindos
	 *  da interface,implementa a l�gica do caso de uso.
	 * @param Msg
	 */
	private void eventHandler(String msg){
		if (msg=="cadastrar"){
			if (viewCadastrarCliente.getnome().equals("")){
				
				viewCadastrarCliente.mensagem("Insira um nome!");
			
			}else if (viewCadastrarCliente.getendereco().equals("")){
				
				viewCadastrarCliente.mensagem("Insira um endre�o!");
				
			}else if (viewCadastrarCliente.getcpf().equals("")){
				
				viewCadastrarCliente.mensagem("Insira o CPF!");
				
			}else if (viewCadastrarCliente.gettelefone().equals("")){
				
				viewCadastrarCliente.mensagem("Insira telefone de contato!");
				
			}else if (viewCadastrarCliente.getdataNascimento().equals("")){
				
				viewCadastrarCliente.mensagem("Insira data de Nascimento!");
				
			}else if (viewCadastrarCliente.getestadoCivil().equals("")){
				
				viewCadastrarCliente.mensagem("Defina estado civil!");
				
			}else if (viewCadastrarCliente.getcnh().equals("")){
				
				viewCadastrarCliente.mensagem("Insira CNH!");
				
			}else{
				cliente.efetuaCadastro(viewCadastrarCliente.getDadosCliente());
				viewCadastrarCliente.setIdCliente(viewCadastrarCliente.getidCliente()+1);
				viewCadastrarCliente.setNome("");
				viewCadastrarCliente.setEndereco("");
				viewCadastrarCliente.setCpf("");
				viewCadastrarCliente.setTelefone("");
				viewCadastrarCliente.setDataNascimento("");
				viewCadastrarCliente.setEstadoCivil("");
				viewCadastrarCliente.setCnh("");
				viewCadastrarCliente.mensagem("Cliente cadastrado com sucesso!");
			}
			
			
			
		}else if (msg=="cancelar"){
			viewCadastrarCliente.setVisible(false);
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

}
