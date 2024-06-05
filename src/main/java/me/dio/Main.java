package me.dio;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Banco banco = new Banco("Meu Banco", List.of(cc, poupanca));
        System.out.println("Lista de Clientes:");
        for (Cliente cliente : banco.listarClientes()) {
            System.out.println(cliente.getNome());
        }

        CartaoDeCredito cartao = new CartaoDeCredito(venilton, 5000, 0);
        cartao.utilizar(1500);
        cartao.imprimirFatura();

        Investimento investimento = new Investimento(venilton, 10000, 150);
        investimento.imprimirExtrato();
    }
}