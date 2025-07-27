package com.stackqueue;

import java.util.Scanner;

/**
 * TUGAS ANGGOTA 5: Meggi Kasandra
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
        System.out.println("=== QUEUE ITEM COUNTER DEMO ===");
        System.out.println("Dibuat oleh: Meggi Kasandra");
        System.out.println("Demonstrasi penggunaan Queue untuk menghitung item dalam antrian");
        System.out.println();
        
        showQueueMenu();
        
        System.out.println("\nTerima kasih telah menggunakan Queue Demo!");
        scanner.close();
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method showQueueMenu()
     * Method untuk menampilkan menu queue dan handle pilihan user
     */
    private static void showQueueMenu() {
        boolean running = true;
        
        while (running) {
            System.out.println("\n=== QUEUE OPERATIONS MENU ===");
            System.out.println("Current queue size: " + queue.size() + "/" + 10);
            System.out.println("1. Add item to queue (Enqueue)");
            System.out.println("2. Remove item from queue (Dequeue)");
            System.out.println("3. Show queue size");
            System.out.println("4. Display queue contents");
            System.out.println("5. Peek front item");
            System.out.println("6. Show queue info");
            System.out.println("7. Run simulation");
            System.out.println("8. Exit");
            System.out.print("Pilih menu (1-8): ");
            
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                
                switch (choice) {
                    case 1:
                        addItemToQueue();
                        break;
                    case 2:
                        removeItemFromQueue();
                        break;
                    case 3:
                        showQueueSize();
                        break;
                    case 4:
                        displayQueueContents();
                        break;
                    case 5:
                        showFrontItem();
                        break;
                    case 6:
                        showQueueInfo();
                        break;
                    case 7:
                        simulateQueueOperations();
                        break;
                    case 8:
                        running = false;
                        break;
                    default:
                        System.out.println("\nPilihan tidak valid! Silakan pilih 1-8.");
                }
            } catch (Exception e) {
                System.out.println("\nInput tidak valid! Silakan masukkan angka.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method addItemToQueue()
     * Method untuk menambahkan item ke queue
     */
    private static void addItemToQueue() {
        System.out.println("\n=== ADD ITEM TO QUEUE ===");
        
        if (queue.isFull()) {
            System.out.println("Queue sudah penuh! Tidak bisa menambahkan item baru.");
            return;
        }
        
        System.out.print("Masukkan nama item/customer: ");
        String item = scanner.nextLine();
        
        if (item.trim().isEmpty()) {
            System.out.println("Nama item tidak boleh kosong!");
            return;
        }
        
        queue.enqueue(item.trim());
        System.out.println("Jumlah item sekarang: " + queue.size());
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method removeItemFromQueue()
     * Method untuk menghapus item dari queue
     */
    private static void removeItemFromQueue() {
        System.out.println("\n=== REMOVE ITEM FROM QUEUE ===");
        
        if (queue.isEmpty()) {
            System.out.println("Queue kosong! Tidak ada item untuk dihapus.");
            return;
        }
        
        String removedItem = queue.dequeue();
        System.out.println("Item '" + removedItem + "' telah dihapus dari queue");
        System.out.println("Jumlah item sekarang: " + queue.size());
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method showQueueSize()
     * Method untuk menampilkan jumlah item dalam queue
     */
    private static void showQueueSize() {
        System.out.println("\n=== QUEUE SIZE INFO ===");
        int size = queue.size();
        System.out.println("Jumlah item dalam queue: " + size);
        System.out.println("Kapasitas maksimum: 10");
        System.out.println("Sisa kapasitas: " + (10 - size));
        
        if (queue.isEmpty()) {
            System.out.println("Status: Queue KOSONG");
        } else if (queue.isFull()) {
            System.out.println("Status: Queue PENUH");
        } else {
            System.out.println("Status: Queue memiliki " + size + " item");
        }
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method displayQueueContents()
     * Method untuk menampilkan semua isi queue
     */
    private static void displayQueueContents() {
        System.out.println("\n=== QUEUE CONTENTS ===");
        queue.display();
        
        if (!queue.isEmpty()) {
            System.out.println("Item terdepan: " + queue.peek());
        }
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method showQueueInfo()
     * Method untuk menampilkan informasi lengkap queue
     */
    private static void showQueueInfo() {
        System.out.println("\n=== INFORMASI QUEUE ===");
        System.out.println("Jumlah item: " + queue.size());
        System.out.println("Kapasitas maksimum: 10");
        System.out.println("Sisa kapasitas: " + (10 - queue.size()));
        
        if (queue.isEmpty()) {
            System.out.println("Status: KOSONG");
            System.out.println("Item terdepan: -");
        } else if (queue.isFull()) {
            System.out.println("Status: PENUH");
            System.out.println("Item terdepan: " + queue.peek());
        } else {
            System.out.println("Status: TERISI SEBAGIAN");
            System.out.println("Item terdepan: " + queue.peek());
        }
        
        System.out.println("\nImplementasi: Circular Array");
        System.out.println("FIFO (First In, First Out) principle");
    }
    
    /**
     * TODO ANGGOTA 5: Implementasikan method simulateQueueOperations()
     * Method untuk simulasi otomatis operasi queue (bonus)
     */
    private static void simulateQueueOperations() {
        System.out.println("\n=== SIMULASI OTOMATIS ===");
        System.out.println("Menjalankan simulasi operasi queue...");
        
        String[] customers = {"Alice", "Bob", "Charlie", "Diana", "Eve", "Frank", "Grace"};
        
        // Simulasi penambahan customer
        System.out.println("\n1. Menambahkan customers ke queue:");
        for (int i = 0; i < 5 && i < customers.length; i++) {
            queue.enqueue("Customer " + customers[i]);
            System.out.println("   Queue size: " + queue.size());
            try {
                Thread.sleep(500); // Delay untuk efek demonstrasi
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        
        System.out.println("\n2. Status queue setelah penambahan:");
        queue.display();
        
        // Simulasi pelayanan customer
        System.out.println("\n3. Melayani customers (dequeue):");
        for (int i = 0; i < 3; i++) {
            if (!queue.isEmpty()) {
                String served = queue.dequeue();
                System.out.println("   Melayani: " + served + " (Queue size: " + queue.size() + ")");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        
        System.out.println("\n4. Status queue setelah pelayanan:");
        queue.display();
        
        System.out.println("\n5. Menambahkan customer baru:");
        for (int i = 5; i < customers.length; i++) {
            queue.enqueue("Customer " + customers[i]);
            System.out.println("   Queue size: " + queue.size());
        }
        
        System.out.println("\n6. Status final queue:");
        queue.display();
        
        System.out.println("\nSimulasi selesai!");
    }
    
    /**
     * Method helper untuk menampilkan item terdepan
     */
    private static void showFrontItem() {
        System.out.println("\n=== FRONT ITEM ===");
        if (queue.isEmpty()) {
            System.out.println("Queue kosong! Tidak ada item terdepan.");
        } else {
            System.out.println("Item terdepan: " + queue.peek());
            System.out.println("Item ini akan keluar pertama saat dequeue.");
        }
    }
}