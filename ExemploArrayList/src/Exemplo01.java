
import java.util.ArrayList;

/**
 *
 * @author logan michel
 */
public class Exemplo01 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(22);
        numeros.add(23);
        numeros.add(25);
        numeros.add(23 + 1);
        numeros.add(21);

        int numerosPosicao0 = numeros.get(0);
        int numerosPosicao1 = numeros.get(1);
        int numerosPosicao2 = numeros.get(2);
        int numerosPosicao3 = numeros.get(3);
        int numerosPosicao4 = numeros.get(4);

        System.out.println("[0] => " + numerosPosicao0);
        System.out.println("[1] => " + numerosPosicao1);
        System.out.println("[2] => " + numerosPosicao2);
        System.out.println("[3] => " + numerosPosicao3);
        System.out.println("[4] => " + numerosPosicao4);

        int somaOutraForma = numeros.get(0) + numeros.get(1) + numeros.get(2)
                numeros.get(3) + numeros.get(4);

        int soma = numeroPosicao0 + numerosPosicao1 + numerosPosicao2 + numerosPosicao3
                + numerosPosicao4;
        System.out.println("Soma: " + soma);

    }

}
