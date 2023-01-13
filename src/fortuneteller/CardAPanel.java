package fortuneteller;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * カードAの画面
 */

public class CardAPanel extends JPanel {
	
	// 一番上の文字のLabel作成
	public JLabel makeCardATopLabel() {
		JLabel label = new JLabel();

		label.setText("<html><body><br>ACE OF WANDS</body></html>");

		Font labelFont = new Font("SansSerif", Font.BOLD, 30);
		label.setFont(labelFont);
		return label;
	}
	
	// 真ん中の文字とカードの写真作成
	public JLabel makeCardACenterLabel() {
		JLabel label = new JLabel();
		ImageIcon cardAImage = new ImageIcon("cardA.jpg");
		label.setIcon(cardAImage);
		label.setText("<html><body>　　新たな始まりのときにあるようですね。<br>" 
				+ "　　自分の情熱をかける、ひとつの挑戦の始まり。<br>"
				+ "　　この先の展開は、自分のやりたいことを信じて<br>" 
				+ "　　追い続けることができるかどうかに、<br>" 
				+ "　　かかっていくことになるでしょう。<br>"
				+ "　　これに賭けて、やってみようと思ったなら、<br>" 
				+ "　　今のこの楽しい気持ち、わくわくする気分、<br>" 
				+ "　　熱いエネルギーがぐんぐん湧き出すような感覚、<br>"
				+ "　　そのやる気を、忘れないことが大事。<br>" 
				+ "　　この先つまずくことがあったとしても、<br>" 
				+ "　　この初心は、簡単に捨てないで。</body></html>");

		Font labelFont = new Font("SansSerif", Font.BOLD, 16);
		label.setFont(labelFont);

		return label;
	}
	
	
	// 一番上の文字をパネルにいれて、パネルのサイズを設定する
	public JPanel makeCardATopPanel() {
		JPanel cardAPanel = new JPanel();
		Dimension cardAPanelDimension = new Dimension(700, 100);
		cardAPanel.setPreferredSize(cardAPanelDimension);
		cardAPanel.add(makeCardATopLabel());
		return cardAPanel;
	}
	
	
	// 真ん中の文字と写真をパネルにいれて、パネルのサイズを設定する
	public JPanel makeCardACenterPanel() {
		JPanel cardAPanel = new JPanel();
		Dimension cardAPanelDimension = new Dimension(300, 500);
		cardAPanel.setPreferredSize(cardAPanelDimension);
		cardAPanel.add(makeCardACenterLabel());
		return cardAPanel;
	}
	
	
	// 戻るボタンのパネルのサイズを設定する
									//★枠の引数を引き取る
	public JPanel makeCardABackPanel(Window w) {
		JPanel cardAPanel = new JPanel();
		Dimension cardAPanelDimension = new Dimension(700, 50);
		cardAPanel.setPreferredSize(cardAPanelDimension);
		cardAPanel.add(Button.makeBackButton("もう一度選んでみるか？", w));//★枠の引数を渡す
		return cardAPanel;
	}
}