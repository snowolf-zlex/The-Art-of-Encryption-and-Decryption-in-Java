import static org.junit.Assert.*;

import org.junit.Test;

/**
 * RipeMD校验
 * 
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
public class RipeMDCoderTest {

	/**
	 * 测试RipeMD128
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeRipeMD128() throws Exception {

		String str = "RIPEMD128消息摘要";

		// 获得摘要信息
		byte[] data1 = RIPEMDCoder.encodeRIPEMD128(str.getBytes());
		byte[] data2 = RIPEMDCoder.encodeRIPEMD128(str.getBytes());

		// 校验
		assertArrayEquals(data1, data2);
	}

	/**
	 * 测试RipeMD128Hex
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeRIPEMD128Hex() throws Exception {

		String str = "RipeMD128Hex消息摘要";

		// 获得摘要信息
		String data1 = RIPEMDCoder.encodeRIPEMD128Hex(str.getBytes());
		String data2 = RIPEMDCoder.encodeRIPEMD128Hex(str.getBytes());

		System.err.println("原文：\t" + str);

		System.err.println("RIPEMD128Hex-1：\t" + data1);
		System.err.println("RIPEMD128Hex-2：\t" + data2);

		// 校验
		assertEquals(data1, data2);
	}

	/**
	 * 测试RipeMD160
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeRIPEMD160() throws Exception {

		String str = "RIPEMD160消息摘要";

		// 获得摘要信息
		byte[] data1 = RIPEMDCoder.encodeRIPEMD160(str.getBytes());
		byte[] data2 = RIPEMDCoder.encodeRIPEMD160(str.getBytes());

		// 校验
		assertArrayEquals(data1, data2);
	}

	/**
	 * 测试RipeMD160Hex
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeRIPEMD160Hex() throws Exception {

		String str = "RIPEMD160Hex消息摘要";

		// 获得摘要信息
		String data1 = RIPEMDCoder.encodeRIPEMD160Hex(str.getBytes());
		String data2 = RIPEMDCoder.encodeRIPEMD160Hex(str.getBytes());

		System.err.println("原文：\t" + str);

		System.err.println("RIPEMD160Hex-1：\t" + data1);
		System.err.println("RIPEMD160Hex-2：\t" + data2);

		// 校验
		assertEquals(data1, data2);
	}

	/**
	 * 测试RipeMD256
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeRIPEMD256() throws Exception {

		String str = "RIPEMD256消息摘要";

		// 获得摘要信息
		byte[] data1 = RIPEMDCoder.encodeRIPEMD256(str.getBytes());
		byte[] data2 = RIPEMDCoder.encodeRIPEMD256(str.getBytes());

		// 校验
		assertArrayEquals(data1, data2);
	}

	/**
	 * 测试RipeMD256Hex
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeRIPEMD256Hex() throws Exception {

		String str = "RipeMD256Hex消息摘要";

		// 获得摘要信息
		String data1 = RIPEMDCoder.encodeRIPEMD256Hex(str.getBytes());
		String data2 = RIPEMDCoder.encodeRIPEMD256Hex(str.getBytes());

		System.err.println("原文：\t" + str);

		System.err.println("RIPEMD256Hex-1：\t" + data1);
		System.err.println("RIPEMD256Hex-2：\t" + data2);

		// 校验
		assertEquals(data1, data2);
	}

	/**
	 * 测试RipeMD320
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeRIPEMD320() throws Exception {

		String str = "RIPEMD320消息摘要";

		// 获得摘要信息
		byte[] data1 = RipeMDCoder.encodeRIPEMD320(str.getBytes());
		byte[] data2 = RipeMDCoder.encodeRIPEMD320(str.getBytes());

		// 校验
		assertArrayEquals(data1, data2);
	}

	/**
	 * 测试RipeMD320Hex
	 * 
	 * @throws Exception
	 */
	@Test
	public final void testEncodeRIPEMD320Hex() throws Exception {

		String str = "RipeMD320Hex消息摘要";

		// 获得摘要信息
		String data1 = RIPEMDCoder.encodeRIPEMD320Hex(str.getBytes());
		String data2 = RIPEMDCoder.encodeRIPEMD320Hex(str.getBytes());

		System.err.println("原文：\t" + str);

		System.err.println("RIPEMD320Hex-1：\t" + data1);
		System.err.println("RIPEMD320Hex-2：\t" + data2);

		// 校验
		assertEquals(data1, data2);
	}

}

