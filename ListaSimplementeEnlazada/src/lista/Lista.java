package lista;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;

public class Lista {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();//Instancia de la lista

        lista.add("Mango");//Añadir elementos a la lista
        lista.add("Fresa");

        lista.add("Manzana");

        System.out.println(lista);//Imprimir la lista

        System.out.println("Tamaño: " + lista.size());//Imprimir tamaño de la lista

        System.out.println("La lista está vacía?: " + lista.isEmpty());//Preguntar si la lista esta vacia

        System.out.println(lista.get(2));//Obtener un valor por su posición

        System.out.println(lista.indexOf("Fresa"));//Obtener la posición de un elemento

        lista.add(0, "Pera");//Añadir elemento en la posición inicial de la lista

        lista.add(lista.size(), "Papaya");//Añadir un elemento en la ultima posición de la Lista

        lista.remove(0); //Remover el primer elemento de la lista

        lista.remove(lista.size() - 1); //Remover el primer elemento de la lista

        System.out.println(lista);//Imprimir la lista

        List<String> sublista = new ArrayList<>();//Instancia de la sublista

        sublista.add("Zapato");//Añadir elementos a la sublista
        sublista.add("Camisa");
        sublista.add("Vestido");

        System.out.println(sublista);//Imprimir la sublista

        for (int i = 0; i < sublista.size(); i++) {
            String valor = sublista.get(i);
            lista.add(valor);
        }
        System.out.println(lista);//Imprimir la lista
        
        lista.remove(5);//Remover un elemento de la SubLista
        
        Collections.sort(lista);//Ordenar Lista
        System.out.println("Lista ordenada: " + lista);
        
        Collections.sort(lista, Collections.reverseOrder());//Ordenar lista al contrario
        System.out.println("Lista ordenada al contrario: " + lista);
        
        Collections.shuffle(lista);//Ordenar aleatoriamente la lista
        System.out.println("Lista desordenada aleatoriamente: " + lista);
        
        lista.clear();//Remover todos los elementos de la lista
        
        
    }
}
