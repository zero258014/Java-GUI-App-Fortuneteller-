package fortuneteller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * 画面の切り替え
 */

public class ChangePanel implements ActionListener {

	Window window = null;

	// ★★★一番最初の画面の設定を変えるために、Mainでインスタンスしたwindowを引き取る
	public ChangePanel(Window w) {
		this.window = w;
	}
	// ★★★--------------------------------------

	// ボタンを押した後の処理
	public void actionPerformed(ActionEvent e) {

		String cardChoice = e.getActionCommand();
		
		
		//乱数でカードを決める
		if (cardChoice.equals("もう一度選んでみるか？")) {   //戻るボタンなので、乱数をしない。

		} else {
			int cardNo = new java.util.Random().nextInt(3) + 1;
			if (cardNo == 1) {
				cardChoice = "カードA";
			} else if (cardNo == 2) {
				cardChoice = "カードB";
			} else if (cardNo == 3) {
				cardChoice = "カードC";
			}
		}
		
		
		//乱数のカードが決めたら、決めたカードを画面に映す
		if (cardChoice.equals("カードA")) {
			window.getContentPane().removeAll();

			CardAPanel cardA = new CardAPanel();
			window.add(cardA.makeCardATopPanel(), BorderLayout.NORTH);
			window.add(cardA.makeCardACenterPanel(), BorderLayout.CENTER);
			window.add(cardA.makeCardABackPanel(window), BorderLayout.SOUTH);
			window.setVisible(true);

		} else if (cardChoice.equals("カードB")) {
			window.getContentPane().removeAll();

			CardBPanel cardB = new CardBPanel();
			window.add(cardB.makeCardBTopPanel(), BorderLayout.NORTH);
			window.add(cardB.makeCardBCenterPanel(), BorderLayout.CENTER);
			window.add(cardB.makeCardBBackPanel(window), BorderLayout.SOUTH);
			window.setVisible(true);

		} else if (cardChoice.equals("カードC")) {
			window.getContentPane().removeAll();

			CardCPanel cardC = new CardCPanel();
			window.add(cardC.makeCardCTopPanel(), BorderLayout.NORTH);
			window.add(cardC.makeCardCCenterPanel(), BorderLayout.CENTER);
			window.add(cardC.makeCardCBackPanel(window), BorderLayout.SOUTH);
			window.setVisible(true);

		} else if (cardChoice.equals("もう一度選んでみるか？")) {
			window.getContentPane().removeAll();

			MainPanel panel = new MainPanel();
			window.add(panel.makeTopPanel(), BorderLayout.NORTH);
			window.add(panel.makeCenterPanel(), BorderLayout.CENTER);
			window.add(panel.makeBottomPanel(window), BorderLayout.SOUTH);

			window.setVisible(true);
		}

	}

}
