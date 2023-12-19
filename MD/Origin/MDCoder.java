import java.security.MessageDigest;

/**
 * MD消息摘要组件
 * 
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
public abstract class MDCoder {

	/**
	 * MD2消息摘要
	 * 
	 * @param data 待做摘要处理的数据
	 * @return byte[] 消息摘要
	 * @throws Exception
	 */
	public static byte[] encodeMD2(byte[] data) throws Exception {

		// 初始化MessageDigest
		MessageDigest md = MessageDigest.getInstance("MD2");

		// 执行消息摘要
		return md.digest(data);
	}

	/**
	 * MD5消息摘要
	 * 
	 * @param data 待做摘要处理的数据
	 * @return byte[] 消息摘要 
	 * @throws Exception
	 */
	public static byte[] encodeMD5(byte[] data) throws Exception {

		// 初始化MessageDigest
		MessageDigest md = MessageDigest.getInstance("MD5");

		// 执行消息摘要
		return md.digest(data);
	}
}
