package PeopleSystem;

/**
 * Classe POJO auxiliar que representa um contato com informações de telefone e endereço
 */
public class Contato {
    private String tipo;
    private String ddd;
    private String numeroTelefone;
    private String descricao;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;

    public Contato() {
    }

    public Contato(String tipo, String ddd, String numeroTelefone) {
        this.tipo = tipo;
        this.ddd = ddd;
        this.numeroTelefone = numeroTelefone;
    }

    public Contato(String tipo, String ddd, String numeroTelefone, String descricao) {
        this.tipo = tipo;
        this.ddd = ddd;
        this.numeroTelefone = numeroTelefone;
        this.descricao = descricao;
    }

    public Contato(String rua, String numero, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public Contato(String tipo, String ddd, String numeroTelefone, String rua, String numero, 
                   String cidade, String estado, String cep) {
        this.tipo = tipo;
        this.ddd = ddd;
        this.numeroTelefone = numeroTelefone;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "tipo='" + tipo + '\'' +
                ", ddd='" + ddd + '\'' +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                ", descricao='" + descricao + '\'' +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}




