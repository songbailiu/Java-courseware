package gok.se1604.inner.diff;

import gok.se1604.inner.Outer;
import gok.se1604.inner.Outer.Inner;
import gok.se1604.inner.Outer.StaticInner;

public class TestDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ʹ���ڲ���
		// ��̬�ڲ���
		StaticInner staticInner = new StaticInner();
		staticInner.test01();

		// ʵ���ڲ��� �ⲿ�����.new ����()
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		inner.test02();
	}

}
