package ro.fasttrackit.file.composition;

import ro.fasttrackit.file.person.Person;

public class InMemoryPeopleReader implements PersonReader{

    @Override
    public Person[] readPeople() {
        return new Person[]{
                new Person("Gicu", "Pop", 34),
                new Person("Ana", "Popa", 14),
                new Person("Mircea", "Popescu", 25),
                new Person("Mihai", "Popovici", 67),
                new Person("Gogu", "Patapievici", 8)
        };
    }
}
