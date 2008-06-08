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

public class umGrupo{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private int idgrupo;

    private String descricaoGrupo;

    private boolean direcaoHidraulica;

    private boolean vidroEletrico;

    private int quantidadePortas;


    /**
     * Construtor dessa classe
     */
    public umGrupo(){
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
     * @return Idgrupo
     */
    public int getIdgrupo() {
        return idgrupo;
    }

    /**
     * @param umIdgrupo
     */
    public void setIdgrupo(int umIdgrupo) {
        idgrupo = umIdgrupo;
    }
    /**
     * @param umIdgrupo
     */
    public void setIdgrupo(String umIdgrupo) {
        idgrupo = Integer.parseInt(umIdgrupo);
    }

    /**
     * @return DescricaoGrupo
     */
    public String getDescricaoGrupo() {
        return descricaoGrupo;
    }

    /**
     * @param umDescricaoGrupo
     */
    public void setDescricaoGrupo(String umDescricaoGrupo) {
        descricaoGrupo = umDescricaoGrupo;
    }

    /**
     * @return DirecaoHidraulica
     */
    public boolean getDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    /**
     * @param umDirecaoHidraulica
     */
    public void setDirecaoHidraulica(boolean umDirecaoHidraulica) {
        direcaoHidraulica = umDirecaoHidraulica;
    }
    /**
     * @param umDirecaoHidraulica
     */
    public void setDirecaoHidraulica(String umDirecaoHidraulica) {
        direcaoHidraulica = Boolean.parseBoolean(umDirecaoHidraulica);
    }

    /**
     * @return VidroEletrico
     */
    public boolean getVidroEletrico() {
        return vidroEletrico;
    }

    /**
     * @param umVidroEletrico
     */
    public void setVidroEletrico(boolean umVidroEletrico) {
        vidroEletrico = umVidroEletrico;
    }
    /**
     * @param umVidroEletrico
     */
    public void setVidroEletrico(String umVidroEletrico) {
        vidroEletrico = Boolean.parseBoolean(umVidroEletrico);
    }

    /**
     * @return QuantidadePortas
     */
    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    /**
     * @param umQuantidadePortas
     */
    public void setQuantidadePortas(int umQuantidadePortas) {
        quantidadePortas = umQuantidadePortas;
    }
    /**
     * @param umQuantidadePortas
     */
    public void setQuantidadePortas(String umQuantidadePortas) {
        quantidadePortas = Integer.parseInt(umQuantidadePortas);
    }


}
