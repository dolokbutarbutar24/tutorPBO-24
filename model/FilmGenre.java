package model;

public abstract class FilmGenre implements Film {
    protected int id;
    protected String judul;
    protected int tahunTerbit;

    public FilmGenre(int id, String judul, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID: " + id);
        System.out.println("Judul: " + judul);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}
