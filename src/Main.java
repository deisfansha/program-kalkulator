import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isRunning = true;

        // Looping untuk mengulang inputan dan perhitungan
        while (isRunning) {
            String hasil = "";

            // Meminta input angka pertama
            System.out.print("\nMasukkan angka pertama: ");
            int firstNumber;
            // Validasi inputan hanya boleh angka
            try {
                firstNumber = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Maaf, input yang anda masukkan tidak valid.");
                input.nextLine(); // Membersihkan buffer input
                continue;
            }

            // Meminta input angka kedua
            System.out.print("Masukkan angka kedua: ");
            int secondNumber = 0;
            // Validasi inputan hanya boleh angka
            try {
                secondNumber = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Maaf, input yang anda masukkan tidak valid.");
                input.nextLine(); // Membersihkan buffer input
                continue;
            }

            // Meminta input operator
            System.out.println("Masukkan Operator (*, +, -, /):");
            String operator = input.next();
            // Kondisi jika memasukkan operator
            if (operator.equalsIgnoreCase("*")) {
                hasil = String.valueOf(firstNumber * secondNumber); // Perkalian
            } else if (operator.equalsIgnoreCase("+")) {
                hasil = String.valueOf(firstNumber + secondNumber); // Penjumlahan
            } else if (operator.equalsIgnoreCase("-")) {
                hasil = String.valueOf(firstNumber - secondNumber); // Pengurangan
            } else if (operator.equalsIgnoreCase("/")) {
                // Kondisi jika inputan pada pembagian berangka 0
                if (secondNumber == 0 || firstNumber == 0) {
                    hasil = "Pembagian angka tidak boleh 0";
                } else {
                    hasil = String.valueOf((double) firstNumber / secondNumber); // Pembagian
                }
            } else {
                hasil = "Operator tidak valid! Masukkan operator yang benar.";
            }

            // Menampilkan hasil perhitungan
            System.out.println("Hasil: " + hasil);

            // Membersihkan buffer input sebelum meminta inputan selanjutnya
            input.nextLine();

            // Meminta pengguna untuk menghitung lagi atau berhenti
            System.out.print("Menghitung lagi (Ya/Tidak): ");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("Tidak")) {
                isRunning = false;
            }
        }

        // Menutup scanner setelah program selesai
        input.close();

    }

}