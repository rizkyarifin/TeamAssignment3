# Team Assignment 3: Stack & Queue Implementation

## Team Members
1. **Tofik Hidayat** - ArrayStack & Validation (20%)
2. **Dwi Rizky Fitriana** - LinkedListStack & Infix to Postfix (10%)
3. **Vincent** - Infix to Prefix & Postfix Evaluation (10%)
4. **Muhammad Rizky Arifin** - Prefix Evaluation & Main Program (25%)
5. **Meggi Kasandra** - Queue Implementation (35%)

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

### **Anggota 1: Tofik Hidayat**
**Bobot: 20%**
- **File**: `ArrayStack.java`, `InfixValidator.java`
- **Tugas**:
  - Implementasi Stack menggunakan Array
  - Validasi input notasi infix
  - Method: `push()`, `pop()`, `peek()`, `isEmpty()`, `isFull()`
  - Validasi: operator/operand bergantian, tidak diawali/diakhiri operator
- **Status**: ✅ SELESAI

### **Anggota 2: Dwi Rizky Fitriana**
**Bobot: 10%**
- **File**: `LinkedListStack.java`, `InfixToPostfix.java`
- **Tugas**:
  - Implementasi Stack menggunakan Linked List
  - Konversi Infix ke Postfix menggunakan Shunting Yard Algorithm
  - Handle operator precedence (*, / > +, -)
- **Status**: ✅ SELESAI

### **Anggota 3: Vincent**
**Bobot: 10%**
- **File**: `InfixToPrefix.java`, `PostfixEvaluator.java`
- **Tugas**:
  - Konversi Infix ke Prefix
  - Evaluasi ekspresi Postfix untuk mendapatkan hasil perhitungan
  - Handle operasi aritmatika: +, -, *, /
- **Status**: ✅ SELESAI

### **Anggota 4: Muhammad Rizky Arifin**
**Bobot: 25%**
- **File**: `PrefixEvaluator.java`, `Main.java`
- **Tugas**:
  - Evaluasi ekspresi Prefix
  - Program utama dengan User Interface
  - Integrasi semua komponen
  - Tampilan hasil yang rapi
- **Status**: ✅ SELESAI

### **Anggota 5: Meggi Kasandra**
**Bobot: 35%**
- **File**: `SimpleQueue.java`, `QueueDemo.java`
- **Tugas**:
  - Implementasi Queue untuk Case 2
  - Program demo penghitung item dalam antrian
  - Method: `enqueue()`, `dequeue()`, `size()`, `isEmpty()`, `display()`
- **Status**: ✅ SELESAI

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