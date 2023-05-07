package Backend_project_1;

import Backend_project_1.ElementoMultimediale;
import Backend_project_1.Luminosità;

public class Immagine extends ElementoMultimediale implements Luminosità{
	
	private int luminosità;
	
	
	public Immagine(String title, int luminosità) {
		super(title);
		this.luminosità = luminosità;
	}

	public int alzaLuminosità() {
		return luminosità++;
	}


	public int abbassaLuminosità() {
		return luminosità--;
	}
	
	public void show() {
			System.out.print(title);
	            for (int j = 0; j < luminosità; j++) {
	                System.out.print(" * ");
	            }
	            System.out.println();
	        }
	

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

}
