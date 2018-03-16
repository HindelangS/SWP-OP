public class HoeherCmd implements ICommand {

	Figur f;
	int meter;
	
	public HoeherCmd(Figur figur, int meter) {
		this.f = figur;
		this.meter = meter;
	}
	
	@Override
	public void doIt() {
		f.hoeher(meter);
	}
	
	@Override
	public void unDoIt() {
		f.hoeher(meter * -1);
	}

}