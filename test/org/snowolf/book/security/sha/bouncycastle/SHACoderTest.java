package org.snowolf.book.security.sha.bouncycastle;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * SHA-224校验
 * 
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
public class SHACoderTest {

	/**
	 * 测试SHA-224
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeSHA224() throws Exception {

		String str = "SHA224消息摘要";

		// 获得摘要信息
		byte[] data1 = SHACoder.encodeSHA224(str.getBytes());
		byte[] data2 = SHACoder.encodeSHA224(str.getBytes());

		// 校验
		assertArrayEquals(data1, data2);
	}

	/**
	 * 测试SHA-224
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeSHA224Hex() throws Exception {

		String str = "SHA224消息摘要";

		// 获得摘要信息
		String data1 = SHACoder.encodeSHA224Hex (str.getBytes());
		String data2 = SHACoder.encodeSHA224Hex (str.getBytes());

		// 校验
		assertEquals(data1, data2);
	}
}

