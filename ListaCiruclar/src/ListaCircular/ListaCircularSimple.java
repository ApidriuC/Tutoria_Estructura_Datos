package ListaCircular;

public class ListaCircularSimple {

    public static void main(String[] args) throws Exception {

        ListaCircular listaCircular = new ListaCircular();//Instancia de la lista circular

        // Agregar al final de la lista circular
        listaCircular.agregarAlFinal(12);
        listaCircular.agregarAlFinal(15);
        listaCircular.agregarAlFinal(9);
        // Agregar in inicio de la lista circular
        listaCircular.agregarAlInicio(41);
        listaCircular.agregarAlInicio(6);

        System.out.println("Impresión Lista Circular con sus apuntadores: ");
        listaCircular.listar();

        System.out.println("\n\nTamaño de la lista: ");
        System.out.println(listaCircular.getTamanio());

        System.out.println("\nObtener el valor del nodo en la posicion 3: ");
        System.out.println(listaCircular.getValor(3));

        System.out.println("\nInserta un nodo con valor 16 despues del 15");
        listaCircular.insertarPorReferencia(15, 16);
        listaCircular.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(listaCircular.getTamanio());

        System.out.println("\nInsertar un nodo con valor 44 en la posición 5");
        listaCircular.insrtarPorPosicion(5, 44);
        listaCircular.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(listaCircular.getTamanio());

        System.out.println("\nActualiza el valor 12 del tercer nodo por 13");
        listaCircular.editarPorReferencia(12, 13);
        listaCircular.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(listaCircular.getTamanio());

        System.out.println("\nActualiza el valor nodo en la posición 0 por 17");
        listaCircular.editarPorPosicion(0, 17);
        listaCircular.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(listaCircular.getTamanio());

        System.out.println("\nElimina el nodo con el valor 41");
        listaCircular.removerPorReferencia(41);
        listaCircular.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(listaCircular.getTamanio());

        System.out.println("\nElimina el nodo en la posición 4");
        listaCircular.removerPorPosicion(4);
        listaCircular.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(listaCircular.getTamanio());

        System.out.println("\nConsulta si existe el valor 30");
        System.out.println(listaCircular.buscar(30));

        System.out.println("\nConsulta la posicion del valor 16");
        System.out.println(listaCircular.getPosicion(16));

        System.out.println("\nElimina la lista");
        listaCircular.eliminar();

        System.out.println("\nConsulta si la lista está vacia");
        System.out.println(listaCircular.esVacia());

    }
}
