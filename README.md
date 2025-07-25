# Team Assignment 3: Stack & Queue Implementation

## Deskripsi Tugas
Program implementasi Stack dan Queue dalam Java untuk menyelesaikan dua case study utama:
1. **Case 1**: Konversi dan evaluasi notasi Infix, Postfix, dan Prefix menggunakan Stack
2. **Case 2**: Program penghitung item dalam antrian menggunakan Queue

## Struktur Project
```
src/main/java/com/stackqueue/
├── ArrayStack.java          # Anggota 1
├── InfixValidator.java      # Anggota 1
├── LinkedListStack.java     # Anggota 2
├── InfixToPostfix.java      # Anggota 2
├── InfixToPrefix.java       # Anggota 3
├── PostfixEvaluator.java    # Anggota 3
├── PrefixEvaluator.java     # Anggota 4
├── Main.java                # Anggota 4
├── SimpleQueue.java         # Anggota 5
└── QueueDemo.java           # Anggota 5
```

## Pembagian Tugas Tim

### **Anggota 1: [Nama Anggota 1]**
**Bobot: 20%**
- **File**: `ArrayStack.java`, `InfixValidator.java`
- **Tugas**:
  - Implementasi Stack menggunakan Array
  - Validasi input notasi infix
  - Method: `push()`, `pop()`, `peek()`, `isEmpty()`, `isFull()`
  - Validasi: operator/operand bergantian, tidak diawali/diakhiri operator

### **Anggota 2: [Nama Anggota 2]**
**Bobot: 10%**
- **File**: `LinkedListStack.java`, `InfixToPostfix.java`
- **Tugas**:
  - Implementasi Stack menggunakan Linked List
  - Konversi Infix ke Postfix menggunakan Shunting Yard Algorithm
  - Handle operator precedence (*, / > +, -)

### **Anggota 3: [Nama Anggota 3]**
**Bobot: 10%**
- **File**: `InfixToPrefix.java`, `PostfixEvaluator.java`
- **Tugas**:
  - Konversi Infix ke Prefix
  - Evaluasi ekspresi Postfix untuk mendapatkan hasil perhitungan
  - Handle operasi aritmatika: +, -, *, /

### **Anggota 4: [Nama Anggota 4]**
**Bobot: 25%**
- **File**: `PrefixEvaluator.java`, `Main.java`
- **Tugas**:
  - Evaluasi ekspresi Prefix
  - Program utama dengan User Interface
  - Integrasi semua komponen
  - Tampilan hasil yang rapi

### **Anggota 5: [Nama Anggota 5]**
**Bobot: 35%**
- **File**: `SimpleQueue.java`, `QueueDemo.java`
- **Tugas**:
  - Implementasi Queue untuk Case 2
  - Program demo penghitung item dalam antrian
  - Method: `enqueue()`, `dequeue()`, `size()`, `isEmpty()`, `display()`

## Cara Menjalankan Program

### Kompilasi
```bash
javac -d out src/main/java/com/stackqueue/*.java
```

### Menjalankan Program Utama
```bash
java -cp out com.stackqueue.Main
```

### Menjalankan Demo Queue
```bash
java -cp out com.stackqueue.QueueDemo
```

## Contoh Input/Output

### Case 1: Infix to Postfix/Prefix
```
Input (Infix)    : 5 + 4 / 2
Postfix          : 5 4 2 / +
Prefix           : + 5 / 4 2
Postfix Result   : 7
Prefix Result    : 7
```

### Case 2: Queue Item Counter
```
=== QUEUE OPERATIONS ===
1. Add Customer 1
2. Add Customer 2
3. Add Customer 3
Queue Size: 3
4. Remove Customer 1
Queue Size: 2
```

## Learning Outcomes

- **LO 1**: Memahami konsep data structures Stack dan Queue
- **LO 2**: Menganalisis kompleksitas algoritma konversi dan evaluasi
- **LO 3**: Implementasi data structures dan algoritma dalam Java

## Catatan Pengerjaan

1. **Setiap anggota** harus fokus pada file yang ditugaskan
2. **Gunakan komentar TODO** yang sudah disediakan sebagai panduan
3. **Test implementasi** dengan method testing yang sudah tersedia
4. **Koordinasi tim** untuk memastikan integrasi berjalan lancar
5. **Ganti placeholder** `[Nama Anggota X]` dengan nama asli

## Deadline & Submission

- **Deadline**: [Tanggal Deadline]
- **Format**: Submit semua file .java dalam folder terstruktur
- **Demo**: Siapkan demo program untuk presentasi

---
**Good luck dan semangat mengerjakan! 🚀**