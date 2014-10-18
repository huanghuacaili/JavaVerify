package test2;

/**
 * 像素点
 * @author wangjiewen
 *
 */
public class Point{
	int x;
	int y;
	boolean isBlack;
	
	public Point(int x, int y){
		this(x, y, true);
	}
	
	public Point(int x, int y, boolean isBlack) {
		this.x = x;
		this.y = y;
		this.isBlack = isBlack;
	}
}
