// my-new-module/src/test/java/GuavaExampleTest.java
import com.google.common.base.Joiner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

public class GuavaExampleTest {

    @Test
    void testJoinerWithNulls() {
        List<String> names = Arrays.asList("Alice", "Bob", null, "Charlie");
        String joined = Joiner.on(", ").skipNulls().join(names);
        assertEquals("Alice, Bob, Charlie", joined);
    }

    @Test
    void testJoinerWithEmptyList() {
        List<String> names = Arrays.asList();
        String joined = Joiner.on(", ").skipNulls().join(names);
        assertEquals("", joined);
    }
}