
Feature: US1009_Yanlis Scenario Outline ile birden fazla dataicin test calistirma

  Scenario Outline: TC14 yanlis kullanici lisesi ile giris yapilamamali

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk sayfa login linkine click yapar
    And kullanici kutusuna manuel olarak "<yanlisUsername>" yazar
    And password kutusuna manuel olarak "<yanlisPassword>" yazar
    And cookiese tiklar
    And 2 saniye bekler
    And login butonuna basar
    And giris yapilamadigini test eder
    Then sayfayi kapatir

    Examples:
      |yanlisUsername  |yanlisPassword|
      |ilker           |ilker@a.com   |
      |mehmet          |mehmet@b.com  |
      |yasar           |yasar@c.com   |
      |Adem            |adem@d.com    |
      |ozgur           |ozgur@e.com   |


