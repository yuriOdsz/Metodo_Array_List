import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ListaComArray lista = new ListaComArray(5);

        System.out.println("=== TESTE ADD ===");
        lista.add(10);
        lista.add(20);
        lista.add(30);
        System.out.println(lista);

        System.out.println("\n=== TESTE ADD COM INDEX ===");
        lista.add(1, 15);
        System.out.println(lista);

        System.out.println("\n=== TESTE REMOVE POR INDEX ===");
        Integer removido = lista.remove(2);
        System.out.println("Removido: " + removido);
        System.out.println(lista);

        System.out.println("\n=== TESTE REMOVE FIRST (valor) ===");
        boolean removeu = lista.removeFirst(10);
        System.out.println("Removeu? " + removeu);
        System.out.println(lista);

        System.out.println("\n=== TESTE SIZE ===");
        System.out.println("Tamanho: " + lista.size());

        System.out.println("\n=== TESTE IS EMPTY ===");
        System.out.println("Está vazia? " + lista.isEmpty());

        System.out.println("\n=== TESTE GET (válido) ===");
        System.out.println(lista);
        System.out.println("Valor retornado (index 0): " + lista.get(0));

        System.out.println("\n=== TESTE SET ===");
        Integer valorSubstituido = lista.set(1, 99);
        System.out.println("Valor substituído: " + valorSubstituido);
        System.out.println(lista);

        System.out.println("\n=== TESTE CONTAINS ===");
        System.out.println("Contém 99? " + lista.contains(99));
        System.out.println("Contém 200? " + lista.contains(200));

        System.out.println("\n=== TESTE INDEX OF ===");
        System.out.println("Index de 99: " + lista.indexOf(99));
        System.out.println("Index de 300: " + lista.indexOf(300));

        System.out.println("\n=== TESTE LAST INDEX OF ===");
        lista.add(99);
        lista.add(10);
        lista.add(99);
        System.out.println(lista);
        System.out.println("Último índice de 99: " + lista.lastIndexOf(99));

        System.out.println("\n=== TESTE TO ARRAY ===");
        System.out.println(Arrays.toString(lista.toArray()));

        System.out.println("\n=== TESTE CLEAR ===");
        lista.clear();
        System.out.println(lista);
        System.out.println("Está vazia? " + lista.isEmpty());

        System.out.println("\n=== TESTE RESIZE ===");
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6); // força resize
        System.out.println(lista);

        System.out.println("\n=== TESTE IS FULL ===");
        ListaComArray listaFixa = new ListaComArray(3, false);
        listaFixa.add(1);
        listaFixa.add(2);
        listaFixa.add(3);
        System.out.println("Está cheia? " + listaFixa.isFull());
        System.out.println(listaFixa);
    }
}