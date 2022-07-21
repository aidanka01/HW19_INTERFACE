public class Hostel extends LivingPlace{
private String nameOfHostel;


    public Hostel(Family family, String nameofHostel) {
        super(family);
        this.nameOfHostel = nameofHostel;
    }

    @Override
    public void payRent() {
        System.out.println("Hamza's family live in a Hostel ");

        System.out.println("They *pay rent*");

    }

    @Override
    public void payUtilities() {
        System.out.println("They don't pay *utilities*");

    }

    @Override
    public String toString() {
        return "Hostel{" +
                "nameofHostel='" + nameOfHostel + '\'' +
                ", family=" + family +
                '}';
    }
}
