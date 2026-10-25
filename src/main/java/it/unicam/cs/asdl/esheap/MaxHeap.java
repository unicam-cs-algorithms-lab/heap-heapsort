package it.unicam.cs.asdl.esheap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Implementazione di un max-heap binario mediante ArrayList.
 * La radice contiene un elemento massimo; elementi uguali sono ammessi.
 * Le operazioni di inserimento ed estrazione ripristinano la proprieta'
 * di heap risalendo o scendendo lungo un cammino dell'albero.
 * 
 * @author Template: Luca Tesei, Implementation: collettiva
 *
 * @param <E>
 *                il tipo degli elementi dello heap, che devono avere un
 *                ordinamento naturale.
 */
public class MaxHeap<E extends Comparable<E>> {

    /*
     * ArrayList usata come rappresentazione indicizzata dell'albero quasi completo. La radice ha indice 0, diversamente dalle slide teoriche con indice 1.
     */
    private ArrayList<E> heap;

    /**
     * Costruisce uno heap vuoto.
     */
    public MaxHeap() {
        this.heap = new ArrayList<E>();
    }

    /**
     * Restituisce il numero di elementi nello heap.
     * 
     * @return il numero di elementi nello heap
     */
    public int size() {
        return this.heap.size();
    }

    /**
     * Determina se lo heap è vuoto.
     * 
     * @return true se lo heap è vuoto.
     */
    public boolean isEmpty() {
        return this.heap.isEmpty();
    }

    /**
     * Costruisce un max-heap a partire dagli elementi di una lista.
     * <p>
     * La costruzione può avvenire in due modi: inserendo gli elementi uno alla
     * volta (costo O(n log n) nel caso peggiore), oppure copiandoli nella
     * rappresentazione e applicando heapify dal basso verso l'alto (costo O(n)).
     * Nel secondo caso quasi tutti i nodi sono vicini alle foglie, perciò
     * richiedono discese molto brevi: la somma dei costi è lineare.
     * <p>
     * In questa esercitazione si adotta la strategia degli inserimenti
     * successivi; la costruzione bottom-up compare nella prima fase di HeapSort.
     * Si veda il README per la spiegazione della complessità.
     *
     * 
     * @param list
     *                 lista di elementi
     * @throws NullPointerException
     *                                  se la lista è nulla
     */
    public MaxHeap(List<E> list) {
        // TODO: costruire lo heap tramite inserimenti successivi.
        // Ogni inserimento può costare O(log n): totale O(n log n).
        // La costruzione bottom-up O(n) sarà mostrata in HeapSort.
    }

    /**
     * Inserisce un elemento nello heap
     * 
     * @param el
     *               l'elemento da inserire
     * @throws NullPointerException
     *                                  se l'elemento è null
     * 
     */
    public void insert(E el) {
        // TODO implementare
    }

    /*
     * Funzione di comodo per calcolare l'indice del figlio sinistro del nodo in
     * posizione i. Si noti che la posizione 0 è significativa e contiene sempre
     * la radice dello heap.
     */
    private int leftIndex(int i) {
        // TODO implementare
        return -1;
    }

    /*
     * Funzione di comodo per calcolare l'indice del figlio destro del nodo in
     * posizione i. Si noti che la posizione 0 è significativa e contiene sempre
     * la radice dello heap.
     */
    private int rightIndex(int i) {
        // TODO implementare
        return -1;
    }

    /*
     * Funzione di comodo per calcolare l'indice del genitore del nodo in
     * posizione i. Si noti che la posizione 0 è significativa e contiene sempre
     * la radice dello heap.
     */
    private int parentIndex(int i) {
        // TODO implementare
        return -1;
    }

    /**
     * Ritorna l'elemento massimo senza toglierlo.
     * 
     * @return l'elemento massimo dello heap oppure null se lo heap è vuoto
     */
    public E getMax() {
        // TODO implementare
        return null;
    }

    /**
     * Estrae l'elemento massimo dallo heap. Dopo la chiamata tale elemento non
     * è più presente nello heap.
     * 
     * @return l'elemento massimo di questo heap oppure null se lo heap è vuoto
     */
    public E extractMax() {
        // TODO implementare
        return null;
    }

    /*
     * Ricostituisce uno heap a partire dal nodo in posizione i assumendo che i
     * suoi sottoalberi sinistro e destro (se esistono) siano heap.
     */
    private void heapify(int i) {
        // TODO implementare
    }
    
    /**
     * Accesso protetto alla rappresentazione interna per i test didattici. Non e' una copia: non modificarla dall'esterno, perche' si puo' violare l'invariante di heap.
     * 
     * @return la lista interna (riferimento condiviso)
     */
    protected ArrayList<E> getHeap() {
        return this.heap;
    }
}
