package org.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class MyUnitTest extends MyUnit {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }

}
