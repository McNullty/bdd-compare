package hr.analemma.spock_gradle

import spock.lang.Specification
import spock.lang.Unroll

class UnrollExampleSpec extends Specification {

    @Unroll('Sums integers #integers into: #expectedResault')
    def "Can sum different amount of integers"(){
	given:
	def instance = new SimpleJavaClass()
	when:
	def resault = instance.sumAll(* integers)
	then:
	resault == expectedResault

	where:
	integers | expectedResault
	[3, 3, 5]| 11
	[3, 5]|8
	[2, 4, 8, 16, 32, 64, 128]|254
	[7, 5, 6, 2, 2]|22
    }

    @Unroll('Concatenates strings #strings with separator "#separator" into: #expectedResult')
    def "Can concatenate different amount of integers with a specified separator"() {
	given:
	def instance = new SimpleGroovyClass()

	when:
	def result = instance.concatenateAll(separator, * strings)

	then:
	result == expectedResult

	where:
	expectedResult     | separator   | strings
	'Whasup dude?'     | ' ' as char | ['Whasup', 'dude?']
	'2012/09/15'       | '/' as char | ['2012', '09', '15']
	'nice-to-meet-you' | '-' as char | ['nice', 'to', 'meet', 'you']
    }
}
