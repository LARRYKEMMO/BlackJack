import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SplashScreen extends JFrame {

	private JPanel contentPane;
	private static JFrame frame;
	public static int Wallet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new SplashScreen();
					frame.setVisible(true);
					BlackJack.OpenSound();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SplashScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BlackJack.ClickSound();
				frame.dispose();
			}
		});
		btnQuit.setBounds(428, 587, 133, 21);
		contentPane.add(btnQuit);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BlackJack.ClickSound();
				SetWallet();
				BlackJack.main(null);
				frame.dispose();
			}
		});
		btnStart.setBounds(428, 526, 133, 21);
		contentPane.add(btnStart);
		
		JLabel lblBG = new JLabel(Assets.BJTable2);
		lblBG.setBounds(0, 0, 986, 663);
		contentPane.add(lblBG);
		
		
	}
	
	public static void SetWallet() {
		// *******************************************************************************************************************************************************
				// Method                  :   	PlaceBet
				//
				// Method  parameters      :    None
				// 
				// Method return           :    void
				//
				// Synopsis                :    This method gets the Bet
				//
				// Modifications           :    
				//                              Date           Developer              Notes
				//                             ------         -----------            -------
				//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
		        //
				//*********************************************************************************************************************************************************
				
				String TempBet;		// Variable declaration TempBet of type String
				boolean UserInputError;	// Variable declaration UserInput of type boolean
				 
				 do {
			/*DO WHILE LOOP THAT ENSURES THAT THE CONSOLE CONTINUES ASKING THE USER TO ENTER A BET VALUE TILL THE AMOUNT ENTERED IS MEMBER THE FAMILY OF POSITIVE INTEGERS*/
					 TempBet= JOptionPane.showInputDialog(null, "Enter an amount you wish to place in your wallet");  // Displays Enter an amount you wish to Bet 
					 UserInputError = false;  // Instantiating UserInputError to false
				
					 /* "Try catch" function used to handle character type input error in this section*/	 
					 try {
						
						 Wallet = Integer.parseInt(TempBet);	// Transforms stream of characters entered as Bet to Integer
					
						 /*Condition that handles the less than 0 error*/
						 if (Wallet < 0) {
							 BlackJack.LoseSound();
							 JOptionPane.showMessageDialog(null, "Error - Amount entered is less than 0");	// Display Error - Amount entered is less than 0
						 }
						 else if (Wallet > 0) {
							 JOptionPane.showMessageDialog(null, "PERFECT !!!");		// Display Good, Now let's get started
						 }
					 }
					 catch (Exception e)
					 {
						 UserInputError = true;
						 BlackJack.LoseSound();
						 JOptionPane.showMessageDialog(null, "Error - Wrong Datatype entered" );		// Displays Error - Wrong Datatype entered
					 }
					 
				 }while(UserInputError || Wallet < 0);
				
				 
	}
}
