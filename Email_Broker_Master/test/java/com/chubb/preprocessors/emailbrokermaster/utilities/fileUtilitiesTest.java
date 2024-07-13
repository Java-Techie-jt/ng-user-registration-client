package com.chubb.preprocessors.emailbrokermaster.utilities;

import com.chubb.preprocessors.emailbrokermaster.dao.PreProcessorDAOTest;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * Created by sxgonn on 03/08/2016.
 */
public class fileUtilitiesTest {
    static final Logger log = Logger.getLogger(PreProcessorDAOTest.class);


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
    public void testCheckNewContent() {
        try {
            // nothing

        } catch (Exception e) {
            log.info(e);
            fail("Not yet implemented");
        }

        // assertTrue(FileUtilities.checkNewContent(resources.getConnectionproperties().getProperty("input.folder.location")));
    }

    @Test
    public void testFileCopy() {
        try {
            // nothing

        } catch (Exception e) {
            log.info(e);
            fail("Not yet implemented");
        }

    }

    @Test
    public void testFileMove() {
        try {
            // nothing

        } catch (Exception e) {
            log.info(e);
            fail("Not yet implemented");
        }

    }

    @Test
    public void testDateToString() {
        try {
            // nothing

        } catch (Exception e) {
            log.info(e);
            fail("Not yet implemented");
        }

    }
}