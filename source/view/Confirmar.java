package view;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Confirmar extends JFrame{

	private ActionListener listener = null;
	
	private JLabel dadosCliente;
	private JLabel lbIdCliente;
	private JLabel idCliente;
	private JLabel lbNome;
	private JLabel nome;
	private JLabel lbEndereco;
	private JLabel endereco;
	private JLabel lbCpf;
	private JLabel cpf;
	private JLabel lbTelefone;
	private JLabel telefone;
	private JLabel lbCnh;
	private JLabel cnh;
	
	private JLabel dadosCarro;
	private JLabel lbIdCarro;
	private JLabel idCarro;
	private JLabel lbAno;
	private JLabel ano;
	private JLabel lbPlaca;
	private JLabel placa;
	private JLabel lbMarcaFabricante;
	private JLabel marcaFabricante;
	private JLabel lbValor;
	private JLabel valor;
	private JLabel lbDescricaoGrupo;
	private JLabel descricaoGrupo;
	private JLabel periodoAluguel;
	
	private JButton botoes[];
    private String nomes[]={"Confirmar","Cancelar"};
    private String comando[]={"confirma","cancelaReserva"};
    
	private GridBagLayout layoutConsulta;
	private JPanel painelConsulta;
	
	private GridBagConstraints constantes;
	
	
	public Confirmar() {
		
		super("Confirmar Cadastro");
		layoutConsulta = new GridBagLayout();
		  
		constantes = new GridBagConstraints();
		botoes = new JButton[nomes.length];
		painelConsulta = new JPanel();
		painelConsulta.setLayout(layoutConsulta);
		 
		setLayout(layoutConsulta);
		
		dadosCliente = new JLabel("------- Dados do Cliente --------");
		lbIdCliente = new JLabel("ID:");
		lbNome = new JLabel("Nome:");
		lbEndereco = new JLabel("Endereco:");
		lbCpf = new JLabel("CPF:");
		lbTelefone = new JLabel("Telefone:");
		lbCnh = new JLabel("CNH:");
		
		dadosCarro = new JLabel("------- Dados do Carro -------");
		lbIdCarro = new JLabel("ID:");
		lbAno = new JLabel("Ano:");
		lbPlaca = new JLabel("Placa:");
		lbMarcaFabricante = new JLabel("Modelo:");
		lbValor = new JLabel("Preço:");
		lbDescricaoGrupo = new JLabel("Descrição:");
		
		idCliente = new JLabel();
		nome = new JLabel();
		endereco = new JLabel();
		cpf = new JLabel();
		telefone = new JLabel();
		cnh = new JLabel();
		
		idCarro = new JLabel();
		ano = new JLabel();
		placa = new JLabel();
		marcaFabricante = new JLabel();
		valor = new JLabel();
		descricaoGrupo = new JLabel();
		periodoAluguel = new JLabel();
		
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
		addComponente(dadosCliente,0,0,2,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbIdCliente,1,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(idCliente,1,1,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbNome,2,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(nome,2,1,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbEndereco,3,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(endereco,3,1,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbCpf,4,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(cpf,4,1,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbTelefone,5,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(telefone,5,1,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbCnh,6,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(cnh,6,1,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(dadosCarro,7,0,2,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbIdCarro,8,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(idCarro,8,1,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbAno,9,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(ano,9,1,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbPlaca,10,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(placa,10,1,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbMarcaFabricante,11,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(marcaFabricante,11,1,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbValor,12,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(valor,12,1,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(lbDescricaoGrupo,13,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(descricaoGrupo,13,1,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.HORIZONTAL;
		addComponente(periodoAluguel,14,0,2,1,1,0,1);
		
		constantes.fill = GridBagConstraints.NONE;
		addComponente(botoes[0],15,0,1,1,1,0,1);
		
		constantes.fill = GridBagConstraints.NONE;
		addComponente(botoes[1],15,1,1,1,1,0,1);
		
		
		
		
		
		add(painelConsulta);
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
	
	public ActionListener getListener() {
		return listener;
	}
	
	public void setListener(ActionListener listener) {

		this.listener = listener;
        
	}
	
	public void setDadosCliente(String[] vCliente){
		this.idCliente.setText(vCliente[0]);
		this.nome.setText(vCliente[1]);
		this.endereco.setText(vCliente[2]);
		this.cpf.setText(vCliente[3]);
		this.telefone.setText(vCliente[4]);
		this.cnh.setText(vCliente[5]);
		
	}
	
	public void setDadosCarro(String grupo,String[] vCarro, String[] vModelo){
		this.idCarro.setText(vCarro[0]);
		this.ano.setText(vCarro[1]);
		this.placa.setText(vCarro[2]);
		this.marcaFabricante.setText(vModelo[0]+" (" + vModelo[1]+")");
		this.valor.setText(vModelo[2]);
		this.descricaoGrupo.setText(grupo);
	}
	public void setPeriodoAluguel(String inicio, String termino){
		this.periodoAluguel.setText("Período:    "+ inicio +"   à   "+ termino);
	}

}
