package componet;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite extends FolderComponent {
	 private final List<FolderComponent> components;

	 public FolderComposite(String name) {
	   super(name);
	   this.components = new ArrayList<FolderComponent>();
	 }

	 public FolderComposite() {
	   this.components = new ArrayList<FolderComponent>();
	 }

	 @Override
	 public void add(FolderComponent component) {
	   this.components.add(component);
	 }

	 @Override
	 public void remove(FolderComponent component) {
	   this.components.remove(component);
	 }

	 @Override
	 public void display() {
	   System.out.println("FolderComposite---name:" + this.getName());
	   for (FolderComponent component : components) {
	     System.out.println("FolderComposite---component-name:" + component.getName());
	   }
	 }
	}