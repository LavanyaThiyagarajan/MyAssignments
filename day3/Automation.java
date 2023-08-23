package week3.day3;

public class Automation  extends MultipleLangauge implements Language,TestTool
{

	public void selenium() {
		System.out.println("Selenium");
		
	}

	public void java() {
		System.out.println("Java");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
		
	}
public static void main(String[] args) {
	Automation aut=new Automation();
	aut.selenium();
	aut.java();
	aut.ruby();
	aut.python();
	
}
	
}
