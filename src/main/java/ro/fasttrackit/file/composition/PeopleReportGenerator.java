package ro.fasttrackit.file.composition;

import ro.fasttrackit.file.person.Person;

public class PeopleReportGenerator {
//    private final PeopleReportWriter reportWriter;

    private final PersonReader personReader;

    public PeopleReportGenerator(PersonReader personReader) {
        this.personReader = personReader;
    }

    public void displayReport() {
        Person[] people = personReader.readPeople();
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

    private String determineAgeGroup(int age) {
        if (age > 0 && age <= 30) {
            return "YOUNG";
        } else if (age > 30 && age <= 50) {
            return "ADULT";
        } else if (age > 50) {
            return "ELDER";
        }

        return "INVALID AGE";
    }
}
