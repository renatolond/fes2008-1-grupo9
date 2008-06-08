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

public class umFuncionario{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private int idAgente;

    private String nome;

    private String cargo;

    private String cpf;

    private String endereco;


    /**
     * Construtor dessa classe
     */
    public umFuncionario(){
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
     * @return IdAgente
     */
    public int getIdAgente() {
        return idAgente;
    }

    /**
     * @param umIdAgente
     */
    public void setIdAgente(int umIdAgente) {
        idAgente = umIdAgente;
    }
    /**
     * @param umIdAgente
     */
    public void setIdAgente(String umIdAgente) {
        idAgente = Integer.parseInt(umIdAgente);
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
     * @return Cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param umCargo
     */
    public void setCargo(String umCargo) {
        cargo = umCargo;
    }

    /**
     * @return Cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param umCpf
     */
    public void setCpf(String umCpf) {
        cpf = umCpf;
    }

    /**
     * @return Endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param umEndereco
     */
    public void setEndereco(String umEndereco) {
        endereco = umEndereco;
    }


}
