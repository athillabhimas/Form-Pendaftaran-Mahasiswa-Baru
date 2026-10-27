package id.ac.ub.filkom.pmb.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class FormPendaftaran {

    @NotBlank(message = "Nama lengkap wajib diisi.")
    @Size(max = 100, message = "Nama maksimal 100 karakter.")
    private String namaLengkap;

    @NotBlank(message = "NIK wajib diisi.")
    @Pattern(regexp = "\\d{16}", message = "NIK harus terdiri dari 16 digit angka.")
    private String nik;

    @NotBlank(message = "Tempat lahir wajib diisi.")
    private String tempatLahir;

    @NotBlank(message = "Tanggal lahir wajib diisi.")
    private String tanggalLahir;

    @NotBlank(message = "Jenis kelamin wajib dipilih.")
    private String jenisKelamin;

    @NotBlank(message = "Alamat lengkap wajib diisi.")
    private String alamatLengkap;

    @NotBlank(message = "Nomor telepon wajib diisi.")
    @Pattern(regexp = "[0-9+() -]{8,20}", message = "Format nomor telepon tidak valid.")
    private String nomorTelepon;

    @NotBlank(message = "Email wajib diisi.")
    @Email(message = "Format email tidak valid.")
    private String email;

    @NotBlank(message = "Asal sekolah wajib diisi.")
    private String asalSekolah;

    @NotBlank(message = "Program studi wajib dipilih.")
    private String programStudi;

    @NotBlank(message = "Pernyataan wajib disetujui.")
    private String persetujuan;

    public String getNamaLengkap() { return namaLengkap; }
    public void setNamaLengkap(String namaLengkap) { this.namaLengkap = namaLengkap; }

    public String getNik() { return nik; }
    public void setNik(String nik) { this.nik = nik; }

    public String getTempatLahir() { return tempatLahir; }
    public void setTempatLahir(String tempatLahir) { this.tempatLahir = tempatLahir; }

    public String getTanggalLahir() { return tanggalLahir; }
    public void setTanggalLahir(String tanggalLahir) { this.tanggalLahir = tanggalLahir; }

    public String getJenisKelamin() { return jenisKelamin; }
    public void setJenisKelamin(String jenisKelamin) { this.jenisKelamin = jenisKelamin; }

    public String getAlamatLengkap() { return alamatLengkap; }
    public void setAlamatLengkap(String alamatLengkap) { this.alamatLengkap = alamatLengkap; }

    public String getNomorTelepon() { return nomorTelepon; }
    public void setNomorTelepon(String nomorTelepon) { this.nomorTelepon = nomorTelepon; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAsalSekolah() { return asalSekolah; }
    public void setAsalSekolah(String asalSekolah) { this.asalSekolah = asalSekolah; }

    public String getProgramStudi() { return programStudi; }
    public void setProgramStudi(String programStudi) { this.programStudi = programStudi; }

    public String getPersetujuan() { return persetujuan; }
    public void setPersetujuan(String persetujuan) { this.persetujuan = persetujuan; }
}
