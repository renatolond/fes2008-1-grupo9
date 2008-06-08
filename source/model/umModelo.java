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

public class umModelo{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private int idModelo;

    private String marca;

    private String fabricante;

    private int idGrupo;

    private float valor;


    /**
     * Construtor dessa classe
     */
    public umModelo(){
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
     * @return Marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param umMarca
     */
    public void setMarca(String umMarca) {
        marca = umMarca;
    }

    /**
     * @return Fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param umFabricante
     */
    public void setFabricante(String umFabricante) {
        fabricante = umFabricante;
    }

    /**
     * @return IdGrupo
     */
    public int getIdGrupo() {
        return idGrupo;
    }

    /**
     * @param umIdGrupo
     */
    public void setIdGrupo(int umIdGrupo) {
        idGrupo = umIdGrupo;
    }
    /**
     * @param umIdGrupo
     */
    public void setIdGrupo(String umIdGrupo) {
        idGrupo = Integer.parseInt(umIdGrupo);
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
