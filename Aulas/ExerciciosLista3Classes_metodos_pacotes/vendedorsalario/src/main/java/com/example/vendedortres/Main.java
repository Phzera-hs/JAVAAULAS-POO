package com.example.vendedortres;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.example.vendedortres.calcular.comissao;
import com.example.vendedortres.vendedor.PessoaqueVende;
import com.example.vendedortres.vendedor.RandomInfos;

public class Main {
    public static void main(String[] args) {
        int quantidade = 10;
        PessoaqueVende[] vendedores = new PessoaqueVende[quantidade];
        
        String caminhoarquivo = "Vendedores.txt";

        for (int i = 0; i < quantidade; i++) {
            try {
                String nome = RandomInfos.getRandomFullName();
                String cpf = RandomInfos.getRandomCPF().replace(".", "").replace("-", ""); // remove pontuação
                String login = RandomInfos.getRandomLogin(nome);
                String senha = RandomInfos.getRandomSenha();
                double salario = RandomInfos.getRandomSalario();
                Integer quantidadeVendas = RandomInfos.getRandomVendas();
                Double Comissao = comissao.CalcularComissao(quantidadeVendas);
                Double salarioFinal = comissao.SalarioFinal(Comissao, salario);


                vendedores[i] = new PessoaqueVende(nome, cpf, login, senha, salario, salarioFinal, quantidadeVendas);

                System.out.println("Vendedor " + (i + 1) + ":");
                System.out.println("Nome: " + vendedores[i].getNome());
                System.out.println("CPF: " + vendedores[i].getCpf());
                System.out.println("Login: " + vendedores[i].getLogin());
                System.out.println("Senha: " + vendedores[i].getSenha());
                System.out.println("Salário: R$" + vendedores[i].getSalarioFix());
                System.out.println("Quantidade de Vendas: " + vendedores[i].getQntdVendas());
                System.out.println("Salário Final (Salario + Comissao): R$" + vendedores[i].getSalarioFinal());
                System.out.println("---------------------------");

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoarquivo, true))) {
                writer.write("Vendedor " + (i + 1) + ":\n");
                writer.write("Nome: " + vendedores[i].getNome() + "\n");
                writer.write("CPF: " + vendedores[i].getCpf() + "\n");
                writer.write("Login: " + vendedores[i].getLogin() + "\n");
                writer.write("Senha: " + vendedores[i].getSenha() + "\n");
                writer.write("Salário: R$" + vendedores[i].getSalarioFix() + "\n");
                writer.write("Quantidade de Vendas: " + vendedores[i].getQntdVendas() + "\n");
                writer.write("Salário Final (Salário + Comissão): R$" + vendedores[i].getSalarioFinal() + "\n");
                writer.write("---------------------------\n\n");
            } catch (IOException e) {
                System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
            }

            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar vendedor " + (i + 1) + ": " + e.getMessage());
            }
        }
    }
}
