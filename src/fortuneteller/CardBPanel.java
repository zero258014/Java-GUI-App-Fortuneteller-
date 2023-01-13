package fortuneteller;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * カードBの画面
 */

public class CardBPanel {
	// 一番上の文字のLabel作成
		public JLabel makeCardBTopLabel() {
			JLabel label = new JLabel();

			label.setText("<html><body><br>FIVE OF RINGS</body></html>");

			Font labelFont = new Font("SansSerif", Font.BOLD, 30);
			label.setFont(labelFont);
			return label;
		}
		
		// 真ん中の文字とカードの写真作成
		public JLabel makeCardBCenterLabel() {
			JLabel label = new JLabel();
			ImageIcon cardBImage = new ImageIcon("cardB.jpg");
			label.setIcon(cardBImage);
			label.setText("<html><body>　　難しいときを迎えているようですね。<br>"
					+ "　　一筋縄ではない問題が発生して、<br>"
					+ "　　収拾に手をやいているのかもしれません。<br>"
					+ "　　不調和な状態はストレスが多いし、<br>"
					+ "　　早く割り切ってすっきりしたいところでしょうが、<br>"
					+ "　　葛藤や混乱の経験にも、大事な意味があるのかも。<br>"
					+ "　　ぱっと全てがうまく解決とはいかなくても、<br>"
					+ "　　少しずつ押したり引いたりしてみているうちに、<br>"
					+ "　　絡まっていた部分がゆるむようになって、<br>"
					+ "　　解ける糸口が、きっと見えてくる。<br>"
					+ "　　焦らずに、自分にとっての意味、<br>"
					+ "　　自分にとっての糸口を探していくことが、<br>"
					+ "　　今後の展開の鍵となっていくでしょう。</body></html>");

			Font labelFont = new Font("SansSerif", Font.BOLD, 16);
			label.setFont(labelFont);

			return label;
		}
		
		
		// 一番上の文字をパネルにいれて、パネルのサイズを設定する
		public JPanel makeCardBTopPanel() {
			JPanel cardBPanel = new JPanel();
			Dimension cardAPanelDimension = new Dimension(700, 100);
			cardBPanel.setPreferredSize(cardAPanelDimension);
			cardBPanel.add(makeCardBTopLabel());
			return cardBPanel;
		}
		
		
		// 真ん中の文字と写真をパネルにいれて、パネルのサイズを設定する
		public JPanel makeCardBCenterPanel() {
			JPanel cardBPanel = new JPanel();
			Dimension cardAPanelDimension = new Dimension(300, 500);
			cardBPanel.setPreferredSize(cardAPanelDimension);
			cardBPanel.add(makeCardBCenterLabel());
			return cardBPanel;
		}
		
		
		// 戻るボタンのパネルのサイズを設定する
										//★枠の引数を引き取る
		public JPanel makeCardBBackPanel(Window w) {
			JPanel cardBPanel = new JPanel();
			Dimension cardBPanelDimension = new Dimension(700, 50);
			cardBPanel.setPreferredSize(cardBPanelDimension);
			cardBPanel.add(Button.makeBackButton("もう一度選んでみるか？", w));//★枠の引数を渡す
			return cardBPanel;
		}
}
