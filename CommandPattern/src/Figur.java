
public class Figur {

	int posX;
	int posZ;
	
	public Figur(){
		
		this.posX = 0;
		this.posZ = 0;
	}
	
	public Figur(int x, int y){
		
		this.posX = x;
		this.posZ = y;
	}
	
	
	
	public void vor(int meter) {
		
		posX += meter;
		
	}
	
	public void hoeher(int meter) {
		
		posZ += meter;
		
	}
	
	public int getX() {
		return posX;
	}

	public int getZ() {
		return posZ;
	}

		
}
