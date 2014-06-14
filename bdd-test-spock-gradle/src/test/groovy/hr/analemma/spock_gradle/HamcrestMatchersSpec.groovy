package hr.analemma.spock_gradle

import static spock.util.matcher.HamcrestMatchers.closeTo
import spock.lang.Specification

class HamcrestMatchersSpec extends Specification {
    def "comparing two decimal numbers"() {
	def myPi = 3.14

	expect:
	myPi closeTo(Math.PI, 0.01)
    }
}
