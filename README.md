# tutorPBO-24
Deskripsi Problem:
Anda diminta untuk membuat sebuah program Java untuk mengelola data film berdasarkan genre. Terdapat empat genre film yang akan dikelola: horror, comedy, romance, dan dokumenter. Setiap film memiliki atribut utama yang terdiri dari id, judul, dan tahun terbit. Implementasikan konsep interface, polymorphism, dan inheritance dalam pembuatan program ini.

Spesifikasi Program:
Buatlah sebuah interface bernama Film yang memiliki method:

void tampilkanInfo() untuk menampilkan informasi film.
Buatlah kelas abstrak bernama FilmGenre yang mengimplementasikan interface Film. Kelas ini memiliki atribut:

id (integer): ID unik untuk setiap film.
judul (String): Judul film.
tahunTerbit (integer): Tahun terbit film.
Buatlah constructor untuk menginisialisasi atribut-atribut tersebut.
Implementasikan method tampilkanInfo() untuk menampilkan informasi film.
Buatlah empat kelas turunan dari FilmGenre, masing-masing merepresentasikan satu genre film. Setiap kelas harus memiliki:

Constructor yang memanggil constructor kelas induk dan menginisialisasi atribut genre yang sesuai.
Override method tampilkanInfo() untuk menampilkan informasi film sesuai dengan genre yang bersangkutan.
Buatlah sebuah kelas Main untuk melakukan input data film dari pengguna dan menampilkan informasi film yang telah dimasukkan.