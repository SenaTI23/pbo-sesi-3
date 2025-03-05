public class Main {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 3);
        Segitiga segitiga = new Segitiga(6, 4);

        System.out.println("Luas Bujur Sangkar: " + bujurSangkar.hitungLuas());
        System.out.println("Keliling Bujur Sangkar: " + bujurSangkar.hitungKeliling());

        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());

        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());
    }
}
