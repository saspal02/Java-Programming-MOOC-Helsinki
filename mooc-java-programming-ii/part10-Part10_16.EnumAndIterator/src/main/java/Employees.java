import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private ArrayList<Person> employees = new ArrayList<>();
    public Employees() {
        this.employees = employees;
    }
    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }
    public void add(List<Person> personToAdd) {
        for (Person person : personToAdd) {
            employees.add(person);
        }
    }
    public void print() {
        Iterator<Person> iterator = this.employees.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation().equals(education)) {
                System.out.println(nextPerson);
            }
        }
    }
    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
