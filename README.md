# kdv-tutari-hesaplayan-program
Java - KDV Tutarı Hesaplayan Program

Dinamik Vergi Oranı: Kodun içine tek bir oran gömmek yerine, tutara göre değişen bir yapı (if-else) kullanılmıştır.

Hassas Hesaplama: double veri tipi kullanıldığı için ondalıklı sayılar (virgülden sonraki kısımlar) doğru bir şekilde korunmuştur.

Formatlama: İstediğin gibi noktadan/virgülden sonra tek basamak gösterilerek (%.1f), çıktının karmaşık görünmesi engellenmiş ve daha okunabilir (temiz) bir rapor sunulmuştur.

Örnekler:

1. Senaryo: Düşük Tutar (%18 KDV)

    Giriş: 123 TL

     Mantık Kontrolü: Program, 123 değerinin 0 ile 1000 arasında olup olmadığına bakar.

      Sonuç: Koşul sağlandığı için vergi oranı otomatik olarak %18 olarak seçilir.

      Hesaplama: * 123×0.18=22.14 (Formatlama ile 22,1 görünüyor).

      123+22.1=145.1 TL toplam fiyat oluşur.

2. Senaryo: Yüksek Tutar (%8 KDV)

    Giriş: 1234 TL

     Mantık Kontrolü: Program, 1234 değerinin 1000'den büyük olduğunu tespit eder.

      Sonuç: Kullanıcıya bir tür "vergi avantajı" veya "toptan alım indirimi" gibi yansıyan %8 oranı devreye girer.

      Hesaplama:

      1234×0.08=98.72 (Formatlama ile 98,7 görünüyor).

      1234+98.7=1332.7 TL toplam fiyat oluşur.
