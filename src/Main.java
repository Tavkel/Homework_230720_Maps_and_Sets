import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (var num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 10, 8));
        Set<Integer> uniqueNums = new HashSet<>(nums);

        for (var num : uniqueNums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void task3() {
        String input = "Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли. Код должен работать с любой последовательностью и объемом списка слов.\n" +
                "\n" +
                "В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения. \n" +
                "\n" +
                "- Критерии проверки\n" +
                "    - В консоль выводятся только уникальные слова из списка слов\n" +
                "    - Код работает с любой последовательностью и объемом списка слов";

        var array = input.toLowerCase().split("[,.\\s]");

        //Как вариант
        var unique = Arrays.stream(input.toLowerCase().split("[,.\\s]")).distinct().collect(Collectors.toList());

        Set<String> uniqueWords = new HashSet<>(List.of(array));

        for (var word : uniqueWords) {
            System.out.println(word);
        }
    }

    public static void task4() {
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> wordsAndCounts = new HashMap<>();
        for (var string : strings) {
            if (!wordsAndCounts.containsKey(string)) {
                wordsAndCounts.put(string, 1);
            } else {
                wordsAndCounts.put(string, wordsAndCounts.get(string) + 1);
            }
        }
        System.out.println(wordsAndCounts);
    }
}