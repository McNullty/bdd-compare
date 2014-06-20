package hr.analemma.spock_maven

import spock.lang.Ignore
import spock.lang.Specification

class IgnoreExampleSpec extends Specification {

    def "my feature not ignored"() {
	expect: "Name size function to return lenght"
	name.size() == length

	where:
	name     | length
	"Spock"  | 5
	"Kirk"   | 4
	"Scotty" | 6
    }

    @Ignore
    def "my feature ignored"() {
	expect: "Name size function to return lenght"
	name.size() == length

	where:
	name     | length
	"Spock"  | 5
	"Kirk"   | 4
	"Scotty" | 6
    }

    @Ignore("Real resaon")
    def "my feature ignored with reason"() {
	expect: "Name size function to return lenght"
	name.size() == length

	where:
	name     | length
	"Spock"  | 5
	"Kirk"   | 4
	"Scotty" | 6
    }
}
