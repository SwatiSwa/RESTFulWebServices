package com.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Player {
	private String playerName;
	private String playerRating;
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerRating() {
		return playerRating;
	}
	public void setPlayerRating(String playerRating) {
		this.playerRating = playerRating;
	}
	
}
