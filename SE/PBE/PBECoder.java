import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

/**
 * PBE安全编码组件
 * 
 * @author 梁栋
 * @version 1.0
 */
public abstract class PBECoder {

	/**
	 * Java 6 支持以下任意一种算法
	 * 
	 * PBEWithMD5AndDES 
	 * PBEWithMD5AndTripleDES 
	 * PBEWithSHA1AndDESede
	 * PBEWithSHA1AndRC2_40
	 * PBKDF2WithHmacSHA1
	 */
	public static final String ALGORITHM = "PBEWITHMD5andDES";

	/**
	 * 迭代次数
	 */
	public static final int ITERATION_COUNT = 100;

	/**
	 * 盐初始化<br>
	 * 盐长度必须为8字节
	 * 
	 * @return byte[] 盐
	 * @throws Exception
	 */
	public static byte[] initSalt() throws Exception {

		// 实例化安全随机数
		SecureRandom random = new SecureRandom();
		
		// 产出盐
		return random.generateSeed(8);
	}
	/**
	 * 转换密钥 
	 * 
	 * @param password 密码
	 * @return Key 密钥
	 * @throws Exception
	 */
	private static Key toKey(String password) throws Exception {

		// 密钥材料转换
		PBEKeySpec keySpec = new PBEKeySpec(password.toCharArray());

		// 实例化
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM);

		// 生成密钥
		SecretKey secretKey = keyFactory.generateSecret(keySpec);

		return secretKey;
	}

	/**
	 * 加密
	 * 
	 * @param data 数据
	 * @param password 密码
	 * @param salt 盐
	 * @return byte[] 加密数据
	 * @throws Exception
	 */
	public static byte[] encrypt(byte[] data, String password, byte[] salt) throws Exception {

		// 转换密钥
		Key key = toKey(password);

		// 实例化PBE参数材料
		PBEParameterSpec paramSpec = new PBEParameterSpec(salt, ITERATION_COUNT);

		// 实例化
		Cipher cipher = Cipher.getInstance(ALGORITHM);

		// 初始化
		cipher.init(Cipher.ENCRYPT_MODE, key, paramSpec);

		// 执行操作
		return cipher.doFinal(data);

	}

	/**
	 * 解密
	 * 
	 * @param data 数据
	 * @param password 密码
	 * @param salt 盐
	 * @return byte[] 解密数据
	 * @throws Exception
	 */
	public static byte[] decrypt(byte[] data, String password, byte[] salt) throws Exception {
	
		// 转换密钥
		Key key = toKey(password);

		// 实例化PBE参数材料
		PBEParameterSpec paramSpec = new PBEParameterSpec(salt, ITERATION_COUNT);

		// 实例化
		Cipher cipher = Cipher.getInstance(ALGORITHM);

		// 初始化
		cipher.init(Cipher.DECRYPT_MODE, key, paramSpec);

		// 执行操作
		return cipher.doFinal(data);

	}
}
