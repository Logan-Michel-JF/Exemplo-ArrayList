
import java.util.ArrayList;


/**
 *
 * @author Alunos
 */
public class Exemplo01 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        //adicionar 3 números ao ArrayList
        numeros.add(10); //adicionar a posição 
        numeros.add(20);
        numeros.add(30);
        
        System.out.println("Números: ");
        System.out.println(numeros.get(0)); //pega a posição 0 
        System.out.println(numeros.get(1)); //pega a posição 1
        System.out.println(numeros.get(2)); //pega a posição 2
        
        System.out.println("Tamanho: "
                + numeros.size()); //tamanho do ArrayList
        
        numeros.remove(1); //apaga o elemento do ArrayList
        //pelo Indice
        
        for(int i = 40; i <= 100; i = i + 10){
            numeros.add(i);
        }
        
        System.out.println("Tamanho: "
                + numeros.size()); // tamanho do ArrayList
        System.out.println("Números: ");
        for(int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
    }
    
}
