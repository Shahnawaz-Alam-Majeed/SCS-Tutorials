# Q1: Write a Java program to find the factorial of a given number using a recursive function.

# Q2: Create a Java program that reads a string from the user and counts the number of vowels (a, e, i, o, u) in the string.

#Q3: Write a Java program to check if a given string is a palindrome (reads the same forwards and backwards).

#Q4: Implement a Java class Person with attributes name, age, and gender. Create an array of Person objects and sort them based on their age in ascending order.

# Q5: Develop a Java program to calculate the sum of all prime numbers in a given range.

-- public class SumOfPrimesInRange {
    public static void main(String[] args) {
        int startRange = 1; // Specify your starting range
        int endRange = 100; // Specify your ending range

        long sumOfPrimes = 0; // Initialize the sum to 0

        for (int number = startRange; number <= endRange; number++) {
            if (isPrime(number)) {
                sumOfPrimes += number; // Add prime numbers to the sum
            }
        }

        System.out.println("Sum of prime numbers between " + startRange + " and " + endRange + " is: " + sumOfPrimes);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
} --

Q16: Create a Java class representing a simple calculator that can perform addition, subtraction, multiplication, and division operations. Write a program to demonstrate its usage.

Q17: Write a Java program that reads a text file, counts the occurrences of each word, and displays the word frequency.

Q18: Implement a Java program that simulates a basic ATM machine with options for checking balance, depositing, and withdrawing money.

Q19: Create a Java program that generates a random number and asks the user to guess it. Provide hints (higher or lower) until the user guesses correctly.

Q20: Develop a Java program to find the intersection of two arrays of integers and display the common elements.