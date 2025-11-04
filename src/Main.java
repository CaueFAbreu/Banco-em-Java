import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Cauê", 1000.0, false);
        ContaCorrente conta2 = new ContaCorrente("Leo", 2000.0, true);

        int opcao = 0;

        while (opcao != 5) {
            String menu = """
                ===== MENU =====
                1 - Ver saldos
                2 - Depositar
                3 - Sacar
                4 - Transferir
                5 - Sair
                """;

            String escolha = JOptionPane.showInputDialog(null, menu, "Banco - Menu Principal", JOptionPane.QUESTION_MESSAGE);


            if (escolha == null) break;

            try {
                opcao = Integer.parseInt(escolha);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            switch (opcao) {
                case 1 -> {
                    conta1.EmitirSaldo();
                    conta2.EmitirSaldo();
                }

                case 2 -> {
                    String conta = JOptionPane.showInputDialog("Escolha a conta para depósito:\n1 - Cauê\n2 - Leo");
                    String valorStr = JOptionPane.showInputDialog("Digite o valor do depósito:");
                    if (conta == null || valorStr == null) break;

                    double valor = Double.parseDouble(valorStr);
                    if (conta.equals("1")) conta1.Depositar(valor);
                    else if (conta.equals("2")) conta2.Depositar(valor);
                    else JOptionPane.showMessageDialog(null, "Conta inválida!");
                }

                case 3 -> {
                    String conta = JOptionPane.showInputDialog("Escolha a conta para saque:\n1 - Cauê\n2 - Leo");
                    String valorStr = JOptionPane.showInputDialog("Digite o valor do saque:");
                    if (conta == null || valorStr == null) break;

                    double valor = Double.parseDouble(valorStr);
                    if (conta.equals("1")) conta1.Sacar(valor);
                    else if (conta.equals("2")) conta2.Sacar(valor);
                    else JOptionPane.showMessageDialog(null, "Conta inválida!");
                }

                case 4 -> {
                    String origem = JOptionPane.showInputDialog("Transferir de qual conta?\n1 - Cauê\n2 - Leo");
                    String valorStr = JOptionPane.showInputDialog("Digite o valor da transferência:");
                    if (origem == null || valorStr == null) break;

                    double valor = Double.parseDouble(valorStr);
                    if (origem.equals("1")) conta1.transferir(valor, conta2);
                    else if (origem.equals("2")) conta2.transferir(valor, conta1);
                    else JOptionPane.showMessageDialog(null, "Conta inválida!");
                }

                case 5 -> JOptionPane.showMessageDialog(null, "Encerrando o programa...");

                default -> JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
