(10.01.2022)
Zdezydowałem dodać ten readme, żeby nie tylko było widać co wiem, ale jeszcze jak myślę.
Tutaj jest opisany cały process moich myśli od początku projektu.

Jeszcze podczas rozmowy rekrutacyjnej HR powiedziała mi, że data końcowa nie jest ustawiona i mogę wziąć tyle czasu, ile potrzebuję.
Nie uwierzyłem w to spoczątku, bo gdybym robiłem to zadanie miesiąc albo dwa, to byłoby zbyt długo, dlatego ustawiłem sobie termin
końcowy jako koniec przuszłego tygodnia, a potem podzieliłem to przez dwa. Tak zdecydołałem skończyć projekt do niedzieli.
Zadanie otrzymałem w środę, znaczy mam 5 dni.

Jak to często dzieje, kiedy przeczytałem zadanie w pierwszy raz miałem ciemny ekran. Nie miałem żadnego pojęcia co i jak robić.
Jak czas minął, mózg wyciągał z pamięci wiedzę, analizował zadanie na nowo, jeszcze raz wyciągał dane z pamięci.
Tak kawałek za kawałkiem składał się obraz mojego rozumienia.

Zanim zacznę coś robić, mam stworzyć plan, bo projekt nie wygląda na kilka minut. "Dla ułatwienia zadania powinno się go
rozbić na mniejsze części i iść krok po kroku". Jak ustawiłem sobie deadline, to mogę rozpisywać kroki.

1. Przygotowywanie się
2. Stworzenie projektu
3. Połączenie bazy danych
4. Stworzenie modelów
5. Napisanie biznes logiki
6. Napisać testy
7. Papierowa praca

1. Przygotowywanie się

        Już wiem, co mam robić i wiem czego nie wiem. Jest lista spacji, które powinno się wyeliminować. Etap googlowania.
    Ten etap zajął mi 3 dni. Marzyłem i marzę o mentorze, bo 20 minut rozmowy mogły zaoszczędzić mi 3 dni googlowania.
    I zostaje mi tylko wyobrażać jakbym dużo szybszej uczyłem, gdybym miał mentora.

2. Stworzenie projektu.

        Stworzyć projekt, strukturę folderów, pom zależności. To minutowa sprawa, ale może zająć dostatnio czasu, jeśli zapomnię
    jak co się robi. Warte być punktem planu. Nie miałem problemów. spring.io - one love.

3. Połączenie bazy danych.

        Jak mowiłem, to minutowa sprawa, ale może zająć dostatnio czasu, lak coś pójdzie nie tak. Odwrotnie od przeszłego puntku planu
    tutaj wszystko, co mogło pójść nie tak, szło. W interniecie nie mogłem znaleźć informacji o bazie danych, baza danych nie ładowała się,
    konsola nie dziawała, rzeczywistość nie zgadzałą się z krokami instrukcji, program wyświetlał mi exception, którego nie ma
    na stackoverflow. W całości spędziłem do 8-10 godzin za kilka dni,
    póki nie zdecyzowałem przełoczyć się na postrgeSQL. HSQLDB i H2 nie dziłały w żaden sposób.

4. Stworzenie modelów

        To właśnie jest pierwszy punkt przesłanego mi zadania. Jak zrozumiałem, w zadaniu opisywały się klasy i ich pola,
    jak one mają wyglądać. Tutaj nie byłem piewny, ja mam stworzyć tabele w bazie danych, czyli jak słychałem, lepiej poprawnie
    stworzyć klasy w projekcie, a hibernate sam stworzy tabele. Też kosztowało mi kilka godzin googlowania, żebym mógł
    odpowiedzieć sobie na to pytanie.

