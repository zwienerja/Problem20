import java.math.BigInteger;

public class Problem20 {

    public static void main(String[] args) {
        long n = 100;
        int sum = 0;
        BigInteger result = BigInteger.ONE, nextTerm, currentTerm = BigInteger.valueOf(n);

        for (int i = 0; i < 99; i++){
            nextTerm = currentTerm.subtract(BigInteger.ONE);
            result = result.multiply(nextTerm);
            currentTerm = nextTerm;
        }

        String resultString = result.toString();
        for (int i = 0; i < resultString.length(); i++){
            Character currentDigit = resultString.charAt(i);
            String currentFactor = currentDigit.toString();
            int factor = Integer.parseInt(currentFactor);
            sum += factor;
        }
        System.out.println(sum);
    }
}
