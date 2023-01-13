package fortuneteller;

import java.awt.BorderLayout;

public class Main {
	public static void main(String[] args) {

		Window window = new Window(); //Windowのインスタンス生成

		MainPanel panel = new MainPanel(); // Panelのインスタンス生成

		// Panelの内容をWindow枠に入れて、位置を設定する
		window.add(panel.makeTopPanel(), BorderLayout.NORTH);
		window.add(panel.makeCenterPanel(), BorderLayout.CENTER);
		
		                         //★★★↓↓↓ChangePanelに使うので、枠の引数windowを渡す
		window.add(panel.makeBottomPanel(window), BorderLayout.SOUTH);

		window.setVisible(true); // 画面見えるように出す
	}
}