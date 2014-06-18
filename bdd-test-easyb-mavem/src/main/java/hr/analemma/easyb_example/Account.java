package hr.analemma.easyb_example;

import java.math.BigDecimal;

/**
 *
 * @author mladenc
 *
 */
public class Account {

    /**
     *
     */
    protected static final int COMPARE_LESS_THEN = -1;

    /**
     *
     */
    protected static final int COMPARE_EQUALS = 0;

    /**
     *
     */
    protected static final int COMPARE_GRATHER_THEN = -1;

    /**
     * Account balance
     */
    private transient BigDecimal balance = BigDecimal.ZERO;

    /**
     *
     * @param amount
     */
    public void add(final BigDecimal amount) {
	if (this.balance.add(amount).compareTo(BigDecimal.ZERO) == Account.COMPARE_LESS_THEN) {
	    throw new IllegalArgumentException("cannot have < 0 balance");
	}
	this.balance = this.balance.add(amount);
    }

    /**
     *
     * @return
     */
    public BigDecimal getBalance() {
	return this.balance;
    }
}
