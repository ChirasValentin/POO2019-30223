package laborator7;

import java.util.*;

public class SortareaPersoanelor {
	public static void main(String[] args)
	{
		Persoana[] persoana = new Persoana[3];
		persoana[0]=new Persoana("Vladislav","Cristian",15);
		persoana[1]=new Persoana("Vladislav","Vlad",20);
		persoana[2]=new Persoana("Vladislav","Ion",35);
		Arrays.sort(persoana);
		for(int i =0;i<3;i++)
			System.out.println(persoana[i].toString());
		
	}
}
