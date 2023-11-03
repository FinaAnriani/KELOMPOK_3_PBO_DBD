<h1> KELOMPOK_3_PBO_DBD </h1>

<h2> NAMA PROJECT "MANAJEMEN DATA KELAHIRAN BAYI" </h2>
<h3> KELOMPOK 3</h3>
<h3> Amalia Kartika Sari (2209116013)</h3>
<h3> Fina Anriani (2209116051)</h3>
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h3>DESKRIPSI PROJECT : </h3>

Project yang kami buat adalah sebuah aplikasi berbasis Java yang bertujuan untuk mengelola data kelahiran bayi. Aplikasi ini dirancang untuk memudahkan pengelolaan data terkait keluarga, data kelahiran bayi, dan staf yang terlibat dalam pengelolaan data tersebut.


Aplikasi ini memberikan fitur lengkap yang mencakup berbagai aspek terkait kelahiran bayi. Terdapat modul untuk mencatat dan memperbarui informasi keluarga yang terkait dengan kelahiran bayi. Informasi tersebut meliputi id kelahiran, nama bayi, jenis kelamin bayi, tempat dan tanggal lahir bayi, waktu lahhir bayi, nomor kartu keluarga dari bayi, dan nama orang tua dari bayi.
Aplikasi ini juga menyediakan modul untuk mengelola data staf yang bertanggung jawab dalam pengelolaan data kelahiran bayi. Informasi staf mencakup id staff, nama staff, jabatan, dan nomor kontak dari staff.


Keamanan merupakan hal penting dalam aplikasi ini. Oleh karena itu, aplikasi dilengkapi dengan sistem keamanan yang membatasi akses data hanya kepada pengguna yang diizinkan. Hal ini akan melindungi privasi dan integritas data kelahiran bayi. Proyek ini menggunakan bahasa pemrograman Java dan basis data MySQL untuk menyimpan data.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h3> FLOWCHART : </h3>


----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h3> ERD : </h3>

-LOGICAL

![logicalkel3](https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/127528115/169352af-d9db-4cf2-b8c5-e143252b3acd)

-RELATIONAL

![image](https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/127528115/d99445c2-039e-457e-b7ea-598d82510df0)


----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h3> KELAS : </h3>

Karena pada studi kasus yang kami buat tidak menerapkan inheritance, maka dibawah ini kami sertakan kelas-kelas yang ada tanpa hierarkinya.

![KELASKEL3 drawio](https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/127528115/5da2f550-4458-47f9-852b-a61859c296b0)

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h3> SCREENSHOOT CODING DAN PENJELASAN: </h3>

PACKAGE


<img width="221" alt="Screenshot 2023-11-03 211514" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/ca95fd64-abcc-4d39-a11b-da4062576b48">

<h4> PACKAGE DAN IMPORT</h4>

<img width="279" alt="Screenshot 2023-11-03 224643" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/d7af2691-774a-4c56-b6b9-90914280522f">


Kode dimulai dengan beberapa baris yang menentukan di mana kelas ini berada (package) dan mengimpor berbagai perpustakaan (libraries) yang diperlukan. Ini memungkinkan kelas ini untuk menggunakan berbagai alat dan fitur yang telah dibuat sebelumnya.

- import datakelahirann.Database;: Mengimpor kelas Database dari paket datakelahirann yang diperlukan untuk koneksi database.
- import java.sql.PreparedStatement;: Mengimpor kelas PreparedStatement dari paket java.sql yang digunakan untuk menyiapkan pernyataan SQL.
- import java.sql.ResultSet;: Mengimpor kelas ResultSet dari paket java.sql yang digunakan untuk mengelola hasil query database.
- import java.sql.SQLException;: Mengimpor kelas SQLException dari paket java.sql yang digunakan untuk menangani pengecualian SQL.
- import java.sql.Connection;: Mengimpor kelas Connection dari paket java.sql yang digunakan untuk mengelola koneksi database.
- import javax.swing.JOptionPane;: Mengimpor kelas JOptionPane dari paket javax.swing yang digunakan untuk menampilkan pesan dialog.


<h4> DEKLARASI KELAS </h4> 

<img width="283" alt="image" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/930ba729-134b-4d74-8d9d-719dc13a0f8e">

Kata kunci final menunjukkan bahwa kelas ini tidak dapat diwariskan.


<h4> VARIABEL KELAS </h4> 

<img width="233" alt="image" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/8f3e1e3e-f79a-49e6-a683-8ab06ad05f70">

- public String idStaff;: Deklarasi variabel anggota idStaff dengan tipe data String.
- public String namaStaff;: Deklarasi variabel anggota namaStaff dengan tipe data String.
- public String noHpStaff;: Deklarasi variabel anggota noHpStaff dengan tipe data String.
- public String jabatanStaff;: Deklarasi variabel anggota jabatanStaff dengan tipe data String.
- public String staffIdStaff;: Deklarasi variabel anggota staffIdStaff dengan tipe data String.

<h4> KONSTRUKTOR KELAS </h4> 

<img width="636" alt="image" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/a040f842-8bf7-4da2-a53a-05d6b7362294">

konstruktor untuk kelas Staff yang menerima beberapa parameter inisialisasi.

