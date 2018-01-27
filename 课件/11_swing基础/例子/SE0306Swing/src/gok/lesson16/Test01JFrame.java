package gok.lesson16;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class Test01JFrame {

	public static void main(String[] args) {
		// JFrame����
		// JFrame�������:
		// Ĭ�ϲ�����;
		// Ĭ�Ͽ��Ϊ0;
		// JFrame��JFrame�����໥Ƕ��
		// Ĭ�ϲ����Ǳ߽粼��(�߿򲼾�)
		JFrame jFrame = new JFrame("java��һ������");
		// ���� ���ڵı���
		jFrame.setTitle("java SWING����");
		// ���ÿ����
		jFrame.setSize(400, 500);
		// ���þ�����ʾ λ��
		// ��������Ͻǵ�ˮƽ����������
		// jFrame.setLocation(100, 50);
		// ��Ծ���λ�� �������������� �ſ�null ������Ļ������
		jFrame.setLocationRelativeTo(null);
		// ����X�ر�ģʽ EXIT_ON_CLOSE �˳�Ӧ�ó���
		// static int DISPOSE_ON_CLOSE �Ƴ����ڵ�Ĭ�ϴ��ڹرղ�����
		// static int DO_NOTHING_ON_CLOSE �޲���Ĭ�ϴ��ڹرղ�����
		// static int EXIT_ON_CLOSE �˳�Ӧ�ó���Ĭ�ϴ��ڹرղ�����
		// static int HIDE_ON_CLOSE[Ĭ��] ���ش��ڵ�Ĭ�ϴ��ڹرղ���

		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ò��ɸı��С[��ѡ]
		// jFrame.setResizable(false);

		// ���������Ĳ��ֶ��Ǳ߿򲼾� BorderLayout
		JButton jButton1 = new JButton("��ť1");
		jFrame.add(jButton1);
		JButton jButtonNorth = new JButton("��ť2����");
		jFrame.add(jButtonNorth, BorderLayout.NORTH);
		JButton jButtonSouth = new JButton("��ť3�ϱ�");
		jFrame.add(jButtonSouth, BorderLayout.SOUTH);
		// ���ÿ��ӻ�[��������� ���ø�����]
		jFrame.setVisible(true);

		// �Ի���JDialog ������JFrame һ�ֶԻ��򴰿�
		// JDialog(JFrame f,String s);
		// JDialog���к�JFrameһ��������;
		// JDialog������: ��ģ,��ģ;

		 JDialog jDialog = new JDialog(jFrame, "�Ի���");
		 jDialog.setSize(new Dimension(200, 250));
		 jDialog.setLocationRelativeTo(jFrame);
		 //�Ի���Ĺر�ģʽ���������˳�Ӧ�ó���ĳ���ֵ
		 //ֻ��Hide,DISPOSE,DO_NOTHING_ON_CLOSE
		 //jDialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//error
		 //������ģʽ[��ס��ǰ��������]
		 jDialog.setModal(true);
		 jDialog.setVisible(true);
		 System.out.println("main��������....");
		 //��ģʽ�Ի�����ӻ�֮�� ��ӡ���û�г�������Ϊģʽ�Ի����ǿ��ռ�ó����ִ��Ȩ
		 //ֱ���Ի������ٺ�Ż��ͷų����ִ��Ȩ
		 //����ִ�� ��ӡ���
		 
		 //���� �ڶԻ�����ʾ֮�� ����ص�ҵ������Ϊִ�в���

	}

}
