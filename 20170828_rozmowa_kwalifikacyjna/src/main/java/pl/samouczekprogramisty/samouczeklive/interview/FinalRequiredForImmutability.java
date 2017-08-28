package pl.samouczekprogramisty.samouczeklive.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class FinalRequiredForImmutability {

    private final List<String> names;

    public FinalRequiredForImmutability(List<String> names) {
        this.names = new ArrayList<>(names);
    }

    public List<String> getNames() {
        return new ArrayList<>(names);
    }

    public static void main(String[] args) {
        FinalRequiredForImmutability instance = new FinalRequiredForImmutability(Arrays.asList("Marcin", "Tomek"));
        System.out.println(instance.names);
        instance.getNames().add("Lucek");

        System.out.println(instance.names);
    }
}
