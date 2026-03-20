package Apps;

import Pessoas.Cliente;
import Pessoas.Funcionario;
import PeopleSystem.Endereco;
import PeopleSystem.Telefone;
import PeopleSystem.Profissao;
import PeopleSystem.Cargo;

import java.time.LocalDate;
import java.util.Arrays;

public class Aplicattion {
    public static void main(String[] args) {
        // Criar Endereco
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua das Flores");
        endereco.setNumero("123");
        endereco.setBairro("Centro");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        endereco.setCep("01234-567");

        // Criar Telefone
        Telefone telefone = new Telefone();
        telefone.setDdd("11");
        telefone.setNumero("99999-9999");
        telefone.setTipo("Celular");

        // Criar Profissao
        Profissao profissao = new Profissao();
        profissao.setNome("Engenheiro");
        profissao.setDescricao("Profissional de engenharia");

        // Criar Cliente (usando classe anônima para implementar métodos abstratos)
        Cliente cliente = new Cliente() {
            @Override
            public void cadastrar() {
                // Implementação vazia para teste
            }

            @Override
            public int obterIdade() {
                if (getDataNascimento() == null) return 0;
                return java.time.Period.between(getDataNascimento(), LocalDate.now()).getYears();
            }
        };
        cliente.setCodigo("CLI001");
        cliente.setNome("João Silva");
        cliente.setDataNascimento(LocalDate.of(1990, 1, 15));
        cliente.setEndereco(endereco);
        cliente.setTelefones(Arrays.asList(telefone));
        cliente.setProfissao(profissao);

        // Criar Cargo
        Cargo cargo = new Cargo();
        cargo.setNome("Gerente");
        cargo.setDescricao("Gerente de vendas");

        // Criar Funcionario
        Funcionario funcionario = new Funcionario();
        funcionario.setMatricula(12345);
        funcionario.setNome("Maria Oliveira");
        funcionario.setDataNascimento(LocalDate.of(1985, 5, 20));
        funcionario.setEndereco(endereco);
        funcionario.setTelefones(Arrays.asList(telefone));
        funcionario.setCargo(cargo);
        funcionario.setSalario(5000.0);
        funcionario.setPercentual(0.0);
        funcionario.setDataAdmissao(LocalDate.of(2020, 1, 10));

        // Imprimir no console
        System.out.println("=== Cliente ===");
        System.out.println("Código: " + cliente.getCodigo());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
        System.out.println("Idade: " + cliente.obterIdade());
        System.out.println("Endereço: " + cliente.getEndereco().getLogradouro() + ", " + cliente.getEndereco().getNumero() + ", " + cliente.getEndereco().getBairro() + ", " + cliente.getEndereco().getCidade() + ", " + cliente.getEndereco().getEstado() + ", " + cliente.getEndereco().getCep());
        System.out.println("Telefones: " + cliente.getTelefones().get(0).getDdd() + " " + cliente.getTelefones().get(0).getNumero() + " (" + cliente.getTelefones().get(0).getTipo() + ")");
        System.out.println("Profissão: " + cliente.getProfissao().getNome() + " - " + cliente.getProfissao().getDescricao());

        System.out.println("\n=== Funcionário ===");
        System.out.println("Matrícula: " + funcionario.getMatricula());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
        System.out.println("Idade: " + funcionario.obterIdade());
        System.out.println("Endereço: " + funcionario.getEndereco().getLogradouro() + ", " + funcionario.getEndereco().getNumero() + ", " + funcionario.getEndereco().getBairro() + ", " + funcionario.getEndereco().getCidade() + ", " + funcionario.getEndereco().getEstado() + ", " + funcionario.getEndereco().getCep());
        System.out.println("Telefones: " + funcionario.getTelefones().get(0).getDdd() + " " + funcionario.getTelefones().get(0).getNumero() + " (" + funcionario.getTelefones().get(0).getTipo() + ")");
        System.out.println("Cargo: " + funcionario.getCargo().getNome() + " - " + funcionario.getCargo().getDescricao());
        System.out.println("Salário: R$ " + funcionario.getSalario());
        System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
    }
}
