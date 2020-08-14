package edu.escuelaing.arep.MeanStandardDev;
import java.util.*;
import java.lang.Math;

public class LinkedListArep
{
	private final ArrayList<Double> ListaEnl;
    private int size = 0;
    private int i = 0;

    public LinkedListArep() {
        ListaEnl = new ArrayList<Double>();
    }

    public void add(final Double dato) {
        size += 1;
        ListaEnl.add(dato);
    }

    public void remove() {
        ListaEnl.remove(size - 1);
        size = -1;
    }

    public Double nextNode() {
        i += 1;
        i = i % size;
        return ListaEnl.get(i);
    }

    public Double priorNode() {
        i -= 1;
        i = i % size;
        return ListaEnl.get(i);
    }

    public int size() {
        return size;
    }

    public double Mean() {
        double suma = 0;
        for (int j = 0; j < size; j++) {
            suma += nextNode();
        }
        return suma / size;
    }

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
