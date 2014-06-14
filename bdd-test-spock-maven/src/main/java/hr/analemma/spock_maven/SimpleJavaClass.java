package hr.analemma.spock_maven;

/**
 * Class under Spock tests
 *
 * @author mladenc
 *
 */
public class SimpleJavaClass {

    /**
     * Sums all arguments
     *
     * @param args
     * @return
     */
    public int sumAll(final int... args) {
	int sum = 0;

	for (int lI : args) {
	    sum += lI;
	}

	return sum;
    }
}
