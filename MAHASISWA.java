package praktikum5;

class siswa {
    private String nim;
    private String nama;
    protected String teori;
    protected String praktik;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTeori() {
        return teori;
    }

    public void setTeori(String teori) {
        this.teori = teori;
    }

    public String getPraktik() {
        return praktik;
    }

    public void setPraktik(String praktik) {
        this.praktik = praktik;
    }

}

public class MAHASISWA {
    public static void main(String[] args) {
        siswa objekK1 = new siswa();
        objekK1.setNim("1");
        objekK1.setNama("Ghiyatsi");
        objekK1.setTeori("90");
        objekK1.setPraktik("95");

        siswa objekK2 = new siswa();
        objekK2.setNim("2");
        objekK2.setNama("Anis");
        objekK2.setTeori("90");
        objekK2.setPraktik("85");

        String nim_1 = objekK1.getNim();
        String nama_1 = objekK1.getNama();
        String teori_1 = objekK1.getTeori();
        String praktik_1 = objekK1.getPraktik();

        String nim_2 = objekK2.getNim();
        String nama_2 = objekK2.getNama();
        String teori_2 = objekK2.getTeori();
        String praktik_2 = objekK2.getPraktik();
        System.out.println("NIM  : " + nim_1);
        System.out.println("Nama  : " + nama_1);
        System.out.println("Nilai Teori  : " + teori_1);
        System.out.println("Nilai Praktik  : " + praktik_1);

        System.out.println("NIM  : " + nim_2);
        System.out.println("Nama  : " + nama_2);
        System.out.println("Nilai Teori  : " + teori_2);
        System.out.println("Nilai Praktik  : " + praktik_2);

    }
}
