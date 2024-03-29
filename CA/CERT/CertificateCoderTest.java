import static org.junit.Assert.*;

import org.apache.commons.codec.binary.Hex;
import org.junit.Test;

/**
 * 证书校验
 * 
 * @author 梁栋
 * @version 1.0
 */
public class CertificateCoderTest {

	private String password = "123456";
	private String alias = "www.zlex.org";
	private String certificatePath = "d:/zlex.cer";
	private String keyStorePath = "d:/zlex.keystore";

	/**
	 * 公钥加密——私钥解密
	 * 
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {

		System.err.println("公钥加密——私钥解密");
		String inputStr = "数字证书";
		byte[] data = inputStr.getBytes();

		// 公钥加密
		byte[] encrypt = CertificateCoder.encryptByPublicKey(data, certificatePath);

		// 私钥解密
		byte[] decrypt = CertificateCoder.decryptByPrivateKey(encrypt, keyStorePath, alias, password);
		String outputStr = new String(decrypt);

		System.err.println("加密前:\n" + inputStr);

		System.err.println("解密后:\n" + outputStr);

		// 验证数据一致
		assertArrayEquals(data, decrypt);

	}

	/**
	 * 私钥加密——公钥解密
	 * 
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {

		System.err.println("私钥加密——公钥解密");

		String inputStr = "数字签名";
		byte[] data = inputStr.getBytes();

		// 私钥加密
		byte[] encodedData = CertificateCoder.encryptByPrivateKey(data, keyStorePath, alias, password);

		// 公钥加密
		byte[] decodedData = CertificateCoder.decryptByPublicKey(encodedData, certificatePath);

		String outputStr = new String(decodedData);

		System.err.println("加密前:\n" + inputStr);
		System.err.println("解密后:\n" + outputStr);

		assertEquals(inputStr, outputStr);
	}

	/**
	 * 签名验证
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSign() throws Exception {

		String inputStr = "签名";
		byte[] data = inputStr.getBytes();
		System.err.println("私钥签名——公钥验证");

		// 产生签名
		byte[] sign = CertificateCoder.sign(data, keyStorePath, alias, password);
		System.err.println("签名:\n" + Hex.encodeHexString(sign));

		// 验证签名
		boolean status = CertificateCoder.verify(data, sign, certificatePath);
		System.err.println("状态:\n" + status);
		
		// 校验
		assertTrue(status);

	}

}
