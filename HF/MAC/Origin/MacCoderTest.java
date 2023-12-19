import static org.junit.Assert.*;

import org.junit.Test;

/**
 * MAC校验
 * Java原生实现
 * 
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
public class MacCoderTest {

	/**
	 * 测试HmacMD5
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeHmacMD5() throws Exception {

		String str = "HmacMD5消息摘要";

		// 初始化密钥
		byte[] key = MacCoder.initHmacMD5Key();

		// 获得摘要信息
		byte[] data1 = MacCoder.encodeHmacMD5(str.getBytes(), key);
		byte[] data2 = MacCoder.encodeHmacMD5(str.getBytes(), key);

		// 校验
		assertArrayEquals(data1, data2);
	}

	/**
	 * 测试HmacSHA1
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeHmacSHA() throws Exception {

		String str = "HmacSHA1消息摘要";

		// 初始化密钥
		byte[] key = MacCoder.initHmacSHAKey();

		// 获得摘要信息
		byte[] data1 = MacCoder.encodeHmacSHA(str.getBytes(), key);
		byte[] data2 = MacCoder.encodeHmacSHA(str.getBytes(), key);

		// 校验
		assertArrayEquals(data1, data2);
	}

	/**
	 * 测试HmacSHA256
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeHmacSHA256() throws Exception {

		String str = "HmacSHA256消息摘要";

		// 初始化密钥
		byte[] key = MacCoder.initHmacSHA256Key();

		// 获得摘要信息
		byte[] data1 = MacCoder.encodeHmacSHA256(str.getBytes(), key);
		byte[] data2 = MacCoder.encodeHmacSHA256(str.getBytes(), key);

		// 校验
		assertArrayEquals(data1, data2);
	}

	/**
	 * 测试HmacSHA384
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeHmacSHA384() throws Exception {

		String str = "HmacSHA384消息摘要";

		// 初始化密钥
		byte[] key = MacCoder.initHmacSHA384Key();

		// 获得摘要信息
		byte[] data1 = MacCoder.encodeHmacSHA384(str.getBytes(), key);
		byte[] data2 = MacCoder.encodeHmacSHA384(str.getBytes(), key);

		// 校验
		assertArrayEquals(data1, data2);
	}

	/**
	 * 测试HmacSHA512
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeHmacSHA512() throws Exception {

		String str = "HmacSHA512消息摘要";

		// 初始化密钥
		byte[] key = MacCoder.initHmacSHA512Key();

		// 获得摘要信息
		byte[] data1 = MacCoder.encodeHmacSHA512(str.getBytes(), key);
		byte[] data2 = MacCoder.encodeHmacSHA512(str.getBytes(), key);

		// 校验
		assertArrayEquals(data1, data2);
	}

}

