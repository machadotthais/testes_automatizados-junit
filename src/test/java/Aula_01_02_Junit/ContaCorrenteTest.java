package Aula_01_02_Junit;

import Aula_01_02_Junit.cc.ContaCorrente;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ContaCorrenteTest {
    @Test
    void teste1(){
        ContaCorrente cc = new ContaCorrente(BigDecimal.TEN, "Joana");
        //Efetuando saque de R$5,00
        cc.sacar(new BigDecimal(5));
        //Obtendo o novo saldo
        BigDecimal novoSaldo = cc.getSaldo();

    }
}
