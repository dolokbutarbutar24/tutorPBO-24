package model;

public class ComedyFilm extends FilmGenre {
    public ComedyFilm(int id, String judul, int tahunTerbit) {
        super(id, judul, tahunTerbit);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Genre: Comedy");
        super.tampilkanInfo();
    }
}
