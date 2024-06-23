/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Entry point for the JavaFX application.
 *   Project:  JavaFX Application
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:      Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *   Version:  2024-03 (4.31.0)
 *   Build id: 20240307-1437
 ********************************************************************************************/

package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * Main class for launching the JavaFX application.
 */
public class Main extends Application {

	/**
	 * Start method to initialize and display the primary stage.
	 * 
	 * @param primaryStage The primary stage of the application.
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			// Load the FXML file
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));

			// Create the scene
			Scene scene = new Scene(root, 400, 400);

			// Add CSS stylesheet to the scene
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			// Set the scene on the primary stage and display
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Main method to launch the application.
	 * 
	 * @param args Command-line arguments.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
