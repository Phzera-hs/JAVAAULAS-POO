package com.example.vendedortres.calcular;

public class comissao {
    public static Double CalcularComissao(Integer qntdVendas){
        return qntdVendas * 0.15;
    }

    public static Double SalarioFinal(Double Comissao, Double salario){
        return (Comissao*100) + salario;
    }
}
