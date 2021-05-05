package Concrete;

import Entity.Gamer;
import Interfaces.IGamerCheckService;
import Interfaces.IGamerService;

public class GamerManager extends BaseGamerManager implements IGamerService{

	private IGamerCheckService �gamercheckservice;
	
	

	public GamerManager(IGamerCheckService igamercheckservice) {
		super();
		�gamercheckservice = igamercheckservice;
	}

	@Override
	public void register(Gamer gamer) {
		if(�gamercheckservice.checkifrealperson(gamer)) {
			super.register(gamer);
		}
		else {
			System.out.println("Giri� ge�erli de�ildir.");
		}
		
	}

	@Override
	public void login(Gamer gamer) {
		System.out.println(gamer.getFirstname()+" isimli kullan�c� giri� yapt�.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstname()+" isimli kullan�c� silindi.");
		
	}

	

	
	
	
}
