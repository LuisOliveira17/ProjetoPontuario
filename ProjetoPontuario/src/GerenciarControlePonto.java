import model.Gerente;
import model.Operador;
import model.Secretaria;

public class GerenciarControlePonto {


    public static void main(String[] args){

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


    }
}

