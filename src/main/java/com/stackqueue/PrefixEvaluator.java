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
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        String[] tokens = prefix.trim().split(" ");
        
        // Scan dari kanan ke kiri
        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];
            
            if (token.isEmpty()) continue;
            
            char firstChar = token.charAt(0);
            
            // Jika operand (angka atau angka negatif)
            if (Character.isDigit(firstChar) || (token.length() > 1 && firstChar == '-')) {
                stack.push(Integer.parseInt(token));
            }
            // Jika operator
            else if (isOperator(firstChar) && token.length() == 1) {
                if (stack.size() < 2) {
                    throw new RuntimeException("Invalid prefix expression");
                }
                int op1 = stack.pop();
                int op2 = stack.pop();
                int result = performOperation(op1, op2, firstChar);
                stack.push(result);
            }
        }
        
        if (stack.size() != 1) {
            throw new RuntimeException("Invalid prefix expression");
        }
        
        return stack.pop();
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
        switch (operator) {
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
            case '*':
                return op1 * op2;
            case '/':
                if (op2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return op1 / op2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    
    /**
     * TODO ANGGOTA 4: Implementasikan method isOperator()
     * Method helper untuk mengecek apakah karakter adalah operator
     * @param c karakter yang akan dicek
     * @return true jika karakter adalah operator (+, -, *, /), false jika tidak
     */
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    
    /**
     * TODO ANGGOTA 4: Implementasikan method isDigit()
     * Method helper untuk mengecek apakah karakter adalah angka
     * @param c karakter yang akan dicek
     * @return true jika karakter adalah angka (0-9), false jika tidak
     */
    private static boolean isDigit(char c) {
        return Character.isDigit(c);
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