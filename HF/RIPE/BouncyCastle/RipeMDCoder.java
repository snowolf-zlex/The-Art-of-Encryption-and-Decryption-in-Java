import java.security.MessageDigest;
import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Hex;

/**
 * RipeMD系列消息摘要组件
 * 
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
public abstract class RipeMDCoder {

	/**
	 * RipeMD128消息摘要
	 * 
	 * @param data 待做消息摘要处理的数据
	 * @return byte[] 消息摘要 
	 * @throws Exception
	 */
	public static byte[] encodeRipeMD128(byte[] data) throws Exception {

		// 加入BouncyCastleProvider支持
		Security.addProvider(new BouncyCastleProvider());

		// 初始化MessageDigest
		MessageDigest md = MessageDigest.getInstance("RipeMD128");

		// 执行消息摘要
		return md.digest(data);
	}

	/**
	 * RipeMD128Hex消息摘要
	 * 
	 * @param data 待做消息摘要处理的数据
	 * @return byte[] 消息摘要 
	 * @throws Exception
	 */
	public static String encodeRipeMD128Hex(byte[] data) throws Exception {

		// 执行消息摘要
		byte[] b = encodeRipeMD128(data);

		// 做十六进制编码处理
		return new String(Hex.encode(b));
	}

	/**
	 * RipeMD160消息摘要
	 * 
	 * @param data 待做消息摘要处理的数据
	 * @return byte[] 消息摘要 
	 * @throws Exception
	 */
	public static byte[] encodeRipeMD160(byte[] data) throws Exception {

		// 加入BouncyCastleProvider支持
		Security.addProvider(new BouncyCastleProvider());

		// 初始化MessageDigest
		MessageDigest md = MessageDigest.getInstance("RipeMD160");

		// 执行消息摘要
		return md.digest(data);
	}

	/**
	 * RipeMD160Hex消息摘要
	 * 
	 * @param data 待做消息摘要处理的数据
	 * @return String 消息摘要 
	 * @throws Exception
	 */
	public static String encodeRipeMD160Hex(byte[] data) throws Exception {

		// 执行消息摘要
		byte[] b = encodeRipeMD160(data);

		// 做十六进制编码处理
		return new String(Hex.encode(b));
	}

	/**
	 * RipeMD256消息摘要
	 * 
	 * @param data 待做消息摘要处理的数据
	 * @return byte[] 消息摘要 
	 * @throws Exception
	 */
	public static byte[] encodeRipeMD256(byte[] data) throws Exception {

		// 加入BouncyCastleProvider支持
		Security.addProvider(new BouncyCastleProvider());

		// 初始化MessageDigest
		MessageDigest md = MessageDigest.getInstance("RipeMD256");

		// 执行消息摘要
		return md.digest(data);
	}

	/**
	 * RipeMD256Hex消息摘要
	 * 
	 * @param data 待做消息摘要处理的数据
	 * @return String 消息摘要 
	 * @throws Exception
	 */
	public static String encodeRipeMD256Hex(byte[] data) throws Exception {

		// 执行消息摘要
		byte[] b = encodeRipeMD256(data);

		// 做十六进制编码处理
		return new String(Hex.encode(b));
	}

	/**
	 * RipeMD320消息摘要
	 * 
	 * @param data 待做消息摘要处理的数据
	 * @return byte[] 消息摘要 
	 * @throws Exception
	 */
	public static byte[] encodeRipeMD320(byte[] data) throws Exception {

		// 加入BouncyCastleProvider支持
		Security.addProvider(new BouncyCastleProvider());

		// 初始化MessageDigest
		MessageDigest md = MessageDigest.getInstance("RipeMD320");

		// 执行消息摘要
		return md.digest(data);
	}

	/**
	 * RipeMD320Hex消息摘要
	 * 
	 * @param data 待做消息摘要处理的数据
	 * @return String 消息摘要 
	 * @throws Exception
	 */
	public static String encodeRipeMD320Hex(byte[] data) throws Exception {

		// 执行消息摘要
		byte[] b = encodeRipeMD320(data);

		// 做十六进制编码处理
		return new String(Hex.encode(b));
	}

}

