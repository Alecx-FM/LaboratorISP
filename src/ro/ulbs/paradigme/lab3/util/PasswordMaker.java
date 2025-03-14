package ro.ulbs.paradigme.lab3.util;

public class PasswordMaker {
    private static final int MAGIC_NUMBER = (int)(Math.random()*5)+5;
    private final String magicstring=StringRandomizer.generateRandomString(20);
    private final String name;

    public PasswordMaker(String name) {
        this.name = name;
    }

    public String getRandomSubstring() {
        int start = (int) (Math.random() * (magicstring.length() - 10 + 1));
        return magicstring.substring(start, start + 10);
    }

    public String getPassword() {
        return StringRandomizer.generateRandomString(MAGIC_NUMBER)+getRandomSubstring() + name.length()+ (int)(Math.random()*50);
    }

}
