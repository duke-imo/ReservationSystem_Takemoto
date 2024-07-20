// @2 新規予約機能で新たに追加したクラス コピペ
package client_system;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import	java.awt.event.ActionListener;
import	java.awt.event.ItemEvent;
import	java.awt.event.ItemListener;
import	java.awt.event.WindowEvent;
import	java.awt.event.WindowListener;

public class ReservationCancelDialog extends Dialog implements ActionListener, WindowListener, ItemListener {

	boolean	canceled;							// 新規予約キャンセルステータス（キャンセル：true）
	ReservationControl	rc;						// ReservationControlインスタンス保存用
	
	// パネル
	Panel	panelCenter;
	Panel	panelSouth;
	
	// 入力用コンポーネント
	TextField		tfReservationID;		// 入力用のテキストフィールド
	
	// ボタン
	Button			buttonOK;					// キャンセル実行ボタン
	
	public	ReservationCancelDialog( Frame owner, ReservationControl rc) {
		// 基底クラスのコンストラクタを呼び出す
		super( owner, "予約キャンセル", true);
		
		this.rc = rc;							// ReservationControlのインスタンスを保存
		// 初期値キャンセルを設定
		canceled = true;
		
		// テキストフィールドの生成（予約ID）
		tfReservationID		= new TextField(""); 

		
		// ボタンの生成
		buttonOK	= new Button("キャンセル実行");
		// パネルの生成
		panelCenter	= new Panel();
		panelSouth	= new Panel();

		// 中央パネルに予約開始時刻，終了時刻入力用選択ボックスを追加
		panelCenter.add( new Label("予約ID"));
		panelCenter.add( tfReservationID);

		// 下部パネルに2つのボタンを追加
		panelSouth.add( new Label("   "));
		panelSouth.add( buttonOK);
		
		setLayout( new BorderLayout());
		add( panelCenter,	BorderLayout.CENTER);
		add( panelSouth,	BorderLayout.SOUTH);
		
		// Window Listenerを追加
		addWindowListener( this);
		// ボタンにアクションリスナを追加
		buttonOK.addActionListener( this);
		
		// 大きさの設定，ウィンドウのサイズ変更不可の設定
		this.setBounds( 100, 100, 500, 150);
		setResizable( false);
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		setVisible( false);
		dispose();		
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == buttonOK) {
			canceled = false;
			setVisible( false);
			dispose();
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	
}
