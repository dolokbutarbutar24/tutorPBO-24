package model;

public class RomanceFilm extends FilmGenre {
    public RomanceFilm(int id, String judul, int tahunTerbit) {
        super(id, judul, tahunTerbit);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Genre: Romance");
        super.tampilkanInfo();
    }
}
