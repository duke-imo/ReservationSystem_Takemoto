// @2 新規予約機能で新たに追加したクラス
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
import	java.util.ArrayList;
import	java.util.List;

public class ConfirmDialog extends Dialog implements ActionListener, WindowListener, ItemListener {

	boolean	canceled;							// 新規予約キャンセルステータス（キャンセル：true）
	ReservationControl	rc;						// ReservationControlインスタンス保存用
	
	// パネル
	Panel	panelNorth;
	Panel	panelSouth;
	
/*	// 入力用コンポーネント
	ChoiceFacility	choiceFacility;				// 教室選択用ボックス
	TextField		tfYear, tfMonth, tfDay;		// 年月日のテキストフィールド
	ChoiceHour		startHour;					// 予約開始時間（時）の選択ボックス
	ChoiceMinute	startMinute;				// 予約開始時間（分）の選択ボックス
	ChoiceHour		endHour;					// 予約終了時間（時）の選択ボックス
	ChoiceMinute	endMinute;					// 予約終了時間（分）の選択ボックス*/
	
	// ボタン
	Button			buttonOK;					// OKボタン
	Button			buttonCancel;				// キャンセルボタン
	
	public	ConfirmDialog( Frame owner, ReservationControl rc) {
		
	}