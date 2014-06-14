package hr.analemma.spock_gradle

import spock.lang.Specification

class SetupSpockSpec extends Specification{

    def "Test setting up Stack"(){
	given:
	def stack = new Stack<String>()
	def elem = "push me"

	when:
	stack.push(elem)

	then:
	!stack.empty
	stack.size() == 1
	stack.peek() == elem
    }
}
