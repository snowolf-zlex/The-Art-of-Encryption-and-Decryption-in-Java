import static org.junit.Assert.*;

import org.junit.Test;

/**
 * HmacRIPEMD校验
 * 
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
public class HmacRIPEMDCoderTest {

	/**
	 * 测试HmacRIPEMD128
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeHmacRIPEMD128() throws Exception {

		String str = "HmacRIPEMD128消息摘要";

		// 初始化密钥
		byte[] key = HmacRIPEMDCoder.initHmacRIPEMD128Key();

		// 获得摘要信息
		byte[] data1 = HmacRIPEMDCoder.encodeHmacRIPEMD128(str.getBytes(), key);
		byte[] data2 = HmacRIPEMDCoder.encodeHmacRIPEMD128(str.getBytes(), key);

		// 校验
		assertArrayEquals(data1, data2);
	}

	/**
	 * 测试HmacRIPEMD128Hex
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeHmacRIPEMD128Hex() throws Exception {

		String str = "HmacRIPEMD128Hex消息摘要";

		// 初始化密钥
		byte[] key = HmacRIPEMDCoder.initHmacRIPEMD128Key();

		// 获得摘要信息
		String data1 = HmacRIPEMDCoder.encodeHmacRIPEMD128Hex(str.getBytes(), key);
		String data2 = HmacRIPEMDCoder.encodeHmacRIPEMD128Hex(str.getBytes(), key);

		System.err.println("原文：\t" + str);

		System.err.println("HmacRIPEMD128Hex-1：\t" + data1);
		System.err.println("HmacRIPEMD128Hex-2：\t" + data2);

		// 校验
		assertEquals(data1, data2);
	}

	/**
	 * 测试HmacRIPEMD160
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeHmacRIPEMD160() throws Exception {

		String str = "HmacRIPEMD160消息摘要";

		// 初始化密钥
		byte[] key = HmacRIPEMDCoder.initHmacRIPEMD160Key();

		// 获得摘要信息
		byte[] data1 = HmacRIPEMDCoder.encodeHmacRIPEMD160(str.getBytes(), key);
		byte[] data2 = HmacRIPEMDCoder.encodeHmacRIPEMD160(str.getBytes(), key);

		// 校验
		assertArrayEquals(data1, data2);
	}

	/**
	 * 测试HmacRIPEMD160Hex
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeHmacMD4Hex() throws Exception {

		String str = "HmacRIPEMD160Hex消息摘要";

		// 初始化密钥
		byte[] key = HmacRIPEMDCoder.initHmacRIPEMD160Key();

		// 获得摘要信息
		String data1 = HmacRIPEMDCoder.encodeHmacRIPEMD160Hex(str.getBytes(), key);
		String data2 = HmacRIPEMDCoder.encodeHmacRIPEMD160Hex(str.getBytes(), key);

		System.err.println("原文：\t" + str);

		System.err.println("HmacRIPEMD160Hex-1：\t" + data1);
		System.err.println("HmacRIPEMD160Hex-2：\t" + data2);

		// 校验
		assertEquals(data1, data2);
	}

}

