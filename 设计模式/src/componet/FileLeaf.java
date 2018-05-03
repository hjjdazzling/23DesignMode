package componet;

public class FileLeaf extends FolderComponent {
	
	public FileLeaf(String name) {
		   super(name);
	}

	@Override
	public void add(FolderComponent component) {
		   component.add(component);
	}

	@Override
	public void remove(FolderComponent component) {
		 component.remove(component);
	}

	@Override
	public void display() {
		System.out.println("FileLeaf:" + this.getName());
	}
}
