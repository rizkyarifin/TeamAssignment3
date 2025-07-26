package com.stackqueue;

/**
 * TUGAS ANGGOTA 1: Muhammad [Nama Anggota 1]
 * 
 * Implementasi Stack menggunakan Array
 * Bobot: Bagian dari 20% Case 1
 * 
 * TODO YANG HARUS DIKERJAKAN:
 * 1. Lengkapi implementasi method push(), pop(), peek(), isEmpty(), isFull()
 * 2. Tambahkan validasi untuk mencegah stack overflow dan underflow
 * 3. Test dengan memasukkan berbagai operator dan operand
 */
public class ArrayStack {
    private char[] stackArray;
    private int top;
    private int maxSize;
    
    public ArrayStack(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }
    
    public void push(char item) {
        if (isFull()) {
            System.out.println("Stack full tidak bisa menambah lagi");
        }
        top++;
        stackArray[top] = item;
        System.out.println("Berhasil menambahkan item ke stack");
    }
    
    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack masih kosong");
            return '\0';
        }

        char poppedItem = stackArray[top];
        top--;
        return poppedItem;
    }
    
    public char peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong tidak bisa peek");
            return '\0';
        }
        return stackArray[top];
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public boolean isFull() {
        return top == maxSize -1;
    }
    
    // Method untuk debugging - sudah selesai, tidak perlu diubah
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return;
        }
        System.out.print("Stack (bottom to top): ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}