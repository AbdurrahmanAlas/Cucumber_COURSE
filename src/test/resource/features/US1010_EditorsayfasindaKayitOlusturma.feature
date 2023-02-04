@wip
Feature: US1010 Kullanici Scenario Outline ile Editör sayfasinda kayit olusturur

  Scenario Outline: TC15 Editor sayfasinda birden fazla kayit olusturabilmeli

    When kullanici "editorUrl" anasayfaya gider
    Then new butonuna basar
    And First name kutusuna "<firstName>" yazar
    And Last name kutusuna "<lastName>" yazar
    And position kutusuna "<position>" yazar
    And Office kutusuna "<office>" yazar
    And Extension kutusuna "<Extension>" yazar
    And Start date kutusuna "<startDate>" yazar
    And Salary kutusuna "<salary>" yazar
    And Create tusuna basar
    When kullanici "<firstName>" ile arama yapar
    Then isim bolumunde "<firstName>" oldugunu dogrular
    And 3 saniye bekler
    Then sayfayi kapatir

    Examples:
      | firstName | lastName | position  | office   | Extension | startDate  | salary |
      | ahmet     | Bulut    | QA        | Istanbul | levent    | 2021-01-01 | 20000  |
      | senem     | Can      | QA lead   | Ankara   | Kizilay   | 2021-10-01 | 25000  |
      | veli      | Saglam   | Test lead | Izmir    | Konak     | 2022-02-02 | 23000  |
      | kerem     | U        | QA        | Istanbul | Kadikoy   | 2023-01-01 | 25000  |
      | sule      | Toprak   | QA lead   | Istanbul | levent    | 2022-11-11 | 20000  |