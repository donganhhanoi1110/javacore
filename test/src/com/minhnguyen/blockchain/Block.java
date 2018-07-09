package com.minhnguyen.blockchain;

import java.util.ArrayList;

import com.google.gson.GsonBuilder;

public class Block {
	public String hash;
	public String previousHash;
	private String data;
	private long timeStamp;
	
	public Block(String data, String previousHash) {
		super();
		this.previousHash = previousHash;
		this.data = data;
		this.hash = calculateHash();
	}
	
	public String calculateHash() {
		return StringUtil.applySha256(
				previousHash +
				Long.toString(timeStamp)+
				data);
	}
	
	public static void main(String[] args) {
		ArrayList<Block> blockchain = new ArrayList<Block>(); 
		
		Block first = new Block("Hi Minh", "0");
		System.out.println("Hash 1: " + first.hash);
		
		Block second = new Block("Hi Minh", first.hash);
		System.out.println("Hash 2: " + second.hash);
		
		blockchain.add(first);
		blockchain.add(second);
		String chainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
		System.out.println(chainJson);
	}
}
