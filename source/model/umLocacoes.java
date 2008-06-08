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

public class umLocacoes{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private int idLocacao;

    private int idCliente;

    private int idCarro;

    private String dataInicio;

    private String dataFim;

    private float valor;


    /**
     * Construtor dessa classe
     */
    public umLocacoes(){
    }

    /**
    * @return oid
    */
    public int getOid() {
        return oid;
    }

	/**
    * @param umResponsavel
    */
    public void setOid(int oid) {
        this.oid = oid;
    }

    /**
     * @return IdLocacao
     */
    public int getIdLocacao() {
        return idLocacao;
    }

    /**
     * @param umIdLocacao
     */
    public void setIdLocacao(int umIdLocacao) {
        idLocacao = umIdLocacao;
    }
    /**
     * @param umIdLocacao
     */
    public void setIdLocacao(String umIdLocacao) {
        idLocacao = Integer.parseInt(umIdLocacao);
    }

    /**
     * @return IdCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param umIdCliente
     */
    public void setIdCliente(int umIdCliente) {
        idCliente = umIdCliente;
    }
    /**
     * @param umIdCliente
     */
    public void setIdCliente(String umIdCliente) {
        idCliente = Integer.parseInt(umIdCliente);
    }

    /**
     * @return IdCarro
     */
    public int getIdCarro() {
        return idCarro;
    }

    /**
     * @param umIdCarro
     */
    public void setIdCarro(int umIdCarro) {
        idCarro = umIdCarro;
    }
    /**
     * @param umIdCarro
     */
    public void setIdCarro(String umIdCarro) {
        idCarro = Integer.parseInt(umIdCarro);
    }

    /**
     * @return DataInicio
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * @param umDataInicio
     */
    public void setDataInicio(String umDataInicio) {
        dataInicio = umDataInicio;
    }

    /**
     * @return DataFim
     */
    public String getDataFim() {
        return dataFim;
    }

    /**
     * @param umDataFim
     */
    public void setDataFim(String umDataFim) {
        dataFim = umDataFim;
    }

    /**
     * @return Valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param umValor
     */
    public void setValor(float umValor) {
        valor = umValor;
    }
    /**
     * @param umValor
     */
    public void setValor(String umValor) {
        valor = Float.parseFloat(umValor);
    }


}
