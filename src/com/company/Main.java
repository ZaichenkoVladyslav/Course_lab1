package com.company;

public class Main {

    public static void main(String[] args) {

        // String sentence = "Ищи, Париж, на рты, ты, транжира пищи";
        // String sentence = "Кинь лед зебре, бобер бездельник!";
        // String sentence = "Мак и воду - ртам, ума - трудовикам";
        // String sentence = "Море могуче. В тон ему, шумен, отвечу Гомером";
        // String sentence = "Я – юзер-гуру», - грезю я";

        String sentence = "Аргентина манит негра";
        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll(" ", "")
                .replaceAll("\\.", "")
                .replaceAll("-", "")
                .replaceAll("–", "")
                .replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll("\\?", "")
                .replaceAll("\"", "")
                .replaceAll("«", "")
                .replaceAll("»", "")
                .replaceAll("\\!", "");

        String template = "";

        for (int i = 0; i < sentence.length(); i++) {
            int index = sentence.length() - i - 1;
            template += sentence.charAt(index);
        }

        System.out.println(template);

        if (sentence.equals(template)) {
            System.out.println("This sentence is palindrom - TRUE");
        } else {
            System.out.println("This sentence is not palindrom - FALSE");
        }
    }
}
