package ui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import model.Game;
import threads.PacmanThread;

public class PacmanController {

    @FXML
    private MenuItem uploadGame;

    @FXML
    private MenuItem saveGame;

    @FXML
    private MenuItem exit;

    @FXML
    private MenuItem hallOfFame;

    @FXML
    private MenuItem aboutTheGame;

    @FXML
    private Pane pane;

    private Game catchThePacman;
    private PacmanThread thread;
    
    @FXML
    public void initialize() {

    	catchThePacman = new Game();
    	pane.setStyle("-fx-background-color: #000080");
    	
    }
    
    @FXML
    void newGame(ActionEvent event) {
    	
    	double maxWidth = getWidth(); maxWidth = (double)maxWidth;
    	double maxHeight = getHeight(); maxHeight = (double)maxHeight;
    	double yRandom = 39+Math.random()* maxHeight-39;
    	double xRandom = 39+Math.random()* maxWidth-39;
    	
    	Arc pacmanClone1 = new Arc(39, yRandom, 25, 25, 45, 270);
    	pacmanClone1.setFill(Color.YELLOW);
    	pacmanClone1.setType(ArcType.ROUND);
    	pacmanClone1.setStrokeWidth(2); pacmanClone1.setStroke(Color.BLACK);
    	
    	pane.getChildren().add(pacmanClone1);
    	thread.start();
    	
    }
    
    public double getWidth() {
    	return pane.getWidth();
    }
    
    public double getHeight() {
    	return pane.getHeight();
    }

}
