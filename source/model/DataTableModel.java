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
import java.util.Iterator;

import javax.swing.table.AbstractTableModel;

/**
 * Classe que gerencia as operações na tabela de registros
 * mostrada no formulario de manutencao
 */
public class DataTableModel extends AbstractTableModel{

	private ArrayList linhas = null;
	private String [] colunas = null;
	private boolean [] colsEdicao;

	public DataTableModel(ArrayList dados, String[] colunas){
		setLinhas(dados);
		setColunas(colunas);
		boolean[] edicao = new boolean[colunas.length];
		colsEdicao = configuraEdicao(edicao.length);

	}

	/**
	 * Retorna o numero de colunas no modelo
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	public int getColumnCount() {return getColunas().length;}

	/**
	 * Retorna o numero de linhas existentes no modelo
	 * @see javax.swing.table.TableModel#getRowCount()
	 */
	public int getRowCount() {return getLinhas().size();}

	/**
	 * Obtem o valor na linha e coluna
	 * @see javax.swing.table.TableModel#getValueAt(int, int)
	 */
	public Object getValueAt(int rowIndex, int columnIndex) {
		// Obtem a linha, que é uma String []
		String [] linha = (String [])getLinhas().get(rowIndex);
		// Retorna o objeto que esta na coluna
		return linha[columnIndex];
	}

	public String[] getColunas() {return colunas;}
	public ArrayList getLinhas() {return linhas;}
	public void setColunas(String[] strings) {colunas = strings;}
	public void setLinhas(ArrayList list) {linhas = list;}

	/**
	 * Seta o valor na linha e coluna
	 * @see javax.swing.table.TableModel#(java.lang.Object, int, int)
	 */
	public void setValueAt(Object value, int row, int col){
		// Obtem a linha, que é uma String []
		String [] linha = (String [])getLinhas().get(row);
		// Altera o conteudo no indice da coluna passado
		linha[col] = (String)value;
		// dispara o evento de celula alterada
		fireTableCellUpdated(row,col);
	}
	/**
	 * Retorna se a celula pode ser editada
	 * @see javax.swing.table.TableModel#isCellEditable(int, int)
	 */
	public boolean isCellEditable(int row, int col){
		return colsEdicao[col];
	}

	/**
	 * Adiciona o array na linha
	 */
	public void addRow( String [] dadosLinha){
		getLinhas().add(dadosLinha);
		// Informa a jtable de que houve linhas incluidas no modelo
		// COmo adicionamos no final, pegamos o tamanho total do modelo
		// menos 1 para obter a linha incluida.
		int linha = getLinhas().size()-1;
		fireTableRowsInserted(linha,linha);
		return;
	}

	/**
	 * Remove a linha pelo indice informado
	 * @param row
	 */
	public void removeRow(int row){
		getLinhas().remove(row);
		// informa a jtable que houve dados deletados passando a
		// linha reovida
		fireTableRowsDeleted(row,row);
	}

	/**
	 * Remove a linha pelo valor da coluna informada
	 * @param val
	 * @param col
	 * @return
	 */
	public boolean removeRow(String val, int col){
		// obtem o iterator
		Iterator i = getLinhas().iterator();
		int linha = 0;
		// Faz um looping em cima das linhas
		while(i.hasNext()){
			// Obtem as colunas da linha atual
			String[] linhaCorrente = (String[])i.next();
			linha++;
			// compara o conteudo String da linha atual na coluna desejada
			// com o valor informado
			if( linhaCorrente[col].equals(val) ){
                            getLinhas().remove(linha);
                            // informa a jtable que houve dados deletados passando a
                            // linha removida
                            fireTableRowsDeleted(linha,linha);
                            return true;
			}
		}
		// Nao encontrou nada
		return false;
	}

	/**
	 * Retorna o nome da coluna.
	 * @see javax.swing.table.TableModel#getColumnName(int)
	 */
	public String getColumnName(int col){
		return getColunas()[col];
	}

	public boolean[] configuraEdicao(int tamanho){
		boolean[] result = new boolean[tamanho];
		for(int i =0; i < result.length; i++){
			result[i] = true;
		}
		return result;
	}


}
