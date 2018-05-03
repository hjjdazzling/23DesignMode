package componet;

import javax.swing.plaf.metal.MetalFileChooserUI.FilterComboBoxRenderer;

public class Test {
	public static void main(String[] args) {
		FolderComponent leaf = new FileLeaf("hjj.text"); 
		FolderComponent leaf2 = new FileLeaf("hjj2.text"); 
		
		
		FolderComponent component = new FolderComposite("ÎÄ¼þŠA");
		component.add(leaf);
		component.add(leaf2);
		
		component.display();
	}
}
