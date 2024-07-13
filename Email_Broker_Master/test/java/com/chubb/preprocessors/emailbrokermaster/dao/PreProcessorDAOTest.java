package com.chubb.preprocessors.emailbrokermaster.dao;

import com.chubb.preprocessors.emailbrokermaster.service.DBConnectionError;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.fail;

public class PreProcessorDAOTest {
    static final Logger log = Logger.getLogger(PreProcessorDAOTest.class);
    // private static PreProcessorDAOTest daoObject =null ;

    @BeforeClass
    public static void setUpBeforeClass() {
        try {
            // nothing

        } catch (Exception e) {
            log.info(e);
        }
    }

    @Before
    public void setUp() throws DBConnectionError {
        try {
            // nothing

        } catch (Exception e) {
            log.info(e);
        }
    }

    @After
    public void tearDown() {
        try {
            // nothing

        } catch (Exception e) {
            log.info(e);
        }
    }

    @Test
    public void testGetDAOObject() {
        try {
            // nothing

        } catch (Exception e) {
            log.info(e);
            fail("Not yet implemented");
        }

        // TODO
    }

    @Test
    public void testCloseConnection() {

        try {
            // nothing

        } catch (Exception e) {
            log.info(e);
            fail("Not yet implemented");
        }

    }

    @Test
    public void testCheckExistence() {

        try {
            // nothing

        } catch (Exception e) {
            log.info(e);
            fail("Not yet implemented");
        }
    }

    @Test
    public void testGetRoutingDetails() {
        try {
            // nothing

        } catch (Exception e) {
            log.info(e);
            fail("Not yet implemented");
        }
    }

}
