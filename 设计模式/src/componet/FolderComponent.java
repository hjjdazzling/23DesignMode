package componet;

public abstract class FolderComponent {
	private String name;

	 public String getName() {
	   return name;
	 }

	 public void setName(final String name) {
	   this.name = name;
	 }

	 public FolderComponent() {
	 }

	 public FolderComponent(final String name) {
	   this.name = name;
	 }

	 public abstract void add(FolderComponent component);

	 public abstract void remove(FolderComponent component);

	 public abstract void display();
}
