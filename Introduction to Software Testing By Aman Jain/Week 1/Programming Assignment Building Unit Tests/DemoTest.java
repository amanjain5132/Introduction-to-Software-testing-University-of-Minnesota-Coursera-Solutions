import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;


import java.io.ByteArrayInputStream;

import java.io.ByteArrayOutputStream;

import java.io.PrintStream;


import org.junit.Test;


public class DemoTest {


	// (0.5, 1,0.5), (0.5, 0.5,1) and (1, 0.5, 0.5)


	@Test

	public void test_Is_Triangle_1() {

		assertFalse(Demo.isTriangle(0.5, 1, 0.5));

	}


	@Test

	public void test_Is_Triangle_2() {

		assertFalse(Demo.isTriangle(0.5, 0.5, 1));

	}


	@Test

	public void test_Is_Triangle_3() {

		assertFalse(Demo.isTriangle(1, 0.5, 0.5));

	}



	@Test

	public void test_Is_Triangle_4() {

		assertFalse(Demo.isTriangle(10, 4, 2));

	}

	

	

	  @Test

	    public void test_is_triangle_1() {

	        assertTrue(Demo.isTriangle(3, 4, 5));

	    }

	    @Test

	    public void test_is_triangle_2() {

	        assertTrue(Demo.isTriangle(5, 12, 13));

	    }

	    @Test

	    public void test_is_triangle_3() {

	        assertTrue(Demo.isTriangle(5, 13, 12));

	    }

	    @Test

	    public void test_is_triangle_4() {

	        assertTrue(Demo.isTriangle(12, 5, 13));

	    }

	    @Test

	    public void test_is_triangle_5() {

	        assertTrue(Demo.isTriangle(12, 13, 5));

	    }

	    @Test

	    public void test_is_NOT_triangle_1() {

	        assertFalse(Demo.isTriangle(5, 7, 13));

	    }

	    @Test

	    public void test_is_NOT_triangle_2() {

	        assertFalse(Demo.isTriangle(5, 13, 7));

	    }

	    @Test

	    public void test_is_NOT_triangle_3() {

	        assertFalse(Demo.isTriangle(13, 5, 7));

	    }

	    @Test

	    public void test_is_NOT_triangle_4() {

	        assertFalse(Demo.isTriangle(13,7, 5));

	    }

	    @Test

	    public void test_is_NOT_triangle_5() {

	        assertFalse(Demo.isTriangle(13, 7, 5));

	    }

	    @Test

	    public void test_is_NOT_triangle_6() {

	        assertFalse(Demo.isTriangle(5, 9, 3));

	    }

	    @Test

	    public void test_is_NOT_triangle_7() {

	        assertFalse(Demo.isTriangle(1, 2, -1));

	    }


	

		/*

		 * @Test public void test_main_program_1() { ByteArrayInputStream in = new

		 * ByteArrayInputStream("5\n12\n13\n".getBytes()); System.setIn(in);

		 * ByteArrayOutputStream out = new ByteArrayOutputStream(); System.setOut(new

		 * PrintStream(out)); String consoleOutput = "Enter side 1:"+

		 * System.getProperty("line.separator"); consoleOutput += "Enter side 2:"+

		 * System.getProperty("line.separator"); consoleOutput += "Enter side 3:"+

		 * System.getProperty("line.separator"); consoleOutput +=

		 * "This is a triangle:\n"; assertEquals(consoleOutput, out.toString()); }

		 */



}