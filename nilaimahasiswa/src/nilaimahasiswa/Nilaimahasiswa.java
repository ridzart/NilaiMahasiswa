/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa;

/**
 *
 * @author Harrid ALfasya
 * Nama     : Harrid Alfasya
 * Kelas    : Pbo-12
 * NIm      : 10116508
 */
public class Nilaimahasiswa {

    private double quiz, uts, uas, na;
    private String nama, nim;

    void getIndexNilai(double na) {
        if (na >= 80) {
            System.out.println("index = A");
            System.out.println("keterangan = sangat baik");
        } else if (na >= 68) {
            System.out.println("index = B");
            System.out.println("keterangan = baik");
        } else if (na >= 56) {
            System.out.println("index = C");
            System.out.println("keterangan = cukup");
        } else if (na >= 45) {
            System.out.println("index = D ");
            System.out.println("keterangan = kurang");
        } else if (na >= 0) {
            System.out.println("index = E");
            System.out.println("keterangan = sangat kurang");
        }

    }

    double getNilaiAkhir() {
        return na = (0.2 * quiz) + (0.3 * uts) + (0.5 * uas);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilaimahasiswa o = new Nilaimahasiswa();
        o.nama = "rizki adam kurniawan";
        o.nim = "7.51.15.036";

        for (int i = 1; i <= 4; i++) {
            System.out.println("nama ke-" + i + "\t" + o.nama);
        }

        for (int j = 8; j >= 1; j--) {
            System.out.println("nim ke-" + j + "\t" + o.nim + "." + j);
        }
        o.quiz = 75;
        o.uts = 45;
        o.uas = 34;
        double nilai = o.getNilaiAkhir();
        System.out.println("Nilai Akhir : \t" + nilai);

        o.getIndexNilai(nilai);

    }

}
