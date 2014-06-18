package hr.analemma.easyb_example

description "account semantics"

// TODO: Datoteka mora imati tip .story što je problem jer onda groovy ne prepoznaje
scenario "increasing an empty account", {

    given "an empty account",{ sut = new Account() }

    when "1 is added", {
	sut.add(BigDecimal.ONE)
    }

    then "the balance should be 1", {
	sut.getBalance().shouldBe BigDecimal.ONE
    }
}

scenario "decreasing an empty account", {
    
	given "an empty account",{
	    sut = new Account()
	}
    
	when "1 is subtracted", {
	    subtract = {sut.add(BigDecimal.ZERO.subtract(BigDecimal.ONE))}
	}
    
	then "an exception occurs", {
	    ensureThrows(Exception) { subtract() }
	}
    }