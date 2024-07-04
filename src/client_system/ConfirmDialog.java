// @3 予約状況確認機能で新たに追加したクラス
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
import java.awt.event.ItemEvent;
import	java.awt.event.ItemListener;
import	java.awt.event.WindowEvent;
import	java.awt.event.WindowListener;
import	java.util.ArrayList;
import	java.util.List;

public class ConfirmDialog extends Dialog implements ActionListener, WindowListener, ItemListener {

	boolean	canceled;							// 新規予約キャンセルステータス（キャンセル：true）
	ReservationControl	rc;						// ReservationControlインスタンス保存用
	
	// パネル
	Panel	panelNorth;
	Panel	panelSouth;
	
	// 入力用コンポーネント
	ChoiceFacility	choiceFacility;				// 教室選択用ボックス
	TextField		tfYear, tfMonth, tfDay;		// 年月日のテキストフィールド

	
	// ボタン
	Button			buttonOK;					// OKボタン
	Button			buttonCancel;				// キャンセルボタン
	
	public	ConfirmDialog( Frame owner, ReservationControl rc) {
		// 基底クラスのコンストラクタを呼び出す
		super( owner, "予約状況確認", true);
		
		this.rc = rc;							// ReservationControlのインスタンスを保存
		// 初期値キャンセルを設定
		canceled = true;
		
		// 教室選択ボックスの生成
		List<String> facilityId = new ArrayList<String>();		// 全てのfacilityIDを入れるリスト
		facilityId 		= rc.getFacilityId();					// 全facilityIDを読出し，リストに入れる
		choiceFacility	= new ChoiceFacility( facilityId);		// 教室選択用コンボボックスのインスタンス生成
		// テキストフィールドの生成（年月日）
		tfYear		= new TextField("", 4);
		tfMonth 	= new TextField("", 2);
		tfDay		= new TextField("",2);
		
		// ボタンの生成
		buttonOK	= new Button("検索");
		
		// パネルの生成
		panelNorth	= new Panel();
		panelSouth	= new Panel();
		
		// 上部パネルに教室選択ボックス，年月日入力欄を配置
		panelNorth.add( new Label("教室　"));
		panelNorth.add( choiceFacility);
		panelNorth.add( new Label("予約日"));
		panelNorth.add( tfYear);
		panelNorth.add( new Label("年"));
		panelNorth.add( tfMonth);
		panelNorth.add( new Label("月"));
		panelNorth.add( tfDay);
		panelNorth.add( new Label("日"));
		
		// 下部パネルに2つのボタンを追加
		panelSouth.add( new Label("   "));
		panelSouth.add( buttonOK);
		
		// ReservationDialogをBorderLayoutに設定し，3つのパネルを追加
		setLayout( new BorderLayout());
		add( panelNorth,	BorderLayout.NORTH);
		add( panelSouth,	BorderLayout.SOUTH);
		
		// Window Listenerを追加
		addWindowListener( this);
		// ボタンにアクションリスナを追加
		buttonOK.addActionListener( this);
		buttonCancel.addActionListener( this);
		// 教室選択ボックス，時・分選択ボックスそれぞれに項目Listenerを追加
		choiceFacility.addItemListener( this);
		
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
		if( e.getSource() == buttonCancel) {
			setVisible( false);
			dispose();
		} else if( e.getSource() == buttonOK) {
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