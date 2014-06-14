package hr.analemma.spock_gradle

class SimpleGroovyClass {

    public String concatenateAll(char separator,  String... args){
	args.join(separator as String)
    }
}
