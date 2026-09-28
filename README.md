# UTS Mata Kuliah PBO

## Sistem Manajemen Kursus Online
Nama: Marza Hanaya Melodya Goga

NIM: 2409116103

### Deskripsi Program
Program Sistem Manajemen Kursus Online ini dibuat untuk membantu pengguna dalam mengelola informasi kursus secara lebih terstruktur. Pengguna dapat menambahkan data kursus baru, melihat daftar kursus yang tersedia, memperbarui detail kursus, serta menghapus kursus yang sudah tidak digunakan. Program ini ditulis menggunakan bahasa pemrograman Java dan menerapkan konsep pemrograman berorientasi objek dengan beberapa kelas utama, yaitu MainKursus sebagai main class, KursusOnline dan KursusOffline untuk menyimpan data kursus sesuai jenisnya, serta ModelKursus sebagai abstract class dasar. Selain itu, program ini juga menggunakan interface Evaluasi untuk memberikan nilai dan laporan hasil, sehingga konsep abstraction dan polymorphism dapat diterapkan secara nyata.

### Struktur Program

<img width="298" height="271" alt="Screenshot 2025-09-30 093551" src="https://github.com/user-attachments/assets/8f6d68fe-bf39-4979-8f4a-c932c9e8ec7a" />

### Penerapan Abstraction

Penerapan Abstraction dalam program ini terdapat pada abstract class ModelKursus yang memiliki method abstract getTipe() dan diimplementasikan secara berbeda pada class KursusOnline dan KursusOffline. Selain itu, program juga menggunakan interface Evaluasi yang diimplementasikan oleh class KursusOnline untuk memberikan nilai serta membuat laporan hasil.

### Penerapan Polymorphism

Penerapan Polymorphism ditunjukkan melalui Overriding, yaitu method getTipe() pada KursusOnline dan KursusOffline yang menyesuaikan output sesuai jenis kursusnya, serta implementasi method dari interface Evaluasi. Sedangkan Overloading diterapkan pada class Siswa dengan adanya method setter setNama() yang dapat digunakan untuk memperbarui nilai atribut dengan fleksibilitas parameter.

### Output Program
<img width="654" height="214" alt="Screenshot 2025-09-30 131514" src="https://github.com/user-attachments/assets/8eb61296-78b7-4066-9e35-9eeb6532c4a7" />

Berikut ini adalah menu utama program pada saat program pertama kali dijalankan.

<img width="794" height="360" alt="Screenshot 2025-09-30 153832" src="https://github.com/user-attachments/assets/659784d9-b464-4fe8-b20e-4fb4fe002be9" />

Pada menu nomor 1, pengguna dapat menambahkan kursus yang diperlukan dengan menginput id kursus, nama kursus, nama pengajar, serta durasi kursus. Setelah berhasil menambahkan kursus, program akan memberi pesan bahwa kursus telah berhasil ditambahkan.

<img width="990" height="333" alt="Screenshot 2025-09-30 131601" src="https://github.com/user-attachments/assets/4cb67c9e-c525-4af2-a1d4-a0daed9fa2a2" />

Selanjutnya, pengguna dapat melihat daftar kursus yang ada dengan memilih menu nomor 2. Program akan menampilkan daftar kursus yang tersedia.

<img width="814" height="351" alt="Screenshot 2025-09-30 154002" src="https://github.com/user-attachments/assets/4a3431b8-0c86-4df0-8cb6-3015f4ed895e" />

Jika pengguna memilih mengubah kursus, sistem akan meminta data baru. Pengguna boleh mengosongkan input tertentu jika tidak ingin diubah. Setelah data diperbarui, program menampilkan pesan bahwa perubahan berhasil dilakukan. Pada opsi hapus kursus, apabila ID sesuai ditemukan maka kursus akan dihapus dan sistem memberi notifikasi berhasil. Sebaliknya, jika ID tidak ada, program menampilkan pesan bahwa kursus tidak ditemukan.

<img width="619" height="280" alt="Screenshot 2025-09-30 154042" src="https://github.com/user-attachments/assets/591bfb08-24ca-45eb-a50d-50b1b1783266" />

Lalu, pada menu nomor 4 pengguna dapat menghapus kursus yang mungkin tidak diperlukan lagi dengan menginput id kursus yang ingin dihapus. Setelah itu, saya kembali memilih menu nomor 2 untuk memastikan bahwa kursus yang ingin saya hapus telah berhasil terhapus.

<img width="1128" height="564" alt="Screenshot 2025-09-30 154239" src="https://github.com/user-attachments/assets/14503152-2042-4667-a9b1-20669d7dfca3" />

Selanjutnya, pengguna dapat mencari kursus yang dicari dengan memilih menu nomor 5. Program akan meminta memasukkan kata kunci kursus yang dicari. Disini saya mencari kursus dengan menggunakan nama pengajar dan nama kursus sebagai kata kunci, setelah itu program akan menampilkan kursus yang berkaitan dengan kata kunci yang pengguna masukkan tadi.

<img width="753" height="252" alt="Screenshot 2025-09-30 210035" src="https://github.com/user-attachments/assets/a29f4a1d-7665-4f6d-8463-21bdfa341124" />

Terakhir, jika pengguna memilih menu nomor 5, pengguna akan keluar dari program dan muncul pesan bahwa pengguna telah keluar dari program.
