package Concrete;

import java.util.ArrayList;

import Abstract.GameService;
import Entities.Game;

public class GameManager  implements GameService{
ArrayList<Game> games=new ArrayList<Game>();
	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi:"+game.getGameName());
		games.add(game);
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi:"+game.getGameName());
		games.remove(game);
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi:"+game.getGameName());
		
	}

	@Override
	public void list() {
		System.out.println("Oyunlar listeleniyor....");
		for(Game game:games)
		{
			System.out.println(game.getGameName());
		}
		System.out.println("Listeleme bitti");
		
	}

}
