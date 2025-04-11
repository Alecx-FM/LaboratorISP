package ro.ulbs.paradigme.lab4;
import java.util.ArrayList;
import java.util.Objects;

public class student {
    private String name;
    private String grupa;
    private ArrayList<Integer> note;

    // Constructor with random grades
    public student(String name, String grupa) {
        this.name = name;
        this.grupa = grupa;
        this.note = new ArrayList<>();

        // Generate 5 random grades in range [4..10]
        for (int i = 0; i < 5; i++) {
            note.add((int)(Math.random() * 7) + 4);
        }
    }

    // Constructor with provided grades
    public student(String name, String grupa, ArrayList<Integer> note) {
        this.name = name;
        this.grupa = grupa;
        this.note = note;
    }

    // Calculate average grade
    public double getAverage() {
        int sum = 0;
        for (Integer grade : note) {
            sum += grade;
        }
        return (double) sum / note.size();
    }

    // Check if student passed all subjects (grades >= 5)
    public boolean isIntegralist() {
        for (Integer grade : note) {
            if (grade < 5) return false;
        }
        return true;
    }

    // Count failed subjects
    public int getFailedCount() {
        int count = 0;
        for (Integer grade : note) {
            if (grade < 5) count++;
        }
        return count;
    }

    // Getters and setters
    public String getName() { return name; }
    public String getGrupa() { return grupa; }
    public ArrayList<Integer> getNote() { return note; }

    @Override
    public String toString() {
        return name + " (Grupa: " + grupa + ") - Note: " + note;
    }
}