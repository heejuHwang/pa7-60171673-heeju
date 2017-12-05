package PA7;
//60171673 Ȳ����
public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10, 20, 30, 40);
		shapes[1] = new Rectangle(30, 30, 10,10);
		shapes[2] = new Circle(50, 20, 30);
		
		for(Shape s : shapes) {
			System.out.printf("Area: %s \n", s.getArea());
			System.out.printf("Length: %s \n", s.getLength());
		}//shapes�� ������ ����, �ѷ��� ���� ����ϱ�
		
		Drawable[] drawables = new Drawable[4];
		for(int i = 0; i< shapes.length; i++) {
			drawables[i] = (Drawable) shapes[i];
		}//shapes�� ���ҵ��� drawables���ҷ� �ֱ� 
		drawables[3] = new Text("Sample Text");
		//drawables�� ������ ���ҷ� "Sample Text' �ֱ�
		for(Drawable d: drawables) {
			d.draw();
		}

	}

}
