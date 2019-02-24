import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Reader {


    public void countWords() throws URISyntaxException {
        URI fileUri = getClass().getClassLoader().getResource("pan-tadeusz.txt").toURI();
        System.out.println(fileUri);

        // Map<slowa, liczbaWystapienSlowa>
        Map<String, Integer> wordCountMap = new HashMap<>();

        Charset charset = Charset.forName("UTF-8");


        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileUri.getPath()), charset)) {
            String line;
            // wczytaj kolejną linijkę z pliku i jeżeli nie jest nullem, przetwarzaj ją.
            // Wczytana linijka będzie nullem dopiero jak dotrzemy do końca pliku
            while ((line = br.readLine()) != null) {
                // Wszystkie znaki, które nie są wymienione na liście poniżej - zamień na spacje
                line = line.replaceAll("[^a-zA-ZąĄęĘżŻźŹćĆńŃóÓłŁśŚ]", " ");
                // Zamień wszystkie znaki litery na małe litery
                line = line.toLowerCase();
                // Podziel każdą linijkę na słowa - dzieląć Stringa na mniejsze wszedzie tam, gdzie pojawia się spacja
                String[] words = line.split(" ");
                //System.out.println(Arrays.toString(words));

                for (String word : words) {
                    if (word.length() > 0) {
                        Integer wordCountValue = wordCountMap.get(word);
                        if (wordCountValue == null) {
                            // tego słowa wcześniej nie widzieliśmy!
                            wordCountMap.put(word, 1);
                        } else {
                            // to słowo już wcześniej było
                            wordCountMap.put(word, wordCountValue + 1);
                        }
                    }
                }

            }
            System.out.println(wordCountMap.toString());

            // Dowolną mapę możemy odczytać jako zbiór (Set) par klucz+wartość, korzystając z metody .entrySet()
            Set<Map.Entry<String, Integer>> entries;
            entries = wordCountMap.entrySet();
            // Dowolny Set możemy zamienić na Listę, korzystając (w tym przypadku) z konstruktora ArrayListy
            List<Map.Entry<String, Integer>> entriesList = new ArrayList<>(entries);
            // Dowolną listę możemy posortować, w taki sposób, jaki chcemy
            // W tym celu musimy stworzyć Comparator - czyli sposób na porównanie dwóch elementów w celu określenia, który powinien stać przed którym
            Collections.sort(entriesList, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> pair1, Map.Entry<String, Integer> pair2) {
                    ;
                    String word1 = pair1.getKey();
                    Integer count1 = pair1.getValue();
                    String word2 = pair2.getKey();
                    Integer count2 = pair2.getValue();

                    // Fragment z dokumentacji metody compare:
                    // Zwraca liczbę ujemną, zero albo dodatnią, jeżeli pierwszy element jest mniejszy, równy albo większy niż drugi
                    // Jeżeli count1 to 5, a count2 to 20, wystarczy ze odejmiemy jedno od drugiego i otrzymamy liczbę ujemną (a więc informację, że pierwszy element jest mniejszy. Podobnie dla pozostałych wartości.
                    // W comparatorze sama wartość zwracana nie ma absolutnie znaczenia - ważne jest tylko, aby "znak" si<e zgadza<l (dodatnia, zero lub ojemna liczba).
                    // Takie odejmowanie (element1 - element2) posortuje nam elementy od najmniejszych do największych. A my chcemy zrobić dokładnie odwrotnie dzisiaj - posortować od najwiekszego do najmniejszego. Dlatego... odejmujemy je na odwrót.
                    // Wiecej można doczytać np. pod tym adresem: https://www.journaldev.com/780/comparable-and-comparator-in-java-example
                    return count2 - count1;
                }
            });
            br.close();

            System.out.println(entriesList);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


