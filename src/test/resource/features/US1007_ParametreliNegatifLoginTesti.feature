

  Feature: Kullanici yanlis bilgilerle giris yapamaz

    Scenario: TC09 Gecerli kullanici adi ve gecersiz sifre ile Negatif Login Testi

      Given kullanici "qdUrl" anasayfaya gider
      Then ilk sayfa login linkine click yapar
      And kullanici kutusuna "qdGecerliUsername" yazar
      And password kutusuna "qdGecersizPassword" yazar
      Then  accept tusuna basar
      And 3 saniye bekler
      Then login butonuna basar
      And basarili giris yapilamadigini test eder
      And 3 saniye bekler
      Then sayfayi kapatir


    Scenario: TC10 Gecersiz kullanici adi ve gecerli sifre ile Negatif Login Testi
      Given kullanici "qdUrl" anasayfaya gider
      Then ilk sayfa login linkine click yapar
      And kullanici kutusuna "qdGecersizUsername" yazar
      And password kutusuna "qdGecerliPassword" yazar
      Then  accept tusuna basar
      And 3 saniye bekler
      Then login butonuna basar
      And basarili giris yapilamadigini test eder
      And 3 saniye bekler
      Then sayfayi kapatir

    Scenario: TC11 Gecersiz kullanici adi ve gecersiz sifre ile Negatif Login Testi

      Given kullanici "qdUrl" anasayfaya gider
      Then ilk sayfa login linkine click yapar
      And kullanici kutusuna "qdGecersizUsername" yazar
      And password kutusuna "qdGecersizPassword" yazar
      Then  accept tusuna basar
      And 3 saniye bekler
      Then login butonuna basar
      And basarili giris yapilamadigini test eder
      And 3 saniye bekler
      Then sayfayi kapatir