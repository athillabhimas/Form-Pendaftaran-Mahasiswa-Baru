package id.ac.ub.filkom.pmb.control;

import id.ac.ub.filkom.pmb.entity.FormPendaftaran;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Locale;

@Service
public class PendaftaranService {

    public String validasiFile(MultipartFile ijazah, MultipartFile skl) {
        if (ijazah == null || ijazah.isEmpty()) {
            return "Silakan unggah berkas ijazah.";
        }
        if (skl == null || skl.isEmpty()) {
            return "Silakan unggah berkas SKL.";
        }

        if (!pdfMaksimalDuaMb(ijazah) || !pdfMaksimalDuaMb(skl)) {
            return "Setiap berkas harus berupa PDF dengan ukuran maksimal 2 MB.";
        }
        return null;
    }

    private boolean pdfMaksimalDuaMb(MultipartFile file) {
        String nama = file.getOriginalFilename();
        boolean pdf = nama != null && nama.toLowerCase(Locale.ROOT).endsWith(".pdf");
        return pdf && file.getSize() <= 2 * 1024 * 1024;
    }

    public HasilPendaftaran prosesPendaftaran(FormPendaftaran form) {
        // Nomor ini hanya simulasi. Data dan file belum disimpan ke database/server.
        String nomor = "PMB-" + (System.currentTimeMillis() % 1_000_000);
        return new HasilPendaftaran(nomor, form.getNamaLengkap(), form.getProgramStudi());
    }
}
