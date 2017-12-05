package PA7;
//60171673 황희주
public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10, 20, 30, 40);
		shapes[1] = new Rectangle(30, 30, 10,10);
		shapes[2] = new Circle(50, 20, 30);
		
		for(Shape s : shapes) {
			System.out.printf("Area: %s \n", s.getArea());
			System.out.printf("Length: %s \n", s.getLength());
		}//shapes의 원소의 넓이, 둘레의 길이 출력하기
		
		Drawable[] drawables = new Drawable[4];
		for(int i = 0; i< shapes.length; i++) {
			drawables[i] = (Drawable) shapes[i];
		}//shapes의 원소들을 drawables원소로 넣기 
		drawables[3] = new Text("Sample Text");
		//drawables의 마지막 원소로 "Sample Text' 넣기
		for(Drawable d: drawables) {
			d.draw();
		}

	}

}
