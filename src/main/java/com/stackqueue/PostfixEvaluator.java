package com.stackqueue;

/**
 * TUGAS ANGGOTA 3:  [Vinsensius I.Wuisan]
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

import java.util.Stack;

public class PostfixEvaluator {
    
    
    public static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            if (Character.isWhitespace(c)) continue;

            if (Character.isDigit(c)) {
                // Konversi char ke int
                stack.push(c - '0');
            } else if (isOperator(c)) {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;

                switch (c) {
                    case '+': result = a + b; break;
                    case '-': result = a - b; break;
                    case '*': result = a * b; break;
                    case '/': result = a / b; break;
                }

                stack.push(result);
            }
        }

        return stack.pop();
    }
    
    
    private static int performOperation(int op1, int op2, char operator) {
        switch (operator) {
        case '+': return op1 + op2;
        case '-': return op1 - op2;
        case '*': return op1 * op2;
        case '/': return op1 / op2;
        default: return 0;
        }
    }
    
    /**
     * TODO ANGGOTA 3: Implementasikan method isOperator()
     * Method helper untuk mengecek apakah karakter adalah operator
     * @param c karakter yang akan dicek
     * @return true jika karakter adalah operator (+, -, *, /), false jika tidak
     */
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    
    /**
     * TODO ANGGOTA 3: Implementasikan method isDigit()
     * Method helper untuk mengecek apakah karakter adalah angka
     * @param c karakter yang akan dicek
     * @return true jika karakter adalah angka (0-9), false jika tidak
     */
    private static boolean isDigit(char c) {
        return Character.isDigit(c);
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
