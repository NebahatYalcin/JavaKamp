package Concrete;

import Entity.Campaing;
import Entity.Game;
import Entity.Gamer;
import Interfaces.IGameSellService;

public class GameSellManager implements IGameSellService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(game.getGameName()+ " adl� oyun " + game.getGamePrice() + " TL'ye " + gamer.getFirstname()
		+ " kullan�c�s�na sat�ld�. ");
		
	}

	@Override
	public void saleCampaing(Game game, Gamer gamer, Campaing campaing) {
		double priceCampaign = game.getGamePrice() - (game.getGamePrice() * ((double) campaing.getCampaingDiscount()/ 100));
		System.out.println(game.getGameName() + " adl� oyun " + gamer.getFirstname() + " kullan�c�s�na  "
				+ campaing.getCampaingName() + " kampanyas�yla " + priceCampaign + " TL'ye sat�ld�.");
		
	}

}
