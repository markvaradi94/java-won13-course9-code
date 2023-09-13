package ro.fasttrackit.file.composition;

import ro.fasttrackit.file.person.Person;

public class FilePeopleReader implements PersonReader {
    private final String inputFile;

    public FilePeopleReader(String inputFile) {
        this.inputFile = inputFile;
    }

    @Override
    public Person[] readPeople() {
        return readPeopleFromFile();
    }

    private Person[] readPeopleFromFile() {
        System.out.printf("Reading people from %s .....", inputFile);
        return new Person[]{
                new Person("Feri", "Nagy", 10),
                new Person("Zsoka", "Fekete", 44),
                new Person("Ana", "Petrovici", 56),
                new Person("Lajos", "Tokeletes", 22),
                new Person("Daddy", "Orban", 60)
        };
    }

    public String getInputFile() {
        return inputFile;
    }
}
