package hr.analemma.spock_maven

import spock.lang.*


class HelloSpockSpec extends spock.lang.Specification {
    def "length of Spock's and his friends' names"() {
	expect: "Name size function to return lenght"
	name.size() == length

	where:
	name     | length
	"Spock"  | 5
	"Kirk"   | 4
	"Scotty" | 6
    }
}
