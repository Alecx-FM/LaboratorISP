package ro.ulbs.paradigme.lab2;
import ro.ulbs.paradigme.lab4.student;
import java.util.*;

import ro.ulbs.paradigme.lab3.util.PasswordMaker;

public class Main {
    public static void main(String[] args) {
        /*
        //Lab 2
        Triangle tri = new Triangle(1.1F, 2.0F, "red");
        Circle c = new Circle(1.5F, "yellow");
        Square sq = new Square(1.2F, "blue");

        System.out.println("Aria = " + tri.getArea() + " detalii: " + tri);
        System.out.println("Aria = " + c.getArea() + " detalii: " + c);
        System.out.println("Aria = " + sq.getArea() + " detalii: " + sq);

        Triangle tri2 = new Triangle(1.1F, 2.0F, "red");
        System.out.println("Triunghi2 este egal cu Triunghi1: " + tri.equals(tri2));

        Triangle tri3 = new Triangle(1.1F, 2.0F, "brown");
        System.out.println("Triunchi3 este egal cu Triunghi1: " + tri.equals(tri3));

        //Lab 3
        System.out.println("Numarul de instante create: " + Form.counter);

        PasswordMaker passwordMaker = new PasswordMaker("Marcel112");
        String password = passwordMaker.getPassword();
        System.out.println("Generated Password: " + password);

        //Lab 4
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList();
        Set<Integer> zSet = new TreeSet();
        List<Integer> xMinusY = new ArrayList();
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList();
        for(int i=0;i<5;i++)
        {
            int rand = (int)((Math.random()*10)+1);
            x.add(rand);
        }
        for(int i=0;i<7;i++) {
            int  rand = (int) ((Math.random() * 10)+1);
            y.add(rand);
        }
        Collections.sort(x);
        System.out.println("X: "+x);
        Collections.sort(y);
        System.out.println("Y: "+y);
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        System.out.println("X+Y: "+xPlusY);
        for(Object object: x)
        {
            if(y.contains(object))
            {
                zSet.add((Integer)object);
            }
        }
        System.out.println("Z: "+zSet);

        List<Integer> xCevay = new ArrayList();
        xCevay.addAll(y);
        for(Object object: x)
        {
            if(y.contains(object))
            {
                xCevay.remove(object);
            }
        }
        xMinusY.addAll(xCevay);
        System.out.println("X-Y: "+xMinusY);
        for(Object object: xPlusY)
        {
            if((Integer)object<p)
            {
                xPlusYLimitedByP.add((Integer)object);
            }
        }
        System.out.println("X+Y limited by p: "+xPlusYLimitedByP);

        List<student> students = new ArrayList<>();
        students.add(new student("Ion Popescu", "223_1"));
        students.add(new student("Maria Popa", "223_2"));
        students.add(new student("Diana Oprea", "223_1"));
        students.add(new student("Andrei Ionescu", "223_3"));
        students.add(new student("Elena Mihai", "223_2"));
        students.add(new student("George Dinu", "223_1"));
        students.add(new student("Ana Barbu", "223_3"));

        System.out.println("All students with random grades:");
        for (student s : students) {
            System.out.println(s);
        }

        System.out.println("\nStudents sorted alphabetically by name, grouped by group:");
        Map<String, List<student>> groupedStudents = new TreeMap<>();

        for (student s : students) {
            if (!groupedStudents.containsKey(s.getGrupa())) {
                groupedStudents.put(s.getGrupa(), new ArrayList<>());
            }
            groupedStudents.get(s.getGrupa()).add(s);
        }

        for (Map.Entry<String, List<student>> entry : groupedStudents.entrySet()) {
            System.out.println("Group: " + entry.getKey());

            List<student> groupStudents = entry.getValue();
            Collections.sort(groupStudents, Comparator.comparing(student::getName));

            for (student s : groupStudents) {
                System.out.println("  " + s);
            }
        }

        System.out.println("\nIntegralists sorted by descending average grade:");
        List<student> integralisti = new ArrayList<>();

        for (student s : students) {
            if (s.isIntegralist()) {
                integralisti.add(s);
            }
        }

        Collections.sort(integralisti, (s1, s2) -> Double.compare(s2.getAverage(), s1.getAverage()));

        for (student s : integralisti) {
            System.out.println(s + " - Average: " + String.format("%.2f", s.getAverage()));
        }

        System.out.println("\nRestantieri sorted by ascending number of failed subjects:");
        List<student> restantieri = new ArrayList<>();

        for (student s : students) {
            if (!s.isIntegralist()) {
                restantieri.add(s);
            }
        }

        Collections.sort(restantieri, Comparator.comparing(student::getFailedCount));

        for (student s : restantieri) {
            System.out.println(s + " - Failed subjects: " + s.getFailedCount());
        }
        */
    }
}