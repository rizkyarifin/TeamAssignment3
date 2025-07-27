package com.stackqueue;

import java.util.Scanner;

/**
 * TUGAS ANGGOTA 4: Muhammad [Nama Anggota 4]
 * 
 * Program utama dengan User Interface sederhana
 * Bobot: 25% dari total nilai
 * 
 * TODO YANG HARUS DIKERJAKAN:
 * 1. Buat menu utama untuk memilih Case 1 atau Case 2
 * 2. Integrasikan semua class yang sudah dibuat anggota lain
 * 3. Tampilkan hasil dengan format yang rapi
 * 4. Handle input validation dan error handling
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("=== PROGRAM STACK & QUEUE ===");
        System.out.println("Kelompok: Team Assignment 3");
        System.out.println("Anggota:");
        System.out.println("1. Tofik Hidayat - ArrayStack & Validation");
        System.out.println("2. Dwi Rizky Fitriana - LinkedListStack & Infix to Postfix");
        System.out.println("3. Vincent - Infix to Prefix & Postfix Evaluation");
        System.out.println("4. [Nama Anggota 4] - Prefix Evaluation & Main Program");
        System.out.println("5. [Nama Anggota 5] - Queue Implementation");
        System.out.println();
        
        /**
         * TODO ANGGOTA 4: Implementasikan method showMainMenu()
         */
        showMainMenu();
    }
    
    /**
     * TODO ANGGOTA 4: Implementasikan method showMainMenu()
     * Method untuk menampilkan menu utama dan handle pilihan user
     */
    private static void showMainMenu() {
        boolean running = true;
        
        while (running) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Case 1: Infix to Postfix/Prefix Calculator");
            System.out.println("2. Case 2: Queue Item Counter");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                
                switch (choice) {
                    case 1:
                        handleCase1();
                        break;
                    case 2:
                        handleCase2();
                        break;
                    case 3:
                        running = false;
                        System.out.println("\nTerima kasih telah menggunakan program ini!");
                        break;
                    default:
                        System.out.println("\nPilihan tidak valid! Silakan pilih 1-3.");
                }
            } catch (Exception e) {
                System.out.println("\nInput tidak valid! Silakan masukkan angka.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }
    
    /**
     * TODO ANGGOTA 4: Implementasikan method handleCase1()
     * Method untuk menangani Case 1 (Stack - Infix/Postfix/Prefix)
     */
    private static void handleCase1() {
        System.out.println("\n=== CASE 1: INFIX TO POSTFIX/PREFIX CALCULATOR ===");
        System.out.println("Format: Gunakan spasi antar operand dan operator");
        System.out.println("Contoh: 5 + 4 / 2");
        System.out.print("\nMasukkan notasi infix: ");
        String infix = scanner.nextLine();
        
        // Validasi input
        if (InfixValidator.isValidInfix(infix)) {
            try {
                // Konversi ke postfix dan prefix
                String postfix = InfixToPostfix.convertToPostfix(infix);
                String prefix = InfixToPrefix.convertToPrefix(infix);
                
                // Evaluasi hasil
                int postfixResult = PostfixEvaluator.evaluatePostfix(postfix);
                int prefixResult = PrefixEvaluator.evaluatePrefix(prefix);
                
                // Tampilkan hasil
                displayResults(infix, postfix, prefix, postfixResult, prefixResult);
                
            } catch (Exception e) {
                System.out.println("\nError: " + e.getMessage());
            }
        } else {
            System.out.println("\nError: Notasi infix tidak valid!");
            System.out.println("Pastikan:");
            System.out.println("- Operator dan operand bergantian");
            System.out.println("- Tidak diawali atau diakhiri dengan operator");
            System.out.println("- Hanya menggunakan angka dan operator (+, -, *, /)");
            System.out.println("- Kurung (jika ada) harus seimbang");
        }
    }
    
    /**
     * TODO ANGGOTA 4: Implementasikan method handleCase2()
     * Method untuk menangani Case 2 (Queue - Item Counter)
     */
    private static void handleCase2() {
        System.out.println("\n=== CASE 2: QUEUE ITEM COUNTER ===");
        
        SimpleQueue queue = new SimpleQueue(10); // Kapasitas maksimal 10
        boolean running = true;
        
        while (running) {
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Add item to queue");
            System.out.println("2. Remove item from queue");
            System.out.println("3. Show queue size");
            System.out.println("4. Display queue contents");
            System.out.println("5. Back to main menu");
            System.out.print("Pilih menu (1-5): ");
            
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                
                switch (choice) {
                    case 1:
                        System.out.print("Masukkan item: ");
                        String item = scanner.nextLine();
                        queue.enqueue(item);
                        break;
                    case 2:
                        String removed = queue.dequeue();
                        if (removed != null) {
                            System.out.println("Item '" + removed + "' telah dihapus dari queue");
                        }
                        break;
                    case 3:
                        System.out.println("Ukuran queue saat ini: " + queue.size());
                        break;
                    case 4:
                        queue.display();
                        break;
                    case 5:
                        running = false;
                        break;
                    default:
                        System.out.println("\nPilihan tidak valid! Silakan pilih 1-5.");
                }
            } catch (Exception e) {
                System.out.println("\nInput tidak valid!");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }
    
    /**
     * TODO ANGGOTA 4: Implementasikan method displayResults()
     * Method helper untuk menampilkan hasil dengan format yang rapi
     * @param infix notasi infix input
     * @param postfix hasil konversi postfix
     * @param prefix hasil konversi prefix
     * @param postfixResult hasil evaluasi postfix
     * @param prefixResult hasil evaluasi prefix
     */
    private static void displayResults(String infix, String postfix, String prefix, 
                                     int postfixResult, int prefixResult) {
        System.out.println("\n================================");
        System.out.println("HASIL KONVERSI DAN EVALUASI");
        System.out.println("================================");
        System.out.println("Input (Infix)    : " + infix);
        System.out.println("Postfix          : " + postfix);
        System.out.println("Prefix           : " + prefix);
        System.out.println("--------------------------------");
        System.out.println("Postfix Result   : " + postfixResult);
        System.out.println("Prefix Result    : " + prefixResult);
        System.out.println("================================");
        
        if (postfixResult == prefixResult) {
            System.out.println("✓ Hasil evaluasi konsisten!");
        } else {
            System.out.println("✗ Warning: Hasil evaluasi tidak konsisten!");
        }
    }
}