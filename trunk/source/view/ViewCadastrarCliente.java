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

import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewCadastrarCliente extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

   	// Guarda a instância do controle associado a esta interface
	private ActionListener listener = null;

    private JLabel lbIdCliente;

    private JTextField txtIdCliente;

    private JLabel lbNome;

    private JTextField txtNome;

    private JLabel lbEndereco;

    private JTextField txtEndereco;

    private JLabel lbCpf;

    private JTextField txtCpf;

    private JLabel lbTelefone;

    private JTextField txtTelefone;

    private JLabel lbDataNascimento;

    private JTextField txtDataNascimento;

    private JLabel lbEstadoCivil;

    private JTextField txtEstadoCivil;

    private JLabel lbCnh;

    private JTextField txtCnh;

    private int idCliente;

    private String nome;

    private String endereco;

    private String cpf;

    private String telefone;

    private String dataNascimento;

    private String estadoCivil;

    private String cnh;
    
    private JButton botoes[];
    private String nomes[]={"Cadastrar","Cancelar"};
    private String comando[]={"cadastrar","cancelar"};
    
    private JPanel painelCadastrar;
    private GridBagLayout layoutCadastrar;
	
	private GridBagConstraints constantes;

    private int currentState;
	/**
	 * Este é um construtor padrão
	 */
    public ViewCadastrarCliente(int id) {
	  super("Cadastrar Cliente");
	  
	  layoutCadastrar = new GridBagLayout();
	  
	  constantes = new GridBagConstraints();
	  botoes = new JButton[nomes.length];
	  painelCadastrar = new JPanel();
	  
		
	  painelCadastrar.setLayout(layoutCadastrar);
	  
	  setLayout(layoutCadastrar);
	  String idCliente = Integer.toString(id+1);
	  txtIdCliente = new JTextField(idCliente);
	  txtIdCliente.setEditable(false);
	  txtNome = new JTextField(10);
	  txtEndereco = new JTextField(10);
	  txtCpf = new JTextField(10);
	  txtTelefone = new JTextField(10);
	  txtDataNascimento = new JTextField(10);
	  txtEstadoCivil = new JTextField(10);
	  txtCnh = new JTextField(10);
      
      lbIdCliente= new JLabel();
      lbIdCliente.setText("IdCliente");
      
      lbNome= new JLabel();
      lbNome.setText("Nome");

      lbEndereco= new JLabel();
      lbEndereco.setText("Endereco");

      lbCpf= new JLabel();
      lbCpf.setText("Cpf");

      lbTelefone= new JLabel();
      lbTelefone.setText("Telefone");

      lbDataNascimento= new JLabel();
      lbDataNascimento.setText("DataNascimento");

      lbEstadoCivil= new JLabel();
      lbEstadoCivil.setText("EstadoCivil");

      lbCnh= new JLabel();
      lbCnh.setText("Cnh");
      
      for (int i=0; i< botoes.length;i++){
			botoes[i]= new JButton(nomes[i]);
			botoes[i].setActionCommand(comando[i]);
			botoes[i].addActionListener(new ActionListener() {
	  		public void actionPerformed(ActionEvent e) {
	  			listener.actionPerformed(e);
	  		}
	  	}); 
	  }
	  
      constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbIdCliente,1,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(txtIdCliente,1,1,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbNome,2,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(txtNome,2,1,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbEndereco,3,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(txtEndereco,3,1,3,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbCpf,4,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(txtCpf,4,1,3,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbTelefone,5,0,3,1,0,0,1);
		
		constantes.fill = GridBagConstraints.NONE;
		addComponente(txtTelefone,5,1,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.NONE;
		constantes.anchor = GridBagConstraints.WEST;
		addComponente(lbDataNascimento,6,0,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		constantes.anchor = GridBagConstraints.CENTER;
		addComponente(txtDataNascimento,6,1,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.NONE;
		constantes.anchor = GridBagConstraints.WEST;
		addComponente(lbEstadoCivil,7,0,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		constantes.anchor = GridBagConstraints.CENTER;
		addComponente(txtEstadoCivil,7,1,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.NONE;
		constantes.anchor = GridBagConstraints.WEST;
		addComponente(lbCnh,8,0,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		constantes.anchor = GridBagConstraints.CENTER;
		addComponente(txtCnh,8,1,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.NONE;
		constantes.anchor = GridBagConstraints.WEST;
		addComponente(botoes[0],10,0,1,1,0,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		constantes.anchor = GridBagConstraints.CENTER;
		addComponente(botoes[1],10,1,1,1,0,0,1);
		
		
		
		add(painelCadastrar);
	 
	}

    private void addComponente(Component componente, int linha, int coluna, int width, int height, int extraX, int extraY, int grid) {
		constantes.gridx = coluna;
		constantes.gridy = linha;
		constantes.gridwidth = width;
		constantes.gridheight = height;
		constantes.weightx = extraX;
		constantes.weighty = extraY;
		
		if (grid==1){
			layoutCadastrar.setConstraints(componente, constantes);
			painelCadastrar.add(componente);
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

	/**
	 * Associa um Listener para essa interface
	 * @param listener
	 */
	public void setListener(ActionListener listener) {

		this.listener = listener;

        /**
         * Associe o Listener à todos os elementos gráficos
         * necessários, para tratar os eventos..
         * Ex:
         *	botao.addActionListener(listener);
         *	botao.setActionCommand("1");
		 * 	 botao.addActionListener(new ActionListener() {
		 *	 public void actionPerformed(ActionEvent e) {
		 *	 	sendEvent(e);
		 *	 }
         *
         */
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


    public void viewCadastrarCliente() {
    }


    public void setNewID() {
    }

    public String[] getDadosCliente() {
    	String vDados[] = {null,null,null,null,null,null,null,null};
    	vDados[0]= this.txtIdCliente.getText();
    	vDados[1]= this.txtNome.getText();
    	vDados[2]= this.txtEndereco.getText();	
    	vDados[3]= this.txtCpf.getText();		
    	vDados[4]= this.txtTelefone.getText();
    	vDados[5]= this.txtDataNascimento.getText();
    	vDados[6]= this.txtEstadoCivil.getText();
    	vDados[7]= this.txtCnh.getText();
    		
    	return vDados;
    }

    /**
     * @return IdCliente
     */
    public int getidCliente(){
        idCliente = Integer.parseInt(txtIdCliente.getText());
        return idCliente;
    }

    /**
     * @param umIdCliente
     */
    public void setIdCliente(int umIdCliente){
        idCliente = umIdCliente;
        txtIdCliente.setText(Integer.toString(umIdCliente));
    }

    /**
     * @return Nome
     */
    public String getnome(){
        nome = txtNome.getText();
        return nome;
    }

    /**
     * @param umNome
     */
    public void setNome(String umNome){
        nome = umNome;
        txtNome.setText(umNome);
    }

    /**
     * @return Endereco
     */
    public String getendereco(){
        endereco = txtEndereco.getText();
        return endereco;
    }

    /**
     * @param umEndereco
     */
    public void setEndereco(String umEndereco){
        endereco = umEndereco;
        txtEndereco.setText(umEndereco);
    }

    /**
     * @return Cpf
     */
    public String getcpf(){
        cpf = txtCpf.getText();
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
     * @return Telefone
     */
    public String gettelefone(){
        telefone = txtTelefone.getText();
        return telefone;
    }

    /**
     * @param umTelefone
     */
    public void setTelefone(String umTelefone){
        telefone = umTelefone;
        txtTelefone.setText(umTelefone);
    }

    /**
     * @return DataNascimento
     */
    public String getdataNascimento(){
        dataNascimento = txtDataNascimento.getText();
        return dataNascimento;
    }

    /**
     * @param umDataNascimento
     */
    public void setDataNascimento(String umDataNascimento){
        dataNascimento = umDataNascimento;
        txtDataNascimento.setText(umDataNascimento);
    }

    /**
     * @return EstadoCivil
     */
    public String getestadoCivil(){
        estadoCivil = txtEstadoCivil.getText();
        return estadoCivil;
    }

    /**
     * @param umEstadoCivil
     */
    public void setEstadoCivil(String umEstadoCivil){
        estadoCivil = umEstadoCivil;
        txtEstadoCivil.setText(umEstadoCivil);
    }

    /**
     * @return Cnh
     */
    public String getcnh(){
        cnh = txtCnh.getText();
        return cnh;
    }

    /**
     * @param umCnh
     */
    public void setCnh(String umCnh){
        cnh = umCnh;
        txtCnh.setText(umCnh);
    }
    
    public void mensagem (String msg){
		JOptionPane.showMessageDialog(null, msg);
	}

}
