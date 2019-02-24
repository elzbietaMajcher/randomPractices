package printerErrors;

public class Printer {

//    public static void main(String[] args) {
//        String errorInfo = "someThing";
//        char[] input = errorInfo.toCharArray();
//        int errors;
//        int length = input.length;
//        int[] numAscii = new int[length];
//
//        for (int i = 0; i < length; i++) {
//            numAscii[i] = input[i];
//            System.out.println(numAscii[i]);
//        }
//}

    public static int[] convertToAscii(char[] charArray) {
        int length = charArray.length;
        int[] numAscii = new int[length];

        for (int i = 0; i < length; i++) {
            numAscii[i] = charArray[i];
        }
        return numAscii;
    }

    public static int calculateErrors(char[] charArray) {
        int errors = 0;
        int[] numAscii = convertToAscii(charArray);
        for (int i = 0; i < numAscii.length; i++) {
            if (numAscii[i] < 97 || numAscii[i] > 109) {
                errors++;
            }
        }
        return errors;
    }


    public static String printerError(String s) {
        String errorInfo = "";
        char[] input = s.toCharArray();
        int errors = calculateErrors(input);
        int attempt = input.length;
        errorInfo = errors + "/" + attempt;
        return errorInfo;
    }

    public static String printerError2(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" +s.length();
    }
}