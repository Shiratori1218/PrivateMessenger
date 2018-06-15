package kugui.owd.privateMessenger.stage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import kugui.owd.privateMessenger.TxThread;

public class SendMessageStageController{
	
	@FXML private TextArea txaMessage;
	@FXML private TextField txfSendTo;

	
	
	public void setSendTo(String pMsg) {
		txfSendTo.setText(pMsg);
		return;
	}
	
	/**
	 * EventHandler
	 */
	
	@FXML
	private void btnSend_Click(ActionEvent event) {
		
		TxThread txThread = new TxThread();
		txThread.setTargetIP(txfSendTo.getText());
		txThread.setMessage(txaMessage.getText());
		txThread.start();
		
		return;
	}
	
}