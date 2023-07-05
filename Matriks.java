import java.util.Scanner;
import java.time.LocalDate;

public class Matriks {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("+--------------------------------------------------------------------+");
    System.out.println("+--------------------------------------------------------------------+");
    System.out.println("+               Ujian Akhir Semester Praktik Pemrograman             +");
    System.out.println("+                  Pendidikan Teknik Informatika 2022                +");
    System.out.println("+                           Fakultas Teknik                          +");
    System.out.println("+                     Universitas Negeri Yogyakarta                  +");
    System.out.println("+--------------------------------------------------------------------+");

    //Menginput Nama dan NIM
    System.out.print("Nama           : ");
    String nama = input.nextLine();

    System.out.print("NIM            : ");
    Long  NIM = input.nextLong();

    System.out.println("tanggal        : " + LocalDate.now());
    System.out.println("Kelas          : E ");
    System.out.println("Dosen Pengampu : Totok Sukardinoyo M.T");
    System.out.println("\n");

    // Input ukuran matriks A
    System.out.println("+-------------------------------+");
    System.out.println("+   Memasukkan Data Matriks A   +");
    System.out.println("+-------------------------------+");
    System.out.print("Masukkan jumlah baris matriks A: ");
    int mabarisA = input.nextInt();
    System.out.print("Masukkan jumlah kolom matriks A: ");
    int makolomA = input.nextInt();

