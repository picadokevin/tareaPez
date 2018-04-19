/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fishhomework;

import java.awt.Image;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.VerticalDirection;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.Line;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author kevin
 * @version 1.0
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
  private ImageView pez;
     @FXML
    private ImageView burbuja;
    @FXML
  private Canvas canvas;
  
    public void initialize(URL url, ResourceBundle rb) {
      
                
       Line line= new Line(0,50,1000,50);
      PathTransition trann=new PathTransition();
       PathTransition tran = new PathTransition();
        trann.setNode(burbuja);
        tran.setNode(pez);
        tran.setDuration(Duration.seconds(4));
        trann.setDuration(Duration.seconds(4));
        tran.setPath(line);
        trann.setPath(line);
        tran.setCycleCount(Animation.INDEFINITE);
        trann.setCycleCount(Animation.INDEFINITE);
        tran.play();
        trann.play();
        
    }
   
        
    
  
  public void canvasMouseClicked(MouseEvent event) throws FileNotFoundException {
	Line line= new Line(0, 100,0,0);
        
        PathTransition trann = new PathTransition();
        
        trann.setNode(burbuja);
        trann.setDuration(Duration.seconds(4));
        trann.setPath(line);
       
        trann.setCycleCount(Animation.INDEFINITE);
  
        trann.play();
        
     	
	}
  
	

}

   


