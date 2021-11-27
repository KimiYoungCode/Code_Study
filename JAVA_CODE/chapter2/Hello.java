//Hello是一个类
//main是其中一个方法
//编码问题：
//	有中文注意编码问题
//	控制台使用的为GBK,与文本编码格式相同即可，否则无法编译
//	PS.Sublime中借助工具设置默认为GBK
public class Hello {

	public static void main(String[] args) {
		System.out.println("hello world");
	}
}

//java 流程：.java(源文件)->.class(字节码文件)->（本质就是将.class装载到虚拟机中）运行结果
//细节：
//	1.源文件以.java为扩展名，其基本组成部分是类(cass)
//	2.java程序的执行入口是main()方法
//	3.Java严格区分大小写
//	4.java方法由语句构成，以;结束
//	5.大括号成对出现
//	6.一个源文件只能有一个public类
//	7.如果源文件包含一个public类，文件名必须按该类命名
//	8.main方法也可以写在其他非public类中，这样入口方法就是非public的main方法


//如何快速学习技术：
//	1.需求：工作需要、跳槽、技术
//	2.看看能否使用传统技术解决，有利于对新技术的理解
//	3.引出学习
//	4.学习新技术或知识点基本语法，抠细节容易出不来
//	5.快速入门案例，基本程序
//	6.开始研究技术的注意事项使用细节使用规范，优化永无止境

