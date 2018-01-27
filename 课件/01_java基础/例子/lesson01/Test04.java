
/**
<div>这是一个类 它的名字是Test04</div>
<div>作者:admin</div>
*/
public class Test04 
{
	/**
	<div>这是主函数main方法</div>
	<div>可以被调用执行输出效果</div>
	*/
	public static void main(String[] args) 
	{
		//java注释
		//单行注释
		/*
		多行注释
		会被编译器忽略的脚本
		*/
		/**
		文档化注释:支持javadoc命令 把类的信息输出成HTML格式的帮助文档
		编译后期查看
		写在类定义之前或者方法定义之前
		*/
		
	}
}

//javadoc 命令:
//javadoc java文件名
//指定html文档输出到指定的目录
//javadoc -d 文件夹 java文件名
//例如:javadoc -d html Test04.java
