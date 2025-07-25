package com.stackqueue;

/**
 * TUGAS ANGGOTA 4: Muhammad [Nama Anggota 4]
 * 
 * Evaluasi ekspresi Prefix untuk mendapatkan hasil perhitungan
 * Bobot: Bagian dari 10% Case 1
 * 
 * TODO YANG HARUS DIKERJAKAN:
 * 1. Implementasikan algorithm evaluasi prefix menggunakan stack
 * 2. Scan dari kanan ke kiri (berbeda dengan postfix)
 * 3. Handle operasi aritmatika: +, -, *, /
 * 
 * Contoh: "+ 5 / 4 2" -> 5 + (4/2) = 7
 */
public class PrefixEvaluator {
    
    /**
     * TODO ANGGOTA 4: Implementasikan method evaluatePrefix()
     * Method utama untuk mengevaluasi ekspresi prefix
     * @param prefix string notasi prefix yang akan dievaluasi
     * @return hasil perhitungan dalam bentuk integer
     */
    public static int evaluatePrefix(String prefix) {
        // IMPLEMENTASI DISINI
        
        // Hint: Algorithm Evaluasi Prefix:
        // 1. Buat stack untuk menyimpan operand (gunakan Stack<Integer> atau array)
        // 2. Scan prefix dari KANAN ke KIRI:
        //    - Jika operand (angka), push ke stack
        //    - Jika operator:
        //      * Pop dua operand dari stack (op1 = pop(), op2 = pop())
        //      * Hitung hasil = op1 operator op2
        //      * Push hasil ke stack
        // 3. Hasil akhir adalah elemen terakhir di stack
        
        return 0; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 4: Implementasikan method performOperation()
     * Method helper untuk melakukan operasi aritmatika
     * @param op1 operand pertama
     * @param op2 operand kedua
     * @param operator operator yang akan digunakan
     * @return hasil operasi
     */
    private static int performOperation(int op1, int op2, char operator) {
        // IMPLEMENTASI DISINI
        // Hint: 
        // switch case untuk +, -, *, /
        // Sama seperti di PostfixEvaluator
        return 0; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 4: Implementasikan method isOperator()
     * Method helper untuk mengecek apakah karakter adalah operator
     * @param c karakter yang akan dicek
     * @return true jika karakter adalah operator (+, -, *, /), false jika tidak
     */
    private static boolean isOperator(char c) {
        // IMPLEMENTASI DISINI
        // Hint: Sama seperti di class lain
        return false; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 4: Implementasikan method isDigit()
     * Method helper untuk mengecek apakah karakter adalah angka
     * @param c karakter yang akan dicek
     * @return true jika karakter adalah angka (0-9), false jika tidak
     */
    private static boolean isDigit(char c) {
        // IMPLEMENTASI DISINI
        // Hint: Sama seperti di PostfixEvaluator
        return false; // Ganti dengan implementasi yang benar
    }
    
    // Method untuk testing - sudah selesai, tidak perlu diubah
    public static void testEvaluation() {
        System.out.println("=== Testing Prefix Evaluation ===");
        String[] testCases = {
            "+ 5 / 4 2",    // 5 + (4/2) = 7
            "+ * 3 2 1",    // (3*2) + 1 = 7
            "+ 2 * 3 4",    // 2 + (3*4) = 14
            "- * 5 4 / 2 1" // (5*4) - (2/1) = 18
        };
        
        for (String test : testCases) {
            System.out.println("Prefix: " + test);
            System.out.println("Result: " + evaluatePrefix(test));
            System.out.println();
        }
    }
}