import java.security.Security;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Hex;

/**
 * HmacRipeMD系列消息摘要组件
 *
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
public abstract class HmacRipeMDCoder {

	/**
	 * 初始化HmacRipeMD128密钥
	 * 
	 * @return byte[] 密钥
	 * @throws Exception
	 */
	public static byte[] initHmacRipeMD128Key() throws Exception {

		// 加入BouncyCastleProvider支持
		Security.addProvider(new BouncyCastleProvider());

		// 初始化KeyGenerator
		KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacRipeMD128");

		// 产生秘密密钥
		SecretKey secretKey = keyGenerator.generateKey();

		// 获得密钥
		return secretKey.getEncoded();
	}

	/**
	 * HmacRipeMD128消息摘要
	 * 
	 * @param data 待做消息摘要处理的数据
	 * @param key 密钥
	 * @return byte[] 消息摘要
	 * @throws Exception
	 */
	public static byte[] encodeHmacRipeMD128(byte[] data, byte[] key)
			throws Exception {

		// 加入BouncyCastleProvider支持
		Security.addProvider(new BouncyCastleProvider());

		// 还原密钥
		SecretKey secretKey = new SecretKeySpec(key, "HmacRipeMD128");

		// 实例化Mac
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());

		// 初始化Mac
		mac.init(secretKey);

		// 执行消息摘要
		return mac.doFinal(data);
	}

	/**
	 * HmacRipeMD128Hex消息摘要
	 * 
	 * @param data 待做消息摘要处理的数据
	 * @param key 密钥
	 * @return String 消息摘要
	 * @throws Exception
	 */
	public static String encodeHmacRipeMD128Hex(byte[] data, byte[] key)
			throws Exception {

		// 执行消息摘要
		byte[] b = encodeHmacRipeMD128(data, key);

		// 做十六进制转换
		return new String(Hex.encode(b));
	}

	/**
	 * 初始化HmacRipeMD160密钥
	 * 
	 * @return byte[] 密钥
	 * @throws Exception
	 */
	public static byte[] initHmacRipeMD160Key() throws Exception {

		// 加入BouncyCastleProvider支持
		Security.addProvider(new BouncyCastleProvider());

		// 初始化KeyGenerator
		KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacRipeMD160");

		// 产生秘密密钥
		SecretKey secretKey = keyGenerator.generateKey();

		// 获得密钥
		return secretKey.getEncoded();
	}

	/**
	 * HmacRipeMD160消息摘要
	 * 
	 * @param data 待做消息摘要处理的数据
	 * @param key 密钥
	 * @return byte[] 消息摘要
	 * @throws Exception
	 */
	public static byte[] encodeHmacRipeMD160(byte[] data, byte[] key)
			throws Exception {

		// 加入BouncyCastleProvider支持
		Security.addProvider(new BouncyCastleProvider());

		// 还原密钥
		SecretKey secretKey = new SecretKeySpec(key, "HmacRipeMD160");

		// 实例化Mac
		Mac mac = Mac.getInstance(secretKey.getAlgorithm());

		// 初始化Mac
		mac.init(secretKey);

		// 执行消息摘要
		return mac.doFinal(data);
	}

	/**
	 * HmacRipeMD160Hex消息摘要
	 * 
	 * @param data 待做消息摘要处理的数据
	 * @param key 密钥
	 * @return String 消息摘要
	 * @throws Exception
	 */
	public static String encodeHmacRipeMD160Hex(byte[] data, byte[] key)
			throws Exception {

		// 执行消息摘要
		byte[] b = encodeHmacRipeMD160(data, key);

		// 做十六进制转换
		return new String(Hex.encode(b));
	}
}
