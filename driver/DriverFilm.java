package driver;

import java.util.Scanner;
import model.*;

public class DriverFilm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan data film:");
        System.out.print("Genre (horror/comedy/romance/dokumenter): ");
        String genre = scanner.nextLine().toLowerCase();

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        System.out.print("Judul: ");
        String judul = scanner.nextLine();

        System.out.print("Tahun Terbit: ");
        int tahunTerbit = scanner.nextInt();

        FilmGenre film; // Change to FilmGenre to accommodate all film genres

        // Memilih jenis film berdasarkan genre yang dimasukkan pengguna
        switch (genre) {
            case "horror":
                film = new HorrorFilm(id, judul, tahunTerbit);
                break;
            case "comedy":
                film = new ComedyFilm(id, judul, tahunTerbit);
                break;
            case "romance":
                film = new RomanceFilm(id, judul, tahunTerbit);
                break;
            case "dokumenter":
                film = new DocumentaryFilm(id, judul, tahunTerbit);
                break;
            default:
                System.out.println("Genre tidak valid.");
                scanner.close();
                return;
        }

        System.out.println("\nData film berhasil dimasukkan!\n");
        System.out.println("Informasi Film:");
        film.tampilkanInfo();

        scanner.close();
    }
}
