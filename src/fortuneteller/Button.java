package fortuneteller;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

/*
 * 画面上のボタンを作る
 */

public class Button {

	// カードを選択するボタン　　　　　　　　　　 ★↓↓★枠の引数を引き取る
	public static JButton makeButton(String name, Window w) {
		JButton button = new JButton(name);
		Dimension buttonDimension = new Dimension(200, 30);
		button.setPreferredSize(buttonDimension);
		Font buttonFont = new Font("SansSerif", Font.BOLD, 24);
		button.setFont(buttonFont);
		button.addActionListener(new ChangePanel(w));//★ChangePanelのインスタンスを生成、枠の引数w渡す
		return button;
	}

	//最初の画面に戻るボタン　　　　　　　　　　　　　★↓↓★枠の引数を引き取る
	public static JButton makeBackButton(String name, Window w) {
		JButton button = new JButton(name);
		Dimension buttonDimension = new Dimension(300, 30);
		button.setPreferredSize(buttonDimension);
		Font buttonFont = new Font("SansSerif", Font.BOLD, 16);
		button.setFont(buttonFont);
		button.addActionListener(new ChangePanel(w));//★ChangePanelのインスタンスを生成、枠の引数w渡す
		return button;
	}
}
