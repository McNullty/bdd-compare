package hr.analemma.spock_maven;

/**
 * Person entity
 *
 * @author mladenc
 *
 */
public class Person {
    /**
     * Name filed
     */
    private final String name;

    /**
     * Constructor
     * 
     * @param name
     */
    public Person(final String name) {
	this.name = name;
    }

    /**
     *
     * @return
     */
    public String getHello() {
	return "Helllo";
    }

    /**
     * Name getter
     *
     * @return
     */
    public String getName() {
	return this.name;
    }
}
