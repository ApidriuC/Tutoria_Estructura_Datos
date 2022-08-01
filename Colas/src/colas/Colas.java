/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colas;

import java.util.LinkedList;

public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList cola = new LinkedList(); //Instanciar Cola

        cola.push("Jose");//Añadir elementos a la Cola
        cola.push("Manuel");
        cola.push("Paola");
        cola.push("Andres");
        
        System.out.println(cola.size()); //Imprimir tamaño de la cola
        System.out.println(cola.isEmpty()); //Imprimir si la cola está vacia
        System.out.println(cola.get(0)); //Imprimir posición de la cola
        System.out.println(cola.pop()); //Saca un elemento de la cola

        for (int i = 0; i < cola.size()-1; i++) {
            if(cola.get(i) == "Manuel"){
                System.out.println("Manuel está en la posición: " + i); //Imprime la posición de mi objeto
            }
        }
        LinkedList SubCola = new LinkedList(); //Instanciar Segunda Cola
        SubCola.push("Daniela");//Añadir valores a la SubCola
        SubCola.push("Pedro");
        cola.push(SubCola);
        SubCola.remove(1); //Remover la posición 1 de la SubCola
        
        for (int i = 0; i < cola.size()-1; i++) { //Imprimir nuestra Cola
            System.out.println("Posición "+ i + ": "+ cola.get(i));
        }
        cola.clear(); //Limpiar nuestra cola
        System.out.println(cola.isEmpty()); //Verificamos si quedó limpia la Cola
    }
}
