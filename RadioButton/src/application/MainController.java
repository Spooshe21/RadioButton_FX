/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Controller class for handling JavaFX RadioButton events.
 *   Project:  JavaFX Application
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:      Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *   Version:  2024-03 (4.31.0)
 *   Build id: 20240307-1437
 ********************************************************************************************/

package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

/**
 * Controller class for handling events related to RadioButtons.
 */
public class MainController {
	@FXML
	private RadioButton rb1;
	@FXML
	private RadioButton rb2;

	@FXML
	private Label lbl;

	/**
	 * Handles the action event when a RadioButton is selected. Updates the Label to
	 * display the selected RadioButton's text.
	 * 
	 * @param event The ActionEvent triggered by selecting a RadioButton.
	 */
	public void radioSelect(ActionEvent event) {
		String message = "";
		if (rb1.isSelected()) {
			message += rb1.getText() + "\n";
		}
		if (rb2.isSelected()) {
			message += rb2.getText() + "\n";
		}
		lbl.setText(message);
	}
}
