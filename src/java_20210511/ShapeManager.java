package java_20210511;

public class ShapeManager {
	private static ShapeManager single;

	private ShapeManager() {
	}

	public static ShapeManager getInstance() {
		if (single == null) {
			single = new ShapeManager();
		}
		return single; //반환값이 클래스(레퍼런스 타입)
	}
	
	public void run(Shape s) {
		s.draw();
}
}
