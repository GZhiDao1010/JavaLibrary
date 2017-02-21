package fns;

import java.util.Arrays;

/**
 * @author GZhi·Dao
 * @time 2017年2月11日 下午11:22:53
 * @functions
 */
public class PublicFns {
	/*
	 * 一、 1.类方法的入口:public static void main(String[] agrs){}; 2._下划线的常规用户：_name
	 * 局部变量; 3. $符号的常规用法 ： fatherName$childNmae;
	 */

	/*
	 * 二、常量：不能改变的值 --大写表示; 分类：1整数，2小数，3布尔型， 4字符常量：将一个数字字母或者符号用''标识；
	 * 5字符常量：将一个或者多个子符用""标识； 6null常量
	 * 
	 * 三、整数的四种表现形式： 1.二进制 0-1 2.八进制 0-7 3.十进制 0-9 4.十六进制 0-9 a-f
	 */

	/*
	 * 写代码的正确步骤： 需求： 思路： 步骤：
	 */
	/*
	 * 一、 1.类方法的入口:public static void main(String[] agrs){}; 2._下划线的常规用户：_name
	 * 局部变量; 3. $符号的常规用法 ： fatherName$childNmae;
	 */

	/*
	 * 二、常量：不能改变的值 --大写表示; 分类：1整数，2小数，3布尔型， 4字符常量：将一个数字字母或者符号用''标识；
	 * 5字符常量：将一个或者多个子符用""标识； 6null常量
	 * 
	 * 三、整数的四种表现形式： 1.二进制 0-1 2.八进制 0-7 3.十进制 0-9 4.十六进制 0-9 a-f
	 */

	/*
	 * 功能： 实现数组的倒序
	 */

	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	String[] strArray = { "1a", "2b", "3c", "4d", "5f" };// 初始化数组

	public void arrayReverse() {
		System.out.print(Arrays.toString(strArray)); // 打印数组
		@SuppressWarnings("unused") // unused这个参数是屏蔽, 忽略这些警告
		String[] newArray = {};
		String interim;
		int num = strArray.length;
		for (int i = 0; i < strArray.length; i++) {
			interim = strArray[0];
			// System.out.print(strArray[i]);
			int newNum = num - i;
			newArray[i] = "aaa";
			System.out.print("++++" + interim);
		}
		System.out.print("倒序后的数组为：" + Arrays.toString(newArray));
	}

	// 定义一个主函数，保证程序的独立运行
	public static void main(String[] agrs) {
		System.out.print("java");// 打印输出

		PublicFns utils = new PublicFns(); // 初始化Utils类
		utils.arrayReverse(); // 输出utils的arrayReverse()方法;
	}

}
