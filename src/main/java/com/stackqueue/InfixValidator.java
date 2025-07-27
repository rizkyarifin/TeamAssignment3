package com.stackqueue;

/**
 * TUGAS ANGGOTA 1: Tofik Hidayat
 * 
 * Validator untuk memvalidasi notasi infix
 * Bobot: 20% dari total nilai
 */
public class InfixValidator {

    /**
     * Method untuk memvalidasi apakah string input adalah notasi infix yang valid
     */
    public static boolean isValidInfix(String expression) {
        if (expression == null || expression.trim().isEmpty()) {
            return false;
        }

        String[] tokens = expression.trim().split(" ");
        int balance = 0;
        boolean expectOperand = true;

        for (String token : tokens) {
            if (token.equals("(")) {
                balance++;
                continue;
            } else if (token.equals(")")) {
                balance--;
                if (balance < 0) return false;
                continue;
            }

            char c = token.charAt(0);
            if (token.length() > 1 && !token.matches("\\d+")) {
                return false;
            }

            if (isOperand(c)) {
                if (!expectOperand) return false;
                expectOperand = false;
            } else if (isOperator(c)) {
                if (expectOperand) return false;
                expectOperand = true;
            } else {
                return false;
            }
        }
        return !expectOperand && balance == 0;
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static boolean isOperand(char c) {
        return Character.isDigit(c);
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
            "5 * 4 - 2 / 1",// Valid
            "5 4 +",        // Invalid
            "( 5 + 3 ) * 2",// Valid
            "( ( 2 + 3 )",  // Invalid - unbalanced
            "2 + 3 )",      // Invalid - unbalanced
            "a + b"         // Invalid - karakter tidak valid
        };

        for (String test : testCases) {
            System.out.println("'" + test + "' -> " +
                (isValidInfix(test) ? "VALID" : "INVALID"));
        }
    }
}
