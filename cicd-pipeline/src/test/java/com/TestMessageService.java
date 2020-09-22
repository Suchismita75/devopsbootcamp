package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestMessageService {

	@Test
	public void testMessageCap() {
		String a="abc";
		MessageService ms = new MessageService();
		Assertions.assertEquals(ms.caps(a), "ABC");
	}
	
	@Test
	public void testMessageLow() {
		String a="ABC";
		MessageService ms = new MessageService();
		Assertions.assertEquals(ms.low(a), "abc");
	}
	
	@Test
	public void testMessageConcat() {
		String a="elep";
		String b="hant";
		MessageService ms = new MessageService();
		Assertions.assertEquals(ms.con(a,b), "elephant");
	}
	
	@Test
	public void testMessageSub() {
		String a="Welcome";
		MessageService ms = new MessageService();
		Assertions.assertEquals(ms.sub(a,1,3), "el");
	}
	
	
	@Test
	public void testMessageLength() {
		String a="empire";
		MessageService ms = new MessageService();
		Assertions.assertEquals(ms.len(a), 6);
	}
}
