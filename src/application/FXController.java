package application;

import org.opencv.videoio.VideoCapture;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class FXController {
	
	// declaring variables from fxml file to be manipulated by controller 
	@FXML
	private Button start_button;  //the button name might be a variation check back later if issue 
	@FXML
	private ImageView currentFrame;
	
	@FXML
	protected void startCamera(ActionEvent event) {
		VideoCapture capture = new VideoCapture();
		
		Runnable frameGrabber = new Runnable();
		Thread t = new Thread(new Runnable() {
		    public void run() {
		        // stuff here
		    	this.timer = Executors.newSingleThreadScheduledExecutor();
	            this.timer.scheduleAtFixedRate(frameGrabber, 0, 33, TimeUnit.MILLISECONDS);
		    }
		});
		t.start();
	/*	Runnable frameGrabber = new Runnable() { ... }
		this.timer = Executors.newSingleThreadScheduledExecutor();
		            this.timer.scheduleAtFixedRate(frameGrabber, 0, 33, TimeUnit.MILLISECONDS); */
	}
	
	
}
