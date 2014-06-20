package hr.analemma.spock_maven

import java.util.concurrent.TimeUnit

import spock.lang.Specification
import spock.lang.Timeout

class TimeoutExampleSpec extends Specification {

    @Timeout(1) //this in seconds
    def "I fail if I run for more than five seconds"() {
	expect: "Name size function to return lenght"
	name.size() == length
	Thread.sleep(5000)

	where:
	name     | length
	"Spock"  | 5
	"Kirk"   | 4
	"Scotty" | 6
    }

    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    def "I better be quick"() {
	expect: "Name size function to return lenght"
	name.size() == length

	where:
	name     | length
	"Spock"  | 5
	"Kirk"   | 4
	"Scotty" | 6
    }
}
