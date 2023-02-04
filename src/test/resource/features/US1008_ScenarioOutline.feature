
@wip
Feature: US1008 Scenario Outline ile birden fazla data icin test calistirma

  Scenario Outline:


      #Amazon anasayfaya gidelim .Nutella,Java ,Samsung ve Apple icin arama yapip
     # arama sonuclarinin aradiginmiz kelimeyi icerdigini test edelim


    Given  kullanici "amazonUrl" anasayfaya gider
    Then amazon arama kutusuna "<arananUrun>" yazip aratir
    And  arama sonuclarinin "<arananUrun>" icerdigini test eder
    Then  sayfayi kapatir

    Examples:
      | arananUrun |
      | Nutella    |
      | Java       |
      | Samsung    |
      | Apple      |