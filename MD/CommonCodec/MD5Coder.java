import org.apache.commons.codec.digest.DigestUtils;

/**
 * MD5消息摘要组件
 * 
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
public abstract class MD5Coder {

	/**
	 * MD5消息摘要
	 * 
	 * @param data 待做摘要处理的数据
	 * @return byte[] 消息摘要
	 * @throws Exception
	 */
	public static byte[] encodeMD5(String data) throws Exception {

		// 执行消息摘要
		return DigestUtils.md5(data);
	}

	/**
	 * MD5消息摘要
	 * 
	 * @param data
	 *            待做摘要处理的数据
	 * @return byte[] 消息摘要
	 *
	 * @throws Exception
	 */
	public static String encodeMD5Hex(String data) throws Exception {

		// 执行消息摘要
		return DigestUtils.md5Hex(data);
	}
}
