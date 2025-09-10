/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package first_time.post_tes1;

/**
 *
 * @author loq
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> spacecoworkerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opsi;

        spacecoworkerList.add("c104");
        spacecoworkerList.add("c302");
        spacecoworkerList.add("c303");
        spacecoworkerList.add("c304");
        spacecoworkerList.add("c305");

        do {
            System.out.println("\n=== Sistem Manajemen Coworker Space ===");
            System.out.println("1. Tambah Space Coworker");
            System.out.println("2. Lihat Daftar Space Coworker");
            System.out.println("3. Ubah Data Space Coworker");
            System.out.println("4. Hapus Space Coworker");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            opsi = scanner.nextInt();
            scanner.nextLine();

            switch (opsi) {
                case 1:
                    System.out.print("Masukkan data space coworker: ");
                    String nama = scanner.nextLine();
                    spacecoworkerList.add(nama);
                    System.out.println("Space Coworker berhasil ditambahkan.");
                    break;
                    
                case 2:
                    if (spacecoworkerList.isEmpty()) {
                        System.out.println("Tidak ada data space coworker");
                    } else {
                        System.out.println("Daftar Space Coworker");
                        for (int i = 0; i < spacecoworkerList.size(); i++) {
                        System.out.println((i + 1)+ "."+ spacecoworkerList.get(i));
                    }
                    break;
                    }
                case 3:
                    if (spacecoworkerList.isEmpty()) {
                        System.out.println("Tidak ada data untuk diubah.");
                    } else {
                        System.out.println("\n--- Daftar Coworker ---");
                        for (int i = 0; i < spacecoworkerList.size(); i++) {
                            System.out.println((i + 1) + ". " + spacecoworkerList.get(i));
                        }
                        System.out.print("Pilih nomor space coworker yang ingin diubah: ");
                        int indexUbah = scanner.nextInt();
                        scanner.nextLine();
                        if (indexUbah > 0 && indexUbah <= spacecoworkerList.size()) {
                            System.out.print("Masukkan nama baru: ");
                            String namaBaru = scanner.nextLine();
                            spacecoworkerList.set(indexUbah - 1, namaBaru);
                            System.out.println("Data berhasil diubah.");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                    break;
                    
                case 4:
                    if (spacecoworkerList.isEmpty()) {
                        System.out.println("Tidak ada data untuk dihapus.");
                    } else {
                        System.out.println("\n--- Daftar Space Coworker ---");
                        for (int i = 0; i < spacecoworkerList.size(); i++) {
                            System.out.println((i + 1) + ". " + spacecoworkerList.get(i));
                        }
                        System.out.print("Pilih nomor space coworker yang ingin dihapus: ");
                        int indexHapus = scanner.nextInt();
                        scanner.nextLine();
                        if (indexHapus > 0 && indexHapus <= spacecoworkerList.size()) {
                            spacecoworkerList.remove(indexHapus - 1);
                            System.out.println("Data berhasil dihapus.");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (opsi != 5);

        scanner.close();
    }
}