package stringTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {
	
	String str1 ="homework";
	String str2 ="HOMEWORK";
	String str3 ="Hometask";
	String str4 ="homework";
	String str5 ="Homemade";
	String str6 ="Welcome ";
	String str7 ="home";
	String str8 ="I am to lazy to do my homework";
	

	@Test
	void testCharAt() {
		assertEquals('h', str1.charAt(0));
		assertEquals('m', str5.charAt(2));
		assertTrue(str1.charAt(3) == 'e');
		assertFalse(str1.charAt(1) != 'o');		
	}
	@Test
	void testCompareTo() {
		assertEquals(0, str1.compareTo(str4));
		assertTrue(str1.compareTo(str6) > 0);		
		assertFalse(str1.compareTo(str8) < 0);		
	}
	@Test
	void testCompareToIgnoreCase() {
		assertEquals(0, str1.compareToIgnoreCase(str2));
		assertTrue(str7.compareToIgnoreCase(str6) < 0);
		assertFalse(str7.compareToIgnoreCase(str6) > 0);		
	}
	@Test
	void testConcat() {
		assertEquals("Welcome home", str6.concat(str7));		
	}
	@Test
	void testStartWith() {
		assertTrue(str1.startsWith("hom"));
		assertFalse(str1.startsWith("work"));
	}
	@Test
	void testEndWith() {
		assertTrue(str3.endsWith("task"));
		assertFalse(str3.endsWith("work"));
	}
	@Test
	void testContains() {
		assertTrue(str8.contains(str1));
		assertFalse(str8.contains(str5));
	}
	@Test
	void testIndexOf() {
		assertEquals(22, str8.indexOf("h"));
		assertEquals(22, str8.indexOf(str1));
		assertFalse(str8.indexOf(str1) == 1);
		
	}
	@Test
	void testLastIndexOf() {
		assertEquals(3, str7.lastIndexOf('e'));
	}

}
