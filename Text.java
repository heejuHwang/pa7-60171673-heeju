package PA7;
//60171673 Ȳ����
public class Text implements Drawable {
	String string;
	@Override
	public void draw() {
		System.out.println(string);
	}
	
	public Text(String string) {
		this.string = string;
	}
}//string ����, ���
