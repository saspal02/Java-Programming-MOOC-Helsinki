import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }
    public void add(Person person) {
        persons.add(person);
    }
    public boolean isEmpty() {
        if(persons.isEmpty()){
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons() {
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);

        }
        return persons;

    }
    public Person shortest() {
        if(persons.isEmpty()) {
            return null;
        }
        Person shortestPerson = persons.get(0);
        for(Person person: persons) {
            if(person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }
        }

        return shortestPerson;
    }
    public Person take() {
        if(persons.isEmpty()) {
            return null;
        }
        Person shortestPersons = shortest();
        persons.remove(shortestPersons);

        return shortestPersons;
    }
}
