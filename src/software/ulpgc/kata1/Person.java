package software.ulpgc.kata1;

public record Person(String name, String dni) {
    @Override
    public String name() {
        return name;
    }

    @Override
    public String dni() {
        return dni;
    }
}
