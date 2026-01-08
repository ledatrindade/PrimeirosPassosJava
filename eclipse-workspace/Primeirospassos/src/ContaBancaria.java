class ContaBancaria {
    private double saldo;
    private double limiteCheque;
    private double chequeUsado;

    public ContaBancaria(double depositoInicial) {
        saldo = depositoInicial;
        chequeUsado = 0;

        if (depositoInicial <= 500) {
            limiteCheque = 50;
        } else {
            limiteCheque = depositoInicial * 0.5;
        }
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public void consultarChequeEspecial() {
        System.out.printf("Cheque especial disponível: R$ %.2f%n",
                (limiteCheque - chequeUsado));
    }

    public void depositar(double valor) {
        saldo += valor;

        if (chequeUsado > 0) {
            double taxa = chequeUsado * 0.2;
            saldo -= taxa;
            System.out.printf("Taxa de 20%% cobrada sobre o cheque especial: R$ %.2f%n", taxa);
            chequeUsado = 0;
        }

        System.out.println("Depósito realizado com sucesso!");
    }

    public void sacar(double valor) {
        double limiteTotal = saldo + (limiteCheque - chequeUsado);

        if (valor <= limiteTotal) {
            if (saldo >= valor) {
                saldo -= valor;
            } else {
                double restante = valor - saldo;
                saldo = 0;
                chequeUsado += restante;
            }
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void pagarBoleto(double valor) {
        System.out.println("Pagamento de boleto:");
        sacar(valor);
    }

    public void verificarChequeEspecial() {
        if (chequeUsado > 0) {
            System.out.println("A conta está usando cheque especial.");
        } else {
            System.out.println("A conta NÃO está usando cheque especial.");
        }
    }
}


