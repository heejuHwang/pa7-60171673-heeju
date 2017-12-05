package PA7;
//60171673 황희주
public class Text implements Drawable {
	String string;
	@Override
	public void draw() {
		System.out.println(string);
	}
	
	public Text(String string) {
		this.string = string;
	}
}//string 설정, 출력
