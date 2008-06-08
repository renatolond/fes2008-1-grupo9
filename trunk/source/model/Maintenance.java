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

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.swing.JFrame;
import model.umCliente;
import model.umFilial;
import model.umCarro;
import model.umModelo;
import model.umBlacklist;
import model.umGrupo;
import model.umReserva;
import model.umLocacoes;
import model.umFuncionario;

public class Maintenance extends JFrame {


    private Object instancia = null;

    private javax.swing.JButton adicionar;

    private javax.swing.JButton anterior;

    private javax.swing.JButton atualizar;

    private javax.swing.JTable dados;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JButton ok;

    private javax.swing.JButton primeiro;

    private javax.swing.JButton proximo;

    private javax.swing.JButton remover;

    private javax.swing.JButton ultimo;
	
    // Instancia o objeto responsável pelo controle da manutenção
	private Ctrlmaintenance controle = new Ctrlmaintenance();

    private List lista = null;

    public Maintenance() {
        initComponents();
    }


    private void initComponents() {
        adicionar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        proximo = new javax.swing.JButton();
        ultimo = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        primeiro = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dados = new javax.swing.JTable();
        ok = new javax.swing.JButton();

        setTitle("Manuten\u00e7\u00e3o");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        adicionar.setText("+");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        remover.setText("-");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });

        proximo.setText(">");
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });

        ultimo.setText("|>");
        ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimoActionPerformed(evt);
            }
        });

        anterior.setText("<");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        primeiro.setText("<|");
        primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeiroActionPerformed(evt);
            }
        });

        atualizar.setText("Atualizar");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        jScrollPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jScrollPane1KeyPressed(evt);
            }
        });

        dados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title"
            }
        ));
        dados.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dadosPropertyChange(evt);
            }
        });
        dados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dadosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dadosKeyTyped(evt);
            }
        });
        dados.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                dadosVetoableChange(evt);
            }
        });

        jScrollPane1.setViewportView(dados);

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .add(layout.createSequentialGroup()
                                .add(primeiro)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(anterior)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(proximo)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(ultimo)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(adicionar)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(remover)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(atualizar)))
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(ok, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(158, 158, 158))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(primeiro)
                    .add(anterior)
                    .add(proximo)
                    .add(ultimo)
                    .add(adicionar)
                    .add(remover)
                    .add(atualizar))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(ok)
                .addContainerGap())
        );
        pack();
    }

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {
        this.listaDados();
    }

    private void dadosVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
    }

    private void dadosKeyTyped(java.awt.event.KeyEvent evt) {
    }

    private void jScrollPane1KeyPressed(java.awt.event.KeyEvent evt) {

    }

    private void dadosPropertyChange(java.beans.PropertyChangeEvent evt) {

        if(dados != null && lista != null && dados.getSelectedRow() != -1){
            String coluna = dados.getColumnName(dados.getSelectedColumn());

            DataTableModel modelo = (DataTableModel) dados.getModel();
            String valor = (String) modelo.getValueAt(dados.getSelectedRow(), dados.getSelectedColumn());

                if(instancia instanceof umCliente)
                    controle.atualizar(coluna, valor, (umCliente) lista.get(dados.getSelectedRow()+1));
                if(instancia instanceof umFilial)
                    controle.atualizar(coluna, valor, (umFilial) lista.get(dados.getSelectedRow()+1));
                if(instancia instanceof umCarro)
                    controle.atualizar(coluna, valor, (umCarro) lista.get(dados.getSelectedRow()+1));
                if(instancia instanceof umModelo)
                    controle.atualizar(coluna, valor, (umModelo) lista.get(dados.getSelectedRow()+1));
                if(instancia instanceof umBlacklist)
                    controle.atualizar(coluna, valor, (umBlacklist) lista.get(dados.getSelectedRow()+1));
                if(instancia instanceof umGrupo)
                    controle.atualizar(coluna, valor, (umGrupo) lista.get(dados.getSelectedRow()+1));
                if(instancia instanceof umReserva)
                    controle.atualizar(coluna, valor, (umReserva) lista.get(dados.getSelectedRow()+1));
                if(instancia instanceof umLocacoes)
                    controle.atualizar(coluna, valor, (umLocacoes) lista.get(dados.getSelectedRow()+1));
                if(instancia instanceof umFuncionario)
                    controle.atualizar(coluna, valor, (umFuncionario) lista.get(dados.getSelectedRow()+1));

        }
    }

    private void dadosKeyPressed(java.awt.event.KeyEvent evt) {
    }



    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            DataTableModel modelo = (DataTableModel) dados.getModel();
            Object obj = null;

            boolean inclui = false;

                if(instancia instanceof umCliente)
                    obj = new umCliente();
                if(instancia instanceof umFilial)
                    obj = new umFilial();
                if(instancia instanceof umCarro)
                    obj = new umCarro();
                if(instancia instanceof umModelo)
                    obj = new umModelo();
                if(instancia instanceof umBlacklist)
                    obj = new umBlacklist();
                if(instancia instanceof umGrupo)
                    obj = new umGrupo();
                if(instancia instanceof umReserva)
                    obj = new umReserva();
                if(instancia instanceof umLocacoes)
                    obj = new umLocacoes();
                if(instancia instanceof umFuncionario)
                    obj = new umFuncionario();

            inclui = controle.incluir(obj);
            if(inclui){
                modelo.addRow(getLinhaVazia(obj));
                lista.add(obj);
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            DataTableModel modelo = (DataTableModel) dados.getModel();
            boolean exclui = false;

                if(instancia instanceof umCliente)
                    exclui = controle.excluir((umCliente) lista.get(dados.getSelectedRow() == 0 ? 1 : dados.getSelectedRow()+1));
                if(instancia instanceof umFilial)
                    exclui = controle.excluir((umFilial) lista.get(dados.getSelectedRow() == 0 ? 1 : dados.getSelectedRow()+1));
                if(instancia instanceof umCarro)
                    exclui = controle.excluir((umCarro) lista.get(dados.getSelectedRow() == 0 ? 1 : dados.getSelectedRow()+1));
                if(instancia instanceof umModelo)
                    exclui = controle.excluir((umModelo) lista.get(dados.getSelectedRow() == 0 ? 1 : dados.getSelectedRow()+1));
                if(instancia instanceof umBlacklist)
                    exclui = controle.excluir((umBlacklist) lista.get(dados.getSelectedRow() == 0 ? 1 : dados.getSelectedRow()+1));
                if(instancia instanceof umGrupo)
                    exclui = controle.excluir((umGrupo) lista.get(dados.getSelectedRow() == 0 ? 1 : dados.getSelectedRow()+1));
                if(instancia instanceof umReserva)
                    exclui = controle.excluir((umReserva) lista.get(dados.getSelectedRow() == 0 ? 1 : dados.getSelectedRow()+1));
                if(instancia instanceof umLocacoes)
                    exclui = controle.excluir((umLocacoes) lista.get(dados.getSelectedRow() == 0 ? 1 : dados.getSelectedRow()+1));
                if(instancia instanceof umFuncionario)
                    exclui = controle.excluir((umFuncionario) lista.get(dados.getSelectedRow() == 0 ? 1 : dados.getSelectedRow()+1));

            if(exclui){
                modelo.removeRow(dados.getSelectedRow());
                lista.remove(dados.getSelectedRow()+1);
            }


        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    private void primeiroActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            dados.setRowSelectionInterval(0, 0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            dados.setRowSelectionInterval(dados.getSelectedRow()-1, dados.getSelectedRow()-1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        this.listaDados();
    }

    private void ultimoActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            dados.setRowSelectionInterval(dados.getRowCount()-1, dados.getRowCount()-1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            dados.setRowSelectionInterval(dados.getSelectedRow()+1, dados.getSelectedRow()+1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void okActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }

    private void listaDados(){
       lista = controle.buscar(instancia);

       ArrayList linhas = new ArrayList();
       String[] colunas = null;
       for(int i = 0; i < lista.size(); i++){
            if(i == 0){
                colunas = (String[]) lista.get(0);
            }else{

                if(instancia instanceof umCliente){
                    umCliente OumCliente = (umCliente) lista.get(i);
                    linhas.add(getLinhaPreenchida(OumCliente));
                }
                if(instancia instanceof umFilial){
                    umFilial OumFilial = (umFilial) lista.get(i);
                    linhas.add(getLinhaPreenchida(OumFilial));
                }
                if(instancia instanceof umCarro){
                    umCarro OumCarro = (umCarro) lista.get(i);
                    linhas.add(getLinhaPreenchida(OumCarro));
                }
                if(instancia instanceof umModelo){
                    umModelo OumModelo = (umModelo) lista.get(i);
                    linhas.add(getLinhaPreenchida(OumModelo));
                }
                if(instancia instanceof umBlacklist){
                    umBlacklist OumBlacklist = (umBlacklist) lista.get(i);
                    linhas.add(getLinhaPreenchida(OumBlacklist));
                }
                if(instancia instanceof umGrupo){
                    umGrupo OumGrupo = (umGrupo) lista.get(i);
                    linhas.add(getLinhaPreenchida(OumGrupo));
                }
                if(instancia instanceof umReserva){
                    umReserva OumReserva = (umReserva) lista.get(i);
                    linhas.add(getLinhaPreenchida(OumReserva));
                }
                if(instancia instanceof umLocacoes){
                    umLocacoes OumLocacoes = (umLocacoes) lista.get(i);
                    linhas.add(getLinhaPreenchida(OumLocacoes));
                }
                if(instancia instanceof umFuncionario){
                    umFuncionario OumFuncionario = (umFuncionario) lista.get(i);
                    linhas.add(getLinhaPreenchida(OumFuncionario));
                }

       		}

		}

	   DataTableModel modelo = new DataTableModel(linhas, colunas);
	   dados.setModel(modelo);
	}


    public Object getInstancia() {
        return instancia;
    }

    public void setInstancia(Object instancia) {
        this.instancia = instancia;
    }


	private String[] getLinhaVazia(Object obj) {
        Class classe = null;
        String[] result = null;

	      classe = getClasse(obj);

          String nomeClasse = classe.getName();
          nomeClasse = nomeClasse.substring(nomeClasse.lastIndexOf(".")+1, nomeClasse.length());

          Field[] atributos = classe.getDeclaredFields();
          result = new String[atributos.length-1];

          for(int i = 0; i < result.length; i++){
        	  result[i] = "";
          }


		return result;
	}

	private String[] getLinhaPreenchida(Object obj) {
        Class classe = null;
        String[] result = null;

       	classe = getClasse(obj);


        Method[] metodos = classe.getMethods();
        Field[] atributos = classe.getDeclaredFields();

        result = new String[atributos.length-1];
        int index = 0;

        for(int i =0; i < atributos.length; i++){

            Field campo = atributos[i];

            for(int j = 0; j < metodos.length; j++){
                Method metodo = metodos[j];
                if(!campo.getName().equals("oid") && metodo.getName().equalsIgnoreCase("get" + campo.getName())){
                    Object retorno = null;
					try {
						retorno = metodo.invoke(obj, new Object[]{});
					} catch (Exception e) {
						e.printStackTrace();
					}
                    String valor = retorno != null ? retorno.toString() : "";
                    result[index] = valor;
                    index++;
                    break;
                }

            }

        }

		return result;
	}

	private Class getClasse(Object obj) {
			Class classe = null;

                if(obj instanceof umCliente){
                    classe = ((umCliente)obj).getClass();
                }
                if(obj instanceof umFilial){
                    classe = ((umFilial)obj).getClass();
                }
                if(obj instanceof umCarro){
                    classe = ((umCarro)obj).getClass();
                }
                if(obj instanceof umModelo){
                    classe = ((umModelo)obj).getClass();
                }
                if(obj instanceof umBlacklist){
                    classe = ((umBlacklist)obj).getClass();
                }
                if(obj instanceof umGrupo){
                    classe = ((umGrupo)obj).getClass();
                }
                if(obj instanceof umReserva){
                    classe = ((umReserva)obj).getClass();
                }
                if(obj instanceof umLocacoes){
                    classe = ((umLocacoes)obj).getClass();
                }
                if(obj instanceof umFuncionario){
                    classe = ((umFuncionario)obj).getClass();
                }

 		return classe;
	}

}
