package edu.escuelaing.arep.MeanStandardDev;
import java.util.*;
import java.lang.Math;

public class LinkedListArep
{
    //Variable que ayudaran con el control de la linked list
	private final ArrayList<Double> ListaEnl;
    private int size = 0;
    private int i = 0;

    //Constructor de la linked list, que gracias a que sera un arraylist todo se facilita
    public LinkedListArep() {
        ListaEnl = new ArrayList<Double>();
    }

    //Añadir un dato en la linked list
    public void add(Double dato) {
        size += 1;
        ListaEnl.add(dato);
    }

    //Eliminar el ultimmo dato en la linked list
    public void remove() {
        ListaEnl.remove(size - 1);
        size = -1;
    }

    //Pasar al siguiente nodo
    public Double nextNode() {
        i += 1;
        i = i % size;
        return ListaEnl.get(i);
    }

    //pasar al anterior nodo
    public Double priorNode() {
        i -= 1;
        i = i % size;
        return ListaEnl.get(i);
    }

    //retornar el tamaño de la linked list
    public int size() {
        return size;
    }

    //Calcular la media de la linked list
    public double Mean() {
        double suma = 0;
        for (int j = 0; j < size; j++) {
            suma += nextNode();
        }
        return suma / size;
    }

    //calcular la desviacion estandar de la linked list
    public double StandardDev() {
        final double mean = Mean();
        double suma = 0;
        for(int j=0; j<size; j++){
            suma += Math.pow(nextNode()-mean,2);
        }
        suma = suma/(size-1);
        return Math.sqrt(suma);
    }
}
