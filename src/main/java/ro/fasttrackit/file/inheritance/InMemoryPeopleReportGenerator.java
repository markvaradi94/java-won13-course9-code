package ro.fasttrackit.file.inheritance;

import ro.fasttrackit.file.person.Person;

public class InMemoryPeopleReportGenerator extends AbstractPersonReportGenerator{
    @Override
    protected Person[] readPeople() {
        return new Person[]{
                new Person("Gyuszi", "Matyas", 38),
                new Person("Laci", "Hegedus", 44),
                new Person("Pista", "Zold", 29),
                new Person("Zoli", "Piros", 17),
                new Person("Ferenc", "Orban", 80)
        };
    }
}
