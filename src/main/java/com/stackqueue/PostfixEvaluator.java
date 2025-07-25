package com.stackqueue;

/**
 * TUGAS ANGGOTA 3: Muhammad [Nama Anggota 3]
 * 
 * Evaluasi ekspresi Postfix untuk mendapatkan hasil perhitungan
 * Bobot: 10% dari total nilai
 * 
 * TODO YANG HARUS DIKERJAKAN:
 * 1. Implementasikan algorithm evaluasi postfix menggunakan stack
 * 2. Gunakan stack untuk menyimpan operand (angka)
 * 3. Handle operasi aritmatika: +, -, *, /
 * 
 * Contoh: "5 4 2 / +" -> 5 + (4/2) = 7
 */
public class PostfixEvaluator {
    
    /**
     * TODO ANGGOTA 3: Implementasikan method evaluatePostfix()
     * Method utama untuk mengevaluasi ekspresi postfix
     * @param postfix string notasi postfix yang akan dievaluasi
     * @return hasil perhitungan dalam bentuk integer
     */
    public static int evaluatePostfix(String postfix) {
        // IMPLEMENTASI DISINI
        
        // Hint: Algorithm Evaluasi Postfix:
        // 1. Buat stack untuk menyimpan operand (gunakan Stack<Integer> atau array)
        // 2. Scan postfix dari kiri ke kanan:
        //    - Jika operand (angka), push ke stack
        //    - Jika operator:
        //      * Pop dua operand dari stack (op2 = pop(), op1 = pop())
        //      * Hitung hasil = op1 operator op2
        //      * Push hasil ke stack
        // 3. Hasil akhir adalah elemen terakhir di stack
        
        return 0; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 3: Implementasikan method performOperation()
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
        // Perhatikan urutan operand untuk - dan /
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
    
    /**
     * TODO ANGGOTA 3: Implementasikan method isDigit()
     * Method helper untuk mengecek apakah karakter adalah angka
     * @param c karakter yang akan dicek
     * @return true jika karakter adalah angka (0-9), false jika tidak
     */
    private static boolean isDigit(char c) {
        // IMPLEMENTASI DISINI
        // Hint: Cek apakah c >= '0' && c <= '9'
        return false; // Ganti dengan implementasi yang benar
    }
    
    // Method untuk testing - sudah selesai, tidak perlu diubah
    public static void testEvaluation() {
        System.out.println("=== Testing Postfix Evaluation ===");
        String[] testCases = {
            "5 4 2 / +",    // 5 + (4/2) = 7
            "3 2 * 1 +",    // (3*2) + 1 = 7
            "2 3 4 * +",    // 2 + (3*4) = 14
            "5 4 * 2 1 / -" // (5*4) - (2/1) = 18
        };
        
        for (String test : testCases) {
            System.out.println("Postfix: " + test);
            System.out.println("Result: " + evaluatePostfix(test));
            System.out.println();
        }
    }
}