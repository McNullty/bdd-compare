package hr.analemma.spock_maven

import spock.lang.IgnoreIf
import spock.lang.Specification

class IgnoreIfExampleSpec extends Specification {

    @IgnoreIf({ os.linux })
    def "I'll run everywhere but on Linux"() {
	expect: "Name size function to return lenght"
	name.size() == length

	where:
	name     | length
	"Spock"  | 5
	"Kirk"   | 4
	"Scotty" | 6
    }

    @IgnoreIf({  System.getProperty("os.name").contains("Linux") })
    def "I'll run everywhere but on Linux detalied"() {
	expect: "Name size function to return lenght"
	name.size() == length

	where:
	name     | length
	"Spock"  | 5
	"Kirk"   | 4
	"Scotty" | 6
    }
}
