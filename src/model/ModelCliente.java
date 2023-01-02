package model;

public class ModelCliente {

    private int idCliente;
    private String cliNome;
    private String cliEndereco;
    private String cliBairro;
    private String cliCidade;
    private String cliUf;
    private String cliCep;
    private String cliTelefone;

    /**
     * Construtor
     */
    public ModelCliente() {
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param pIdCliente the idCliente to set
     */
    public void setIdCliente(int pIdCliente) {
        this.idCliente = pIdCliente;
    }

    /**
     * @return the cliNome
     */
    public String getCliNome() {
        return cliNome;
    }

    /**
     * @param cliNome the cliNome to set
     */
    public void setCliNome(String cliNome) {
        this.cliNome = cliNome;
    }

    /**
     * @return the cliEndereco
     */
    public String getCliEndereco() {
        return cliEndereco;
    }

    /**
     * @param cliEndereco the cliEndereco to set
     */
    public void setCliEndereco(String cliEndereco) {
        this.cliEndereco = cliEndereco;
    }

    /**
     * @return the cliBairro
     */
    public String getCliBairro() {
        return cliBairro;
    }

    /**
     * @param cliBairro the cliBairro to set
     */
    public void setCliBairro(String cliBairro) {
        this.cliBairro = cliBairro;
    }

    /**
     * @return the cliCidade
     */
    public String getCliCidade() {
        return cliCidade;
    }

    /**
     * @param cliCidade the cliCidade to set
     */
    public void setCliCidade(String cliCidade) {
        this.cliCidade = cliCidade;
    }

    /**
     * @return the cliUf
     */
    public String getCliUf() {
        return cliUf;
    }

    /**
     * @param cliUf the cliUf to set
     */
    public void setCliUf(String cliUf) {
        this.cliUf = cliUf;
    }

    /**
     * @return the cliCep
     */
    public String getCliCep() {
        return cliCep;
    }

    /**
     * @param cliCep the cliCep to set
     */
    public void setCliCep(String cliCep) {
        this.cliCep = cliCep;
    }

    /**
     * @return the cliTelefone
     */
    public String getCliTelefone() {
        return cliTelefone;
    }

    /**
     * @param cliTelefone the cliTelefone to set
     */
    public void setCliTelefone(String cliTelefone) {
        this.cliTelefone = cliTelefone;
    }

    @Override
    public String toString() {
        return "ModelCliente{" + "idCliente=" + idCliente + ", cliNome=" + cliNome + ", cliEndereco=" + cliEndereco + ", cliBairro=" + cliBairro + ", cliCidade=" + cliCidade + ", cliUf=" + cliUf + ", cliCep=" + cliCep + ", cliTelefone=" + cliTelefone + '}';
    }
}
