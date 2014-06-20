package hr.analemma.spock_maven

import spock.lang.Requires
import spock.lang.Specification

class RequiresExampleSpec extends Specification {

    @Requires({ os.windows })
    def "my feature that requires Windows"() {
	expect: "Name size function to return lenght"
	name.size() == length

	where:
	name     | length
	"Spock"  | 5
	"Kirk"   | 4
	"Scotty" | 6
    }
}
