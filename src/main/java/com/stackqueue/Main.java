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
        System.out.println("Kelompok: [Nama Kelompok]");
        System.out.println("Anggota:");
        System.out.println("1. [Nama Anggota 1] - ArrayStack & Validation");
        System.out.println("2. [Nama Anggota 2] - LinkedListStack & Infix to Postfix");
        System.out.println("3. [Nama Anggota 3] - Infix to Prefix & Postfix Evaluation");
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
        // IMPLEMENTASI DISINI
        
        // Hint: 
        // 1. Tampilkan menu:
        //    - Case 1: Infix to Postfix/Prefix Calculator
        //    - Case 2: Queue Item Counter
        //    - Exit
        // 2. Baca input user
        // 3. Panggil method yang sesuai dengan pilihan
        // 4. Loop sampai user memilih exit
    }
    
    /**
     * TODO ANGGOTA 4: Implementasikan method handleCase1()
     * Method untuk menangani Case 1 (Stack - Infix/Postfix/Prefix)
     */
    private static void handleCase1() {
        // IMPLEMENTASI DISINI
        
        System.out.println("\n=== CASE 1: INFIX TO POSTFIX/PREFIX CALCULATOR ===");
        
        // Hint: Langkah-langkah yang harus dilakukan:
        // 1. Minta input notasi infix dari user
        // 2. Validasi input menggunakan InfixValidator.isValidInfix()
        // 3. Jika valid:
        //    - Konversi ke postfix menggunakan InfixToPostfix.convertToPostfix()
        //    - Konversi ke prefix menggunakan InfixToPrefix.convertToPrefix()
        //    - Evaluasi postfix menggunakan PostfixEvaluator.evaluatePostfix()
        //    - Evaluasi prefix menggunakan PrefixEvaluator.evaluatePrefix()
        //    - Tampilkan semua hasil
        // 4. Jika tidak valid, tampilkan pesan error
        
        System.out.print("Masukkan notasi infix: ");
        String infix = scanner.nextLine();
        
        // Lanjutkan implementasi disini...
    }
    
    /**
     * TODO ANGGOTA 4: Implementasikan method handleCase2()
     * Method untuk menangani Case 2 (Queue - Item Counter)
     */
    private static void handleCase2() {
        // IMPLEMENTASI DISINI
        
        System.out.println("\n=== CASE 2: QUEUE ITEM COUNTER ===");
        
        // Hint:
        // 1. Buat instance Queue
        // 2. Tampilkan menu untuk:
        //    - Add item to queue
        //    - Remove item from queue
        //    - Show queue size
        //    - Display queue contents
        //    - Back to main menu
        // 3. Handle setiap pilihan dengan memanggil method Queue yang sesuai
        
        // Lanjutkan implementasi disini...
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
        // IMPLEMENTASI DISINI
        
        // Hint: Format output yang rapi, contoh:
        // ================================
        // Input (Infix)    : 5 + 4 / 2
        // Postfix          : 5 4 2 / +
        // Prefix           : + 5 / 4 2
        // Postfix Result   : 7
        // Prefix Result    : 7
        // ================================
    }
}