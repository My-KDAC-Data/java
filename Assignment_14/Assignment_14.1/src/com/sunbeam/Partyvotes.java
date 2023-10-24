package com.sunbeam;

public class Partyvotes {
	
	private String party;
	private int votes;
	
	public Partyvotes() {
		
	}
	
	

	public Partyvotes(String party, int votes) {
		
		this.party = party;
		this.votes = votes;
	}



	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}



	@Override
	public String toString() {
		return "Partyvotes [party=" + party + ", votes=" + votes + "]";
	}
	
	
	
	

}
