package com.stackqueue;

import java.util.Scanner;

/**
 * TUGAS ANGGOTA 5: Muhammad [Nama Anggota 5]
 * 
 * Program demo untuk menghitung jumlah item dalam antrian
 * Bobot: 35% dari total nilai (Case 2)
 * 
 * TODO YANG HARUS DIKERJAKAN:
 * 1. Buat program interaktif untuk menggunakan queue
 * 2. Menu untuk add, remove, count, display queue
 * 3. Demonstrasikan penggunaan queue dengan berbagai operasi
 * 4. Tampilkan jumlah item dalam antrian secara real-time
 */
public class QueueDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static SimpleQueue queue = new SimpleQueue(10); // Queue dengan kapasitas 10
    
    /**
     * TODO ANGGOTA 5: Implementasikan method main()
     * Method utama untuk menjalankan demo queue
     */
    public static void main(String[] args) {
        // IMPLEMENTASI DISINI
        System.out.println("=== QUEUE ITEM COUNTER DEMO ===");
        System.out.println("Dibuat oleh: [Nama Anggota 5]");
        System.out.println();
        
        // Panggil showQueueMenu()
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method showQueueMenu()
     * Method untuk menampilkan menu queue dan handle pilihan user
     */
    private static void showQueueMenu() {
        // IMPLEMENTASI DISINI
        
        // Hint: Buat loop menu dengan pilihan:
        // 1. Add item to queue (Enqueue)
        // 2. Remove item from queue (Dequeue)
        // 3. Show queue size (Count items)
        // 4. Display queue contents
        // 5. Peek front item
        // 6. Back to main menu / Exit
        
        // Setiap kali operasi dilakukan, tampilkan jumlah item saat ini
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method addItemToQueue()
     * Method untuk menambahkan item ke queue
     */
    private static void addItemToQueue() {
        // IMPLEMENTASI DISINI
        
        // Hint:
        // 1. Minta input dari user (nama customer, item, dll)
        // 2. Panggil queue.enqueue()
        // 3. Tampilkan konfirmasi dan jumlah item saat ini
        
        System.out.print("Masukkan nama item/customer: ");
        // Lanjutkan implementasi...
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method removeItemFromQueue()
     * Method untuk menghapus item dari queue
     */
    private static void removeItemFromQueue() {
        // IMPLEMENTASI DISINI
        
        // Hint:
        // 1. Cek apakah queue kosong
        // 2. Jika tidak kosong, panggil queue.dequeue()
        // 3. Tampilkan item yang dihapus dan jumlah item saat ini
        // 4. Jika kosong, tampilkan pesan error
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method showQueueSize()
     * Method untuk menampilkan jumlah item dalam queue
     */
    private static void showQueueSize() {
        // IMPLEMENTASI DISINI
        
        // Hint:
        // 1. Panggil queue.size()
        // 2. Tampilkan jumlah item dengan format yang rapi
        // 3. Tampilkan juga informasi apakah queue kosong/penuh
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method displayQueueContents()
     * Method untuk menampilkan semua isi queue
     */
    private static void displayQueueContents() {
        // IMPLEMENTASI DISINI
        
        // Hint:
        // 1. Panggil queue.display()
        // 2. Tampilkan jumlah item total
        // 3. Tampilkan item terdepan jika ada
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method showQueueInfo()
     * Method untuk menampilkan informasi lengkap queue
     */
    private static void showQueueInfo() {
        // IMPLEMENTASI DISINI
        
        // Hint: Tampilkan informasi seperti:
        // - Jumlah item dalam queue
        // - Apakah queue kosong/penuh
        // - Item terdepan (jika ada)
        // - Kapasitas maksimum queue
        
        System.out.println("\n=== INFORMASI QUEUE ===");
        System.out.println("Jumlah item: " + queue.size());
        // Lanjutkan implementasi...
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method simulateQueueOperations()
     * Method untuk simulasi otomatis operasi queue (bonus)
     */
    private static void simulateQueueOperations() {
        // IMPLEMENTASI DISINI (OPSIONAL)
        
        // Hint: Buat simulasi otomatis:
        // 1. Add beberapa customer
        // 2. Remove beberapa customer
        // 3. Tampilkan perubahan jumlah item secara real-time
        
        System.out.println("\n=== SIMULASI OTOMATIS ===");
        String[] customers = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
        
        // Lanjutkan implementasi simulasi...
    }
}