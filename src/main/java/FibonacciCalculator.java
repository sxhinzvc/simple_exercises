public class FibonacciCalculator {
    public int findFibonacciNumberRecursively(int positionNumber) {
        if (positionNumber == 1 || positionNumber == 2)
            return 1;
        return findFibonacciNumberRecursively(positionNumber-1) + findFibonacciNumberRecursively(positionNumber-2);
    }

    public int findFibonacciNumberNonRecursively(int positionNumber) {
        if (positionNumber == 1 || positionNumber == 2)
            return 1;

        int currentFibonacciNumber=0;
        int previousFibonacciNumber=1;
        int twoPreviousFibonacciNumber=1;

        for (int position = 3; position <= positionNumber; position++) {
            currentFibonacciNumber = previousFibonacciNumber + twoPreviousFibonacciNumber;
            twoPreviousFibonacciNumber = previousFibonacciNumber;
            previousFibonacciNumber = currentFibonacciNumber;
        }

        return currentFibonacciNumber;
    }
}
