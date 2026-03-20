package Pessoas;

import PeopleSystem.Endereco;
import PeopleSystem.Telefone;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    protected String nome;
    protected LocalDate dataNascimento;
    protected int idade;
    protected Endereco endereco;
    protected Telefone telefone;

    public void cadastrar() {
    }

    public int obterIdade() {
        return getIdade();
    }

    public Pessoa(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telefone) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
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

    public int getIdade() {
        if (idade > 0) {
            return idade;
        }
        if (dataNascimento == null) {
            return 0;
        }
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", idade=" + getIdade() +
                ", endereco=" + endereco +
                ", telefone=" + telefone +
                '}';
    }
}
