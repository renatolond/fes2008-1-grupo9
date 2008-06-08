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

public class umBlacklist{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private int idCliente;

    private String motivo;


    /**
     * Construtor dessa classe
     */
    public umBlacklist(){
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
     * @return Motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param umMotivo
     */
    public void setMotivo(String umMotivo) {
        motivo = umMotivo;
    }


}
