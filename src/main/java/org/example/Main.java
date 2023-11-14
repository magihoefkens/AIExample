package org.example;

public class Main {
    public static void main(String[] args) {

        String originalString = "Hello";
        String reversedString = reverseString(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
        String palindromeString = "level";
        boolean isPalindrome = isPalindrome(palindromeString);

        System.out.println("Is \"" + palindromeString + "\" a palindrome? " + isPalindrome);
        int n = 10; // Du kannst hier die gewünschte Anzahl der Primzahlen ändern
        int[] primes = generatePrimes(n);

        System.out.println("Die ersten " + n + " Primzahlen sind:");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }

    public static String reverseString(String input) {
        // Konvertiere die Zeichenkette in einen StringBuilder
        StringBuilder stringBuilder = new StringBuilder(input);

        // Verwende die reverse-Methode des StringBuilders
        stringBuilder.reverse();

        // Konvertiere den StringBuilder zurück in eine Zeichenkette
        return stringBuilder.toString();
    }
    public static boolean isPalindrome(String input) {
        // Entferne Leerzeichen und setze alles in Kleinbuchstaben für den Fallinsensitiven Vergleich
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        // Verwende zwei Zeiger (von Anfang und Ende der Zeichenkette)
        int start = 0;
        int end = cleanedInput.length() - 1;

        // Vergleiche die Zeichen von beiden Enden in Richtung Mitte
        while (start < end) {
            if (cleanedInput.charAt(start) != cleanedInput.charAt(end)) {
                return false; // Nicht identische Zeichen gefunden, keine Palindrom
            }
            start++;
            end--;
        }

        return true; // Alle Paare von Zeichen waren identisch, es ist ein Palindrom
    }
    public static int[] generatePrimes(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Die Anzahl der Primzahlen muss größer als 0 sein.");
        }

        int[] primes = new int[n];
        int count = 0;
        int number = 2; // Starte bei der ersten Primzahl

        while (count < n) {
            if (isPrime(number)) {
                primes[count] = number;
                count++;
            }
            number++;
        }

        return primes;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
    //Diese Methode verwendet die Sieb des Eratosthenes Methode, um die ersten n Primzahlen zu generieren. Beachte, dass dies eine einfache Implementierung ist und für große n-Werte möglicherweise nicht optimal ist. Für effizientere Methoden zur Generierung von Primzahlen könntest du den Sieb des Eratosthenes Algorithmus oder den Miller-Rabin Primzahltest in Betracht ziehen.




