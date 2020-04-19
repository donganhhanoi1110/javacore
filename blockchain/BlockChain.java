package com.minhnguyen.blockchain;

import java.util.List;
import java.util.stream.IntStream;

public class BlockChain {
	private static List<Block> blockChain;

	public BlockChain(List<Block> blockChain) {
		super();
		this.blockChain = blockChain;
	}
	
	public static boolean isChainValid() {
		
		//loop through blockchain to check hashes
		for(int i=1; i < blockChain.size(); i++) {
			Block current = (Block) blockChain.get(i);
			Block previous = blockChain.get(i - 1);
			//compare registered hash and calculated hash:
			if(!current.hash.equals(current.calculateHash()) ){
				System.out.println("Current Hashes not equal");			
				return false;
			}
			//compare previous hash and registered previous hash
			if(!previous.hash.equals(current.previousHash) ) {
				System.out.println("Previous Hashes not equal");
				return false;
			}
		}
		return true;
	}
}
