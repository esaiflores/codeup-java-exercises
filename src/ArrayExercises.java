import java.util.Arrays;

public class ArrayExercises {

    static Person[] people = new Person[3];


    public static void main(String[] args){

        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        people[0] = new Person("Esai");
        people[1] = new Person("Lindsay");
        people[2] = new Person("Adam");

        people = addPerson(people, new Person("Araceli"));
        people = addPerson(people, new Person("jon"));

        for (Person eachPerson : people) {
            System.out.println(eachPerson.getName());
        }

    }


    public static Person[] addPerson(Person[] people, Person newPeople) {
        Person[] newList = Arrays.copyOf(people, people.length + 1);
        newList[newList.length - 1] = newPeople;
        return newList;

    }


}
