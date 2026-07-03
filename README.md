# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data service HP menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama pelanggan, merk HP, pilihan layanan service, jumlah unit HP, dan keluhan pelanggan, dan memberikan output berupa informasi detail dari pesanan service seperti nama layanan, keluhan, jumlah unit, subtotal, dan total bayar.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Layanan`, `ServiceCepat`, dan `ServiceBeraksi` adalah contoh dari class.

```bash
public class Layanan {
    ...
}

public class ServiceCepat extends Layanan {
    ...
}

public class Layanan { ...

}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarLayanan[i] = new Layanan(...) dan daftarLayanan[i] = new ServiceCepat(...)` adalah contoh pembuatan object.

```bash
new Layanan("Ganti LCD", "Layar Pecah", 450000); 
new ServiceCepat("Install Ulang", "Sistem Error", 100000, 50000);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaLayanan`, `jenisKerusakan`, `biaya`, dan `biayaTambahan` adalah contoh atribut.

```bash
private String namaLayanan; 
private String jenisKerusakan; 
private int biaya; 
private int biayaTambahan;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Layanan` dan `ServiceCepat`.

```bash
public Layanan(String namaLayanan, String jenisKerusakan, int biaya) { 
  this.namaLayanan = namaLayanan; 
  this.jenisKerusakan = jenisKerusakan; 
  this.biaya = biaya; 
}

public ServiceCepat(String namaLayanan, String jenisKerusakan, int biaya, int biayaTambahan) { 
  super(namaLayanan, jenisKerusakan, biaya); 
  this.biayaTambahan = biayaTambahan; 
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaLayanan`, `setJenisKerusakan`, `setBiaya` dan `setBiayaTambahan` adalah contoh method mutator.

```bash
public void setNamaLayanan(String namaLayanan) { 
  this.namaLayanan = namaLayanan;
}

public void setBiaya(int biaya) { 
  this.biaya = biaya; 
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaLayanan`, `getJenisKerusakan`, `getbiaya`, `getBiayaTambahan` adalah contoh method accessor.

```bash
public String getNamaLayanan() { 
  return namaLayanan;
}

public int getBiaya() { 
  return biaya;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaLayanan`, `jenisKerusakan`,`biaya`, dan `biayaTambahan` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namaLayanan;
private String jenisKerusakan;
private int biaya;
private int biayaTambahan;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `ServiceCepat` mewarisi `Layanan` dengan sintaks `extends`.

```bash
public class ServiceCepat extends Layanan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo(String)` di `Layanan` merupakan overloading method `tampilkanInfo` dan `tampilkanInfo` di `ServiceCepat` merupakan override dari method `tampilkanInfo` di `Layanan`.

```bash
public String tampilkanInfo(String keterangan) {
    tampilkanInfo(); 
    System.out.println("Keterangan: " + keterangan);
}

@Override
public String tampilkanInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam pengecekan pilihan layanan dan jumlah unit.

```bash
if (pilihan < 1 || pilihan > daftarLayanan.length) { 
  System.out.println("Pilihan tidak tersedia."); 
  continue; 
} else { 
  pesanan[jumlahPesanan] = daftarLayanan[pilihan - 1]; 
}

if (unit <= 0) { 
  System.out.println("Jumlah unit harus lebih dari 0."); 
  continue; 
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk menampilkan data layanan dan pesanan.

```bash
for (int i = 0; i < daftarLayanan.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);
System.out.print("Masukkan nama pelanggan: ");
String namaPelanggan = input.nextLine();

System.out.println("\n=== STRUK SERVICE HP ==="); 
System.out.println("Total Bayar: Rp" + totalBayar);
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Layanan[] daftarLayanan = {...}; dan Layanan[] pesanan = new Layanan[20];` adalah contoh penggunaan array.

```bash
Layanan[] daftarLayanan = { 
new Layanan("Ganti LCD", "Layar Pecah", 450000), 
new Layanan("Ganti Baterai", "Baterai Boros", 250000), 
new ServiceCepat("Install Ulang", "Sistem Error", 100000, 50000)
};

Layanan[] pesanan = new Layanan[20];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
  // code that might throw an exception 
} catch (InputMismatchException e) { 
  System.out.println("Input harus berupa angka."); 
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Edya Rosadi
NPM: 2110010001
