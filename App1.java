package appStuff;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App1 extends Application {

	private ObservableList<String> items = FXCollections.observableArrayList("winkin", "blinkin", "nod");
	private ListView<String> itemListView;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage mainStage) throws Exception {
		VBox root = new VBox();
		addMenuBar(root);
		addList(root);
		addButtons(root);
		Scene scene = new Scene(root, 300, 200);
		mainStage.setScene(scene);
		mainStage.setTitle("Groovy App");
		mainStage.show();
	}
	private void addMenuBar(VBox parent) {
		MenuBar menuBar = new MenuBar();
		itemListView = new ListView<String>(items);
		Menu fileMenu = new Menu("File");
		
		MenuItem addItem = new MenuItem("addItem");
		MenuItem clearSelection = new MenuItem("Clear Selection");
		MenuItem removeItem = new MenuItem("Remove");
		
		fileMenu.getItems().add(clearSelection);
		fileMenu.getItems().add(addItem);
		fileMenu.getItems().add(removeItem);
		
		clearSelection.setOnAction( (event)->clearSelection());
		addItem.setOnAction((event)->addItem());
		removeItem.setOnAction((event)->removeItem());
		menuBar.getMenus().add(fileMenu);
		
		parent.getChildren().add(menuBar);
	}
	
	private void clearSelection() {
		itemListView.getSelectionModel().clearSelection();
	}
	
	private void addItem() {
		items.add("a new item!");
	}
	
	private void removeItem() {
		int selectedIndex = itemListView.getSelectionModel().getSelectedIndex();
		if(selectedIndex == -1) {
			return;
		}
		items.remove(selectedIndex);
		
	}
	
	private void addList(VBox parent) {
		itemListView = new ListView<String>(items);
		parent.getChildren().add(itemListView);	
		}
	
	private void addButtons(VBox parent) {
		HBox row = new HBox();
		Button button1 = new Button("Hello");
		Button button2 = new Button("Bye");
		Button button3 = new Button("Message");
		button1.setOnAction( (event)->handleButton1() );
		button2.setOnAction( (event)->handleButton2() );
		button3.setOnAction( (event) ->handleButton3() );
		row.getChildren().add(button1);
		row.getChildren().add(button2);
		row.getChildren().add(button3);
		parent.getChildren().add(row);
	}
	
	private void handleButton1() {
		System.out.println("Hello");
	}
	private void handleButton2() {
		System.out.println("Bye");
	}
	
	private void handleButton3() {
		String message = itemListView.getSelectionModel().getSelectedItem();
		if(message == null) {
			message = "Please select an item";
		}
		System.out.println(message);
	}

}
