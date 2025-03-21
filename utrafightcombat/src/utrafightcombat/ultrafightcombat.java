package utrafightcombat;

public class ultrafightcombat {

	public static void main(String[] args) {
   Lutador l[] = new Lutador[6];
		   
		  l[0] = new Lutador("Mauro Icardi","Argentina", 33, 1.82f,
		                     68.9f,11,2,3);
		  l[1]= new Lutador("Maxi Lopez","Italia", 29, 1.80f,
				           57.8f, 14,5,2);
		  l[2]= new Lutador ("Marcelo Brozovic","Croacia",35, 1.77f,
				             55.9f, 9,2,4);
		   l[2].apresentar();
	}

}
