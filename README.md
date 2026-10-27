# Formulir Pendaftaran Mahasiswa Baru — Spring Boot

Simulasi UI pendaftaran mahasiswa baru dengan Spring Boot, Thymeleaf, HTML, dan CSS.

## Teknologi
- Java 17
- Spring Boot 3.5.6
- Spring MVC + Thymeleaf
- Jakarta Bean Validation
- Maven

## Menjalankan secara lokal
1. Pastikan Java 17+ terpasang: `java -version`
2. Pastikan Maven terpasang: `mvn -version`
3. Dari folder proyek, jalankan: `mvn spring-boot:run`
4. Buka `http://localhost:8080`

## Catatan
- Data belum disimpan ke database.
- File PDF hanya divalidasi nama ekstensi dan ukuran; file tidak disimpan.
- Nomor registrasi adalah nomor simulasi, bukan nomor resmi kampus.

## Deploy ke Railway
Proyek menyediakan Dockerfile. Push seluruh folder proyek ke repository GitHub, lalu di Railway pilih New Project → Deploy from GitHub Repo. Railway akan membangun image dari Dockerfile. Setelah deployment selesai, buat domain publik dari menu Networking.
