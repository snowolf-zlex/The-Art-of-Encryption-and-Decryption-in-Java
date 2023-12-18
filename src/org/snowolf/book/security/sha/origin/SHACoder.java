package org.snowolf.book.security.sha.origin;

import java.security.MessageDigest; 

/**
 * SHA消息摘要组件
 * 
 * @author 梁栋
 * @version 1.0
 * @since 1.0
 */
public abstract class SHACoder {

	/**
	 * SHA-1消息摘要
	 * 
	 * @param data 待做摘要处理的数据
	 * @return byte[] 消息摘要 
	 * @throws Exception
	 */
	public static byte[] encodeSHA(byte[] data) throws Exception {

		// 初始化MessageDigest
		MessageDigest md = MessageDigest.getInstance("SHA");

		// 执行消息摘要
		return md.digest(data);
	}


	/**
	 * SHA-256消息摘要
	 * 
	 * @param data 待做摘要处理的数据
	 * @return byte[] 消息摘要 
	 * @throws Exception
	 */
	public static byte[] encodeSHA256(byte[] data) throws Exception {

		// 初始化MessageDigest
		MessageDigest md = MessageDigest.getInstance("SHA-256");

		// 执行消息摘要
		return md.digest(data);
	}

	/**
	 * SHA-384消息摘要
	 * 
	 * @param data 待做摘要处理的数据
	 * @return byte[] 消息摘要 
	 * @throws Exception
	 */
	public static byte[] encodeSHA384(byte[] data) throws Exception {

		// 初始化MessageDigest
		MessageDigest md = MessageDigest.getInstance("SHA-384");

		// 执行消息摘要
		return md.digest(data);
	}

	/**
	 * SHA-512消息摘要
	 * 
	 * @param data 待做摘要处理的数据
	 * @return byte[] 消息摘要 
	 * @throws Exception
	 */
	public static byte[] encodeSHA512(byte[] data) throws Exception {

		// 初始化MessageDigest
		MessageDigest md = MessageDigest.getInstance("SHA-512");

		// 执行消息摘要
		return md.digest(data);
	}
}
