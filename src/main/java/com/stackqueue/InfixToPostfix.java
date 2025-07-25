package com.stackqueue;

/**
 * TUGAS ANGGOTA 2: Muhammad [Nama Anggota 2]
 * 
 * Konversi dari notasi Infix ke Postfix menggunakan Stack
 * Bobot: 10% dari total nilai
 * 
 * TODO YANG HARUS DIKERJAKAN:
 * 1. Implementasikan algorithm Shunting Yard untuk konversi infix ke postfix
 * 2. Gunakan ArrayStack atau LinkedListStack yang sudah dibuat
 * 3. Handle operator precedence: *, / lebih tinggi dari +, -
 * 
 * Contoh: "5 + 4 / 2" -> "5 4 2 / +"
 */
public class InfixToPostfix {
    
    /**
     * TODO ANGGOTA 2: Implementasikan method convertToPostfix()
     * Method utama untuk mengkonversi infix ke postfix
     * @param infix string notasi infix yang akan dikonversi
     * @return string notasi postfix hasil konversi
     */
    public static String convertToPostfix(String infix) {
        // IMPLEMENTASI DISINI
        
        // Hint: Algorithm Shunting Yard:
        // 1. Buat stack untuk operator dan StringBuilder untuk hasil
        // 2. Scan infix dari kiri ke kanan:
        //    - Jika operand (angka), tambahkan ke hasil
        //    - Jika operator:
        //      * Pop operator dari stack yang precedence-nya >= operator saat ini
        //      * Push operator saat ini ke stack
        // 3. Pop semua operator yang tersisa dari stack ke hasil
        
        return ""; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 2: Implementasikan method getPrecedence()
     * Method helper untuk mendapatkan precedence operator
     * @param operator karakter operator
     * @return nilai precedence (angka yang lebih besar = precedence lebih tinggi)
     */
    private static int getPrecedence(char operator) {
        // IMPLEMENTASI DISINI
        // Hint: 
        // *, / memiliki precedence 2
        // +, - memiliki precedence 1
        return 0; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 2: Implementasikan method isOperator()
     * Method helper untuk mengecek apakah karakter adalah operator
     * @param c karakter yang akan dicek
     * @return true jika karakter adalah operator (+, -, *, /), false jika tidak
     */
    private static boolean isOperator(char c) {
        // IMPLEMENTASI DISINI
        // Hint: Sama seperti di InfixValidator
        return false; // Ganti dengan implementasi yang benar
    }
    
    // Method untuk testing - sudah selesai, tidak perlu diubah
    public static void testConversion() {
        System.out.println("=== Testing Infix to Postfix Conversion ===");
        String[] testCases = {
            "5 + 4 / 2",
            "3 * 2 + 1",
            "2 + 3 * 4",
            "5 * 4 - 2 / 1"
        };
        
        for (String test : testCases) {
            System.out.println("Infix: " + test);
            System.out.println("Postfix: " + convertToPostfix(test));
            System.out.println();
        }
    }
}