package kugui.owd.privateMessenger;

import javafx.application.Application;
import javafx.application.Platform;
import kugui.owd.privateMessenger.stage.*;

public class PrivateMessenger
{
	public static void main( String[] args) {
		
		RxThread rxThread = new RxThread();
		
		/* メッセージ受信ポートのLISTEN開始 */
		rxThread.start();
		
		/* applicationの展開。当該スレッドをアプリケーションスレッドとする。 */
		Application.launch(MainStage.class, args);
		
		/**
		 *  ウィンドウが全て閉じられた場合、以降の処理を実行する。 
		 */
		
		/* メッセージ受信ポートのLISTEN終了を知らせる */
		rxThread.interrupt();
		
		/* applicationを確実に終了させる */
		Platform.exit();
		
		System.out.println( "r u still awake?");
		
		return;
	}
}