package Inheritance2;

public class EmailLogger extends Logger{

	@Override
	public void log() { //Bunlara @Override diyoruz yani uzerine yazma
		System.out.println("Email gönderildi");
	}
}
