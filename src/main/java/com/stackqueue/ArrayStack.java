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
    
    // Constructor - sudah selesai, tidak perlu diubah
    public ArrayStack(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }
    
    /**
     * TODO ANGGOTA 1: Implementasikan method push()
     * Method untuk menambahkan elemen ke stack
     * @param item karakter yang akan ditambahkan
     */
    public void push(char item) {
        // IMPLEMENTASI DISINI
        // Hint: Cek apakah stack sudah penuh, jika tidak tambahkan item dan increment top
    }
    
    /**
     * TODO ANGGOTA 1: Implementasikan method pop()
     * Method untuk mengambil dan menghapus elemen teratas dari stack
     * @return karakter teratas dari stack
     */
    public char pop() {
        // IMPLEMENTASI DISINI
        // Hint: Cek apakah stack kosong, jika tidak ambil item dan decrement top
        return ' '; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 1: Implementasikan method peek()
     * Method untuk melihat elemen teratas tanpa menghapusnya
     * @return karakter teratas dari stack
     */
    public char peek() {
        // IMPLEMENTASI DISINI
        // Hint: Return elemen di posisi top tanpa mengubah top
        return ' '; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 1: Implementasikan method isEmpty()
     * Method untuk mengecek apakah stack kosong
     * @return true jika stack kosong, false jika tidak
     */
    public boolean isEmpty() {
        // IMPLEMENTASI DISINI
        // Hint: Stack kosong jika top == -1
        return false; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 1: Implementasikan method isFull()
     * Method untuk mengecek apakah stack penuh
     * @return true jika stack penuh, false jika tidak
     */
    public boolean isFull() {
        // IMPLEMENTASI DISINI
        // Hint: Stack penuh jika top == maxSize - 1
        return false; // Ganti dengan implementasi yang benar
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