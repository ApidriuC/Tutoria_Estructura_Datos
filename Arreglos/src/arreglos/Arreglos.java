package arreglos;

import java.util.Scanner;
import static javax.swing.text.html.HTML.Attribute.N;

public class Arreglos {

    public static void main(String[] args) {

        byte[] Arreglobytes = new byte[5]; //Creación arreglo de bytes
        Byte[] ArregloBytes = new Byte[5]; //Creación arreglo de Bytes
        byte elementoByte = 1;

        char[] Arreglochar = new char[5]; //Creación arreglo de chars
        Character[] ArregloCharacter = new Character[5]; //Creación arreglo de Characters

        short[] Arregloshort = new short[5]; //Creación arreglo de shorts
        Short[] ArregloShort = new Short[5]; //Creación arreglo de Shorts

        int[] ArregloInt = new int[5]; //Creación arreglo de Ints
        Integer[] ArregloInteger = new Integer[5]; //Creación arreglo de Integers

        long[] Arreglolongs = new long[5]; //Creación arreglo de longs
        Long[] ArregloLongs = new Long[5]; //Creación arreglo de Longs
        long elementoLong = 1;

        float[] Arreglofloats = new float[5]; //Creación arreglo de Longs
        Float[] ArregloFloats = new Float[5]; //Creación arreglo de Longs
        float elementoFloat = 1;

        double[] Arreglodoubles = new double[5]; //Creación arreglo de doubles
        Double[] ArregloDoubles = new Double[5]; //Creación arreglo de Doubles
        double elementoDouble = 1.2;

        Object[] ArregloObjects = new Object[5]; //Creación arreglo de Object

        String[] ArregloStrings = new String[5]; //Creación arreglo Strings

        //Asignación de elementos a los arreglos
        for (int i = 0; i < 5; i++) {
            Arreglobytes[i] = elementoByte;
            ArregloBytes[i] = elementoByte;
            Arreglochar[i] = 'a';
            ArregloCharacter[i] = 'a';
            Arregloshort[i] = 'a';
            ArregloShort[i] = 'a';
            ArregloInt[i] = i;
            ArregloInteger[i] = i;
            Arreglolongs[i] = elementoLong;
            ArregloLongs[i] = elementoLong;
            Arreglofloats[i] = elementoFloat;
            ArregloFloats[i] = elementoFloat;
            Arreglodoubles[i] = elementoDouble;
            ArregloDoubles[i] = elementoDouble;
            ArregloObjects[i] = i;
            ArregloStrings[i] = "a";
        }
        //Imprimir Arreglobytes
        System.out.print("Elementos del arreglo bytes: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(Arreglobytes[i] + " ");
        }
        System.out.println("]");

        System.out.print("Elementos del arreglo Bytes: [");
        //Imprimir ArregloBytes
        for (int i = 0; i < 5; i++) {
            System.out.print(ArregloBytes[i] + " ");
        }
        System.out.println("]");

        System.out.print("Elementos del arreglo char: [");
        //Imprimir Arreglochar
        for (int i = 0; i < 5; i++) {
            System.out.print(Arreglochar[i] + " ");
        }
        System.out.println("]");

        System.out.print("Elementos del arreglo Character: [");
        //Imprimir ArregloChar
        for (int i = 0; i < 5; i++) {
            System.out.print(ArregloCharacter[i] + " ");
        }
        System.out.println("]");

        System.out.print("Elementos del arreglo short: [");
        //Imprimir Arregloshort
        for (int i = 0; i < 5; i++) {
            System.out.print(Arregloshort[i] + " ");
        }
        System.out.println("]");

        System.out.print("Elementos del arreglo Short: [");
        //Imprimir ArregloShort
        for (int i = 0; i < 5; i++) {
            System.out.print(ArregloShort[i] + " ");
        }
        System.out.println("]");

        System.out.print("Elementos del arreglo Int: [");
        //Imprimir ArregloInt
        for (int i = 0; i < 5; i++) {
            System.out.print(ArregloInt[i] + " ");
        }
        System.out.println("]");

        System.out.print("Elementos del arreglo Integer: [");
        //Imprimir ArregloInteger
        for (int i = 0; i < 5; i++) {
            System.out.print(ArregloInteger[i] + " ");
        }
        System.out.println("]");

        System.out.print("Elementos del arreglo longs: [");
        //Imprimir Arreglolongs
        for (int i = 0; i < 5; i++) {
            System.out.print(Arreglolongs[i] + " ");
        }
        System.out.println("]");

        System.out.print("Elementos del arreglo Longs: [");
        //Imprimir ArregloLongs
        for (int i = 0; i < 5; i++) {
            System.out.print(ArregloLongs[i] + " ");
        }
        System.out.println("]");

        System.out.print("Elementos del arreglo floats: [");
        //Imprimir Arreglofloats
        for (int i = 0; i < 5; i++) {
            System.out.print(Arreglofloats[i] + " ");
        }
        System.out.println("]");

        System.out.print("Elementos del arreglo Floats: [");
        //Imprimir ArregloFloats
        for (int i = 0; i < 5; i++) {
            System.out.print(ArregloFloats[i] + " ");
        }
        System.out.println("]");

        System.out.print("Elementos del arreglo doubles: [");
        //Imprimir Arreglodoubles
        for (int i = 0; i < 5; i++) {
            System.out.print(Arreglodoubles[i] + " ");
        }
        System.out.println("]");
        
        System.out.print("Elementos del arreglo Doubles: [");
        //Imprimir ArregloDoubles
        for (int i = 0; i < 5; i++) {
            System.out.print(ArregloDoubles[i] + " ");
        }
        System.out.println("]");
        
        System.out.print("Elementos del arreglo Objects: [");
        //Imprimir ArregloObjects
        for (int i = 0; i < 5; i++) {
            System.out.print(ArregloObjects[i] + " ");
        }
        System.out.println("]");
        
        System.out.print("Elementos del arreglo Strings: [");
        //Imprimir ArregloStrings
        for (int i = 0; i < 5; i++) {
            System.out.print(ArregloStrings[i] + " ");
        }
        System.out.println("]");
        
        //Instanciar otro arreglo de tipo String
        String[] dataStructs = new String[]{
            "Listas", 
            "Colas",
            "Pilas",
            "Mapas",
            "Conjuntos"
        };
        
        //Instanciar otro arreglo de tipo String que recibirá
        //valores por entrada del teclado
        String[] caracteristicas =  new String[5];
        Scanner tecladito = new Scanner(System.in);
        System.out.println("Ingrese 5 elementos: ");
        for (int i = 0; i < 5; i++) {//Repetir 5 veces la obtención de datos
            System.out.print("Dato " + i + ": ");
            caracteristicas[i] = tecladito.nextLine();//Asignar valor ingresado al arreglo
        }
        System.out.print("Elementos del arreglo Strings: [");
        //Imprimir arreglo dataTeclado
        for (int i = 0; i < 5; i++) {
            System.out.print(caracteristicas[i] + " ");
        }
        System.out.println("]");
        
        //imprimir los arreglos con sus respectivos equivalentes
        System.out.println("Equivalentes: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(dataStructs[i] + " :" + caracteristicas[i]);
        }
        
        //Instanciar un arreglo de tipo entero
        int random = (int) Math.floor(Math.random()*(3-20+1)+20);
        int[] ventas = new int[random];
        
        for (int i = 0; i < ventas.length; i++) {//Recorrer nuestro arreglo
            ventas[i] = (int) Math.floor(Math.random()*(1-1000+1)+1000);//Asignar el valor al arreglo
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + ventas[i]);//Imprimir el arreglo
        }
        int valorTotal = 0;//Instanciamos la valirable donde se almacenará la suma de nuestros elementos
        for (int i = 0; i < ventas.length; i++) {
          valorTotal += ventas[i];
        }
        int promedio = valorTotal / ventas.length; //Promedio de las ventas
        
    }
}
