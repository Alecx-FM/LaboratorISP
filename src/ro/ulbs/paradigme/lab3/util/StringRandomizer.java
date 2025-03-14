package ro.ulbs.paradigme.lab3.util;

public class StringRandomizer {
    public static String generateRandomString(int length) {
        String randomString = "";
        for (int i = 0; i < length; i++) {
            randomString += (char) (Math.random() * 26 + 'a');
        }
        return randomString;
    }
}
