package id.ac.ub.filkom.pmb.boundary;

import id.ac.ub.filkom.pmb.control.PendaftaranService;
import id.ac.ub.filkom.pmb.control.HasilPendaftaran;
import id.ac.ub.filkom.pmb.entity.FormPendaftaran;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PendaftaranController {

    private final PendaftaranService pendaftaranService;

    public PendaftaranController(PendaftaranService pendaftaranService) {
        this.pendaftaranService = pendaftaranService;
    }

    @GetMapping("/")
    public String tampilkanForm(Model model) {
        if (!model.containsAttribute("formPendaftaran")) {
            model.addAttribute("formPendaftaran", new FormPendaftaran());
        }
        return "pendaftaran";
    }

    @PostMapping("/daftar")
    public String prosesPendaftaran(
            @Valid @ModelAttribute("formPendaftaran") FormPendaftaran form,
            BindingResult bindingResult,
            @RequestParam("ijazah") MultipartFile ijazah,
            @RequestParam("skl") MultipartFile skl,
            Model model,
            RedirectAttributes redirectAttributes) {

        String pesanFile = pendaftaranService.validasiFile(ijazah, skl);
        if (bindingResult.hasErrors() || pesanFile != null) {
            model.addAttribute("pesanFile", pesanFile);
            return "pendaftaran";
        }

        HasilPendaftaran hasil = pendaftaranService.prosesPendaftaran(form);
        redirectAttributes.addFlashAttribute("hasil", hasil);
        return "redirect:/berhasil";
    }

    @GetMapping("/berhasil")
    public String tampilkanHasil() {
        return "berhasil";
    }
}
