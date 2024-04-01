package model;

public class HorrorFilm extends FilmGenre {
    public HorrorFilm(int id, String judul, int tahunTerbit) {
        super(id, judul, tahunTerbit);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Genre: Horror");
        super.tampilkanInfo();
    }
}
