package com.stackqueue;

/**
 * TUGAS ANGGOTA 5: Muhammad [Nama Anggota 5]
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
        // IMPLEMENTASI DISINI
        // Hint:
        // - Set maxSize = size
        // - Buat array dengan ukuran size
        // - Inisialisasi front = 0, rear = -1, currentSize = 0
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method enqueue()
     * Method untuk menambahkan item ke queue
     * @param item string yang akan ditambahkan ke queue
     */
    public void enqueue(String item) {
        // IMPLEMENTASI DISINI
        // Hint:
        // 1. Cek apakah queue sudah penuh
        // 2. Jika tidak penuh:
        //    - Increment rear (dengan handling circular array)
        //    - Masukkan item ke queueArray[rear]
        //    - Increment currentSize
        // 3. Jika penuh, tampilkan pesan error
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method dequeue()
     * Method untuk mengambil dan menghapus item dari queue
     * @return item yang diambil dari queue
     */
    public String dequeue() {
        // IMPLEMENTASI DISINI
        // Hint:
        // 1. Cek apakah queue kosong
        // 2. Jika tidak kosong:
        //    - Ambil item dari queueArray[front]
        //    - Increment front (dengan handling circular array)
        //    - Decrement currentSize
        //    - Return item
        // 3. Jika kosong, return null atau tampilkan pesan error
        return null; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method size()
     * Method untuk mendapatkan jumlah item dalam queue
     * @return jumlah item dalam queue
     */
    public int size() {
        // IMPLEMENTASI DISINI
        // Hint: Return currentSize
        return 0; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method isEmpty()
     * Method untuk mengecek apakah queue kosong
     * @return true jika queue kosong, false jika tidak
     */
    public boolean isEmpty() {
        // IMPLEMENTASI DISINI
        // Hint: Queue kosong jika currentSize == 0
        return false; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method isFull()
     * Method untuk mengecek apakah queue penuh
     * @return true jika queue penuh, false jika tidak
     */
    public boolean isFull() {
        // IMPLEMENTASI DISINI
        // Hint: Queue penuh jika currentSize == maxSize
        return false; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method display()
     * Method untuk menampilkan isi queue
     */
    public void display() {
        // IMPLEMENTASI DISINI
        // Hint:
        // 1. Cek apakah queue kosong
        // 2. Jika tidak kosong, tampilkan semua item dari front sampai rear
        // 3. Handle circular array dengan benar
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method peek()
     * Method untuk melihat item terdepan tanpa menghapusnya
     * @return item terdepan dalam queue
     */
    public String peek() {
        // IMPLEMENTASI DISINI
        // Hint: Return queueArray[front] jika queue tidak kosong
        return null; // Ganti dengan implementasi yang benar
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