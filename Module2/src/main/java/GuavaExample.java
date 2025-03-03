// my-new-module/src/main/java/GuavaExample.java

import com.google.common.base.Joiner;

import java.util.Arrays;
import java.util.List;

public class GuavaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", null, "David");

        String joinedNames = Joiner.on(", ").skipNulls().join(names);

        System.out.println("Joined names: " + joinedNames);
    }
}
