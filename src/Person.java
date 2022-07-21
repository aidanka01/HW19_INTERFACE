public class Person implements Liveable  {
    private String position; //position in the family
    private String name;
    private int age;

    public Person(String position,String name, int age) {
        this.position = position;
        this.name = name;
        this.age = age;
    }

    @Override
    public void live() {
        System.out.println(name + "lives ");
    }

    @Override
    public String toString() {
        return "Person{" +
                "position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