    // Input matriks A
    System.out.println("+--------------------------------------------------------------+");
    int[][] A = new int[mabarisA][makolomA];
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A.length; j++) {
        System.out.print("Masukkan data ke-[" + i + "][" + j + "] untuk Matrik A : ");
        A[i][j] = input.nextInt();
      }

    }
    System.out.println("+--------------------------------------------------------------+");
    
    // Input ukuran matriks B
    System.out.println("+-------------------------------+");
    System.out.println("+   Memasukkan Data Matriks B   +");
    System.out.println("+-------------------------------+");
     System.out.print("Masukkan jumlah baris matriks B : ");
     int mabarisB = input.nextInt();
     System.out.print("Masukkan jumlah kolom matriks B : ");
     int makolomB = input.nextInt();

    // Input matriks B
    System.out.println("+--------------------------------------------------------------+");
    int[][] B = new int[mabarisB][makolomB];
    for (int i = 0; i < B.length; i++) {
      for (int j = 0; j < B.length; j++) {
        System.out.print("Masukkan data ke-[" + i + "][" + j + "] untuk Matrik B : ");
        B[i][j] = input.nextInt();
      }
    }
    System.out.println("+--------------------------------------------------------------+");
    

    // Menampilkan matriks A
    System.out.println("Menampilkan Matriks A:");
    for (int i = 0; i < A.length; i++) {
      System.out.print(" | ");
      for (int j = 0; j < A.length; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println("|");
    }

    // Menampilkan matriks B
    System.out.println("Menampilkan Matriks B:");
    for (int i = 0; i < B.length; i++) {
      System.out.print(" | ");
      for (int j = 0; j < B.length; j++) {
        System.out.print(B[i][j] + " ");
      }
      System.out.println("|");
    }
    System.out.println("+--------------------------------------------------------------+");

    
    System.out.println("+-------------------------------+");
    System.out.println("+    Memilih Operasi Matriks    +");
    System.out.println("+-------------------------------+");
    System.out.println("1. Penjumlahan");
    System.out.println("2. Pengurangan");
    System.out.println("3. Perkalian");
    System.out.println("4. Pembagian");
    System.out.println("5. Selesai");
    System.out.println("+--------------------------------------------------------------+");
    System.out.print("Pilih Operasi  : ");
    int operasi = input.nextInt();
    System.out.println("+--------------------------------------------------------------+");


    switch (operasi){

      case 1 :
      // Memeriksa apakah ordo matriks A dan B sama
      if (mabarisA != mabarisB || makolomA != makolomB) {
      System.out.println("Ordo matriks A dan B tidak sama, tidak dapat dilakukan operasi");
      return; // Mengakhiri program jika ordo tidak sama
      }

      // Menjumlahkan matriks
    int[][] penjumlahan = new int[A.length][B.length];
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < B.length; j++) {
        penjumlahan[i][j] = A[i][j] + B[i][j];
      }

    }
    // Menampilkan matriks A
    System.out.println("Matriks A : ");
    for (int i = 0; i < A.length; i++) {
      System.out.print(" | ");
      for (int j = 0; j < A.length; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println("|");
    } 

    // Menampilkan matriks B
    System.out.println("Matriks B : ");
    for (int i = 0; i < B.length; i++) {
      System.out.print(" | ");
      for (int j = 0; j < B.length; j++) {
        System.out.print(B[i][j] + " ");
      }
      System.out.println("|");
    }



    // Menampilkan hasil penjumlahan
    System.out.println("Hasil penjumlahan matriks A + B :");
    for (int i = 0; i < A.length; i++) {
      System.out.print(" | ");
      for (int j = 0; j < B.length; j++) {
        System.out.print(penjumlahan[i][j] + " ");
      }
      System.out.println("|");
    }break;

    case 2 :
    // Memeriksa apakah ordo matriks A dan B sama
    if (mabarisA != mabarisB || makolomA != makolomB) {
      System.out.println("Ordo matriks A dan B tidak sama, tidak dapat dilakukan operasi");
      return; // Mengakhiri program jika ordo tidak sama
      }

    // Mengurangi  matriks
    int[][] pengurangan = new int[A.length][B.length];
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < B.length; j++) {
        pengurangan[i][j] = A[i][j] - B[i][j];
      }

    }
    // Menampilkan matriks A
    System.out.println("Matriks A :");
    for (int i = 0; i < A.length; i++) {
      System.out.print(" | ");
      for (int j = 0; j < A.length; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println("|");
    } 

    // Menampilkan matriks B
    System.out.println("Matriks B :");
    for (int i = 0; i < B.length; i++) {
      System.out.print(" | ");
      for (int j = 0; j < B.length; j++) {
        System.out.print(B[i][j] + " ");
      }
      System.out.println("|");
    }



    // Menampilkan hasil pengurangan
    System.out.println("Hasil pengurangan matriks A - B :");
    for (int i = 0; i < A.length; i++) {
      System.out.print(" | ");
      for (int j = 0; j < B.length; j++) {
        System.out.print(pengurangan[i][j] + " ");
      }
      System.out.println("|");
    }break;

    case 3 :
    // Memeriksa apakah ordo matriks A dan B sama
      if (mabarisA != mabarisB || makolomA != makolomB) {
      System.out.println("Ordo matriks A dan B tidak sama, tidak dapat dilakukan operasi");
      return; // Mengakhiri program jika ordo tidak sama
      }
     // Mengkali Matriks
     int[][] perkalian = new int[mabarisA][makolomB];
     for (int i = 0; i < mabarisA; i++) {
       for (int j = 0; j < makolomB; j++) {
         perkalian[i][j] = 0;
         for (int k = 0; k < makolomA; k++) {
           perkalian[i][j] += A[i][k] * B[k][j];
         }
       }
     }

    // Menampilkan matriks A
    System.out.println("Matriks A :");
    for (int i = 0; i < A.length; i++) {
      System.out.print(" | ");
      for (int j = 0; j < A.length; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println("|");
    } 

    // Menampilkan matriks B
    System.out.println("Matriks B :");
    for (int i = 0; i < B.length; i++) {
      System.out.print(" | ");
      for (int j = 0; j < B.length; j++) {
        System.out.print(B[i][j] + " ");
      }
      System.out.println("|");
    }


    // Mencetak matriks hasil perkalian
    System.out.println("Hasil perkalian Matriks A dan B : ");
    for (int i = 0; i < mabarisA; i++) {
		System.out.print("| ");
      for (int j = 0; j < makolomB; j++) {
        System.out.print(perkalian[i][j] + " ");
      }
      System.out.println("|");

    }break;

    case 4 :
    if (mabarisA != mabarisB || makolomA != makolomB) {
      System.out.println("Ordo matriks A dan B tidak sama, tidak dapat dilakukan operasi");
      return; // Mengakhiri program jika ordo tidak sama
      }
    // Membuat matriks invers B sebagai hasil invers matriks B
    double[][] inversB = new double[B.length][B[0].length];

    // Menghitung invers matriks B jika matriks B merupakan matriks 2x2
    double determinan = (B[0][0] * B[1][1]) - (B[0][1] * B[1][0]);
    inversB[0][0] = B[1][1] / determinan;
    inversB[0][1] = -B[0][1] / determinan;
    inversB[1][0] = -B[1][0] / determinan;
    inversB[1][1] = B[0][0] / determinan;

    // Menampilkan matriks A
    System.out.println("Matriks A :");
    for (int i = 0; i < A.length; i++) {
      System.out.print(" | ");
      for (int j = 0; j < A.length; j++) {
        System.out.print(A[i][j] + " ");
      }
      System.out.println("|");
    } 

    // Menampilkan hasil invers matriks B
    System.out.println("Hasil invers matriks B :");
    for (int i = 0; i < inversB.length; i++) {
      System.out.print(" | ");
      for (int j = 0; j < inversB[i].length; j++) {
        System.out.print(inversB[i][j] + " ");
      }
      System.out.println("|");
    }

    //proses mengekali Matriks A * invers B
    int[][] pembagian = new int[mabarisA][makolomA];
    for (int i = 0; i < mabarisA; i++) {
      for (int j = 0; j < makolomB; j++) {
        pembagian[i][j] = 0;
        for (int k = 0; k < makolomA; k++) {
          pembagian[i][j] += A[i][k] * inversB[k][j];
        }
      }
    }



    // Hasil pembagian Matriks A * B invers
    System.out.println("Hasil Bagi Matriks A x invers B :");
    for (int i = 0; i < mabarisA; i++) {
      System.out.print("| ");
      for (int j = 0; j < makolomB; j++) {
        System.out.print(pembagian[i][j] + " ");
      }
      System.out.println("|");

    }break;

    case 5 :
    //Keluar Operasi
    System.out.println( "Selesai" );
    break ;

    //Pilihan yang tidak sesuai
    default :
    System.out.println("Nomor Perintah yang anda masukkan salah");

    }
    
    // Meminta pengguna untuk memasukkan pilihan untuk mengulangi atau mengakhiri program
  System.out.print("Apakah Anda ingin mengulangi (y/n)? ");
  String pilihan = input.next();

if (pilihan.equalsIgnoreCase("y")) {
  // Menjalankan program kembali dari awal
  main(args);
} else if (pilihan.equalsIgnoreCase("n")) {
  // Menutup Scanner dan mengakhiri program
  input.close();
} else {
  // Menampilkan pesan error jika pengguna memasukkan pilihan yang tidak valid
  System.out.println("Pilihan yang Anda masukkan tidak valid");
}

    
  }
}