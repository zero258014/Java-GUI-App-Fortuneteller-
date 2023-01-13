package fortuneteller;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * カードCの画面
 */

public class CardCPanel {
	// 一番上の文字のLabel作成
		public JLabel makeCardCTopLabel() {
			JLabel label = new JLabel();

			label.setText("<html><body><br>THREE OF SWORDS</body></html>");

			Font labelFont = new Font("SansSerif", Font.BOLD, 30);
			label.setFont(labelFont);
			return label;
		}
		
		// 真ん中の文字とカードの写真作成
		public JLabel makeCardCCenterLabel() {
			JLabel label = new JLabel();
			ImageIcon cardCImage = new ImageIcon("cardC.jpg");
			label.setIcon(cardCImage);
			label.setText("<html><body>　　大変なときにあるようですね。<br>"
					+ "　　心が傷んで、疲れてもうぼろぼろ、<br>"
					+ "　　そんな心境かもしれません。<br>"
					+ "　　今後の展開のためにも、<br>"
					+ "　　今必要なのは、心を癒すこと、休めること、<br>"
					+ "　　養生して無理をしないこと。<br>"
					+ "　　人生にはそういうときもあるのだと、<br>"
					+ "　　泣きたいときには泣いて、<br>"
					+ "　　痛いときには頑張らないで、<br>"
					+ "　　傷が癒えていくのを、待ちましょう。<br>"
					+ "　　決して、無駄な痛みにはならないから。</body></html>");

			Font labelFont = new Font("SansSerif", Font.BOLD, 16);
			label.setFont(labelFont);

			return label;
		}
		
		
		// 一番上の文字をパネルにいれて、パネルのサイズを設定する
		public JPanel makeCardCTopPanel() {
			JPanel cardCPanel = new JPanel();
			Dimension cardCPanelDimension = new Dimension(700, 100);
			cardCPanel.setPreferredSize(cardCPanelDimension);
			cardCPanel.add(makeCardCTopLabel());
			return cardCPanel;
		}
		
		
		// 真ん中の文字と写真をパネルにいれて、パネルのサイズを設定する
		public JPanel makeCardCCenterPanel() {
			JPanel cardCPanel = new JPanel();
			Dimension cardCPanelDimension = new Dimension(300, 500);
			cardCPanel.setPreferredSize(cardCPanelDimension);
			cardCPanel.add(makeCardCCenterLabel());
			return cardCPanel;
		}
		
		
		// 戻るボタンのパネルのサイズを設定する
										//★枠の引数を引き取る
		public JPanel makeCardCBackPanel(Window w) {
			JPanel cardCPanel = new JPanel();
			Dimension cardCPanelDimension = new Dimension(700, 50);
			cardCPanel.setPreferredSize(cardCPanelDimension);
			cardCPanel.add(Button.makeBackButton("もう一度選んでみるか？", w));//★枠の引数を渡す
			return cardCPanel;
		}
}
