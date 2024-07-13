package com.chubb.preprocessors.emailbrokermaster.preprocessor;

import com.chubb.preprocessors.emailbrokermaster.dao.PreProcessorDAOTest;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * Created by sxgonn on 03/08/2016.
 */
public class preProcessorMainTest {

    static final Logger log = Logger.getLogger(PreProcessorDAOTest.class);

    // PreProcessorMain preproMain=new PreProcessorMain();
    @Before
    public void setUp() {
        try {
            // nothing

        } catch (Exception e) {
            log.info(e);
            fail("Not yet implemented");
        }
    }

    @After
    public void tearDown() {
        try {
            // nothing

        } catch (Exception e) {
            log.info(e);
            fail("Not yet implemented");
        }
    }

    @Test
    public void testMain() {
        try {
            // preproMain.main(null);

        } catch (Exception e) {
            log.info(e);
            fail("Test Failed : " + e.getMessage());
        }
    }
}
