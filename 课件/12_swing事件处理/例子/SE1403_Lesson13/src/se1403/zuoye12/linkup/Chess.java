package se1403.zuoye12.linkup;

/**
 * 棋子类
 * 
 * @author admin
 * 
 */
public class Chess {
	// 图片状态值:1-20 0代表消掉的图片 无图片
	private int status;

	public Chess(int status) {
		super();
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
