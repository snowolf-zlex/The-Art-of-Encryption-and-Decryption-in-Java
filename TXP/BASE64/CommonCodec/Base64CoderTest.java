
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Base64编码与解码测试类
 * 
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
public class Base64CoderTest {

	/**
	 * 测试Base64编码与解码
	 */
	@Test
	public final void test() throws Exception {

		String inputStr = "Java加密与解密的艺术";

		System.err.println("原文:\t" + inputStr);

		// 进行Base64编码
		String code = Base64Coder.encode(inputStr);

		System.err.println("编码后:\t" + code);

		// 进行Base64解码
		String outputStr = Base64Coder.decode(code);

		System.err.println("解码后:\t" + outputStr);

		// 验证Base64编码解码一致性
		assertEquals(inputStr, outputStr);

	}

	/**
	 * 测试Base64编码与解码
	 */
	@Test
	public final void testSafe() throws Exception {

		String inputStr = "Java加密与解密的艺术";

		System.err.println("原文:\t" + inputStr);

		// 进行Base64编码
		String code = Base64Coder.encodeSafe(inputStr);

		System.err.println("编码后:\t" + code);

		// 进行Base64解码
		String outputStr = Base64Coder.decode(code);

		System.err.println("解码后:\t" + outputStr);

		// 验证Base64编码解码一致性
		assertEquals(inputStr, outputStr);

	}
}
