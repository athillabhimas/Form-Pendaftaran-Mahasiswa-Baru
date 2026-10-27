package id.ac.ub.filkom.pmb.control;

public class HasilPendaftaran {
    private final String nomorRegistrasi;
    private final String namaLengkap;
    private final String programStudi;

    public HasilPendaftaran(String nomorRegistrasi, String namaLengkap, String programStudi) {
        this.nomorRegistrasi = nomorRegistrasi;
        this.namaLengkap = namaLengkap;
        this.programStudi = programStudi;
    }

    public String getNomorRegistrasi() {
        return nomorRegistrasi;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getProgramStudi() {
        return programStudi;
    }
}
