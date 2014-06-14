package hr.analemma.spock_maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Person tests
 *
 * @author mladenc
 *
 */
public class PersonTest {

    /**
     * Testing name getter
     */
    @Test
    public void canConstructAPersonWithAName() {
	final Person person = new Person("Larry");
	assertEquals("Worng name", "Larry", person.getName());
    }
}
