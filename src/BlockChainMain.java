
public class BlockChainMain {

	public static void main(String[] args) 
	{
		//first block in which data is passed and hash is calculated
		
		BlockChain MyFirstBlock=new BlockChain("ThisIsMyFirstBlock");
		System.out.println("This is my first block: " +MyFirstBlock.CalculateHash());
		
		//data is changed and hash also changes when data changes
		
		MyFirstBlock.setData("ThisIsMyChangedData");
		System.out.println("This is my changed hash code: "+MyFirstBlock.CalculateHash());
		
		//series of 4 blocks in which first one have data and all other are null
		//the hash of secound one depend on first one hash and similar thing follow up for all blocks further

		BlockChain MySecoundBlock=new BlockChain("ThisIsMyFirstBlock",MyFirstBlock.getHash());
		System.out.println("This is my Secound block: " +MySecoundBlock.CalculatePreviousHash());
		

		BlockChain MyThirdBlock=new BlockChain(null,MySecoundBlock.getHash());
		System.out.println("This is my Third block: " +MyThirdBlock.CalculatePreviousHash());
		

		BlockChain MyFourthBlock=new BlockChain(null,MyThirdBlock.getHash());
		System.out.println("This is my fourth block: " +MyFourthBlock.CalculatePreviousHash());
		

		BlockChain MyFifthBlock=new BlockChain(null,MyFourthBlock.getHash());
		System.out.println("This is my fifth block: " +MyFifthBlock.CalculatePreviousHash());
		
		
		
		
	}
}
