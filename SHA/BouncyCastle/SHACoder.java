import java.security.MessageDigest;
import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Hex;

/**
 * SHA-224消息摘要组件
 * 
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
public abstract class SHACoder {

	/**
	 * SHA-224消息摘要
	 * 
	 * @param data 待做摘要处理的数据
	 * @return byte[] 消息摘要 
	 * @throws Exception
	 */
	public static byte[] encodeSHA224(byte[] data) throws Exception {

		// 加入BouncyCastleProvider支持
		Security.addProvider(new BouncyCastleProvider());

		// 初始化MessageDigest
		MessageDigest md = MessageDigest.getInstance("SHA-224");

		// 执行消息摘要
		return md.digest(data);
	}

	/**
	 * SHA-224消息摘要
	 * 
	 * @param data 待做摘要处理的数据
	 * @return String 十六进制消息摘要 
	 * @throws Exception
	 */
	public static String encodeSHA224Hex(byte[] data) throws Exception {

		// 执行消息摘要
		byte[] b = encodeSHA224(data);

		// 做十六进制编码处理
		return new String(Hex.encode(b));
	}
}

