package pl.samouczekprogramisty.samouczeklive.interview;

public class NonFinalImmutable {

    private final String name;

    public NonFinalImmutable(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        NonFinalImmutable instance = new NonFinalImmutable("name");
        System.out.println(instance.name);
        // instance.name = "xxx";
    }
}
