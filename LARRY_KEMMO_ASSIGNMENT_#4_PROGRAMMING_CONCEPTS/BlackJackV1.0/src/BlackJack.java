 
/*Please Professor Run the Program From Here..... Thank you*/

// *******************************************************************************************************************************************************
			// Class                   :    GUI BlackJack.Java
			//
			// Method  parameters      :    None
			// 
			// Method return           :    void
			//
			// Synopsis                :    This class is responsible for the running of the game as well as the whole Graphical User Interface
			//                              
			// Modifications           :    
			//                              Date           Developer              Notes
			//                             ------         -----------            -------
			//                            2022-03-31      Larry Kemmo        Initial setup and commenting   
	        //                                              
			//                                            
			//                                            
	        //
			//*********************************************************************************************************************************************************
	

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

public class BlackJack extends JFrame {
    
	/*GLOBAL DATA DECLERATION*/
	
	private JPanel contentPane;
	private static JLabel lblPlayerFirstCards;          // Global Data declaration for lblPlayerFirstCards
	private static JLabel lblPlayerSecondCards;         // Global Data declaration for lblPlayerSecondCards
	private static JLabel lblPlayerThirdCards;          // Global Data declaration for lblPlayerThirdCards
	private static JLabel lblPlayerFourthCards;         // Global Data declaration for lblPlayerFourthCards
	private static JLabel lblPlayerFifthCards;          // Global Data declaration for lblPlayerFifthCards
	private static JLabel lblDealerFirstCards;          // Global Data declaration for lblDealerFirstCards
	private static JLabel lblDealerSecondCards;         // Global Data declaration for lblDealerSecondCards
	private static JLabel lblDealerThirdCards;          // Global Data declaration for lblDealerThirdCards
	private static JLabel lblDealerFourthCards;			// Global Data declaration for lblDealerFourthCards
	private static JLabel lblDealerFifthCards;			// Global Data declaration for lblDealerFifthCards
	private JLabel lblPlayerHandCount;                  // Global Data declaration for lblPlayerHandCount
	private static JLabel lblPlayerHand;				// Global Data declaration for lblPlayerHand
	private static JLabel lblDealerHand;				// Global Data declaration for lblDealerHand
	private JLabel lblDealerHandCount;					// Global Data declaration for lblDealerHandCount
	private static 	int HitCounter = 0;					// Global Data declaration for HitCounter
	private static  int PlayCounter =0;					// Global Data declaration for PlayCounter
	private JLabel lblDealerWallet;						// Global Data declaration for lblDealerWallet
	private static JLabel lblDWallet;					// Global Data declaration for lblDWallet
	private JLabel lblPlayerWallet;						// Global Data declaration for lblPlayerWallet
	private  static JLabel lblPWallet;					// Global Data declaration for lblPWallet
	private JLabel lblPlayerWin;						// Global Data declaration for lblPlayerWin
	private static JLabel lblPlayerWins;				// Global Data declaration for lblPlayerWins
	private JLabel lblDealerWin;						// Global Data declaration for lblDealerWin
	private static JLabel lblDealerWins;				// Global Data declaration for lblDealerWins
	private JLabel lblPlayerNames;						// Global Data declaration for lblPlayerNames
	private static JLabel lblPlayerName;				// Global Data declaration for lblPlayerName
	private JLabel lblBlackJack;						// Global Data declaration for lblBlackJack
	private JLabel IblBJBackground;						// Global Data declaration for lblBackground
	private JLabel lblBJLogo;							// Global Data declaration for lblLogo
	private static JButton btnPlay;						// Global Data declaration for btnPlay
	private static JButton btnHit;						// Global Data declaration for btnHit
	private static JButton btnStand;					// Global Data declaration for btnStand
	public static JButton btnNewGame;					// Global Data declaration for btnStand
	public static Clip TensionSound;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlackJack frame = new BlackJack();
					frame.setVisible(true);
					btnNewGame.setEnabled(false);
					btnHit.setEnabled(false);
					btnStand.setEnabled(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BlackJack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClickSound();
				/*Condition ensuring that the methods  when play button is actionned the first time differs from the second time  */
				
				btnHit.setEnabled(true);
				btnStand.setEnabled(true);
				
				if (PlayCounter == 0) {            // Condition for when the play button is actionned the first time
					ValuesInit();					// Calling the ValuesInit method
					BlackJackMechanics.play();		// Calling the play method from the BlackJackMechanics
					btnPlay.setEnabled(false);		// Disabling the Play button
				}

				 if (PlayCounter >= 1) {			// Condition for when the play button is actionned the first time
					CardInit();						// Calling the CardInit method
					ValuesInit2();					// Calling the ValuesInit2 method
					BlackJackMechanics.Play2();		// Calling the Play2 method from the BlackJackMechanics class

				}
				
				PlayCounter ++;						// Incrementing PlayCounter
			
			}
		});
		btnPlay.setBounds(817, 291, 108, 21);
		contentPane.add(btnPlay);
		
		btnHit = new JButton("Hit");
		btnHit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClickSound();
				Hit();			// Calling Hit method

			}
		});
		btnHit.setBounds(817, 339, 108, 21);
		contentPane.add(btnHit);
		
		
		
		btnStand = new JButton("Stand");
		btnStand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClickSound();
				BlackJackMechanics.Stand();			// Calling Stand method from BlackJackMechanics class
				btnHit.setEnabled(false);			// Disable Hit button
				btnStand.setEnabled(false);			// Disable Stand button
				if(BlackJackMechanics.BetValue <= 0 || BlackJackMechanics.BetValue2 <= 0) {
	 	 			BlackJack.setBtnPlay(BlackJackMechanics.GameEnd = false);
	 	 		}
	 	 		else {
	 	 			BlackJack.setBtnPlay(BlackJackMechanics.GameEnd = true);
	 	 		}

			}
		});
		btnStand.setBounds(817, 381, 108, 21);
		contentPane.add(btnStand);
		
		
		btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClickSound();
				btnNewGame.setEnabled(false);
				CardInit();						// Calling the CardInit method
				ValuesInit();					// Calling the ValuesInit2 method
				HitCounter = 0;
				BlackJackMechanics.Play3();
			}
		});
		btnNewGame.setBounds(817, 423, 108, 21);
		contentPane.add(btnNewGame);
		
		 lblPlayerFirstCards = new JLabel(Assets.BackOfCard);   // Initializing lblPlayerFirstCards to the instantiated image back of card in the assets class
		lblPlayerFirstCards.setBounds(43, 456, 108, 149);
		contentPane.add(lblPlayerFirstCards);
		
		 lblPlayerSecondCards = new JLabel(Assets.BackOfCard);	// Initializing lblPlayerSecondCards to the instantiated image back of card in the assets class
		lblPlayerSecondCards.setBounds(196, 456, 108, 149);
		contentPane.add(lblPlayerSecondCards);
		
		lblPlayerThirdCards = new JLabel(Assets.BackOfCard);	// Initializing lblPlayerThirdCards to the instantiated image back of card in the assets class
		lblPlayerThirdCards.setBounds(341, 456, 108, 149);
		contentPane.add(lblPlayerThirdCards);
		
		lblPlayerFourthCards = new JLabel(Assets.BackOfCard);	// Initializing lblPlayerFourthCards to the instantiated image back of card in the assets class
		lblPlayerFourthCards.setBounds(500, 456, 108, 149);
		contentPane.add(lblPlayerFourthCards);
		
		lblPlayerFifthCards = new JLabel(Assets.BackOfCard);	// Initializing lblPlayerFifthCards to the instantiated image back of card in the assets class
		lblPlayerFifthCards.setBounds(675, 456, 108, 149);
		contentPane.add(lblPlayerFifthCards);
		
		lblDealerFirstCards = new JLabel(Assets.BackOfCard);	// Initializing lblDealerFirstCards to the instantiated image back of card in the assets class
		lblDealerFirstCards.setBounds(43, 71, 108, 149);
		contentPane.add(lblDealerFirstCards);
		
		 lblDealerSecondCards = new JLabel(Assets.BackOfCard);	// Initializing lblDealerSecondCards to the instantiated image back of card in the assets class
		lblDealerSecondCards.setBounds(196, 71, 108, 149);
		contentPane.add(lblDealerSecondCards);
		
		 lblDealerThirdCards = new JLabel(Assets.BackOfCard);	// Initializing lblDealerThirdCards to the instantiated image back of card in the assets class
		lblDealerThirdCards.setBounds(341, 71, 108, 149);
		contentPane.add(lblDealerThirdCards);
		
		lblDealerFourthCards = new JLabel(Assets.BackOfCard);	// Initializing lblDealerFourthCards to the instantiated image back of card in the assets class
		lblDealerFourthCards.setBounds(500, 71, 108, 149);
		contentPane.add(lblDealerFourthCards);
		
		lblDealerFifthCards = new JLabel(Assets.BackOfCard);	// Initializing lblDealerFifthCards to the instantiated image back of card in the assets class
		lblDealerFifthCards.setBounds(675, 71, 108, 149);
		contentPane.add(lblDealerFifthCards);
		
		 lblPlayerHand = new JLabel("");			// Initializing lblPlayerHand
		 lblPlayerHand.setForeground(Color.RED);
		lblPlayerHand.setFont(new Font("Cooper Black", Font.BOLD, 17));
		lblPlayerHand.setBounds(190, 368, 45, 34);
		contentPane.add(lblPlayerHand);
		
		lblPlayerHandCount = new JLabel("Player Hand Count:");		// Initializing lblPlayerHandCount	
		lblPlayerHandCount.setForeground(Color.RED);
		lblPlayerHandCount.setFont(new Font("Cooper Black", Font.BOLD, 16));
		lblPlayerHandCount.setBounds(10, 368, 173, 34);
		contentPane.add(lblPlayerHandCount);
		
		lblDealerHand = new JLabel("");				// Initializing lblDealerHand
		lblDealerHand.setForeground(Color.RED);
		lblDealerHand.setFont(new Font("Cooper Black", Font.BOLD, 17));
		lblDealerHand.setBounds(190, 5, 45, 34);
		contentPane.add(lblDealerHand);
		
		lblDealerHandCount = new JLabel("Dealer Hand Count:");		// Initializing lblDealerHandCount
		lblDealerHandCount.setForeground(Color.RED);
		lblDealerHandCount.setFont(new Font("Cooper Black", Font.BOLD, 16));
		lblDealerHandCount.setBounds(10, 5, 173, 34);
		contentPane.add(lblDealerHandCount);
		
		lblDealerWallet = new JLabel("Dealer Wallet:");				// Initializing lblDealerWallet
		lblDealerWallet.setBackground(new Color(240, 240, 240));
		lblDealerWallet.setForeground(Color.RED);
		lblDealerWallet.setFont(new Font("Cooper Black", Font.BOLD, 17));
		lblDealerWallet.setBounds(278, 10, 130, 25);
		contentPane.add(lblDealerWallet);
		
		lblDWallet = new JLabel("");		// Initializing lblDWallet
		lblDWallet.setFont(new Font("Cooper Black", Font.BOLD, 17));
		lblDWallet.setForeground(Color.RED);
		lblDWallet.setBounds(418, 10, 147, 25);
		contentPane.add(lblDWallet);
		
		lblPlayerWallet = new JLabel("Player Wallet:");		// Initializing lblPlayerWallet
		lblPlayerWallet.setForeground(Color.RED);
		lblPlayerWallet.setFont(new Font("Cooper Black", Font.BOLD, 17));
		lblPlayerWallet.setBounds(264, 373, 137, 25);
		contentPane.add(lblPlayerWallet);
		
		lblPWallet = new JLabel("");		// Initializing lblPWallet
		lblPWallet.setFont(new Font("Cooper Black", Font.BOLD, 17));
		lblPWallet.setForeground(Color.RED);
		lblPWallet.setBounds(405, 373, 160, 25);
		contentPane.add(lblPWallet);
		
		lblPlayerWin = new JLabel("Player Wins:");		//Initializing PlayerWin
		lblPlayerWin.setForeground(Color.RED);
		lblPlayerWin.setFont(new Font("Cooper Black", Font.BOLD, 17));
		lblPlayerWin.setBounds(614, 377, 120, 25);
		contentPane.add(lblPlayerWin);
		
		lblPlayerWins = new JLabel("");		// Initializing lblPlayerWins
		lblPlayerWins.setBackground(new Color(240, 240, 240));
		lblPlayerWins.setForeground(Color.RED);
		lblPlayerWins.setFont(new Font("Cooper Black", Font.BOLD, 17));
		lblPlayerWins.setBounds(738, 377, 45, 25);
		contentPane.add(lblPlayerWins);
		
		lblDealerWin = new JLabel("Dealer Wins:");		// Initializing lblDealerWin
		lblDealerWin.setForeground(Color.RED);
		lblDealerWin.setFont(new Font("Cooper Black", Font.BOLD, 17));
		lblDealerWin.setBounds(614, 14, 120, 25);
		contentPane.add(lblDealerWin);
		
		lblDealerWins = new JLabel("");			// Initializing lblDealerWins
		lblDealerWins.setForeground(Color.RED);
		lblDealerWins.setFont(new Font("Cooper Black", Font.BOLD, 17));
		lblDealerWins.setBounds(738, 14, 45, 25);
		contentPane.add(lblDealerWins);
		
		lblPlayerNames = new JLabel("Player Name:");		// Initializing lblPlayerNames
		lblPlayerNames.setForeground(Color.RED);
		lblPlayerNames.setFont(new Font("Cooper Black", Font.BOLD, 17));
		lblPlayerNames.setBounds(10, 628, 134, 25);
		contentPane.add(lblPlayerNames);
		
		lblPlayerName = new JLabel("");			// Initializing lblPlayerName
		lblPlayerName.setForeground(Color.RED);
		lblPlayerName.setFont(new Font("Cooper Black", Font.BOLD, 17));
		lblPlayerName.setBounds(154, 627, 629, 25);
		contentPane.add(lblPlayerName);
		
		lblBlackJack = new JLabel("BlackJack by LARRY");		// Initializing lblBlackJack
		lblBlackJack.setForeground(Color.RED);
		lblBlackJack.setFont(new Font("Cooper Black", Font.BOLD, 24));
		lblBlackJack.setBounds(254, 260, 326, 74);
		contentPane.add(lblBlackJack);
		
		lblBJLogo = new JLabel(Assets.Icon);		// Initializing lblBJLogo
		lblBJLogo.setBounds(558, 243, 108, 91);
		contentPane.add(lblBJLogo);
		
		IblBJBackground = new JLabel(Assets.BJTable);		// Initializing lblBJBackground
		IblBJBackground.setBounds(0, 0, 986, 663);
		contentPane.add(IblBJBackground);
		
		
		// lblDealerFifthCards.setIcon(Assets.AceofClubs);
	}
	
	// Setter method
	public static void SetLblPlayerName(String tempName) {
		/* METHOD THAT SETS THE PLAYER NAME IN THE GAME*/
		lblPlayerName.setText(tempName);
	}
	// Setter method
	 public static void SetLblPlayerFirstCards(ImageIcon tempCard) {
		/* METHOD THAT SETS THE PLAYER FIRST CARDS IN THE GAME*/
		 lblPlayerFirstCards.setIcon(tempCard);
	 }
	// Setter method
	public static void SetLblPlayerSecondCards(ImageIcon tempCard) {
		/* METHOD THAT SETS THE PLAYER SECOND CARDS IN THE GAME*/	
		lblPlayerSecondCards.setIcon(tempCard);
	}
	// Setter method
	public static void SetLblPlayerThirdCards(ImageIcon tempCard) {
		/* METHOD THAT SETS THE PLAYER THIRD CARDS IN THE GAME*/
		 lblPlayerThirdCards.setIcon(tempCard);
	 }
	// Setter method
	public static void SetLblPlayerFourthCards(ImageIcon tempCard) {
		/* METHOD THAT SETS THE PLAYER FOURTH CARDS IN THE GAME*/
		 lblPlayerFourthCards.setIcon(tempCard);
	 }
	// Setter method
	public static void SetLblPlayerFifthCards(ImageIcon tempCard) {
		/* METHOD THAT SETS THE PLAYER FIFTH CARDS IN THE GAME*/
		lblPlayerFifthCards.setIcon(tempCard);
	}
	// Setter method
	public static void SetLblDealersFirstCard(ImageIcon tempCard) {
		/* METHOD THAT SETS THE DEALER FIRST CARDS IN THE GAME*/
		lblDealerFirstCards.setIcon(tempCard);
	}
	// Setter method
	public static void SetLblDealerSecondCards(ImageIcon tempCard) {
		/* METHOD THAT SETS THE DEALER SECOND CARDS IN THE GAME*/
		lblDealerSecondCards.setIcon(tempCard);
	}
	// Setter method
	public static void SetLblDealerThirdCards(ImageIcon tempCard) {
		/* METHOD THAT SETS THE DEALER THIRD CARDS IN THE GAME*/
		lblDealerThirdCards.setIcon(tempCard);
	}
	// Setter method
	public static void SetLblDealerFourthCards(ImageIcon tempCard) {
		/* METHOD THAT SETS THE DEALER FOURTH CARDS IN THE GAME*/
		lblDealerFourthCards.setIcon(tempCard);
	}
	// Setter method
	public static void SetLblDealerFifthCards(ImageIcon tempCard) {
		/* METHOD THAT SETS THE DEALER FIFTH CARDS IN THE GAME*/
		lblDealerFifthCards.setIcon(tempCard);
	}
	// Setter method
	public static void SetLblPlayerHand(Integer tempHand) {
		/* METHOD THAT SETS THE PLAYER HAND IN THE GAME*/
		String tempHand1 = tempHand.toString();
		lblPlayerHand.setText(tempHand1);
	}
	// Setter method
	public static void SetLblDealerHand(Integer tempHand) {
		/* METHOD THAT SETS THE DEALER HAND IN THE GAME*/
		String tempHand1 = tempHand.toString();
		lblDealerHand.setText(tempHand1);
	}
	public static void Hit() {
		/*Condition that ensures methods  when play button is actionned the first time differs from the second time and from the third*/
		if (HitCounter == 0) {			
			BlackJackMechanics.DisplayPlayerThirdCards();	// Calls the DisplayPlayerThirdCards method in the BlackJackMechanics class when HitCounter equals 0
			
			}
		else if (HitCounter == 1) {
			BlackJackMechanics.DisplayPlayerFourthCards();	// Calls the DisplayPlayerFourthCards method in the BlackJackMechanics class when HitCounter equals 1

			}
		else if (HitCounter == 2) {
			BlackJackMechanics.DisplayPlayerFifthCards();	// Calls the DisplayPlayerFithCards method in the BlackJackMechanics class when HitCounter equals 2
			btnHit.setEnabled(false);
			}
		
		HitCounter ++;		// HitCounter variable incrementing
	}
	

	public static void setBtnPlay(boolean tempStandState) {
		/* METHOD THAT HANDLES THE PLAY BUTTON IN THE GAME*/
		btnPlay.setEnabled(tempStandState);
		
	}
	public static void setBtnHit(boolean tempStandState) {
		/* METHOD THAT HANDLES THE HIT BUTTON IN THE GAME*/
		btnHit.setEnabled(tempStandState);
		
	}
	public static void setBtnStand(boolean tempStandState) {
		/* METHOD THAT HANDLES THE STAND BUTTON IN THE GAME*/
		btnStand.setEnabled(tempStandState);
		
	}
	public static void CardInit() {
		/* METHOD THAT INITIALIZES ALL CARDS AFTER THE END OF THE GAME TO THE BACK OF CARDS IN THE GAME*/
		
		lblPlayerFirstCards.setIcon(Assets.BackOfCard);
		lblPlayerSecondCards.setIcon(Assets.BackOfCard);
		lblPlayerThirdCards.setIcon(Assets.BackOfCard);
		lblPlayerFourthCards.setIcon(Assets.BackOfCard);
		lblPlayerFifthCards.setIcon(Assets.BackOfCard);
		lblDealerFirstCards.setIcon(Assets.BackOfCard);
		lblDealerSecondCards.setIcon(Assets.BackOfCard);
		lblDealerThirdCards.setIcon(Assets.BackOfCard);
		lblDealerFourthCards.setIcon(Assets.BackOfCard);
		lblDealerFifthCards.setIcon(Assets.BackOfCard);

	}
	
	public static void ValuesInit() {
		/* METHOD THAT INITIALIZES PLAYER WALLET, DEALER WALLET, PLAYER HAND, DEALER HAND, PLAYER WINS, AND DEALER WINS TO 0 IN THE BEGINNING OF THE GAME*/
		Integer InitWallet = 0;
		String TempWallet;
		TempWallet = InitWallet.toString();
		lblPWallet.setText(TempWallet);
		lblDWallet.setText(TempWallet);
		lblPlayerHand.setText(TempWallet);
		lblDealerHand.setText(TempWallet);
		lblPlayerWins.setText(TempWallet);
		lblDealerWins.setText(TempWallet);
	}
	public static void ValuesInit2() {
		/* METHOD THAT INITIALIZES PLAYER HAND, DEALER HAND, AND HITCOUNTER TO O IN THE BEGINNING OF THE SECOND AND REST OF THE GAMES*/
		Integer InitWallet = 0;
		String TempWallet;
		TempWallet = InitWallet.toString();
		lblPlayerHand.setText(TempWallet);
		lblDealerHand.setText(TempWallet);
		HitCounter = 0;

	}
	
	public static void SetLblPlayerWins(Integer tempWin) {
		/* METHOD THAT SETS THE PLAYER WINS IN THE GAME*/
		String tempWin1 = tempWin.toString();
		lblPlayerWins.setText(tempWin1);
	}
	public static void SetLblDealerWins(Integer tempWin) {
		/* METHOD THAT SETS THE DEALER WINS IN THE GAME*/
		String tempWin1 = tempWin.toString();
		lblDealerWins.setText(tempWin1);
	}
	public static void SetLblPWallet(Integer tempWallet) {
		/* METHOD THAT SETS THE PLAYER WALLET IN THE GAME*/
		String tempWallet1 = tempWallet.toString();
		lblPWallet.setText("$ " + tempWallet1);
	}
	public static void SetLblDWallet(Integer tempWallet) {
		/* METHOD THAT SETS THE DEALER WALLET IN THE GAME*/
		String tempWallet1 = tempWallet.toString();
		lblDWallet.setText("$ " + tempWallet1);
	}
	
	public static void OpenSound() {
		/*METHOD THAT PLAYS WELCOMING SOUND ON THE GAME*/

		String dingLocation = "Audio/Opener.wav";		// Local data member declaration and instantiation of String "Audio/Opener.wav" (Winning Sound directory)
		
		/*CONDITION THAT INSTANTIATES THE SOUND INTO THE COMPUTER AND IF DONE SUCCESSFULLY, SOUND IS ACTIVATED*/

		try {
			File dingFile = new File(dingLocation);
			
			AudioInputStream dingAudioFile = AudioSystem.getAudioInputStream(dingFile);
			
			Clip dingSound = AudioSystem.getClip();
			
			dingSound.open(dingAudioFile);		// Open audio File loaded from Assets class
			dingSound.start();				// Start (Play) Audio file
		
			/*IF SOUND WAS NOT SUCCESFULLY INSTIANTIATED, SOUND NOT ACTIVATED, SYSTEM DISPLAYS Problem playing sound */
			
		} catch (Exception e1) {
			
			JOptionPane.showMessageDialog(null, "Problem playing sound");		// System displays Problem playing sound
		}
//		OpenSound();
	}
	
	public static void LevelWinSound() {
		/*METHOD THAT PLAYS WINNING SOUND ON THE GAME*/
		
		String dingLocation = "Audio/LevelWin.wav";		// Local data member declaration and instantiation of String "Audio/LevelWin.wav" (Winning Sound directory)
		
		/*CONDITION THAT INSTANTIATES THE SOUND INTO THE COMPUTER AND IF DONE SUCCESSFULLY, SOUND IS ACTIVATED*/

		try {
			File dingFile = new File(dingLocation);
			
			AudioInputStream dingAudioFile = AudioSystem.getAudioInputStream(dingFile);
			
			Clip dingSound = AudioSystem.getClip();
			
			dingSound.open(dingAudioFile);		// Open audio File loaded from Assets class
			dingSound.start();			// Start (Play) Audio file
		
			/*IF SOUND WAS NOT SUCCESFULLY INSTIANTIATED, SOUND NOT ACTIVATED, SYSTEM DISPLAYS Problem playing sound */
			
		} catch (Exception e1) {
			
			JOptionPane.showMessageDialog(null, "Problem playing sound");		// System displays Problem playing sound
		}
	}
	
	public static void WinSound() {
		
		/*METHOD THAT PLAYS WINNING SOUND ON THE GAME*/
		
		String dingLocation = "Audio/payout.wav"; // Local data member declaration and instantiation of String "Audio/Win.wav" (Winning Sound directory)
		
		/*CONDITION THAT INSTANTIATES THE SOUND INTO THE COMPUTER AND IF DONE SUCCESSFULLY, SOUND IS ACTIVATED*/
		
		try {
			File dingFile = new File(dingLocation);
			
			AudioInputStream dingAudioFile = AudioSystem.getAudioInputStream(dingFile);
			
			Clip dingSound = AudioSystem.getClip();
			
			dingSound.open(dingAudioFile);		// Open audio File loaded from Assets class
			dingSound.start();					// Start (Play) Audio file
		
		/*IF SOUND WAS NOT SUCCESFULLY INSTIANTIATED, SOUND NOT ACTIVATED, SYSTEM DISPLAYS Problem playing sound */
			
			} catch (Exception e1) {
				
			JOptionPane.showMessageDialog(null, "Problem playing sound");		// System displays Problem playing sound
			
			}
	}
	
	
	public static void CoinsSound() {
		
		/*METHOD THAT PLAYS WINNING SOUND ON THE GAME*/
		
		String dingLocation = "Audio/coins.wav"; // Local data member declaration and instantiation of String "Audio/Win.wav" (Winning Sound directory)
		
		/*CONDITION THAT INSTANTIATES THE SOUND INTO THE COMPUTER AND IF DONE SUCCESSFULLY, SOUND IS ACTIVATED*/
		
		try {
			File dingFile = new File(dingLocation);
			
			AudioInputStream dingAudioFile = AudioSystem.getAudioInputStream(dingFile);
			
			Clip dingSound = AudioSystem.getClip();
			
			dingSound.open(dingAudioFile);		// Open audio File loaded from Assets class
			dingSound.start();					// Start (Play) Audio file
		
		/*IF SOUND WAS NOT SUCCESFULLY INSTIANTIATED, SOUND NOT ACTIVATED, SYSTEM DISPLAYS Problem playing sound */
			
			} catch (Exception e1) {
				
			JOptionPane.showMessageDialog(null, "Problem playing sound");		// System displays Problem playing sound
			
			}
	}
	
	
	public static void ShuffleSound() {
		/*METHOD THAT PLAYS WELCOMING SOUND ON THE GAME*/

		String dingLocation = "Audio/shuffle.wav";		// Local data member declaration and instantiation of String "Audio/Opener.wav" (Winning Sound directory)
		
		/*CONDITION THAT INSTANTIATES THE SOUND INTO THE COMPUTER AND IF DONE SUCCESSFULLY, SOUND IS ACTIVATED*/

		try {
			File dingFile = new File(dingLocation);
			
			AudioInputStream dingAudioFile = AudioSystem.getAudioInputStream(dingFile);
			
			Clip ClickSound = AudioSystem.getClip();
			
			ClickSound.open(dingAudioFile);		// Open audio File loaded from Assets class
			ClickSound.start();				// Start (Play) Audio file
		
			/*IF SOUND WAS NOT SUCCESFULLY INSTIANTIATED, SOUND NOT ACTIVATED, SYSTEM DISPLAYS Problem playing sound */
			
		} catch (Exception e1) {
			
			JOptionPane.showMessageDialog(null, "Problem playing sound");		// System displays Problem playing sound
		}
//		OpenSound();
	}
	
	
	public static void CardSound() {
		/*METHOD THAT PLAYS WELCOMING SOUND ON THE GAME*/

		String dingLocation = "Audio/CardP.wav";		// Local data member declaration and instantiation of String "Audio/Opener.wav" (Winning Sound directory)
		
		/*CONDITION THAT INSTANTIATES THE SOUND INTO THE COMPUTER AND IF DONE SUCCESSFULLY, SOUND IS ACTIVATED*/

		try {
			File dingFile = new File(dingLocation);
			
			AudioInputStream dingAudioFile = AudioSystem.getAudioInputStream(dingFile);
			
			Clip ClickSound = AudioSystem.getClip();
			
			ClickSound.open(dingAudioFile);		// Open audio File loaded from Assets class
			ClickSound.start();				// Start (Play) Audio file
		
			/*IF SOUND WAS NOT SUCCESFULLY INSTIANTIATED, SOUND NOT ACTIVATED, SYSTEM DISPLAYS Problem playing sound */
			
		} catch (Exception e1) {
			
			JOptionPane.showMessageDialog(null, "Problem playing sound");		// System displays Problem playing sound
		}
//		OpenSound();
	}
	
	public static void ClickSound() {
		/*METHOD THAT PLAYS WELCOMING SOUND ON THE GAME*/

		String dingLocation = "Audio/Click.wav";		// Local data member declaration and instantiation of String "Audio/Opener.wav" (Winning Sound directory)
		
		/*CONDITION THAT INSTANTIATES THE SOUND INTO THE COMPUTER AND IF DONE SUCCESSFULLY, SOUND IS ACTIVATED*/

		try {
			File dingFile = new File(dingLocation);
			
			AudioInputStream dingAudioFile = AudioSystem.getAudioInputStream(dingFile);
			
			Clip ClickSound = AudioSystem.getClip();
			
			ClickSound.open(dingAudioFile);		// Open audio File loaded from Assets class
			ClickSound.start();				// Start (Play) Audio file
		
			/*IF SOUND WAS NOT SUCCESFULLY INSTIANTIATED, SOUND NOT ACTIVATED, SYSTEM DISPLAYS Problem playing sound */
			
		} catch (Exception e1) {
			
			JOptionPane.showMessageDialog(null, "Problem playing sound");		// System displays Problem playing sound
		}
//		OpenSound();
	}
	
	public static void LoseSound() {
		
		/*METHOD THAT PLAYS WINNING SOUND ON THE GAME*/

		String dingLocation = "Audio/Fail.wav";		// Local data member declaration and instantiation of String "Audio/Fail.wav" (Winning Sound directory)
		
		/*CONDITION THAT INSTANTIATES THE SOUND INTO THE COMPUTER AND IF DONE SUCCESSFULLY, SOUND IS ACTIVATED*/

		try {
			File dingFile = new File(dingLocation);
			
			AudioInputStream dingAudioFile = AudioSystem.getAudioInputStream(dingFile);
			
			Clip dingSound = AudioSystem.getClip();
			
			dingSound.open(dingAudioFile);		// Open audio File loaded from Assets class
			dingSound.start();				// Start (Play) Audio file
		
			/*IF SOUND WAS NOT SUCCESFULLY INSTIANTIATED, SOUND NOT ACTIVATED, SYSTEM DISPLAYS Problem playing sound */
			
		} catch (Exception e1) {
			
			JOptionPane.showMessageDialog(null, "Problem playing sound");		// System displays Problem playing sound
		}
	}
	
	public static void TensionSound() {
		/*METHOD THAT PLAYS WINNING SOUND ON THE GAME*/
		
		String dingLocation = "Audio/tension.wav";		// Local data member declaration and instantiation of String "Audio/LevelWin.wav" (Winning Sound directory)
		
		/*CONDITION THAT INSTANTIATES THE SOUND INTO THE COMPUTER AND IF DONE SUCCESSFULLY, SOUND IS ACTIVATED*/
		
		try {
			File dingFile = new File(dingLocation);
			
			AudioInputStream dingAudioFile = AudioSystem.getAudioInputStream(dingFile);
			
			 TensionSound = AudioSystem.getClip();
			
			TensionSound.open(dingAudioFile);		// Open audio File loaded from Assets class
			TensionSound.start();		// Start (Play) Audio file
			
			/*IF SOUND WAS NOT SUCCESFULLY INSTIANTIATED, SOUND NOT ACTIVATED, SYSTEM DISPLAYS Problem playing sound */
			
		} catch (Exception e1) {
			
			JOptionPane.showMessageDialog(null, "Problem playing sound");		// System displays Problem playing sound
		}
	}
	
	
	public static void GameOverSound() {
		/*METHOD THAT PLAYS WINNING SOUND ON THE GAME*/
		
		String dingLocation = "Audio/GameOver.wav";		// Local data member declaration and instantiation of String "Audio/LevelWin.wav" (Winning Sound directory)
		
		/*CONDITION THAT INSTANTIATES THE SOUND INTO THE COMPUTER AND IF DONE SUCCESSFULLY, SOUND IS ACTIVATED*/
		
		try {
			File dingFile = new File(dingLocation);
			
			AudioInputStream dingAudioFile = AudioSystem.getAudioInputStream(dingFile);
			
			Clip dingSound = AudioSystem.getClip();
			
			dingSound.open(dingAudioFile);		// Open audio File loaded from Assets class
			dingSound.start();		// Start (Play) Audio file
			
			/*IF SOUND WAS NOT SUCCESFULLY INSTIANTIATED, SOUND NOT ACTIVATED, SYSTEM DISPLAYS Problem playing sound */
			
		} catch (Exception e1) {
			
			JOptionPane.showMessageDialog(null, "Problem playing sound");		// System displays Problem playing sound
		}
	}
}

  