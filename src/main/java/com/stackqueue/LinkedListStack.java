package com.stackqueue;

/**
 * TUGAS ANGGOTA 2: Muhammad [Nama Anggota 2]
 * 
 * Implementasi Stack menggunakan Linked List
 * Bobot: Bagian dari 10% Case 1
 * 
 * TODO YANG HARUS DIKERJAKAN:
 * 1. Buat inner class Node untuk menyimpan data dan pointer
 * 2. Implementasikan method push(), pop(), peek(), isEmpty()
 * 3. Test dengan memasukkan berbagai operator dan operand
 */
public class LinkedListStack {
    
    /**
     * TODO ANGGOTA 2: Buat inner class Node
     * Class untuk menyimpan data dan referensi ke node berikutnya
     */
    private class Node {
        // IMPLEMENTASI DISINI
        // Hint: Node harus memiliki:
        // - char data untuk menyimpan karakter
        // - Node next untuk referensi ke node berikutnya
        
        // Constructor untuk Node
        // public Node(char data) { ... }
    }
    
    private Node top; // Pointer ke node teratas
    
    // Constructor - sudah selesai, tidak perlu diubah
    public LinkedListStack() {
        this.top = null;
    }
    
    /**
     * TODO ANGGOTA 2: Implementasikan method push()
     * Method untuk menambahkan elemen ke stack
     * @param item karakter yang akan ditambahkan
     */
    public void push(char item) {
        // IMPLEMENTASI DISINI
        // Hint: 
        // 1. Buat node baru dengan data = item
        // 2. Set next dari node baru = top yang lama
        // 3. Update top menjadi node baru
    }
    
    /**
     * TODO ANGGOTA 2: Implementasikan method pop()
     * Method untuk mengambil dan menghapus elemen teratas dari stack
     * @return karakter teratas dari stack
     */
    public char pop() {
        // IMPLEMENTASI DISINI
        // Hint:
        // 1. Cek apakah stack kosong
        // 2. Simpan data dari top
        // 3. Update top menjadi top.next
        // 4. Return data yang disimpan
        return ' '; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 2: Implementasikan method peek()
     * Method untuk melihat elemen teratas tanpa menghapusnya
     * @return karakter teratas dari stack
     */
    public char peek() {
        // IMPLEMENTASI DISINI
        // Hint: Cek apakah stack kosong, jika tidak return top.data
        return ' '; // Ganti dengan implementasi yang benar
    }
    
    /**
     * TODO ANGGOTA 2: Implementasikan method isEmpty()
     * Method untuk mengecek apakah stack kosong
     * @return true jika stack kosong, false jika tidak
     */
    public boolean isEmpty() {
        // IMPLEMENTASI DISINI
        // Hint: Stack kosong jika top == null
        return false; // Ganti dengan implementasi yang benar
    }
    
    // Method untuk debugging - sudah selesai, tidak perlu diubah
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}