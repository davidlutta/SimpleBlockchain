package com.Ezekiel.Lutta;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    ArrayList<Block> blockchain = new ArrayList();
    public static void main(String[] args) {
	// Creation of the genesis block
        String[] genesisTransactions = {
                "10 bitcoin was sent to Alan by David",
                "2000 bitcoin was received by David from Anonymous_User"
        };
        Block genesisBlock = new Block(0,genesisTransactions);

        String[] Block2Transactions = {
                "1000 bitcoin was sent to Alan by David",
                "20 bitcoin was received by David from Anonymous_User"
        };
        Block block2Transactions = new Block(genesisBlock.getBlockHash(),Block2Transactions);

        System.out.println("Genesis BlockHash: "+genesisBlock.getBlockHash());
        System.out.println("Block2 BlockHash: "+block2Transactions.getBlockHash());

    }
}
