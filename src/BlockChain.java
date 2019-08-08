
public class BlockChain 
{
	
	//Properties
	private String hash;
	private String data;
	private String previousHash;

	//constructor with only data is created
public BlockChain(String data)
{
	this.data=data;
	this.hash=hash;
}
//New constructor is created for calclulating previous hash
public BlockChain(String data,String previousHash)
{
	this.data=data;
	this.hash=hash;
	this.previousHash=previousHash;
}
//getter and setters are generated
public String getPreviousHash() {
	return previousHash;
}

public void setPreviousHash(String previousHash) {
	this.previousHash = previousHash;
}

public String getHash() {
	return hash;
}

public void setHash(String hash) {
	this.hash = hash;
}

public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}

//Method for calclulating hash is generated as defined in phase1
public int CalculateHash()
{
	int CalculatedHash=data.hashCode();
	return CalculatedHash;
}

//Method for calculating previous hash is generated as mentioned in phase2
public int CalculatePreviousHash()
{
	int CalculatePreviousHash=(data+previousHash).hashCode();
	return CalculatePreviousHash;	
}
}