package ru.geekbrains.lesson4;

import java.util.*;

public class HomeWork4 {

    private static String word;

    public static  void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList(
                "One", "Two", "Three", "Four", "Five", "Two", "Six", "Six",
                "Seven", "Three", "One", "Eight", "Nine", "Three", "Two", "One", "Five", "Ten"
        ));

        printWithoutDuplicates(stringList);
        countDuplicates(stringList);
        testPhoneBook();
    }
    public  static  void printWithoutDuplicates(List<String> input) {
        Set<String> inputSet = new HashSet<>(input);
        System.out.println(inputSet);
    }
    public static void countDuplicates(List<String> input) {
        Set<String> inputSet = new HashSet<>(input);
        for (String world : inputSet) {
            int count = 0;
            for (String inner : input) {
                if (word.equals(inner)) {
                    count++;
                }
            }
            System.out.printf("%s: %d\n", word, count);
        }
    }
    public static void testPhoneBook() {
        PhoneBook.add("Chilvers", "+1 951 707 8915");
        PhoneBook.add("Hodgon", "+7 873 336 0160");
        PhoneBook.add("Ewence", "+420 520 329 9315");
        PhoneBook.add("Frampton", "+977 160 615 2260");
        PhoneBook.add("Roose", "+86 128 606 6341");
        PhoneBook.add("Goodee", "+86 352 635 7554");
        PhoneBook.add("Lowseley", "+57 848 586 0804");
        PhoneBook.add("Bere", "+351 379 752 0647");
        PhoneBook.add("Avramovsky", "+33 354 518 8651");
        PhoneBook.add("Roose", "+86 438 822 4806");
        PhoneBook.add("Hodgon", "+55 699 111 6724");
        PhoneBook.add("Chilvers", "+51 842 705 3113");
        PhoneBook.add("Cheng", "+30 834 670 9834");
        PhoneBook.add("Roose", "+993 496 202 7795");
        PhoneBook.add("Hunstone", "+62 434 489 5152");
        PhoneBook.add("Arthur", "+372 187 399 1059");
        PhoneBook.add("Yurin", "+234 791 740 9424");
        PhoneBook.add("Wernher", "+51 337 709 8896");


        PhoneBook.get("Chilvers");
        PhoneBook.get("Hodgon");
        PhoneBook.get("Ewence");
        PhoneBook.get("Frampton");
        PhoneBook.get("Roose");
        PhoneBook.get("Goodee");
        PhoneBook.get("Lowseley");
        PhoneBook.get("Bere");
        PhoneBook.get("Avramovsky");
        PhoneBook.get("Cheng");
        PhoneBook.get("Hunstone");
        PhoneBook.get("Arthur");
        PhoneBook.get("Yurin");
        PhoneBook.get("Wernher");

    }
}
