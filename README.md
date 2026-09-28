# UTSPBO

Nama: Marza Hanaya Melodya Goga

NIM: 2409116103

## Sistem Manajemen Laundry

### Deskripsi Program
Program Sistem Manajemen Kursus ini dibuat untuk memudahkan pengguna dalam mengelola data kursus secara sederhana. Pengguna dapat emnambahkan kursus baru, melihat daftar kursus, mengubah informasi kursus, menghapus kursus, serta mencari kursus berdasarkan kata kunci. Program ditulis menggunakan bahasa pemograman java dengan konsep pemograman berorientasi objek. Struktur kode dibagi menjadi tiga package, yaitu KursusMain sebagai menu utama, Kursus Model yang berisi class ModelKursus sebagai superclass, KursusOnline dan KursusOffline sebagai subclass, serta KursusService yang menyimpan logika CRUD dan pencarian. Program ini juga menerapkan enkapsulasi dengan penggunaan atribut private dan getter-setter, inheritance pada class turunan KursusOnline dan KursusOffline dari superclass ModelKursus, serta overriding pada method getTipe() untuk menampilkan jenis kursus sesuai dengan tipe masing-masing.

### Output Program

<img width="356" height="192" alt="Screenshot 2025-09-23 195548" src="https://github.com/user-attachments/assets/226f8f23-0355-4742-ba97-9ad76f55a588" />

Berikut ini adalah menu utama program pada saat program pertama kali dijalankan.

<img width="810" height="367" alt="Screenshot 2025-09-23 202545" src="https://github.com/user-attachments/assets/2ac2a8ac-ad8d-44cb-8ae2-44906c6eabd2" />

Pada menu nomor 1, pengguna dapat menambahkan kursus yang diperlukan dengan menginput id kursus, nama kursus, nama pengajar, serta durasi kursus. Setelah berhasil menambahkan kursus, program akan memberi pesan bahwa kursus telah berhasil ditambahkan.

<img width="948" height="342" alt="Screenshot 2025-09-23 202812" src="https://github.com/user-attachments/assets/9c06c7ae-1222-410a-98c3-fe2af7fe23f6" />

Selanjutnya, pengguna dapat melihat daftar kursus yang ada dengan memilih menu nomor 2. Program akan menampilkan daftar kursus yang tersedia.

<img width="948" height="687" alt="Screenshot 2025-09-23 202954" src="https://github.com/user-attachments/assets/d3869aa0-b11a-4e0f-a971-fe0dd9814539" />

Di menu nomor 3, pengguna dapat mengubah informasi kursus. Sebagai contoh, saya mengubah informasi kursus dengan id nomor 3, disitu saya mengubah nama kursus dan durasi kursus dengan id 03. Setelah itu, saya memilih menu nomor 2, dan dapat dilihat bahwa infromasi kursus dengan id 03 telah berhasil diubah.

<img width="989" height="596" alt="Screenshot 2025-09-23 203459" src="https://github.com/user-attachments/assets/f6a9aa35-a1c5-4f71-9e06-b5376dc33140" />

Lalu, pada menu nomor 4 pengguna dapat menghapus kursus yang mungkin tidak diperlukan lagi dengan menginput id kursus yang ingin dihapus. Setelah itu, saya kembali memilih menu nomor 2 untuk memastikan bahwa kursus yang ingin saya hapus telah berhasil terhapus.

<img width="889" height="580" alt="Screenshot 2025-09-23 203732" src="https://github.com/user-attachments/assets/6574ac26-56e6-4146-bf76-ec3f748cb847" />

Selanjutnya, pengguna dapat mencari kursus yang dicari dengan memilih menu nomor 5. Program akan meminta memasukkan kata kunci kursus yang dicari. Disini saya mencari kursus dengan menggunakan nama pengajar dan nama kursus sebagai kata kunci, setelah itu program akan menampilkan kursus yang berkaitan dengan kata kunci yang pengguna masukkan tadi.

<img width="825" height="242" alt="Screenshot 2025-09-23 204404" src="https://github.com/user-attachments/assets/2011ff62-06a6-4c98-87db-3d5c8d989a59" />

Terakhir, jika pengguna memilih menu nomor 5, pengguna akan keluar dari program dan muncul pesan bahwa pengguna telah keluar dari program.
