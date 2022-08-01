
package listadoblementeenlazada;

import java.util.LinkedList;


public class ListaDoblementeEnlazada {

    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();//Instancia de la Lista
        
        lista.add("Mango");//Añadir elementos a la Lista
        lista.add("Fresa");
        lista.add("Manzana");
        
        System.out.println("Lista: " + lista);//Impresión de la Lista
    }
    
}
