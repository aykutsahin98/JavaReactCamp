package Inheritance2;

public class FileLogger extends Logger {
	
	@Override
	public void log() { //Bunlara @Override diyoruz yani uzerine yazma
		System.out.println("Dosya loglandý");
	}
}
