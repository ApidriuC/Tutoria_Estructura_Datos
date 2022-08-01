/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;

import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {
        Stack pila = new Stack();//Instanciar nuestra Pila
        pila.push("Andrés");//Añadir elementos a nuestra Pila
        pila.push("Cesar");
        pila.push("Martin");
        System.out.println(pila.size());//Contar los elementos de nuestra Pila
        System.out.println(pila.isEmpty());//Contar los elementos de nuestra Pila
        //pila.pop();//Eliminar la última posición de la Pila
        pila.remove(pila.firstElement());//Eliminar la primera posición de la Pila
        
        System.out.println(pila.search("Cesar"));//Buscar un elemento en la Pila
        for (int i = 0; i < 5; i++) {//Añadir elementos consecutivos
            pila.push(i);
        }
        for (int i = 0; i < 2; i++) {
            pila.remove(i);//Eliminar elementos consecutivos
        }
        for (int i = 0; i < pila.size(); i++) {
            System.out.println("Posición "+ i + ": " + pila.get(i));//Imprimir Pila
        }
        System.out.println(pila.search("Martin"));//Imprimir la posición de un elemento de la Pila
        pila.clear();//Limpiar toda la pila
        
    }
}

