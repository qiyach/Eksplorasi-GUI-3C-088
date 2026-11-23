# Latihan GUI Java - Kalkulator Imut Zasqia088

Latihan eksplorasi materi Graphical User Interface (GUI) pada Java menggunakan Swing.

Aplikasinya kalkulator kecil: user mengisi dua angka, lalu klik tombol **Tambah** atau **Kurang** untuk melihat hasilnya. Tombol **Reset** mengosongkan semua kolom.

5 Komponen Utama GUI yang Digunakan
1. Top-Level Container: `JFrame`
Jendela utama aplikasi. Semua komponen lain ditaruh di dalamnya. Di sini `JFrame` dipakai untuk mengatur judul, ukuran, posisi di tengah layar, dan aksi saat jendela ditutup.
2. Intermediate Container: `JPanel`
Wadah di tengah-tengah untuk mengelompokkan komponen supaya lebih rapi. Aku pakai dua panel:
- `panelInput` untuk kolom angka 1, angka 2, dan hasil
- `panelTombol` untuk tiga tombol
3. Atomic Component: `JLabel`, `JTextField`, `JButton`
Komponen paling kecil yang langsung dilihat dan dipakai user.
- `JLabel` : teks keterangan (judul, "Angka 1:", dst.)
- `JTextField` : kolom untuk mengetik angka dan menampilkan hasil
- `JButton` : tombol Tambah, Kurang, dan Reset
4. Layout Classes: `BorderLayout`, `GridLayout`, `FlowLayout`
Mengatur posisi komponen di dalam container.
- `BorderLayout` : dipakai di `JFrame`. Judul di atas (NORTH), input di tengah (CENTER), tombol di bawah (SOUTH)
- `GridLayout` : dipakai di `panelInput`. Komponen tersusun rapi 3 baris x 2 kolom
- `FlowLayout` : dipakai di `panelTombol`. Tombol berjajar ke samping
5. Event Listener: `ActionListener`
Penghubung antara aksi user dan program. Setiap tombol diberi `addActionListener`, lalu method `actionPerformed` di-override. Kode di dalamnya jalan saat tombol diklik, misalnya mengambil angka dari kolom, menghitung, dan menampilkan hasil. Kalau input bukan angka, muncul pesan peringatan lewat `JOptionPane`.

Cara Menjalankan <3
javac Kalkulator.java
java Kalkulator

