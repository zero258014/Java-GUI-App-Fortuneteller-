package fortuneteller;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 *アプリ最初の画面を作る
 */

public class MainPanel {

	// 一番上の文字のLabel作成
	public JLabel makeTopLabel() {
		JLabel label = new JLabel();
		label.setText("占い館へようこそ");

		Font labelFont = new Font("SansSerif", Font.BOLD, 30);
		label.setFont(labelFont);
		return label;
	}

	// 真ん中の文字とカードの写真作成
	public JLabel makeCenterLabel() {
		JLabel label = new JLabel();
		ImageIcon cardImage = new ImageIcon("card.jpg");

		label.setText("好きなカードを選んでください");
		label.setIcon(cardImage);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);

		Font labelFont = new Font("SansSerif", Font.BOLD, 30);
		label.setFont(labelFont);
		return label;

	}

	// 一番上の文字をパネルにいれて、パネルのサイズを設定する
	public JPanel makeTopPanel() {
		JPanel headerPanel = new JPanel();
		Dimension headerPanelDimension = new Dimension(700, 50);
		headerPanel.setPreferredSize(headerPanelDimension);
		headerPanel.add(makeTopLabel());
		return headerPanel;
	}

	// 真ん中の文字と写真をパネルにいれて、パネルのサイズを設定する
	public JPanel makeCenterPanel() {
		JPanel centerPanel = new JPanel();
		Dimension centerPanelDimension = new Dimension(700, 500);
		centerPanel.setPreferredSize(centerPanelDimension);
		centerPanel.add(makeCenterLabel());
		return centerPanel;
	}

	// 選択ボタンのパネルのサイズを設定する
	                            //★↓↓★枠の引数を引き取る
	public JPanel makeBottomPanel(Window w) {
		JPanel bottomPanel = new JPanel();
		Dimension bottomPanelDimension = new Dimension(700, 50);
		bottomPanel.setPreferredSize(bottomPanelDimension);
		bottomPanel.add(Button.makeButton("カードA", w));//★枠の引数w渡す
		bottomPanel.add(Button.makeButton("カードB", w));//★枠の引数w渡す
		bottomPanel.add(Button.makeButton("カードC", w));//★枠の引数w渡す
		return bottomPanel;
	}

}