<h4> METODE 'getAtasan' </h4> 

<img width="640" alt="image" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/eede983a-fcd8-448a-8c63-9f891cb7d257">

Mendefinisikan metode getAtasan() yang mengembalikan objek Staff.

<h4> METODE 'Tambah' </h4> 

![image](https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/c5746abb-bbf0-4bfc-b006-e7f4ead70be8)

mengembalikan nilai boolean (true jika berhasil, false jika gagal) untuk menambahkan data staf ke database.

<h4> METODE 'Read' </h4> 

![image](https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/38f68e93-f399-4093-be7c-62ba29741ea5)

![image](https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/1ca3e96e-84d1-402e-9d30-446f64859e3c)


mengembalikan objek DefaultTableModel yang berisi data staf dari database.


<h4> METODE 'Update' </h4> 

![image](https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/329b537f-638d-45dd-a1f9-d05cfe8f2c9d)

mengembalikan nilai boolean (true jika berhasil, false jika gagal) untuk memperbarui data staf di database.


<h4> METODE 'Delete' </h4>

![image](https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/4cbf162f-b93e-4d0d-af2f-98ddce3629d8)

mengembalikan nilai boolean (true jika berhasil, false jika gagal) untuk menghapus data staf dari database.

<h4> METODE 'getAllStaff' </h4> 

<img width="575" alt="image" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/a3132c25-a1e0-4b7a-92a1-88f86d3b26d9">


metode statis getAllStaff() yang mengembalikan daftar semua staf dalam bentuk ArrayList.







----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h3> SCREENSHOOT OUTPUT : </h3>

LOGIN

<img width="430" alt="Screenshot 2023-11-03 202645" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/60426ccf-2916-4835-ae18-5960bdf8e737">
<img width="427" alt="Screenshot 2023-11-03 202705" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/6d063b6c-33b1-47b2-b4b6-d35d93c09623">
<img width="428" alt="Screenshot 2023-11-03 202717" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/9f37965e-7832-4104-8086-aa408f2bb29a">

pada bagian login ini memerlukan input berupa nama dan id staff. kalau nama dan id benar, maka akan otomatis masuk ke menu opsi. kalau salah maka akan kembali meminta memasukkan nama dan id.

MENU


<img width="426" alt="Screenshot 2023-11-03 202725" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/75aa2c2b-96ea-4dbe-a008-da0f6811f080">

Setelah berhasil Login maka akan menampilkan opsi berupa data staff, data kelahiran dan menu keluar

MENU STAFF


<img width="428" alt="Screenshot 2023-11-03 202735" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/24621563-0e0a-4121-aab9-ded4209fce5a">

READ, Pada GUI ini menampilkan daftar Staff yang berada pada Database. dalam READ ini juga terdapat opsi Tambah, Edit, Hapus, dan Menu

TAMBAH


<img width="428" alt="Screenshot 2023-11-03 202744" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/751f3075-1b45-4ce8-8f88-27deb4842137">
<img width="428" alt="Screenshot 2023-11-03 202836" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/55e2cc6c-dcae-420c-9ec2-41dd31963664">
<img width="427" alt="Screenshot 2023-11-03 202904" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/b0b71038-95e1-4768-8449-39de6bf431b9">

TAMBAH, Memasukkan Id Staff, Nama, No HP, Jabatan dan ID Atasan. jika sesuai maka data akan langsung masuk ke database. jika tidak maka akan terdapat notifikasi untuk melengkapi data.


EDIT

<img width="428" alt="Screenshot 2023-11-03 202946" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/ad967317-b102-4c80-afee-011fa23d6ca4">
<img width="430" alt="Screenshot 2023-11-03 202954" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/10813c8e-55ec-4e27-8d22-5897b13cf67f">

Jika ingin mengedit maka harus memasukkan ID staff yang benar, sedangkan data lain dapat berubah sesuai keinginan.

HAPUS


<img width="422" alt="Screenshot 2023-11-03 203040" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/d4385c1a-7ad5-42e4-a106-d8c7537209ee">
<img width="427" alt="Screenshot 2023-11-03 203047" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/fcb2381f-eda4-429d-b6e2-f29d009da54b">

DATA KELAHIRANNN

CEK NO KK
<img width="426" alt="Screenshot 2023-11-03 203136" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/7fd6e563-0ca2-41bd-9172-7263f1cc4d2a">

READ


<img width="427" alt="Screenshot 2023-11-03 203144" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/9faa9596-7d46-487a-8fa3-d3dc7746e770">

TAMBAH


<img width="425" alt="Screenshot 2023-11-03 203242" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/81fdde44-0996-49d2-b4cf-d7b051f10611">
<img width="429" alt="Screenshot 2023-11-03 203252" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/a13f1e1c-c0cb-41ba-8cd2-cc9c5836e1a9">

EDIT


<img width="429" alt="Screenshot 2023-11-03 203321" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/4f2e8ab4-859b-47d7-9bdf-d82639999ca5">
<img width="429" alt="Screenshot 2023-11-03 203328" src="https://github.com/FinaAnriani/KELOMPOK_3_PBO_DBD/assets/121868323/090ce3b2-07c5-47a9-acd2-fa286b433300">
