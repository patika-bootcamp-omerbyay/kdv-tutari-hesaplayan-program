import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımlıyoruz
        double tutar, kdvOrani, kdvTutari, kdvliFiyat;

        // Kullanıcıdan veri girişi alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        // Ödev kısmındaki mantıksal koşul:
        // Tutar 0-1000 arası ise %18, 1000'den büyükse %8
        if (tutar > 0 && tutar <= 1000) {
            kdvOrani = 0.18;
        } else if (tutar > 1000) {
            kdvOrani = 0.08;
        } else {
            // Tutarın 0 veya negatif olması durumu için
            kdvOrani = 0;
            System.out.println("Geçersiz tutar girdiniz!");
        }

        // Hesaplamaları yapıyoruz
        kdvTutari = tutar * kdvOrani;
        kdvliFiyat = tutar + kdvTutari;

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("\n--- Hesaplama Sonuçları ---");
        System.out.println("KDV'siz Tutar: " + String.format("%.1f", tutar) + " TL");
        System.out.println("KDV Oranı: %" + (int)(kdvOrani * 100));
        System.out.println("KDV Tutarı: " + String.format("%.1f", kdvTutari) + " TL");
        System.out.println("KDV'li Toplam Fiyat: " + String.format("%.1f", kdvliFiyat) + " TL");

        input.close();
    }
}
