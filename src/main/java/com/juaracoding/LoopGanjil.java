package com.juaracoding;

public class LoopGanjil {
    public static void main(String[] args) {
        // Loop untuk mengontrol baris
        for (int i = 0; i < 5; i++) {
            // Loop untuk mengontrol kolom
            for (int j = 0; j < 5; j++) {
                // Jika indeks kolom lebih besar dari indeks baris
                // cetak angka ganjil saja, jika tidak, cetak _
                if (j >= i) {
                    System.out.print((2 * j + 1) + "_");
                } else {
                    System.out.print("");
                }
            }
            System.out.println(); // Pindah ke baris berikutnya setelah setiap baris selesai dicetak
        }
    }
}