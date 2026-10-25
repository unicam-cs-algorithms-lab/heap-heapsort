/**
 * 
 */
package it.unicam.cs.asdl.esheap;

import java.util.List;

// TODO completare import 

/**
 * HeapSort in-place su una List con accesso indicizzato e set.
 * La parte iniziale e' un max-heap di dimensione heapSize; la parte finale
 * contiene gli elementi gia' collocati nella posizione definitiva.
 * La costruzione iniziale del max-heap è bottom-up e richiede O(n):
 * heapify può costare O(log n) alla radice, ma i molti nodi vicini alle
 * foglie hanno altezza piccola. La successiva fase di ordinamento richiede
 * O(n log n). Il conteggio dei confronti riguarda le chiamate a compareTo.
 * 
 * @author Template: Luca Tesei, Implementation: collettiva
 *
 * @param <E> tipo degli elementi, confrontabili secondo l’ordinamento naturale
 */
public class HeapSort<E extends Comparable<E>> implements SortingAlgorithm<E> {

    /**
     * Crea un algoritmo HeapSort privo di stato relativo alle sequenze da ordinare.
     * Ogni invocazione di {@link #sort(List)} opera sulla lista ricevuta.
     */
    public HeapSort() {
        // Nessuno stato da inizializzare: la sequenza è fornita a sort().
    }


    @Override
    public SortingAlgorithmResult<E> sort(List<E> l) {
        // TODO: costruire prima il max-heap bottom-up in O(n), applicando
        // heapify dall'ultimo nodo interno fino alla radice; poi eseguire
        // l'ordinamento in O(n log n). La costruzione bottom-up è lineare
        // perché la maggior parte dei nodi è vicina alle foglie.
        // Nota: usare una variante dei metodi della classe
        // MaxHeap in modo da implementare l'algoritmo utilizzando solo un array
        // (arraylist) e alcune variabili locali di appoggio (implementazione
        // cosiddetta "in loco" o "in place", si veda
        // https://it.wikipedia.org/wiki/Algoritmo_in_loco)
        return null;
    }

    @Override
    public String getName() {
        return "HeapSort";
    }

}
