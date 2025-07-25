package com.stackqueue;

/**
 * TUGAS ANGGOTA 1: Muhammad [Nama Anggota 1]
 * 
 * Validator untuk memvalidasi notasi infix
 * Bobot: 20% dari total nilai
 * 
 * TODO YANG HARUS DIKERJAKAN:
 * 1. Implementasikan method isValidInfix() untuk memvalidasi input
 * 2. Pastikan validasi mencakup:
 *    - Operator dan operand harus bergantian
 *    - Tidak boleh diawali atau diakhiri dengan operator
 *    - Kurung harus seimbang (jika ada)
 *    - Hanya boleh mengandung angka, operator (+, -, *, /), dan spasi
 * 
 * Contoh valid: "5 + 4 / 2", "3 * 2 + 1"
 * Contoh tidak valid: "5 + +", "+ 5", "5 +"
 */
public class InfixValidator {
    
    /**
     * TODO ANGGOTA 1: Implementasikan method isValidInfix()
     * Method untuk memvalidasi apakah string input adalah notasi infix yang valid
     * @param expression string ekspresi yang akan divalidasi
     * @return true jika valid, false jika tidak valid
     */
    public static boolean isValidInfix(String expression) {
        // IMPLEMENTASI DISINI
        
        // Hint: Langkah-langkah yang bisa dilakukan:
        // 1. Hapus semua spasi dari expression
        // 2. Cek apakah expression kosong
        // 3. Cek apakah dimulai atau diakhiri dengan operator
        // 4. Cek apakah operator dan operand bergantian dengan benar
        // 5. Cek apakah hanya mengandung karakter yang diizinkan
        
        return false; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 1: Implementasikan method isOperator()
     * Method helper untuk mengecek apakah karakter adalah operator
     * @param c karakter yang akan dicek
     * @return true jika karakter adalah operator (+, -, *, /), false jika tidak
     */
    private static boolean isOperator(char c) {
        // IMPLEMENTASI DISINI
        // Hint: Cek apakah c adalah salah satu dari: +, -, *, /
        return false; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 1: Implementasikan method isOperand()
     * Method helper untuk mengecek apakah karakter adalah operand (angka)
     * @param c karakter yang akan dicek
     * @return true jika karakter adalah angka (0-9), false jika tidak
     */
    private static boolean isOperand(char c) {
        // IMPLEMENTASI DISINI
        // Hint: Cek apakah c adalah digit (0-9)
        return false; // Ganti dengan implementasi yang benar
    }
    
    // Method untuk testing - sudah selesai, tidak perlu diubah
    public static void testValidation() {
        System.out.println("=== Testing Infix Validation ===");
        String[] testCases = {
            "5 + 4 / 2",    // Valid
            "3 * 2 + 1",    // Valid
            "5 + +",        // Invalid
            "+ 5",          // Invalid
            "5 +",          // Invalid
            "5 * 4 - 2 / 1" // Valid
        };
        
        for (String test : testCases) {
            System.out.println("'" + test + "' -> " + 
                (isValidInfix(test) ? "VALID" : "INVALID"));
        }
    }
}