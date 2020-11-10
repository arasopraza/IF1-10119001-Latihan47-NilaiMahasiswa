/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: program menghitung nilai yang berasal
 * dari inputan user dengan berbasis OOP
 */

public class Main {
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        nilai.setKuis(60.0);
        nilai.setUts(80.0);
        nilai.setUas(75.0);

        System.out.println("QUIZ\t\t\t = " + nilai.getKuis());
        System.out.println("UTS\t\t\t\t = " + nilai.getUts());
        System.out.println("UAS\t\t\t\t = " + nilai.getUas());
        System.out.print("\n");
        System.out.println("Nilai Akhir\t\t = " + nilai.getNilaiAkhir());
        System.out.print("\n");
        System.out.println("Index = " + nilai.mencariIndexNilai(nilai.getNilaiAkhir()));
        System.out.print("Keterangan = " + nilai.menentukanKeterangan(nilai.mencariIndexNilai(nilai.getNilaiAkhir())));
    }
}
