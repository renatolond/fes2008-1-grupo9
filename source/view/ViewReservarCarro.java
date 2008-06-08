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
package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.DateFormatter;

public class ViewReservarCarro extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

   	// Guarda a instância do controle associado a esta interface
	private ActionListener listener = null;
	private ItemListener listenerItem = null;
	private String modelos[];

    private JLabel lbInicio;
    
    private JFormattedTextField txtInicio;
    
    private JLabel lbTermino;
    private JFormattedTextField txtTermino;
    private JLabel lbSituacaoDoPedido;
    private JTextField txtSituacaoDoPedido;
    private JLabel lbCpf;
    private JTextField txtCpf;
    private JLabel lbModelo;
    private JTextField txtModelo;
    private JLabel lbGrupo;
    private JTextField txtGrupo;
    private JLabel lbNomeCliente;
    private JTextField txtNomeCliente;
    private String inicio;
    private String termino;
    private String situacaoDoPedido;
    private String cpf;
    private String modelo;
    private String grupo;
    private String nomeCliente;
    
    private JLabel pergunta;
    
    private JComboBox cbModelo;
    
    private JPanel painelConsulta;
   

    private JButton botoes[];
    private String nomes[]={"Verificar","Disponibilidade","Efetuar Reserva","Sim","Não","Nova Busca","Alterar"};
    private String comando[]={"cadastrar","disponivel","reservar","cadastrarNovo","naoCadastrar","cancelarCadastro","alterar"};
    private GridBagLayout layoutConsulta;
	
	private GridBagConstraints constantes;

    private int currentState;
	/**
	 * Este é um construtor padrão
	 */
    public ViewReservarCarro(String [] vModelos) {
	  super("Reservar Carro");
	  
	  this.modelos = vModelos;
	  layoutConsulta = new GridBagLayout();
	  
	  constantes = new GridBagConstraints();
	  botoes = new JButton[nomes.length];
	  painelConsulta = new JPanel();
	  
		
	  painelConsulta.setLayout(layoutConsulta);
	  
	  setLayout(layoutConsulta);
	  
	  
	  
	  lbInicio= new JLabel("Inicio");
      lbTermino= new JLabel("Termino");
      lbSituacaoDoPedido= new JLabel("Situação do Pedido");
      lbCpf= new JLabel("Cpf");
      lbModelo= new JLabel("Modelo");
      lbGrupo= new JLabel("Grupo");
      lbNomeCliente= new JLabel("Nome do Cliente");
      
      pergunta = new JLabel("CPF não encontrado! Deseja Cadastrar Novo Cliente?");
      
      txtInicio = new JFormattedTextField(new SimpleDateFormat("d/M/yyyy"));
      txtInicio.setEditable(false);
      
            
      txtTermino = new JFormattedTextField(new SimpleDateFormat("d/M/yyyy"));
      txtTermino.setEditable(false);
      txtSituacaoDoPedido = new JTextField(10);
      txtSituacaoDoPedido.setEditable(false);
      txtCpf = new JTextField(10);
      
      txtGrupo = new JTextField(10);
      txtGrupo.setEditable(false);
      txtNomeCliente = new JTextField(10);
      txtNomeCliente.setEditable(false);
      
      
	  cbModelo = new JComboBox(vModelos);
	  cbModelo.addItemListener(new ItemListener() {
		  public void itemStateChanged(ItemEvent e){
			  listenerItem.itemStateChanged(e);
		  }
	  });
	  
	  for (int i=0; i< botoes.length;i++){
			botoes[i]= new JButton(nomes[i]);
			botoes[i].setActionCommand(comando[i]);
			botoes[i].addActionListener(new ActionListener() {
  	  		public void actionPerformed(ActionEvent e) {
  	  			listener.actionPerformed(e);
  	  		}
  	  	}); 
	  }
		botoes[1].setEnabled(false);
		botoes[2].setEnabled(false);
		
		
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbCpf,1,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(txtCpf,1,1,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(botoes[0],1,2,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(botoes[5],1,2,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbNomeCliente,2,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(txtNomeCliente,2,1,3,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbSituacaoDoPedido,3,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(txtSituacaoDoPedido,3,1,3,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(pergunta,4,0,3,1,0,0,1);
		
		constantes.fill = GridBagConstraints.NONE;
		addComponente(botoes[3],5,1,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.NONE;
		constantes.anchor = GridBagConstraints.WEST;
		addComponente(botoes[4],5,2,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		constantes.anchor = GridBagConstraints.CENTER;
		addComponente(lbModelo,6,0,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(cbModelo,6,1,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbGrupo,7,0,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(txtGrupo,7,1,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbInicio,8,0,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(txtInicio,8,1,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbTermino,9,0,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(txtTermino,9,1,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(botoes[1],9,2,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(botoes[2],10,1,1,3,0,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(botoes[6],10,2,1,1,0,0,1);
		
		
		
		add(painelConsulta);
		
		pergunta.setVisible(false);
		botoes[3].setVisible(false);
		botoes[4].setVisible(false);
		botoes[5].setVisible(false);
		botoes[6].setVisible(false);
				
		
	  }
    
    
	  private void addComponente(Component componente, int linha, int coluna, int width, int height, int extraX, int extraY, int grid) {
			constantes.gridx = coluna;
			constantes.gridy = linha;
			constantes.gridwidth = width;
			constantes.gridheight = height;
			constantes.weightx = extraX;
			constantes.weighty = extraY;
			
			if (grid==1){
				layoutConsulta.setConstraints(componente, constantes);
				painelConsulta.add(componente);
			}
			if (grid==2){
				
					//layoutReserva.setConstraints(componente, constantes);
					//painelReserva.add(componente);	
			}
			
		}



	
	



            
            

	
	/**
	 * Retorna o Listener dessa interface
	 * @return Listener
	 */
	public ActionListener getListener() {
		return listener;
	}
	
	public ItemListener getItemListener() {
		return listenerItem;
	}

	/**
	 * Associa um Listener para essa interface
	 * @param listener
	 */
	public void setListener(ActionListener listener) {

		this.listener = listener;
        
	}

	public void setItemListener(ItemListener listener) {

		this.listenerItem = listener;

  	}
	/**
	 * @param msg
	 */
	private void sendEvent(ActionEvent e){
		int msg = Integer.parseInt(e.getActionCommand());
	}

	/**
	 * @param msg
	 */
	public void changeState(int msg){
	}


    public void viewReservarCarro() {
    }




    /**
     * @return Inicio
     */
    public String getInicio(){
        inicio = txtInicio.getText();
        return inicio;
    }

    /**
     * @param umInicio
     */
    public void setInicio(String umInicio){
        inicio = umInicio;
        txtInicio.setText(umInicio);
    }

    /**
     * @return Termino
     */
    public String getTermino(){
        termino = txtTermino.getText();
        return termino;
    }

    /**
     * @param umTermino
     */
    public void setTermino(String umTermino){
        termino = umTermino;
        txtTermino.setText(umTermino);
    }

    /**
     * @return SituacaoDoPedido
     */
    public String getsituacaoDoPedido(){
        situacaoDoPedido = txtSituacaoDoPedido.getText();
        return situacaoDoPedido;
    }

    /**
     * @param umSituacaoDoPedido
     */
    public void setSituacaoDoPedido(String umSituacaoDoPedido){
        situacaoDoPedido = umSituacaoDoPedido;
        txtSituacaoDoPedido.setText(umSituacaoDoPedido);
    }

    /**
     * @return Cpf
     */
    public String getcpf() throws NumberFormatException{
        cpf = txtCpf.getText();
        Integer.parseInt(txtCpf.getText());
        return cpf;
    }

    /**
     * @param umCpf
     */
    public void setCpf(String umCpf){
        cpf = umCpf;
        txtCpf.setText(umCpf);
    }

    /**
     * @return Modelo
     */
    public int getModelo(){
        return cbModelo.getSelectedIndex();
    }

    
    /**
     * @return Grupo
     */
    public String getgrupo(){
        grupo = txtGrupo.getText();
        return grupo;
    }

    /**
     * @param umGrupo
     */
    public void setGrupo(String umGrupo){
        grupo = umGrupo;
        txtGrupo.setText(umGrupo);
    }

    /**
     * @return NomeCliente
     */
    public String getnomeCliente(){
        nomeCliente = txtNomeCliente.getText();
        return nomeCliente;
    }

    /**
     * @param umNomeCliente
     */
    public void setNomeCliente(String umNomeCliente){
        nomeCliente = umNomeCliente;
        txtNomeCliente.setText(umNomeCliente);
    }
    
    public void setEditabletxtCpf(boolean estado){
    	txtCpf.setEditable(estado);
    	
    }
    
    public void setEditabletxtNome(boolean estado){
    	txtNomeCliente.setEditable(estado);
    }
    
    public void setEditabletxtSituacao(boolean estado){
    	txtSituacaoDoPedido.setEditable(estado);
    }
    
    public void setEditablecbModelo(boolean estado){
    	cbModelo.setEditable(estado);
    	
    }
    
    public void setEditabletxtGrupo(boolean estado){
    	txtGrupo.setEditable(estado);
    }
    
    public void setEditabletxtInicio(boolean estado){
    	txtInicio.setEditable(estado);
    }
    
    public void setEditabletxtTermino(boolean estado){
    	txtTermino.setEditable(estado);
    }
    
    public void setEditableVerificaCadastro(boolean estado){
    	botoes[0].setEnabled(estado);
    }
    
    public void setEditableVerificaDisponibilidade(boolean estado){
    	botoes[1].setEnabled(estado);
    }
    
    public void setEditableEfetuaCadastro(boolean estado){
    	botoes[2].setEnabled(estado);
    }
    
    public void setEditableCancelarVerificarCadastro(boolean estado){
    	botoes[5].setEnabled(estado);
    }
    
    public void setTxtNomeCliente(String nome){
    	txtNomeCliente.setText(nome);
    }
     
    public void setVisibleVerificarCadastro(boolean estado){
    	botoes[0].setVisible(estado);
    }
    
    public void setVisibleCancelarVerificarCadastro(boolean estado){
    	botoes[5].setVisible(estado);
    }
    
    public void setVisiblePergunta(boolean estado){
    	pergunta.setVisible(estado);
    }
    public void setVisibleCadastrarNovo(boolean estado){
    	botoes[3].setVisible(estado);
    }
    
    public void setVisibleNaoCadastrar(boolean estado){
    	botoes[4].setVisible(estado);
    }
    
    public void setVisibleAlterarReserva(boolean estado){
    	botoes[6].setVisible(estado);
    }
    
    public void mensagem (String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
}
