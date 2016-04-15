package com.appweb;

import java.math.BigInteger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConexaoBancoTest {

    public ConexaoBancoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void hello() {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("HibernateDB");
            EntityManager em = factory.createEntityManager();
            assertEquals(em.createNativeQuery("select true").getSingleResult(), BigInteger.ONE);
    }
}