5. Napisanie biznes logiki

        To raczej jest najsłabszy punkt planu albo punkty planu były źle zapisane do tego momentu,
    bo skakałem między 1, 3 i 4 punktami planu. Polegało to na tym, że miałem słabe wyobrażenie, jak ma wygładać końcowy projekt,
    i rozumienie następnego kroku pojawiało się tylko po skończeniu przeszłego. Tak naprawdę chodziłem po kołu troche.
    Ileś czasu spędziłem przez zły plan.

        Podczas pierwszej edycji tego tekstu jestem na tym etapie. 3 dni ja spędziłem na googlowanie i w sobotę napisałem wszystko,
    co mam na czas terażniejszy - poziom DAO, poziom Service, modele i ich repozytoria.
    Teraz, jak to było ze stworzeniem modelów, mam zrobić wybór. Jak powinne wyglądać poziomy aplikacji Controllers i Views?
        Z jednej strony zadanie wygląda na to, że mam pisać tylko backend, znaczy nie mam tworzyć skomplikowanych plików
    html z wykorzystaniem template engine i form, ale wtedy nie wiem, jak mogę otrzymywać dane.
    Coś słyszałem o @RestController i @RequestBody, tylko nie wiem jeszcze jak z nimi pracować.
        Z drugiej strony, w moim pierwszym projekcie już jest gotowy przykład tego, jak można wszystko realizować przez @Controller
    oraz html formy. Tylko stresuję się przez daty. Nie wiem, jak z nimi pracować i jak to będzie wyglądało w formach html.
    Mógłbym zapytać rekrutera jaką drogą mam iśc, ale tak jak jeszcze nic nie wiem o tym, jak działa realizacja przez @RestContoller,
    to nie jestem pewien, że zmogę sformuwołac pytanie tak, żeby mnie zrozumieli.

        Po sobocie, w niedziele bardzo bolała mi głowa, dlatego prawie nic nie zrobiłem. Bardzo stresowałem się, bo według mnie
    już doszedłem do deadline`u a jeszcze nie mam pojęcia, jak będę realizował controllery. Miły i spokojny głos HRarki oraz jej
    zapewnienie, że mam tyle czasu, ile potrzebuję, pomogły mi zaspokoić się i usunąć presję czasu, którą uczuwałem.
        Teraz planuje googlować temat z realizacją przez @RestContoller i tam dalej edytować plany według tego, co dowie się.
        "Plan to jest nic, planowanie to jest wszystko".

        (13.01.2022)
        Dziś przegooglowałem temat. Zrozumiałem, że mój przeszły projekt pasuje do kryteria restful applikacji.
    Adnotacja @Contorller też dotyczy tego tematu, nie tylko @RestController. Znalazłem równierz odpowiedź na swoje pytanie
    "jak realizować odczyt danych z @RestController". W tym tutorialu był wykorzystywany @RestController, ale wszystko jedno
    tworzył się @Controller i html formy. Teraz wiem, co będę dalej robił. Mam stworzyć html pliki i integrować ich w projekt.

        Stop, nie. Znalazłem na ostatniej niezamkniętej stronie przykład realizacji przez @RestController. Znalazłem jak
    można przesyłać dane do applikacji. Dowiedziałem się o istnieniu rest clientów, a szczególniej o Postmanie. Teraz mogę
    odsyłać post request. Znałem, że jeśli można odsyłać json pliki z aplikacji, to i przyjmować w jakiś sposób to możliwe.
    Ale teraz mam inny problem. Żeby testować applikacje mam pisać json pliki, ale nie umiem pisać json pliki, osobliwie
    dla takiego skoplikowanego obietku jak Rezerwacja. Ta klasa ma pola typu danych Data i pola innych klasów.
        Ja albo mam nauczyć się pisać json pliki, albo tworzyć applikacje przez @Controller z wykorzystaniem html plików,
    template engine oraz modelów. I znowu nie wiem, co będzie lepiej.

        Załatwienie tej sprawy zajęło mi czasu, ale w końcu zrozumiałem, że świetnie ten problem załatwia się przez pytanie do rekrutera.
    Już mogę sformułować pytanie, to mogę wtedy zapytać to u Wiktorii.
    Teraz wiem, że mam to robić przez @RestController, a znaczy nie mam spędzać siły na robienie wyboru.

        (16.01.2022)
        Wszoraj przegooglowałem temat. Wyjaśniałem jak pracować z klasą Date. Dowiedziałem się o istnieniu klasy Calendar.
    Wyjaśniłem różnicę między klasami java.util a java.sql. Tylko nie znalazłem dlaczego mamy korzystać s klasy w pakiecie
    java.sql. Chyba poprostu wtedy nie biędzie data zachowac się do bazy, ale ja nie miałem takiego problemu, chociaż w klasie
    Rezerwacja mam java.util.Date. Myśle, to dlatego, że Spring Data Jpa sam przetwarza datę w poprawny format, ale nie wiem napewno.
    Działa i dobrze, teraz mam inne rzeczy do zrobienia.
        Jeszcze googlowałem jak tworzą się zależności między tabelami w bazach danych. Pamiętam, że nie ma tam nic trudnego,
    ale dawno temu to uczyłem.
        Jeszcze znalazłem niewielki tutorial, jak pisać sjon pliki.
        Takie małe niewyjaśnione rzeczy przeszkadzali mi w napisaniu json plików. Jak tylko wszystko wyjaśniłem, odrazu stało
        oczywiste, jak mam tworzyć post requesty.

        Teraz przetestowałem zapis i odczyt danych, wszystko działa. Z tego momentu mogę tworzyć metody według zadania.