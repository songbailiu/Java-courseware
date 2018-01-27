package gok.se1604.inner.diff;

import gok.se1604.inner.Outer;
import gok.se1604.inner.Outer.Inner;
import gok.se1604.inner.Outer.StaticInner;

public class TestDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 使用内部类
		// 静态内部类
		StaticInner staticInner = new StaticInner();
		staticInner.test01();

		// 实例内部类 外部类对象.new 类名()
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		inner.test02();
	}

}
