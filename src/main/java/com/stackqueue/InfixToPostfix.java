package com.stackqueue;

/**
 * TUGAS ANGGOTA 2: Dwi Rizky Fitriana
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
     * Method utama untuk mengkonversi infix ke postfix
     * @param infix string notasi infix yang akan dikonversi
     * @return string notasi postfix hasil konversi
     */
    public static String convertToPostfix(String infix) {
        com.stackqueue.LinkedListStack stack = new com.stackqueue.LinkedListStack();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);


            if (ch == ' ') continue; // Skip Spasi

            if (Character.isDigit(ch)) {
                output.append(ch);
                if (i + 1 >= infix.length() || !Character.isDigit(infix.charAt(i + 1))) {
                    output.append(' ');
                }
            } else if (isOperator(ch)) {
                while (!stack.isEmpty() && isOperator(stack.peek()) && getPrecedence(stack.peek()) >= getPrecedence(ch)) {
                    output.append(stack.pop()).append(' ');
                }
                stack.push(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop()).append(' ');
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
            }
        }

        while (!stack.isEmpty()) {
            char op = stack.pop();
            if (op == '(' || op == ')') continue;
            output.append(op).append(' ');
        }

        return output.toString().trim();
    }
    
    /**
     * Method helper untuk mendapatkan precedence operator
     * @param operator karakter operator
     * @return nilai precedence (angka yang lebih besar = precedence lebih tinggi)
     */
    private static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
                case '-':
                    return 1;
                    case '*':
                        case '/':
                            return 2;
            default:
                    return 0;
        }
    }
    
    /**
     * Method helper untuk mengecek apakah karakter adalah operator
     * @param c karakter yang akan dicek
     * @return true jika karakter adalah operator (+, -, *, /), false jika tidak
     */
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
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