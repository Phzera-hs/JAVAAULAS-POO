package com.example.vendedortres.vendedor;

public class PessoaqueVende {
    private String nome;
    private String cpf;
    private String login;
    private String senha;
    private Double salarioFix;
    private Double salarioFinal;
    public Integer qntdVendas;


    public PessoaqueVende(String nome, String cpf, String login, String senha, Double salarioFix,Double salarioFinal, Integer Vendas) {
        this.nome = nome;
        
        if (cpf != null && cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido. Deve conter 11 dígitos.");
        }

        if (login != null && login.length() >= 6 && login.length() <= 1000) {
            this.login = login;
        } else {
            throw new IllegalArgumentException("Login deve ter entre 6 e 1000 caracteres.");
        }

        if (senha != null && senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$")) {
            this.senha = senha;
        } else {
            throw new IllegalArgumentException("Senha inválida. Deve conter pelo menos 8 caracteres, incluindo letra maiúscula, minúscula, número e caractere especial.");
        }

        this.salarioFix = salarioFix;
        this.salarioFinal = salarioFinal;
        this.qntdVendas = Vendas;
    }
    public Double getSalarioFinal() {
        return salarioFinal;
    }
    public void setSalarioFinal(Double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
    public Integer getQntdVendas() {
        return qntdVendas;
    }
    public void setQntdVendas(Integer qntdVendas) {
        this.qntdVendas = qntdVendas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Double getSalarioFix() {
        return salarioFix;
    }
    public void setSalarioFix(Double salarioFix) {
        this.salarioFix = salarioFix;
    }

    

}
