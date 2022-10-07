package Aula_01_02_Junit.cc;

import java.math.BigDecimal;

public class ContaCorrente {
    private String titular;
    private BigDecimal saldo;
    private boolean ativa;
    public ContaCorrente(BigDecimal saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void transferir(BigDecimal ValorTransf, ContaCorrente outraConta){
        if (isValorValido(ValorTransf)){
            saldo = saldo.subtract(ValorTransf);
            outraConta.saldo = outraConta.saldo.add(ValorTransf);
        }
    }
    public BigDecimal getSaldo() {
        return saldo;
    }

    public void sacar(BigDecimal valor) {
        // saldo.compareTo(valor) = -1 | 0 | 1

        // diferente:      !=
        // igual:          ==
        // maior que:      >
        // menor que:      <
        // maior ou igual: >=
        // menor ou igual: <=

        //Primeira implementação
        //saldo.compareTo(valor) = se saldo for menor retorna -1 | se for igual retorna 0 | se for maior retorna 1
//        if (valor != null
//                && saldo.compareTo(valor) >= 0
//                && valor.compareTo(BigDecimal.ZERO) >= 0
//                && valor.compareTo(new BigDecimal(3_000)) <= 0) {
//            saldo = saldo.subtract(valor);
//        }

        // refatorado
        if (isValorValido(valor)) {
            saldo = saldo.subtract(valor);
        }
    }

    private boolean isValorValido(BigDecimal valor) {
        return valor != null
                && valor.compareTo(BigDecimal.ZERO) >= 0
                && saldo.compareTo(valor) >= 0
                && valor.compareTo(new BigDecimal(3000)) <= 0;
    }


}

