package pl.samouczekprogramisty.samouczeklive.interview;

import java.util.HashMap;
import java.util.Map;

public class SimpleMemoryLeak {

    private static final Runtime RUNTIME = Runtime.getRuntime();

    public static void main(String[] args) {
        Map<String, String> strings = new HashMap<>();
        // Force JVM to use 100 MB heap space with -Xmx100M
        for (int index = 0; index < Integer.MAX_VALUE; index++) {
            strings.put("key" + index, "value" + index);
            if (index % 10_000 == 0) {
                printHeapStats(index);
            }
            // ends with
            // Exception in thread "main" java.lang.OutOfMemoryError: GC overhead limit exceeded
        }
        System.out.println("success!");
    }

    private static void printHeapStats(int index) {
        System.out.print(index);
        double freeMemorPercentage = RUNTIME.freeMemory() * 1.0 / RUNTIME.maxMemory() * 100;
        System.out.println(" free memory: " + freeMemorPercentage + "%");
    }

}
