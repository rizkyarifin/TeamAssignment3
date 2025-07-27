package com.stackqueue;

/**
 * TUGAS ANGGOTA 3: [Vinsensius I. Wuisan]
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
    
    
    public static String convertToPrefix(String infix) {
       String reversed = reverseString(infix);
        Stack<Character> operators = new Stack<>();
        Stack<String> operands = new Stack<>();

        for (int i = 0; i < reversed.length(); i++) {
            char c = reversed.charAt(i);

            if (Character.isWhitespace(c)) continue;

            if (Character.isDigit(c)) {
                StringBuilder number = new StringBuilder();
                while (i < reversed.length() && Character.isDigit(reversed.charAt(i))) {
                    number.insert(0, reversed.charAt(i));
                    i++;
                }
                i--;
                operands.push(number.toString());
            } else if (c == ')') {
                operators.push(c);
            } else if (c == '(') {
                while (!operators.isEmpty() && operators.peek() != ')') {
                    String op1 = operands.pop();
                    String op2 = operands.pop();
                    char op = operators.pop();
                    operands.push(op + op1 + op2);
                }
                if (!operators.isEmpty()) {
                    operators.pop();
                }
            } else if (isOperator(c)) {
                while (!operators.isEmpty() && getPrecedence(operators.peek()) > getPrecedence(c)) {
                    String op1 = operands.pop();
                    String op2 = operands.pop();
                    char op = operators.pop();
                    operands.push(op + op1 + op2);
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            String op1 = operands.pop();
            String op2 = operands.pop();
            char op = operators.pop();
            operands.push(op + op1 + op2);
        }

        return operands.peek();
    }

    // Main method untuk testing lokal
    public static void main(String[] args) {
        String infix = "5 + 4 / 2";
        String prefix = convertToPrefix(infix);
        System.out.println("Infix : " + infix);
        System.out.println("Prefix: " + prefix);
    }
}
    
    
    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString(); 
    }
    
   
    private static int getPrecedence(char operator) {
        switch (operator) {
        case '+':
        case '-': return 1;
        case '*':
        case '/': return 2;
        default: return -1;
        }
    }
    
    
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
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
