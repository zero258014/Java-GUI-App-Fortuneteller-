package fortuneteller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * アプリの枠を作る
 */

public class Window extends JFrame {
	public Window() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 右上の×
		this.setResizable(false); // 画面サイズ調整できない
		this.setTitle("占い館"); // タイトル設定
		this.setSize(700, 550); // 画面最初のサイズ
		this.setLocationRelativeTo(null); // 画面を真ん中にする

		ImageIcon icon = new ImageIcon("icon.jpg"); // 画面左上のアイコンを変える
		this.setIconImage(icon.getImage()); // アイコンを画面に入れる

	}

}
