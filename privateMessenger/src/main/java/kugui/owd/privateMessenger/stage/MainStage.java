package kugui.owd.privateMessenger.stage;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainStage extends Application {
	
	@Override
	public void start(Stage stage) throws Exception{
		
		/* 初期画面としてメッセージ送信ウィンドウを表示 */
		
		stage = new SendMessageStage().getStage();
		stage.show();
		
		return;
	}

}

