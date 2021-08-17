package banco_digital;

public class Main {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Paulo Machado");
        Conta contaCC = new ContaCorrente(cliente1);
        Conta contaPP = new ContaPoupanca(cliente1);
        contaCC.imprimirExtrato();
        contaPP.imprimirExtrato();
    }
}
