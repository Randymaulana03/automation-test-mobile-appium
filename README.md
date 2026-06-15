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

```
## How to Start
### 1. Persiapan Perangkat (Android)
* Pastikan **Developer Options** dan **USB Debugging** pada HP Anda sudah aktif.
* Aktifkan opsi **Install via USB** dan **USB Debugging (Security Settings)** agar injeksi input teks otomatis tidak diblokir oleh sistem keamanan HP.
* Hubungkan HP ke laptop menggunakan kabel USB, buka terminal, lalu pastikan perangkat terdeteksi dengan mengetik:
  ```bash
  adb devices
  ```
* Salin UDid Device Anda dan Paste di File AppTest.java
  Di bagian
  ```bash
  .setUdid("paste dibagian ini")
  ```

### 2. Menjalankan Appium Server (Terminal)
 ```bash
  appium
  ```

### 3. Eksekusi Script Testing via Maven
```bash
mvn clean test -DforkCount=0
```

### 4. Menunggu Hingga Aplikasi Terinstall didevice
* Pastika ketika ada notifikasi untuk menginstall maka pilih opsi "Allow"

### 5. Log Sukses
<img width="867" height="381" alt="image" src="https://github.com/user-attachments/assets/4066ae7b-c838-4da2-b437-816a0e14de7c" />

### Dokumentasi
<img width="246" height="500" alt="WhatsApp Image 2026-06-14 at 3 48 24 AM" src="https://github.com/user-attachments/assets/7a56baf6-3d13-49ba-8b77-e688383fa9f2" />

<img width="246" height="500" alt="WhatsApp Image 2026-06-14 at 3 48 23 AM (3)" src="https://github.com/user-attachments/assets/2db8294e-d1c0-4741-9ce1-2381a99f8a19" />

<img width="246" height="500" alt="WhatsApp Image 2026-06-14 at 3 48 23 AM (2)" src="https://github.com/user-attachments/assets/536e7abe-32ee-4869-b3ec-25690762192c" />

<img width="246" height="500" alt="WhatsApp Image 2026-06-14 at 3 48 23 AM" src="https://github.com/user-attachments/assets/6f50557e-9bb5-4af1-90a9-7c6d134cc0e9" />

<img width="246" height="500" alt="WhatsApp Image 2026-06-14 at 3 48 23 AM (1)" src="https://github.com/user-attachments/assets/005f84a7-e221-4060-a4c2-f55f45e0a284" />
