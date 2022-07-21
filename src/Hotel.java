public class Hotel extends LivingPlace {
    private String nameOfHotel;

    public Hotel(Family family, String nameofHotel) {
        super(family);
        this.nameOfHotel = nameofHotel;
    }


    @Override
    public void payRent() {
        System.out.println("Kamchybek's family live in a hotel, they *pay rent*");

    }

    @Override
    public void payUtilities() {
        System.out.println("Kamchybek's family *don't pay utilities* ");
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nameofHotel='" + nameOfHotel + '\'' +
                ", family=" + family +
                '}';
    }
}
