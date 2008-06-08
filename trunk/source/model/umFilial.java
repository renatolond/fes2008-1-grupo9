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

public class umFilial{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private int idFilial;

    private String nome;

    private String lugar;


    /**
     * Construtor dessa classe
     */
    public umFilial(){
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
     * @return Nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param umNome
     */
    public void setNome(String umNome) {
        nome = umNome;
    }

    /**
     * @return Lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * @param umLugar
     */
    public void setLugar(String umLugar) {
        lugar = umLugar;
    }


}
