package kugui.owd.privateMessenger;

import kugui.owd.privateMessenger.stage.BaseStage;

public class Booker extends Thread {
	
	private BaseStage baseStage;
	
	public void run() {
		
//		if( baseStage.getClass() == new ReceivedMessageStage().getClass() ) {
//			ReceivedMessageStageController rmsc = (ReceivedMessageStageController)baseStage.getContoller();
//			rmsc.setMessageWindow("Test");
//		}
		
		baseStage.getStage().show();
		return;
	}
	
	/**
	 * コンストラクタ
	 * @param pBS 描画したい画面のStage取得用クラス
	 */
	public Booker( BaseStage pBS ) {
		setStage(pBS);
		return;
	}
	
	/**
	 * 描画する画面を設定する
	 * @param pBS 描画対象となる画面のStage取得用クラス
	 */
	public void setStage(BaseStage pBS) {
		baseStage = pBS;
		return;
	}
	
	/**
	 * Controllerのインスタンスを取得する。
	 * @return Controllerインスタンス
	 */
	public Object getController() {
		return baseStage.getContoller();
	}
	
}