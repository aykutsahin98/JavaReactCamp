package Inheritance2;

public class DatabaseLogger extends Logger{

	@Override
	public void log() { //Bunlara @Override diyoruz yani uzerine yazma
		System.out.println("Veritabanýna loglandý");
	}
}
