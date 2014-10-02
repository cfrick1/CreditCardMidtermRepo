package MainPackage;

import java.io.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckDigitTest {

	String[] args = {};
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain1() {
		ByteArrayInputStream in = new ByteArrayInputStream("4246345689049834".getBytes());
		System.setIn(in);
		System.out.println("Test will  always pass, but 2 lines down should read \"The number is invalid\"");
		CheckDigit.main(args);
		System.setIn(System.in);
	}
	
	@Test
	public void testMain2() {
		ByteArrayInputStream in = new ByteArrayInputStream("4388576018410707".getBytes());
		System.setIn(in);
		System.out.println("Test will  always pass, but 2 lines down should read \"The number is valid\"");
		CheckDigit.main(args);
		System.setIn(System.in);
	}
}
