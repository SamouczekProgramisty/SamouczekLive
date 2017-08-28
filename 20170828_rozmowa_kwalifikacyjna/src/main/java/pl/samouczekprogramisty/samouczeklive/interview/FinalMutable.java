package pl.samouczekprogramisty.samouczeklive.interview;

public final class FinalMutable {
    private String name;

    public FinalMutable(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        FinalMutable finalMutable = new FinalMutable("name1");
        System.out.println(finalMutable.name);
        finalMutable.name = "name2";
        System.out.println(finalMutable.name);
    }
}
