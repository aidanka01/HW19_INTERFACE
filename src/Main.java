public class Main {
    public static void main(String[] args) {



        Person person = new Person("Dad", "Kamchybek", 52);
        Person person1 = new Person("Mom", "Aizhan", 50);
        Person person3 = new Person("daughter", "Dana", 19);

        Person person4 = new Person("Dad", "Akyl", 27);
        Person person5 = new Person("Mom", "Aisha", 25);
        Person person6 = new Person("baby", "Asman", 1 );

        Person person7 = new Person("husband", "Hamza", 25);
        Person person8= new Person("wife", "Sofia",22);



        Person[] people1 = {person, person1, person3};
        Family family1 = new Family(people1);
        Hotel hotel = new Hotel(family1, "Diamond");
        System.out.println(hotel);
        System.out.println("quantity of family members: " + hotel.family.people.length);
        hotel.payRent();
        hotel.payUtilities();

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\\\t\t\\\t\t\t\\\t\t\\\t");

        Person [] people2 = {person4, person5, person6};
        Family family2 = new Family(people2);
        Apartment apartment = new Apartment(family2);
        System.out.println(apartment);
        System.out.println("quantity of family members: " + apartment.family.people.length);
        apartment.payRent();
        apartment.payUtilities();

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\\\t\t\\\t\t\t\\\t\t\\\t");

        Person [] people3 = {person7, person8};
        Family family3 = new Family(people3);
        Hostel hostel = new Hostel(family3, "STAR");
        System.out.println(hostel);
        System.out.println("quantity of family members: " + hostel.family.people.length);
        hostel.payRent();
        hostel.payUtilities();


    }
}