package ro.fasttrackit.file.inheritance;

import ro.fasttrackit.file.person.Person;

public abstract class AbstractPersonReportGenerator {
    // Person - firstName, lastName, age
    // firstName lastName - ADULT

    public void displayReport() {
        Person[] people = readPeople();
        String[] reportLines = createReport(people);
        for (String line : reportLines) {
            System.out.println(line);
        }
    }

    private String[] createReport(Person[] people) {
        String[] result = new String[people.length];
        for (int i = 0; i < people.length; i++) {
            result[i] = people[i].getFirstName() + " " + people[i].getLastName() + " - " + determineAgeGroup(people[i].getAge());
        }
        return result;
    }

    protected String determineAgeGroup(int age) {
        if (age > 0 && age <= 30) {
            return "YOUNG";
        } else if (age > 30 && age <= 50) {
            return "ADULT";
        } else if (age > 50) {
            return "ELDER";
        }

        return "INVALID AGE";
    }

    protected abstract Person[] readPeople();

//    protected String writeReport();
}
