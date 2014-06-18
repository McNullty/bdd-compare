package hr.analemma.easyb_example;

import java.io.File;

import org.easyb.junit.EasybSuite;

/**
 * JUnit Runner
 *
 * @author mladenc
 *
 */
public class EasybTestRunner extends EasybSuite {

    /**
     *
     */
    @Override
    protected File baseDir() {
	return new File("src/test/groovy");
    }

    /**
     *
     */
    @Override
    protected String description() {
	return "My Project Behaviors";
    }

}
