package solvers;

import boardgames.GameBoard;
import boardgames.GameBoardView;
import boardgames.GameCoordinate;
import boardgames.Knight;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PuzzleApp extends Application {
	
	GameBoard board = new GameBoard(6, Color.DARKGREEN, Color.BEIGE);
	private PuzzleSolver solver;
	private GameCoordinate startCoord = new GameCoordinate('a',1);
	private Knight aKnight = new Knight();
	private GameMove startMove = new GameMove(startCoord, aKnight);
	private ListView<GameMove> moveListView;
	
	@Override
	public void start(Stage mainStage) throws Exception {
		solver = new KnightsTourSolver( board, startMove);
		solver.solve();
		HBox root = new HBox();
		addGameBoardAndButtons(root);
		addMoveListView(root);
		Scene scene = new Scene(root, 400, 300);
		mainStage.setScene(scene);
		mainStage.setTitle("Puzzles!");
		mainStage.show();

	}
	
	private void addGameBoardAndButtons(HBox parent) {
		VBox column = new VBox();
		column.getChildren().add(new GameBoardView(board, 280, 280));
		//code to add game board
		addButtons(column);
		parent.getChildren().add(column);
	}
	private void addButtons(VBox parent) {
		HBox row = new HBox(3);
		Button resetButton = new Button("Reset");
		Button stepButton = new Button("Step");
		resetButton.setOnAction((event)->handleReset());
		stepButton.setOnAction((event)->handleStep());

		row.getChildren().add(resetButton);
		row.getChildren().add(stepButton);
		parent.getChildren().add(row);
	}
	
	private void handleReset() {
		board.clearBoard();
		moveListView.getSelectionModel().clearSelection();
		nextStep =0;
	}
	
	private void handleStep() {
		if(nextStep >= solver.getMoves().size()) {
			return;
		}
		moveListView.getSelectionModel().clearAndSelect(nextStep);
		solver.getMoves().get(nextStep).doOn(board);
		++nextStep;
	}
	private void addMoveListView(HBox parent) {
		moveListView = new ListView<GameMove>(solver.getMoves());
		parent.getChildren().add(moveListView);
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
