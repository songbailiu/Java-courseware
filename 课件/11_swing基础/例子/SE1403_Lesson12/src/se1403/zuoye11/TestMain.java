package se1403.zuoye11;

import java.util.Enumeration;
import java.util.Vector;

public class TestMain {
	public static void main(String[] args) {
		// HashSet hs = new HashSet();
		// hs.add("1");
		// hs.add("2");
		// hs.add("3");
		// System.out.println(hs);

		Vector v = new Vector();
		for (int i = 0; i < 10; i++)
			v.add(new Integer(i));
		// System.out.println(v);
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			Integer i = (Integer) e.nextElement();
			v.remove(i);
		}
		System.out.println(v.size());
		System.out.println(v);

	}
}
