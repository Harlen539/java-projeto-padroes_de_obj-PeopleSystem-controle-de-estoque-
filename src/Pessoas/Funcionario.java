package Pessoas;

import PeopleSystem.Cargo;
import PeopleSystem.Endereco;
import PeopleSystem.Telefone;

import java.time.LocalDate;
import java.util.List;

public class Funcionario {
    private Integer matricula;
    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private List<Telefone> telefones;
    private Cargo cargo;
    private double salario;
    private double percentual;
    private LocalDate dataAdmissao;

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
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

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void cadastrar() {
    }

    public int obterIdade() {
        if (dataNascimento == null) {
            return 0;
        }
        return java.time.Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public void reajustarSalario(double percentual) {
        this.percentual = percentual;
        this.salario += this.salario * (percentual / 100.0);
    }

    public void promover(Cargo novoCargo) {
        this.cargo = novoCargo;
    }
}
