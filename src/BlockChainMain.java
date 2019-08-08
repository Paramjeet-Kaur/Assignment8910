
public class BlockChainMain {

	public static void main(String[] args) 
	{
		BlockChain MyFirstBlock=new BlockChain("ThisIsMyFirstBlock");
		System.out.println("This is my first block: " +MyFirstBlock.CalculateHash());
		MyFirstBlock.setData("ThisIsMyybhbhData");
		System.out.println("This is my changed hash code: "+MyFirstBlock.CalculateHash());
		
	}
}
