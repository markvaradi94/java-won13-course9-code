package ro.fasttrackit.file.inheritance;

import ro.fasttrackit.file.person.Person;

public class FilePersonReportGenerator extends AbstractPersonReportGenerator {
    private final String inputFile;

    public FilePersonReportGenerator(String inputFile) {
        this.inputFile = inputFile;
    }

    @Override
    protected Person[] readPeople() {
        return readPeopleFromFile();
    }

    @Override
    protected String determineAgeGroup(int age) {
        return "GREAT";
    }

    private Person[] readPeopleFromFile() {
        System.out.printf("Reading people from file %s .....", inputFile);
        return new Person[]{
                new Person("Ion", "Popescu", 66),
                new Person("Laurentiu", "Furtos", 57),
                new Person("Maria", "Dragomir", 20),
                new Person("Gicu", "Rosu", 44),
                new Person("Paul", "Albu", 80)
        };
    }

    public String getInputFile() {
        return inputFile;
    }
}
