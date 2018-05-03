package build;

public class Direct {
	private IBuild iBuild;
	
	public Direct(IBuild iBuild) {
		this.iBuild = iBuild;
	}
	
	public Product build() {
		return iBuild.create();
	}
	public IBuild getiBuild() {
		return iBuild;
	}

	public void setiBuild(IBuild iBuild) {
		this.iBuild = iBuild;
	}
	
	
}
