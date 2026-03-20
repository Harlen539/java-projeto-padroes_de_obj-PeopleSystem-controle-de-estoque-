package Pessoas;

import PeopleSystem.Endereco;
import PeopleSystem.Profissao;
import PeopleSystem.Telefone;

import java.time.LocalDate;
import java.util.List;

public abstract class Cliente {
    private String codigo;
    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private List<Telefone> telefones;
    private Profissao profissao;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public abstract void cadastrar();

    public abstract int obterIdade();
}
