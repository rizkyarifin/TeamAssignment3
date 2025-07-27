package com.stackqueue;

/**
 * TUGAS ANGGOTA 5: Meggi Kasandra
 * 
 * Implementasi Queue untuk menghitung jumlah item dalam antrian
 * Bobot: 35% dari total nilai
 * 
 * TODO YANG HARUS DIKERJAKAN:
 * 1. Implementasikan Queue menggunakan array atau linked list
 * 2. Buat method enqueue(), dequeue(), size(), isEmpty(), display()
 * 3. Buat program untuk mendemonstrasikan penggunaan queue
 * 4. Hitung dan tampilkan jumlah item dalam antrian
 */
public class SimpleQueue {
    private String[] queueArray;
    private int front;
    private int rear;
    private int maxSize;
    private int currentSize;
    
    /**
     * TODO ANGGOTA 5: Lengkapi constructor
     * Constructor untuk membuat queue dengan ukuran tertentu
     * @param size ukuran maksimum queue
     */
    public SimpleQueue(int size) {
        this.maxSize = size;
        this.queueArray = new String[maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method enqueue()
     * Method untuk menambahkan item ke queue
     * @param item string yang akan ditambahkan ke queue
     */
    public void enqueue(String item) {
        if (isFull()) {
            System.out.println("Queue penuh! Tidak bisa menambahkan item: " + item);
            return;
        }
        
        rear = (rear + 1) % maxSize; // Circular array
        queueArray[rear] = item;
        currentSize++;
        System.out.println("Item '" + item + "' berhasil ditambahkan ke queue");
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method dequeue()
     * Method untuk mengambil dan menghapus item dari queue
     * @return item yang diambil dari queue
     */
    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong! Tidak ada item untuk dihapus");
            return null;
        }
        
        String removedItem = queueArray[front];
        queueArray[front] = null; // Clear reference
        front = (front + 1) % maxSize; // Circular array
        currentSize--;
        return removedItem;
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method size()
     * Method untuk mendapatkan jumlah item dalam queue
     * @return jumlah item dalam queue
     */
    public int size() {
        return currentSize;
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method isEmpty()
     * Method untuk mengecek apakah queue kosong
     * @return true jika queue kosong, false jika tidak
     */
    public boolean isEmpty() {
        return currentSize == 0;
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method isFull()
     * Method untuk mengecek apakah queue penuh
     * @return true jika queue penuh, false jika tidak
     */
    public boolean isFull() {
        return currentSize == maxSize;
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method display()
     * Method untuk menampilkan isi queue
     */
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
            return;
        }
        
        System.out.print("Queue contents (front to rear): ");
        for (int i = 0; i < currentSize; i++) {
            int index = (front + i) % maxSize;
            System.out.print(queueArray[index]);
            if (i < currentSize - 1) {
                System.out.print(" <- ");
            }
        }
        System.out.println();
        System.out.println("Queue size: " + currentSize + "/" + maxSize);
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method peek()
     * Method untuk melihat item terdepan tanpa menghapusnya
     * @return item terdepan dalam queue
     */
    public String peek() {
        if (isEmpty()) {
            System.out.println("Queue kosong! Tidak ada item untuk dilihat");
            return null;
        }
        return queueArray[front];
    }
    
    // Method untuk testing - sudah selesai, tidak perlu diubah
    public static void demonstrateQueue() {
        System.out.println("=== DEMONSTRASI QUEUE ===");
        SimpleQueue queue = new SimpleQueue(5);
        
        // Test enqueue
        System.out.println("Menambahkan item ke queue:");
        queue.enqueue("Customer 1");
        queue.enqueue("Customer 2");
        queue.enqueue("Customer 3");
        
        System.out.println("Jumlah item dalam queue: " + queue.size());
        queue.display();
        
        // Test dequeue
        System.out.println("\nMenghapus item dari queue:");
        String removed = queue.dequeue();
        System.out.println("Item yang dihapus: " + removed);
        System.out.println("Jumlah item dalam queue: " + queue.size());
        queue.display();
        
        // Test peek
        System.out.println("\nItem terdepan: " + queue.peek());
        System.out.println("Jumlah item dalam queue: " + queue.size());
    }
}