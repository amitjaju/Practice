public class CodePractice {


        public static void main(String[] args) {
            // Debug with custom inputs here
           // String a = "1", b = "2";

            //String a = "144", b = "890"; //1034
            String a = "8944394323791464", b = "2447233402467622";
            // "11391627726259086"
            System.out.println("result: " + largeSum(a, b));

            // Executes in-built test cases & prints the success rate. All test cases should pass for a successful solution
            //executeJunitTests();
        }

        public static String largeSum(String a, String b) {
            int maxLength = Math.max(a.length(), b.length());

            // Pad the shorter string with leading zeros
            a = padLeftZeros(a, maxLength);
            b = padLeftZeros(b, maxLength);

            char[] output = new char[maxLength + 1];
            int carry = 0;

            for (int i = maxLength - 1; i >= 0; i--) {
                int digitA = a.charAt(i) - '0';
                int digitB = b.charAt(i) - '0';

                int sum = digitA + digitB + carry;
                carry = sum / 10;
                output[i + 1] = (char) ('0' + sum % 10);
            }

            // If there's a carry left at the end, add it to the output
            if (carry != 0) {
                output[0] = (char) ('0' + carry);
                return new String(output);
            } else {
                return new String(output, 1, maxLength); // Skip leading zero
            }
        }

        public static String padLeftZeros(String str, int length) {
            char[] padded = new char[length];
            int offset = length - str.length();
            for (int i = 0; i < offset; i++) {
                padded[i] = '0';
            }
            for (int i = 0; i < str.length(); i++) {
                padded[offset + i] = str.charAt(i);
            }
            return new String(padded);
        }

        // DO NOT MODIFY THE CODE BELOW THIS LINE.
//        public static void executeJunitTests() {
//            // Run tests and count passing/failing
//            Result result = JUnitCore.runClasses(TestJunit.class);
//            int testsRun = result.getRunCount();
//            int testsFailed = result.getFailureCount();
//
//            // Optional: print failures
//            for (Failure failure : result.getFailures()) {
//                System.out.println(failure.toString());
//            }
//
//            // REQUIRED
//            // These lines are required in order for our system to assign a grade based on the unit tests
//            System.out.println("__JUNIT__ TESTS RUN COUNT: " + testsRun);
//            System.out.println("__JUNIT__ TESTS FAILURE COUNT: " + testsFailed);
//            System.out.println("__JUNIT__ ALL TESTS PASSING: " + result.wasSuccessful());
//        }
    }


