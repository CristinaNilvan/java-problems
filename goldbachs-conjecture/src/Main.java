public class Main {
    final static int MAX_NO_ELEMENTS = 100;

    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;

        for (int divisor = 2; divisor < number / 2; divisor++)
            if (number % divisor == 0)
                return false;

        return true;
    }

    public static boolean checkGoldbachsConjecture(int number) {
        if ((number > 2) && (number % 2 == 0)) {
            var arrayOfPrimeNumbers = new int[MAX_NO_ELEMENTS];
            int numberOfPrimeNumbers = 0;

            for (int i = 0; i < number; i++)
                if (isPrime(i)) {
                    arrayOfPrimeNumbers[numberOfPrimeNumbers] = i;

                    numberOfPrimeNumbers += 1;
                }

            for (int i = 0; i < numberOfPrimeNumbers; i++)
                for (int j = 0; j < numberOfPrimeNumbers; j++) {
                    int sum = arrayOfPrimeNumbers[i] + arrayOfPrimeNumbers[j];

                    if (sum == number)
                        return true;
                }

            return false;
        }

        return false;
    }

    public static void testFunction() {
        System.out.println(checkGoldbachsConjecture(8));
        System.out.println(checkGoldbachsConjecture(7));
    }

    public static void main(String[] args) {
        testFunction();
    }
}
