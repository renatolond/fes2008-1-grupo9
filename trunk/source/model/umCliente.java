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

public class umCliente{

    /**
     * Propriedade fixa e necessaria para identificar o registro
     */
    private int oid;

    private int idCliente;

    private String nome;

    private String endereco;

    private String cpf;

    private String telefone;

    private String dataNascimento;

    private String estadoCivil;

    private String cnh;


    /**
     * Construtor dessa classe
     */
    public umCliente(){
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
     * @return Telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param umTelefone
     */
    public void setTelefone(String umTelefone) {
        telefone = umTelefone;
    }

    /**
     * @return DataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param umDataNascimento
     */
    public void setDataNascimento(String umDataNascimento) {
        dataNascimento = umDataNascimento;
    }

    /**
     * @return EstadoCivil
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param umEstadoCivil
     */
    public void setEstadoCivil(String umEstadoCivil) {
        estadoCivil = umEstadoCivil;
    }

    /**
     * @return Cnh
     */
    public String getCnh() {
        return cnh;
    }

    /**
     * @param umCnh
     */
    public void setCnh(String umCnh) {
        cnh = umCnh;
    }


}
