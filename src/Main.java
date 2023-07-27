import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isRunning = true;

        //looping untuk mengulang inputan
        while (isRunning){
            String hasil = "";
            System.out.print("\nMasukkan angka pertama: ");
            double firstNumber;
            //validasi inputan hanya boleh angka
            try {
                firstNumber = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Maaf, input yang anda masukan tidak valid.");
                input.nextLine(); // Membersihkan buffer input
                continue;
            }

            System.out.print("Masukkan angka kedua: ");
            double secondNumber = 0;

            //validasi inputan hanya boleh angka
            try {
                secondNumber = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Maaf, input yang anda masukan tidak valid.");
                input.nextLine(); // Membersihkan buffer input
                continue;
            }

            System.out.println("Masukkan Operator :");
            String operator = input.next();
                //kondisi jika memasukkan operator
                if (operator.equalsIgnoreCase("*")){
                    hasil =  String.valueOf(firstNumber * secondNumber); // Perkalian
                }else if(operator.equalsIgnoreCase("+")){
                    hasil =  String.valueOf(firstNumber + secondNumber); // Penjumlahan
                }else if(operator.equalsIgnoreCase("-")){
                    hasil =  String.valueOf(firstNumber - secondNumber); // Pengurangan
                }else if(operator.equalsIgnoreCase("/")){
                    // Kondisi jika inputan pada pembagian berangka 0
                    if (secondNumber == 0 || firstNumber==0){
                        hasil = "Pembagian angka tidak boleh 0";
                    }else {
                        hasil =  String.valueOf(firstNumber / secondNumber); // Pembagian
                    }
                }
                // Kondisi jika operator selain tanda *, /, +, -
                else if (!(operator.equalsIgnoreCase("*")||operator.equalsIgnoreCase("+")||operator.equalsIgnoreCase("-")||operator.equalsIgnoreCase("/"))){
                    hasil = "Operator tidak valid! Masukkan operator yang benar.";
                }

            System.out.print("Hasil :" +hasil); //

        }

    }

}