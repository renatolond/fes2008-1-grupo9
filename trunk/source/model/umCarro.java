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

public class umCarro{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private int idCarro;

    private int idModelo;

    private int idFilial;

    private String ano;

    private float quilometragem;

    private boolean disponibilidade;

    private String placa;


    /**
     * Construtor dessa classe
     */
    public umCarro(){
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
     * @return IdModelo
     */
    public int getIdModelo() {
        return idModelo;
    }

    /**
     * @param umIdModelo
     */
    public void setIdModelo(int umIdModelo) {
        idModelo = umIdModelo;
    }
    /**
     * @param umIdModelo
     */
    public void setIdModelo(String umIdModelo) {
        idModelo = Integer.parseInt(umIdModelo);
    }

    /**
     * @return IdFilial
     */
    public int getIdFilial() {
        return idFilial;
    }

    /**
     * @param umIdFilial
     */
    public void setIdFilial(int umIdFilial) {
        idFilial = umIdFilial;
    }
    /**
     * @param umIdFilial
     */
    public void setIdFilial(String umIdFilial) {
        idFilial = Integer.parseInt(umIdFilial);
    }

    /**
     * @return Ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param umAno
     */
    public void setAno(String umAno) {
        ano = umAno;
    }

    /**
     * @return Quilometragem
     */
    public float getQuilometragem() {
        return quilometragem;
    }

    /**
     * @param umQuilometragem
     */
    public void setQuilometragem(float umQuilometragem) {
        quilometragem = umQuilometragem;
    }
    /**
     * @param umQuilometragem
     */
    public void setQuilometragem(String umQuilometragem) {
        quilometragem = Float.parseFloat(umQuilometragem);
    }

    /**
     * @return Disponibilidade
     */
    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    /**
     * @param umDisponibilidade
     */
    public void setDisponibilidade(boolean umDisponibilidade) {
        disponibilidade = umDisponibilidade;
    }
    /**
     * @param umDisponibilidade
     */
    public void setDisponibilidade(String umDisponibilidade) {
        disponibilidade = Boolean.parseBoolean(umDisponibilidade);
    }

    /**
     * @return Placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param umPlaca
     */
    public void setPlaca(String umPlaca) {
        placa = umPlaca;
    }


}
