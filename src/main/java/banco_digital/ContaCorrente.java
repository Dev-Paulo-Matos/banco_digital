package banco_digital;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("#### Extrato da conta Corrente ####");
        imprimirInformacoesComum();
    }



}

