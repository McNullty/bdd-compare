package hr.analemma.spock_maven

import spock.lang.Specification
import spock.lang.Unroll
@Unroll
class MathSpec extends Specification {
    def "maximum of #a and #b is #c"() {
	expect:
	Math.max(a, b) == c

	where:
	a | b | c
	1 | 3 | 3
	7 | 4 | 7
	0 | 0 | 0
    }
}
