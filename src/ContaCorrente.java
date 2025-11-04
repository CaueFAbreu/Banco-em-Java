import javax.swing.JOptionPane;

public class ContaCorrente {
    String cliente;
    double saldo;
    boolean especial;

    public ContaCorrente(String cliente, double saldo, boolean especial) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.especial = especial;
    }

    void EmitirSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo de " + cliente + ": R$ " + saldo);
    }

    void Depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            JOptionPane.showMessageDialog(null, "Depósito de R$ " + valor + " realizado com sucesso para " + cliente + ".");
        } else {
            JOptionPane.showMessageDialog(null, "O valor depositado deve ser positivo.");
        }
    }

    void Sacar(double valor) {
        if (valor > 0) {
            if (especial || saldo >= valor) {
                saldo -= valor;
                JOptionPane.showMessageDialog(null, "Retirada de R$ " + valor + " realizada com sucesso para " + cliente + ".");
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente para retirar esse valor.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "O valor de retirada deve ser positivo.");
        }
    }

    void transferir(double valor, ContaCorrente contaDestino){
        if (valor > 0) {
            if (especial || saldo >= valor) {
                saldo -= valor;
                contaDestino.Depositar(valor);
                JOptionPane.showMessageDialog(null, "Transferência de R$ " + valor + " realizada de " + cliente + " para " + contaDestino.cliente + ".");
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar a transferência.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "O valor de transferência deve ser positivo.");
        }
    }
}
