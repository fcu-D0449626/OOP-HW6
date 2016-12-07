package fcu.iecs.oop.pokemon;
import java.util.Random;
public class GYM {
	public static Player fight(Player p1,Player p2){
		Random rand = new Random();
		int winA=0,winB=0,i;
		Player R=new Player("0");
		Pokemon[] A = p1.getPokemon();
		Pokemon[] B = p2.getPokemon();
		
		for(i=0;i<3;i++)
		{
			if(A[i].gettype()==PokemonType.FIRE && B[i].gettype()==PokemonType.GRASS)
				winA++;
			else if(B[i].gettype()==PokemonType.FIRE && A[i].gettype()==PokemonType.GRASS)
				winB++;
			else if(A[i].gettype()==PokemonType.GRASS && B[i].gettype()==PokemonType.WATER)
				winA++;
			else if(B[i].gettype()==PokemonType.GRASS && A[i].gettype()==PokemonType.WATER)
				winB++;
			else if(A[i].gettype()==PokemonType.WATER && B[i].gettype()==PokemonType.FIRE)
				winA++;
			else if(B[i].gettype()==PokemonType.WATER && A[i].gettype()==PokemonType.FIRE)
				winB++;
			else if(A[i].gettype()==B[i].gettype()){
				if(A[i].cp>B[i].cp)
					winA++;
				else if(A[i].cp<B[i].cp)
					winB++;
				else if(A[i].cp==B[i].cp){
					int  n = rand.nextInt(2) + 1;
					if(n==1)
						winA++;
					else
						winB++;}}
		}
		if(winA>winB){
					p1.level++;
					System.out.println("Winner is ["+p1.Playername+"]and his/her level becomes ["+p2.level+"].");
					R = p1;
					}
		else if(winA<winB){
					p2.level++;
					System.out.println("Winner is ["+p2.Playername+"]and his/her level becomes ["+p2.level+"].");
					R = p2;
					}
		return R;
					

	}
}
