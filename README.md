# QuestMVVM_0217

Aplikasi Android berbasis Jetpack Compose dengan arsitektur MVVM (Model-View-ViewModel) untuk tugas Pemrograman Aplikasi Mobile (PAM).

## Fitur Utama
- Formulir Input Siswa / Pembayaran
- Pilihan Jenis Kelamin (Radio Button)
- Navigasi antar halaman (Formulir dan Detail) menggunakan Jetpack Navigation Compose
- State Management menggunakan StateFlow & ViewModel

## Struktur Proyek
- `model/`: Berisi data class Siswa dan enum DataJK
- `view/`: Berisi UI Compose (FormSiswa, TampilSiswa) dan Navigasi
- `viewmodel/`: Berisi SiswaViewModel untuk manajemen state UI
