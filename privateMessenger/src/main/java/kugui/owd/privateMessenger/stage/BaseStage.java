package kugui.owd.privateMessenger.stage;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BaseStage{
	
	protected final String EXT_FXML = ".fxml";
	
	protected String FXMLName;
	protected String Title;
	protected FXMLLoader fxmlLoader;
	protected Parent parent;
	protected Scene scene;
	
	/**
	 * コンストラクタ
	 *   ・参照するFXMLファイル名にクラス名を設定。
	 */
	public BaseStage() {
		FXMLName = getClass().getSimpleName();
		fxmlLoader = new FXMLLoader(getClass().getResource(FXMLName + EXT_FXML));
		Title = "Stage Titile";
		try {
		parent = fxmlLoader.load();
		scene = new Scene(parent);
		}catch(IOException ioe) {
			
			ioe.printStackTrace();
			
		}
		
		return;
	}
	
	public Stage getStage() {
		Stage ret = new Stage();
		
			
			
			/**
			 * Stageの内容を設定する
			 */
			ret.setScene(scene);
			ret.setTitle(Title);
			
		
		return ret;
	}
	
	public void setController(ReceivedMessageStageController pCtrl) {
		fxmlLoader.setController((Object)pCtrl);
		return;
	}
	
	public Object getContoller() {
		return fxmlLoader.getController();
	}
	
}

