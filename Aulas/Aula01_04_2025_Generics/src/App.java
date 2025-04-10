
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class App {
    public static void main(String[] args) throws Exception {
        // Set listaSet;
        // Map dicionario;
        var list1 = new ArrayList<Integer>();
        var list2 = new ArrayList<String>();
        // var list3 = new ArrayList<Object>();

        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);

        list1.remove(Integer.valueOf(4)); // <-- Valor 4
        // list1.remove(3); <--- ainda nao tem o index 3

        System.out.println("Antes do clear\n");
        for (Integer value : list1) {
            System.out.println(value);
        }


        var elemento = obterPrimeiroElemento(list1);
        System.out.println("\n\nElemento: " + elemento);

        System.out.println("\n\nFor each\n");
        list1.forEach(value -> {
            System.out.println(value);
        });
        
        list1.clear();

        System.out.println("Depois do clear\n");
        for (Integer value : list1) {
            System.out.println(value);
        }

    }

    private static <T> T obterPrimeiroElemento(List<T> lista){
        if(lista == null || lista.isEmpty()){
            throw new NoSuchElementException("Lista está vazia");
        }
        return lista.get(0);
    }
}
