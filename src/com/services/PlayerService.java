package com.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.pojo.Player;

@Path("PlayerService")
public class PlayerService {

	@GET
	@Path("getAllPlayers")
	@Produces("application/json")
	public List<Player> getAllPlayers(){
		List<Player> players = new ArrayList<Player>();
		
		Player player1 = new Player();
		player1.setPlayerName("Dhoni");
		player1.setPlayerRating("7.0");
		players.add(player1);
		
		Player player2 = new Player();
		player2.setPlayerName("Kohli");
		player2.setPlayerRating("8.0");
		players.add(player2);		
		
		return players;
	}
	
	@POST
	@Path("insertPlayer")
	@Consumes("application/json")
	@Produces("application/json")
	public List<Player> insertPlayer(List<Player> players){		
		return players;
	}	
}
