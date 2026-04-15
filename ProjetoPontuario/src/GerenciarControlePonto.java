import model.Gerente;
import model.Operador;
import model.RegistroPonto;
import model.Secretaria;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {


    public static void main(String[] args) throws InterruptedException {

        RegistroPonto reg = new RegistroPonto();

        Gerente gerente = new Gerente(1,"Laercio","laercio@gmail.com","76787644527","admin","418151");
        Operador operador = new Operador(
                3,
                "Laercio gay",
                "lalaercio18@gmail.com",
                "33555588820",
                150.00
        );

        Secretaria secretaria = new Secretaria(
                2,
                "Lara Zonaro",
                "larinha20@gmail.com",
                "2255588832",
                "1999885577",
                "585462"
        );

        reg.setIdRegPonto(operador.getIdFunc());
        reg.setFunc(operador);
        reg.setDataRegistro(LocalDate.now());
        reg.setHoraEntrada(LocalDateTime.now());
        Thread.sleep(5000);
        reg.setHoraSaida(LocalDateTime.now());

        System.out.println(reg.apresentarRegistroPonto());


        reg.setIdRegPonto(secretaria.getIdFunc());
        reg.setFunc(secretaria);
        reg.setDataRegistro(LocalDate.now());
        reg.setHoraEntrada(LocalDateTime.now());
        Thread.sleep(5000);
        reg.setHoraSaida(LocalDateTime.now());

        System.out.println(reg.apresentarRegistroPonto());
        
    }
}

