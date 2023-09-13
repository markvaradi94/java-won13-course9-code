package ro.fasttrackit.file;

import ro.fasttrackit.file.composition.FilePeopleReader;
import ro.fasttrackit.file.composition.InMemoryPeopleReader;
import ro.fasttrackit.file.composition.PeopleReportGenerator;
import ro.fasttrackit.file.composition.PersonReader;
import ro.fasttrackit.file.inheritance.FilePersonReportGenerator;

import java.util.List;

public class PeopleMain {
    public static void main(String[] args) {
//        InMemoryPeopleReportGenerator inMemory = new InMemoryPeopleReportGenerator();
//        inMemory.displayReport();
//        System.out.println("================================================");
        FilePersonReportGenerator fileGenerator = new FilePersonReportGenerator("people.txt");
        fileGenerator.displayReport();
//        System.out.println("================================================");

        InMemoryPeopleReader inMemoryPeopleReader = new InMemoryPeopleReader();
        PeopleReportGenerator reportGenerator = new PeopleReportGenerator(inMemoryPeopleReader);
//        reportGenerator.displayReport();
        System.out.println("================================================");
        FilePeopleReader filePeopleReader = new FilePeopleReader("other-people.txt");
        reportGenerator = new PeopleReportGenerator(filePeopleReader);
//        reportGenerator.displayReport();

        List<PersonReader> readers = List.of(inMemoryPeopleReader, filePeopleReader);

        for (PersonReader reader : readers) {
            reportGenerator = new PeopleReportGenerator(reader);
            reportGenerator.displayReport();
            System.out.println("================================================");
        }

        sum(2,5);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
