package se1403.lesson12;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class TestJFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// JFrame�������:
		// Ĭ�ϲ�����;
		// Ĭ�Ͽ��Ϊ0;
		// JFrame��JFrame�����໥Ƕ��

		JFrame jFrame = new JFrame("java��һ������");
		// ���ÿ����
		jFrame.setSize(400, 500);
		// ���þ�����Ļ��ʾ
		jFrame.setLocationRelativeTo(null);
		// ָ������������ʾ
		// jFrame.setLocation(100, 20);

		// Ĭ�ϵĹر�ģʽ������//HIDE_ON_CLOSE
		// DO_NOTHING_ON_CLOSE ɶ������
		// //DISPOSE_ON_CLOSE ���ٴ���
		// EXIT_ON_CLOSE �˳�Ӧ�ó���
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ���ò��ɸı��С[��ѡ]
		jFrame.setResizable(false);

		// ���ÿ��ӻ�
		jFrame.setVisible(true);

		// ���ù��췽��: JDialog(JFrame f,String s);
		// JDialog���к�JFrameһ��������;
		// JDialog������: ��ģ,��ģ;
		// �����ڴ���
		JDialog jDialog = new JDialog(jFrame, "java��һ��Dialog");
		// ���ÿ����
		jDialog.setSize(200, 300);
		// ���þ�����Ļ��ʾ
		jDialog.setLocationRelativeTo(jFrame);
		// ָ������������ʾ
		// jFrame.setLocation(100, 20);
		// Ĭ�ϵĹر�ģʽ������//HIDE_ON_CLOSE
		// DO_NOTHING_ON_CLOSE ɶ������
		// //DISPOSE_ON_CLOSE ���ٴ���
		jDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// ���ò��ɸı��С[��ѡ]
		jDialog.setResizable(false);
		// ����ģʽ[�ص�]//��ס������
		jDialog.setModal(true);
		// ���ÿ��ӻ�
		jDialog.setVisible(true);

		// ģʽ�Ի���:���ó���ִ��Ȩ���߳�ִ��Ȩ,��������ȫ������ͣ��ֱ���Ի������ٺ�Ż�ִ��

		System.out.println("main����......");
		// �ܽ᣺ֻ�жԻ������٣��Ż�ִ����һ�仰

	}

}
