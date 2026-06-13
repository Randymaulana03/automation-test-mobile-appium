# Mobile Automation Testing - Sauce Labs Sample App

Proyek ini merupakan tugas implementasi *Automation Testing* untuk aplikasi Android menggunakan **Appium Framework** dengan bahasa pemrograman **Java** dan manajemen proyek **Maven**. Pengujian dilakukan langsung pada perangkat fisik (*Real Device*).

## Fitur Pengujian (Skenario)
Script ini melakukan otomatisasi pada alur fungsional utama aplikasi:
1. Membuka aplikasi **Sauce Labs Sample App**.
2. Melakukan simulasi input teks otomatis pada kolom *Username* (`standard_user`).
3. Melakukan simulasi input teks otomatis pada kolom *Password* (`secret_sauce`).
4. Menekan tombol *Login*.
5. Melakukan validasi (*Assertion*) untuk memastikan halaman produk (`PRODUCTS`) berhasil termuat di layar.

---

## Spesifikasi Environment
Untuk menjalankan proyek ini, spesifikasi environment yang digunakan adalah:
- **OS Laptop:** Windows 11
- **Java JDK:** 17
- **Build Tool:** Maven 3.x
- **Appium Server:** Versi 3.x
- **Driver:** UiAutomator2
- **Perangkat Uji:** Real Device Android (Koneksi USB Debugging)

---

## Struktur Proyek
```text
appium-test/
├── apk/
│   └── Android.SauceLabs.Mobile.Sample.app.2.7.1.apk  (Berkas APK Target)
├── src/
│   └── test/
│       └── java/
│           └── com/
│               └── automation/
│                   └── AppTest.java                  (Script Utama Java)
├── .gitignore
└── pom.xml                                           (Library Dependencies)
