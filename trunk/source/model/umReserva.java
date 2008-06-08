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

public class umReserva{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private String dataInicio;

    private String dataFim;

    private int idReserva;

    private int idCarro;

    private int idCliente;


    /**
     * Construtor dessa classe
     */
    public umReserva(){
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
     * @return IdReserva
     */
    public int getIdReserva() {
        return idReserva;
    }

    /**
     * @param umIdReserva
     */
    public void setIdReserva(int umIdReserva) {
        idReserva = umIdReserva;
    }
    /**
     * @param umIdReserva
     */
    public void setIdReserva(String umIdReserva) {
        idReserva = Integer.parseInt(umIdReserva);
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


}
