package model;

public class DocumentaryFilm extends FilmGenre {
    public DocumentaryFilm(int id, String judul, int tahunTerbit) {
        super(id, judul, tahunTerbit);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Genre: Dokumenter");
        super.tampilkanInfo();
    }
}
