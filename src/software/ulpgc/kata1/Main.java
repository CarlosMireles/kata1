package software.ulpgc.kata1;

public class Main {
    public static void main(String[] args) {
        Conference conference = new Conference(3);
        Person maria = new Person("Maria", "1");
        Person jose = new Person("Jose", "2");
        Person lucas = new Person("Lucas", "3");
        Person benito = new Person("Benito", "4");

        //conference.enlist(maria);
        //conference.enlist(jose);
        conference.enlist(lucas);
        System.out.println(conference.enlist(benito));

        System.out.println(conference);
    }
}
