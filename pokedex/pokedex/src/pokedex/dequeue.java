/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

/**
 *
 * @author alex
 */
public class dequeue {

    private node[] heap;
    private int heapSize;
    private final int capacity = 1000;

    public dequeue() {
        heap = new node[this.capacity + 1];
        heapSize = 0;
    }

    public void clear() {
        heap = new node[capacity + 1];
        heapSize = 0;
    }

    public boolean isEmpty() {
        return heapSize == 0;
    }

    public boolean isFull() {
        return heapSize == capacity - 1;
    }

    public int size() {
        return heapSize;
    }

    public void insert(int position, int tamaño) {
        node newJob = new node(position, tamaño);

        heap[++heapSize] = newJob;
        int pos = heapSize;
        while (pos != 1 && newJob.getPriority() > heap[pos / 2].getPriority()) {
            heap[pos] = heap[pos / 2];
            pos /= 2;
        }
        heap[pos] = newJob;
    }

    public node dequeue() {
        int parent, child;
        node first, last;
        if (isEmpty()) {
            System.out.println("Heap empty");
            return null;
        }

        first = heap[1];
        last = heap[heapSize--];

        parent = 1;
        child = 2;
        while (child <= heapSize) {
            if (child < heapSize && heap[child].getPriority() < heap[child + 1].getPriority()) {
                child++;
            }
            if (last.getPriority() >= heap[child].getPriority()) {
                break;
            }

            heap[parent] = heap[child];
            parent = child;
            child *= 2;
        }
        heap[parent] = last;
        return first;
    }

    public node get(int pos) {
        return heap[pos];
    }

    public int peek() {
        return heap[1].getPriority();
    }
}
