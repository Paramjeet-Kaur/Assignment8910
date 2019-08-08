import java.util.Scanner;
public class BlockChainMain {

	public static void main(String[] args) 
	{
		//first block in which data is passed and hash is calculated
		
		BlockChain MyGenesisBlock=new BlockChain("ThisIsMyGenesisBlock");
		System.out.println("This is my Genesis block: " +MyGenesisBlock.CalculateHash());
		
		//data is changed and hash also changes when data changes
		MyGenesisBlock.setData("ThisIsMyChangedData");
		System.out.println("This is my changed hash code: "+MyGenesisBlock.CalculateHash());
		
		//series of 4 blocks in which first one have data and all other are null
		//the hash of secound one depend on first one hash and similar thing follow up for all blocks Further

		System.out.println("");
		BlockChain MyFirstBlock=new BlockChain("ThisIsMyFirstBlock",MyGenesisBlock.getHash());
		System.out.println("This is my First block: " +MyFirstBlock.CalculatePreviousHash());

		System.out.println("");
		BlockChain MySecoundBlock=new BlockChain(null,MyFirstBlock.getHash());
		System.out.println("This is my Secound block: " +MySecoundBlock.CalculatePreviousHash());
		
		//Scanner is used for allowing user to enter data as mentioned in phase3
		Scanner Keyboard=new Scanner(System.in);
		System.out.println("Enter the data you want to store?");
		String EnteredData=Keyboard.nextLine();
		MySecoundBlock.setData(EnteredData);
		System.out.println("My new Data is: "+EnteredData+ " : " +MySecoundBlock.CalculatePreviousHash());
		
	
		System.out.println("");
		BlockChain MyThirdBlock=new BlockChain(null,MySecoundBlock.getHash());
		System.out.println("This is my Third block: " +MyThirdBlock.CalculatePreviousHash());
		System.out.println("Enter the data you want to store?");
		String EnteredData1=Keyboard.nextLine();
		MyThirdBlock.setData(EnteredData1);
		System.out.println("My new Data is: "+EnteredData1+ " : " +MyThirdBlock.CalculatePreviousHash());
		
		
		System.out.println("");
		BlockChain MyFourthBlock=new BlockChain(null,MyThirdBlock.getHash());
		System.out.println("This is my fourth block: " +MyFourthBlock.CalculatePreviousHash());
		System.out.println("Enter the data you want to store?");
		String EnteredData2=Keyboard.nextLine();
		MyFourthBlock.setData(EnteredData2);
		System.out.println("My new Data is: "+EnteredData2+ " : " +MyFourthBlock.CalculatePreviousHash());
			
	}
}
