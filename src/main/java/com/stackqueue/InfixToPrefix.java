package com.stackqueue;

/**
 * TUGAS ANGGOTA 3: Muhammad [Nama Anggota 3]
 * 
 * Konversi dari notasi Infix ke Prefix menggunakan Stack
 * Bobot: Bagian dari 10% Case 1
 * 
 * TODO YANG HARUS DIKERJAKAN:
 * 1. Implementasikan algorithm untuk konversi infix ke prefix
 * 2. Gunakan ArrayStack atau LinkedListStack yang sudah dibuat
 * 3. Handle operator precedence yang sama seperti postfix
 * 
 * Contoh: "5 + 4 / 2" -> "+ 5 / 4 2"
 */
public class InfixToPrefix {
    
    /**
     * TODO ANGGOTA 3: Implementasikan method convertToPrefix()
     * Method utama untuk mengkonversi infix ke prefix
     * @param infix string notasi infix yang akan dikonversi
     * @return string notasi prefix hasil konversi
     */
    public static String convertToPrefix(String infix) {
        // IMPLEMENTASI DISINI
        
        // Hint: Algorithm untuk Infix ke Prefix:
        // 1. Reverse string infix
        // 2. Ganti '(' menjadi ')' dan sebaliknya (jika ada kurung)
        // 3. Gunakan modified Shunting Yard algorithm:
        //    - Sama seperti postfix tapi dengan aturan precedence yang sedikit berbeda
        // 4. Reverse hasil akhir
        
        return ""; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 3: Implementasikan method reverseString()
     * Method helper untuk membalik string
     * @param str string yang akan dibalik
     * @return string yang sudah dibalik
     */
    private static String reverseString(String str) {
        // IMPLEMENTASI DISINI
        // Hint: Gunakan StringBuilder dan method reverse(), atau loop manual
        return ""; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 3: Implementasikan method getPrecedence()
     * Method helper untuk mendapatkan precedence operator
     * @param operator karakter operator
     * @return nilai precedence (angka yang lebih besar = precedence lebih tinggi)
     */
    private static int getPrecedence(char operator) {
        // IMPLEMENTASI DISINI
        // Hint: Sama seperti di InfixToPostfix
        // *, / memiliki precedence 2
        // +, - memiliki precedence 1
        return 0; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 3: Implementasikan method isOperator()
     * Method helper untuk mengecek apakah karakter adalah operator
     * @param c karakter yang akan dicek
     * @return true jika karakter adalah operator (+, -, *, /), false jika tidak
     */
    private static boolean isOperator(char c) {
        // IMPLEMENTASI DISINI
        // Hint: Sama seperti di class lain
        return false; // Ganti dengan implementasi yang benar
    }
    
    // Method untuk testing - sudah selesai, tidak perlu diubah
    public static void testConversion() {
        System.out.println("=== Testing Infix to Prefix Conversion ===");
        String[] testCases = {
            "5 + 4 / 2",
            "3 * 2 + 1",
            "2 + 3 * 4",
            "5 * 4 - 2 / 1"
        };
        
        for (String test : testCases) {
            System.out.println("Infix: " + test);
            System.out.println("Prefix: " + convertToPrefix(test));
            System.out.println();
        }
    }
}