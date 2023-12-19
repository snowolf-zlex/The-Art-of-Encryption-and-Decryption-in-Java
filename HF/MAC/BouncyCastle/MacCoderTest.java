import static org.junit.Assert.*;

import org.junit.Test;

/**
 * MAC校验
 * BouncyCastle实现
 * 
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
public class MacCoderTest {

	/**
	 * 测试HmacMD2
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeHmacMD2() throws Exception {

		String str = "HmacMD2消息摘要";

		// 初始化密钥
		byte[] key = MacCoder.initHmacMD2Key();

		// 获得摘要信息
		byte[] data1 = MacCoder.encodeHmacMD2(str.getBytes(), key);
		byte[] data2 = MacCoder.encodeHmacMD2(str.getBytes(), key);

		// 校验
		assertArrayEquals(data1, data2);
	}

	/**
	 * 测试HmacMD4
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeHmacMD4() throws Exception {

		String str = "HmacMD4消息摘要";

		// 初始化密钥
		byte[] key = MacCoder.initHmacMD4Key();

		// 获得摘要信息
		byte[] data1 = MacCoder.encodeHmacMD4(str.getBytes(), key);
		byte[] data2 = MacCoder.encodeHmacMD4(str.getBytes(), key);

		// 校验
		assertArrayEquals(data1, data2);
	}

	/**
	 * 测试HmacSHA224
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeHmacSHA224() throws Exception {

		String str = "HmacSHA224消息摘要";

		// 初始化密钥
		byte[] key = MacCoder.initHmacSHA224Key();

		// 获得摘要信息
		byte[] data1 = MacCoder.encodeHmacSHA224(str.getBytes(), key);
		byte[] data2 = MacCoder.encodeHmacSHA224(str.getBytes(), key);

		// 校验
		assertArrayEquals(data1, data2);
	}

}

