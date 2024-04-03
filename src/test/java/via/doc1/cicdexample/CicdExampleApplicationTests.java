package via.doc1.cicdexample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CicdExampleApplicationTests {

    @Test
    void contextLoads() {
        // This test will fail if the application context
        // won't start - so even if it doesn't look like much,
        // it serves a purpose.
    }

    @Test
    public void mainTest() {
        CicdExampleApplication.main(new String[] {});
        assertTrue(true);
    }

    @Test
    void indexTest() {
        String html2 = new CicdExampleApplication().index();
        assertTrue(html2.contains("DevOps"));
    }
}
