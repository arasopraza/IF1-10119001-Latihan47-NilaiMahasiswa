public class Nilai {
    private double kuis, uts, uas;

    public double getKuis() {
        return kuis;
    }

    public void setKuis(double kuis) {
        this.kuis = kuis;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getNilaiAkhir() {
        return 0.20 * kuis + 0.30 * uts + 0.50 * uas;
    }

    public char mencariIndexNilai(double nilaiAkhir) {
        char indexPrestasi = 'n';
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            indexPrestasi = 'A';
        } else if (nilaiAkhir >= 68 && nilaiAkhir < 80) {
            indexPrestasi = 'B';
        } else if (nilaiAkhir >= 56 && nilaiAkhir < 68) {
            indexPrestasi = 'C';
        } else if (nilaiAkhir >= 45 && nilaiAkhir < 56) {
            indexPrestasi = 'D';
        } else if (nilaiAkhir >= 0 && nilaiAkhir < 45) {
            indexPrestasi = 'E';
        }
        return indexPrestasi;
    }

    public String menentukanKeterangan(char indexPrestasi) {
        String keterangan = "";
        if (indexPrestasi == 'A') {
            keterangan = "Sangat Baik";
        } else if (indexPrestasi == 'B') {
            keterangan = "Baik";
        } else if (indexPrestasi == 'C') {
            keterangan = "Cukup";
        } else if (indexPrestasi == 'D') {
            keterangan = "Kurang";
        } else if (indexPrestasi == 'E') {
            keterangan = "Sangat Kurang";
        }
        return keterangan;
    }
}
