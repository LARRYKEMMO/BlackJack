
/*Please Professor Run the Program From BlackJack.java ..... Thank you*/


import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class BlackJackMechanics {

				// *******************************************************************************************************************************************************
				// Class                   :   	BlackJackMechanics.Java
				//
				// Method  parameters      :    void
				// 
				// Method return           :    void
				//
				// Synopsis                :    This class is responsible for the mechanics behind the BlackJack Game
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
		
	
	private static String PlayerName;		// Data member declaration PlayerName
	private static int Bet ;				// Data member declaration Bet
	public static int BetValue;		// Data member declaration BetValue
	public static int BetValue2;		// Data member declaration BetValue
	private static String PlayerFirstCards;	 // Data member declaration PlayerFirst Cards
	private static String PlayerSecondCards; // Data member declaration PlayerSecond Cards 
	private static String PlayerThirdCards;		// Data member declaration PlayerThird Cards
	private static String PlayerFourthCards;	// Data member declaration PlayerFourth Cards
	private static String PlayerFifthCards;		// Data member declaration PlayerFifth Cards
	private static int PlayerHand =0 ;			// Data member declaration PlayerHand to 0
	private static int DealerHand =0;			// Data member declaration DealerHand to 0
	private static String DealerFirstCards;		// Data member declaration DealerFirstCards
	private static String DealerSecondCards;	// Data member declaration DealerSecondCards
	private static String DealerThirdCards;		// Data member declaration DealerThirdCards
	private static String DealerFourthCards;	// Data member declaration DealerFourthCards
	private static String DealerFifthCards;		// Data member declaration DealerFifthCards
	public static String[] DeckOfCards;			// Array declaration DeckOfCards
	public static boolean GameEnd;				// Data member declaration GameEnd
	private static int PlayerWins = 0;			// Data member declaration PlayerWins
	private static int DealerWins = 0;			// Data member declaration DealerWins
	
	
	
	public static void ArrayDeclaration() {
		
		
				// *******************************************************************************************************************************************************
				// Method                  :    ArrayDeclartion
				//
				// Method  parameters      :    None
				// 
				// Method return           :    void
				//
				// Synopsis                :    This method Declares the Array of Cards
				//
				// Modifications           :    
				//                              Date           Developer              Notes
				//                             ------         -----------            -------
				//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
		        //
				//*********************************************************************************************************************************************************
		
		 DeckOfCards = new String[52];		// Instantiation of Array (DeckOfards)
		
		
	/*CARDS DECLARATION BASED ON EACH CARD INDEX*/
	
		DeckOfCards[0] = "Ace of Clubs";
		DeckOfCards[1] = "Two of Clubs"; 
		DeckOfCards[2] = "Three of Clubs";
		DeckOfCards[3] = "Four of Clubs";
		DeckOfCards[4] = "Five of Clubs";
		DeckOfCards[5] = "Six of Clubs";
		DeckOfCards[6] = "Seven of Clubs";
		DeckOfCards[7] = "Eight of Clubs";
		DeckOfCards[8] = "Nine of Clubs";
		DeckOfCards[9] = "Ten of Clubs";
		DeckOfCards[10] = "Jack of Clubs";
		DeckOfCards[11] = "Queen of Clubs";
		DeckOfCards[12] = "King of Clubs";
		DeckOfCards[13] = "Ace of Diamonds";
		DeckOfCards[14] = "Two of Diamonds"; 
		DeckOfCards[15] = "Three of Diamonds";
		DeckOfCards[16] = "Four of Diamonds";
		DeckOfCards[17] = "Five of Diamonds";
		DeckOfCards[18] = "Six of Diamonds";
		DeckOfCards[19] = "Seven of Diamonds";
		DeckOfCards[20] = "Eight of Diamonds";
		DeckOfCards[21] = "Nine of Diamonds";
		DeckOfCards[22] = "Ten of Diamonds";
		DeckOfCards[23] = "Jack of Diamonds";
		DeckOfCards[24] = "Queen of Diamonds";
		DeckOfCards[25] = "King of Diamonds";
		DeckOfCards[26] = "Ace of Hearts";
		DeckOfCards[27] = "Two of Hearts"; 
		DeckOfCards[28] = "Three of Hearts";
		DeckOfCards[29] = "Four of Hearts";
		DeckOfCards[30] = "Five of Hearts";
		DeckOfCards[31] = "Six of Hearts";
		DeckOfCards[32] = "Seven of Hearts";
		DeckOfCards[33] = "Eight of Hearts";
		DeckOfCards[34] = "Nine of Hearts";
		DeckOfCards[35] = "Ten of Hearts";
		DeckOfCards[36] = "Jack of Hearts";
		DeckOfCards[37] = "Queen of Hearts";
		DeckOfCards[38] = "King of Hearts";
		DeckOfCards[39] = "Ace of Spades";
		DeckOfCards[40] = "Two of Spades"; 
		DeckOfCards[41] = "Three of Spades";
		DeckOfCards[42] = "Four of Spades";
		DeckOfCards[43] = "Five of Spades";
		DeckOfCards[44] = "Six of Spades";
		DeckOfCards[45] = "Seven of Spades";
		DeckOfCards[46] = "Eight of Spades";
		DeckOfCards[47] = "Nine of Spades";
		DeckOfCards[48] = "Ten of Spades";
		DeckOfCards[49] = "Jack of Spades";
		DeckOfCards[50] = "Queen of Spades";
		DeckOfCards[51] = "King of Spades"; 
		
	}
	
	
	
	public static void play() {
		
		// ******************************************************************************************************************************************************************************
		// Method                  :   	Play
		//
		// Method  parameters      :    None
		// 
		// Method return           :    void
		//
		// Synopsis                :    This method runs the ArrayDeclaration, WelcomeMessage, InputPlayerName,Bet,Player and Dealer first and second cards,PlayerHand, and DealerHand
		//
		// Modifications           :    
		//                              Date           Developer              Notes
		//                             ------         -----------            -------
		//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
        //
		//******************************************************************************************************************************************************************************

		BetValue = SplashScreen.Wallet;
		BetValue2 = SplashScreen.Wallet  * 100;
		BlackJack.SetLblPWallet(BetValue);
	 	BlackJack.SetLblDWallet(BetValue2);
		ArrayDeclaration();
		WelcomeMessage();
		InputPlayerName();
		Bet = PlaceBet();
		PlayerFirstCards = DisplayPlayerFirstCards();
		PlayerSecondCards = DisplayPlayerSecondCards();
		DealerFirstCards = DisplayDealerFirstCards();
		DealerSecondCards = DisplayDealerSecondCards();
		PlayerHand = DisplayPlayerHand();
		DealerHand = DisplayDealerHand();
		
		
	}

	public static void Play2() {
		
		// *******************************************************************************************************************************************************
		// Method                  :   	Play2
		//
		// Method  parameters      :    None
		// 
		// Method return           :    void
		//
		// Synopsis                :    This method runs ClearPandDHand, Bet, Player and Dealer first and second cards,PlayerHand, and DealerHand
		//
		// Modifications           :    
		//                              Date           Developer              Notes
		//                             ------         -----------            -------
		//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
        //
		//*********************************************************************************************************************************************************
		ClearPandDHand();
		Bet = PlaceBet();
		PlayerFirstCards = DisplayPlayerFirstCards();
		PlayerSecondCards = DisplayPlayerSecondCards();
		DealerFirstCards = DisplayDealerFirstCards();
		DealerSecondCards = DisplayDealerSecondCards();
		PlayerHand = DisplayPlayerHand();
		DealerHand = DisplayDealerHand();

	}
	
	public static void Play3() {
		
		// *******************************************************************************************************************************************************
		// Method                  :   	Play2
		//
		// Method  parameters      :    None
		// 
		// Method return           :    void
		//
		// Synopsis                :    This method runs ClearPandDHand, Bet, Player and Dealer first and second cards,PlayerHand, and DealerHand
		//
		// Modifications           :    
		//                              Date           Developer              Notes
		//                             ------         -----------            -------
		//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
        //
		//*********************************************************************************************************************************************************

		SplashScreen.SetWallet();
		BetValue = SplashScreen.Wallet;
		BetValue2 = SplashScreen.Wallet  * 100;
		BlackJack.SetLblPWallet(BetValue);
	 	BlackJack.SetLblDWallet(BetValue2);
		ClearPandDHand();
		Bet = PlaceBet();
		PlayerFirstCards = DisplayPlayerFirstCards();
		PlayerSecondCards = DisplayPlayerSecondCards();
		DealerFirstCards = DisplayDealerFirstCards();
		DealerSecondCards = DisplayDealerSecondCards();
		PlayerHand = DisplayPlayerHand();
		DealerHand = DisplayDealerHand();

	}

	public static void ClearPandDHand() {
		
				// *******************************************************************************************************************************************************
				// Method                  :   	ClearPandDHand
				//
				// Method  parameters      :    None
				// 
				// Method return           :    void
				//
				// Synopsis                :    This method initializes PlayerHand and DealerHand to 0
				//
				// Modifications           :    
				//                              Date           Developer              Notes
				//                             ------         -----------            -------
				//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
		        //
				//*********************************************************************************************************************************************************
		
		PlayerHand = 0;
		DealerHand = 0;

	}
	
	public static void Stand() {
		
		// *******************************************************************************************************************************************************
		// Method                  :   	Stand
		//
		// Method  parameters      :    None
		// 
		// Method return           :    void
		//
		// Synopsis                :    This method Displays Dealer Cards till he wins or losses
		//
		// Modifications           :    
		//                              Date           Developer              Notes
		//                             ------         -----------            -------
		//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
        //
		//*********************************************************************************************************************************************************
		
			DisplayDealerThirdCards();
			DisplayDealerFourthCards();
			DisplayDealerFifthCards();
			if(BetValue <= 0 || BetValue2 <= 0) {
 	 			BlackJack.setBtnPlay(GameEnd = false);
 	 			BlackJack.btnNewGame.setEnabled(true);
 	 			if(BetValue <= 0) {
 	 				BlackJack.GameOverSound();
 	 				JOptionPane.showMessageDialog(null, "Sorry you can't play anymore because your wallet is empty");
 	 			}
 	 			else if(BetValue2 <= 0){
 	 				BlackJack.LevelWinSound();
 	 				JOptionPane.showMessageDialog(null, "Congratulations you won the dealer, his wallet is empty");
 	 			}
 	 		}
 	 		else {
 	 			BlackJack.setBtnPlay(GameEnd = true);
 	 		}
			
	}
    	
	
	
	
	private static void WelcomeMessage() {
		
		// *******************************************************************************************************************************************************
			// Method                  :   	WelcomeMessage
			//
			// Method  parameters      :    None
			// 
			// Method return           :    void
			//
			// Synopsis                :    This method Displays Welcome Message
			//
			// Modifications           :    
			//                              Date           Developer              Notes
			//                             ------         -----------            -------
			//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
	        //
			//*********************************************************************************************************************************************************
		
		
		JOptionPane.showMessageDialog(null, "WELCOME TO BLACKJACK VERSION 1.0");
		
	}
	
	private static String InputPlayerName() {
		
		// *******************************************************************************************************************************************************
		// Method                  :    InputPlayerName
		//
		// Method  parameters      :    None
		// 
		// Method return           :    void
		//
		// Synopsis                :    This method Gets Player Name
		//
		// Modifications           :    
		//                              Date           Developer              Notes
		//                             ------         -----------            -------
		//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
        //
		//*********************************************************************************************************************************************************
		
			
		JOptionPane.showMessageDialog(null, "Please enter your Name: "); 	// Displays Please Enter Your Name
		
		PlayerName = JOptionPane.showInputDialog(null,PlayerName);	
		
		BlackJack.SetLblPlayerName(PlayerName);		// Setter accesses PlayerName variable to use it in BlackJack.Java
		
		return(PlayerName);
	}

	private static int PlaceBet() {
		
		
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
			 TempBet= JOptionPane.showInputDialog(null, "Enter an amount you wish to bet");  // Displays Enter an amount you wish to Bet 
			 UserInputError = false;  // Instantiating UserInputError to false
		
			 /* "Try catch" function used to handle character type input error in this section*/	 
			 try {
				
				 Bet = Integer.parseInt(TempBet);	// Transforms stream of characters entered as Bet to Integer
			
				 /*Condition that handles the less than 0 error*/
				 if (Bet < 0) {
					 BlackJack.LoseSound();
					 JOptionPane.showMessageDialog(null, "Error - Amount entered is less than 0");	// Display Error - Amount entered is less than 0
				 }
				 else if (Bet > 0 && Bet < BetValue) {
					 JOptionPane.showMessageDialog(null, "Good, Now let's get started");		// Display Good, Now let's get started
				 }
				 else if (Bet > BetValue){
					 BlackJack.LoseSound();
					 JOptionPane.showMessageDialog(null, "Error - the amount you entered is bigger than your wallet (Wallet = " + BetValue + " )");
				 }
			 }
			 catch (Exception e)
			 {
				 UserInputError = true;
				 BlackJack.LoseSound();
				 JOptionPane.showMessageDialog(null, "Error - Wrong Datatype entered" );		// Displays Error - Wrong Datatype entered
			 }
			 
		 }while(UserInputError || Bet < 0 || Bet > BetValue);
		
		 
		return (Bet);
	}
	
	
	
	public static String DisplayPlayerFirstCards() {
		BlackJack.ShuffleSound();	
		
		// *******************************************************************************************************************************************************
		// Method                  :   	DisplayPlayerFirstCards
		//
		// Method  parameters      :    None
		// 
		// Method return           :    void
		//
		// Synopsis                :    This method Displays Player First Card
		//
		// Modifications           :    
		//                              Date           Developer              Notes
		//                             ------         -----------            -------
		//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
        //
		//*********************************************************************************************************************************************************
		
			
		
		Random rand = new Random();		// Instantiates the random method
		int TemporaryCardIndex = 0;		// Variable declaration TemporaryCardIndex of type int
		
		TemporaryCardIndex = rand.nextInt(51);		// Randomizes the numbers between 0 to 51
		PlayerFirstCards = DeckOfCards[TemporaryCardIndex];	// Instantiates PlayerFirstCards to the Card name stored under that index in the array
		
//		JOptionPane.showMessageDialog(null, "Your first card is " + PlayerFirstCards);		// Displays PlayerFirstCards
		
		
		ImageIcon image = DeterminingCardImage(PlayerFirstCards);	// Passes the Name of PlayerFirstCards to the DeterminingCardImage method
		BlackJack.CardSound();
		BlackJack.SetLblPlayerFirstCards(image);		// SetLblPlayerFirstCards method in BlackJack.java accesses the card determined by the DeterminingCardImage method in order to display PlayerFirstCard in the game
		
		return(PlayerFirstCards);
	}
	
	
	
	public static String DisplayPlayerSecondCards() {
		
				// *******************************************************************************************************************************************************
				// Method                  :   	DisplayPlayerSecondCards
				//
				// Method  parameters      :    None
				// 
				// Method return           :    void
				//
				// Synopsis                :    This method Displays Player Second Card
				//
				// Modifications           :    
				//                              Date           Developer              Notes
				//                             ------         -----------            -------
				//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
		        //
				//*********************************************************************************************************************************************************
		
		
		Random rand = new Random();		// Instantiates the random method
        int TemporaryCardIndex2 = 0;	// Variable declaration TemporaryCardIndex2 of type int
		
		TemporaryCardIndex2 = rand.nextInt(51);		// Randomizes the numbers between 0 to 51
		PlayerSecondCards = DeckOfCards[TemporaryCardIndex2];		// Instantiates PlayerSecondCards to the Card name stored under that index in the array
	/* Condition that makes sure that PlayerSecond Cards don not resemble any other card prior to it by repeating the Randomization*/	
		if (PlayerSecondCards == PlayerFirstCards) {
			
			do {
				Random random = new Random();
				
				TemporaryCardIndex2 = random.nextInt(51);
				PlayerSecondCards = DeckOfCards[TemporaryCardIndex2];
			}while (PlayerSecondCards == PlayerFirstCards);
			
//			JOptionPane.showMessageDialog(null, "Your second card is " + PlayerSecondCards);		// Displays PlayerSecondCards when it doesn't resemble any other card prior to it
			ImageIcon image = DeterminingCardImage(PlayerSecondCards);		// Passes the Name of PlayerSecondCards to the DeterminingCardImage method
			BlackJack.CardSound();
			BlackJack.SetLblPlayerSecondCards(image);		// SetLblPlayerSecondCards method in BlackJack.java accesses the card determined by the DeterminingCardImage method in order to display PlayerSecondCard in the game

		}
		else {
//			JOptionPane.showMessageDialog(null, "Your second card is " + PlayerSecondCards);		// Displays PlayerSecondCards
			ImageIcon image = DeterminingCardImage(PlayerSecondCards);	// Passes the Name of PlayerSecondCards to the DeterminingCardImage method
			BlackJack.CardSound();
			BlackJack.SetLblPlayerSecondCards(image);			// SetLblPlayerSecondCards method in BlackJack.java accesses the card determined by the DeterminingCardImage method in order to display PlayerSecondCard in the game


		}
		
		
		return (PlayerSecondCards);
	}
	
 	public static String DisplayDealerFirstCards() {

 		
 			// *******************************************************************************************************************************************************
 			// Method                  :   	DisplayDealerFirstCards
 			//
 			// Method  parameters      :    None
 			// 
 			// Method return           :    void
 			//
 			// Synopsis                :    This method Displays Dealer First Card
 			//
 			// Modifications           :    
 			//                              Date           Developer              Notes
 			//                             ------         -----------            -------
 			//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
 	        //
 			//*********************************************************************************************************************************************************
 		
		Random rand = new Random();		// Instantiates the random method
		int TemporaryCardIndex3 = 0;			// Variable declaration TemporaryCardIndex3 of type int
		TemporaryCardIndex3 = rand.nextInt(51);		// Randomizes the numbers between 0 to 51
		DealerFirstCards = DeckOfCards[TemporaryCardIndex3];		// Instantiates DealerFirstCards to the Card name stored under that index in the array
		
		/* Condition that makes sure that DealerFirstCards don not resemble any other card prior to it by repeating the Randomization*/
        if (DealerFirstCards == PlayerFirstCards || DealerFirstCards == PlayerSecondCards) {
			
			do {
				Random random2 = new Random();
				TemporaryCardIndex3 = random2.nextInt(51);
				DealerFirstCards = DeckOfCards[TemporaryCardIndex3];
			}while (DealerFirstCards == PlayerFirstCards || DealerFirstCards == PlayerSecondCards );
			
	//		JOptionPane.showMessageDialog(null, "The dealer first card is " + DealerFirstCards);		// Displays DealerFirstCards when it doesn't resemble any other card prior to it
			
			ImageIcon image = DeterminingCardImage(DealerFirstCards);		// Passes the Name of DealerFirstCards to the DeterminingCardImage method
			BlackJack.CardSound();
			BlackJack.SetLblDealersFirstCard(image);			// SetLblDealerFirstCards method in BlackJack.java accesses the card determined by the DeterminingCardImage method in order to display DealerFirstCard in the game

			
			
		}
        else {
    //		JOptionPane.showMessageDialog(null, "The delear first card is " + DealerFirstCards);		// Displays DealerFirstCards when it doesn't resemble any other card prior to it
    		ImageIcon image = DeterminingCardImage(DealerFirstCards);		// Passes the Name of DealerFirstCards to the DeterminingCardImage method
    		BlackJack.CardSound();
    		BlackJack.SetLblDealersFirstCard(image);		// SetLblDealerFirstCards method in BlackJack.java accesses the card determined by the DeterminingCardImage method in order to display DealerFirstCard in the game
        }	
 		return(DealerFirstCards);
 	}
 	
 	public static String DisplayDealerSecondCards() {

 	// *******************************************************************************************************************************************************
 			// Method                  :   	DisplayDealerSecondCard
 			//
 			// Method  parameters      :    None
 			// 
 			// Method return           :    void
 			//
 			// Synopsis                :    This method Displays Dealer Second Card
 			//
 			// Modifications           :    
 			//                              Date           Developer              Notes
 			//                             ------         -----------            -------
 			//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
 	        //
 			//*********************************************************************************************************************************************************
 		
		Random rand = new Random();		// Instantiates the random method
 		int TemporaryCardIndex4 = 0;		// Variable declaration TemporaryCardIndex4 of type int
 		TemporaryCardIndex4 = rand.nextInt(51);		// Randomizes the numbers between 0 to 51
 		DealerSecondCards = DeckOfCards[TemporaryCardIndex4];		// Instantiates DealerSecondCards to the Card name stored under that index in the array
 		
 		/* Condition that makes sure that DealerSecondCards don not resemble any other card prior to it by repeating the Randomization*/
        if (DealerSecondCards == PlayerFirstCards || DealerSecondCards == PlayerSecondCards || DealerSecondCards == DealerFirstCards) {		
			do {
				Random random3 = new Random();
				
				TemporaryCardIndex4 = random3.nextInt(51);
				DealerSecondCards = DeckOfCards[TemporaryCardIndex4];
			}while (DealerSecondCards == PlayerFirstCards || DealerSecondCards == PlayerSecondCards || DealerSecondCards == DealerFirstCards );
			
	//		JOptionPane.showMessageDialog(null, "The Dealer's second card is " + DealerSecondCards);		// Displays DealerFirstCards when it doesn't resemble any other card prior to it
			
			ImageIcon image = DeterminingCardImage(DealerSecondCards);		// Passes the Name of DealerSecondCards to the DeterminingCardImage method
			BlackJack.CardSound();
			BlackJack.SetLblDealerSecondCards(image);		// SetLblDealerSecondCards method in BlackJack.java accesses the card determined by the DeterminingCardImage method in order to display DealerFirstCard in the game
			
		}
        else {	
    //    	JOptionPane.showMessageDialog(null, "The Dealer's second card is " + DealerSecondCards); 	// Displays DealerFirstCards when it doesn't resemble any other card prior to it
        	
        	ImageIcon image = DeterminingCardImage(DealerSecondCards);		// Passes the Name of DealerSecondCards to the DeterminingCardImage method
        	BlackJack.CardSound();
        	BlackJack.SetLblDealerSecondCards(image);		// SetLblDealerSecondCards method in BlackJack.java accesses the card determined by the DeterminingCardImage method in order to display DealerFirstCard in the game
        }

 		return(DealerSecondCards);
 	}
	
 	
 	public static ImageIcon DeterminingCardImage(String CurrentCard) {
 		
 		
 	// *******************************************************************************************************************************************************
 			// Method                  :   	DeterminingCardImage
 			//
 			// Method  parameters      :    None
 			// 
 			// Method return           :    void
 			//
 			// Synopsis                :    This method Determines the card Image based on the Player and dealer's array index gotten from the random generator
 			//
 			// Modifications           :    
 			//                              Date           Developer              Notes
 			//                             ------         -----------            -------
 			//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
 	        //
 			//*********************************************************************************************************************************************************
 		
 		
 		if (CurrentCard == "Ace of Clubs") {
 			return Assets.AceofClubs;
 		}
 		else if (CurrentCard == "Two of Clubs") {
 			return Assets.TwoofClubs;
 		}
 		else if (CurrentCard == "Three of Clubs") {
 			return Assets.ThreeofClubs;
 		}
 		else if (CurrentCard == "Four of Clubs") {
 			return Assets.FourofClubs;
 		}
 		else if (CurrentCard == "Five of Clubs") {
 			return Assets.FiveofClubs;
 		}
 		else if (CurrentCard == "Six of Clubs") {
 			return Assets.SixofClubs;
 		}
 		else if (CurrentCard == "Seven of Clubs") {
 			return Assets.SevenofClubs;
 		}
 		else if (CurrentCard == "Eight of Clubs") {
 			return Assets.EightofClubs;
 		}
 		else if (CurrentCard == "Nine of Clubs") {
 			return Assets.NineofClubs;
 		}
 		else if (CurrentCard == "Ten of Clubs") {
 			return Assets.TenofClubs;
 		}
 		else if (CurrentCard == "Jack of Clubs") {
 			return Assets.JackofClubs;
 		}
 		else if (CurrentCard == "Queen of Clubs") {
 			return Assets.QueenofClubs;
 		}
 		else if (CurrentCard == "King of Clubs") {
 			return Assets.KingofClubs;
 		}
 		else if (CurrentCard == "Ace of Diamonds") {
 			return Assets.AceofDiamonds;
 		}
 		else if (CurrentCard == "Two of Diamonds") {
 			return Assets.TwoofDiamonds;
 		}
 		else if (CurrentCard == "Three of Diamonds") {
 			return Assets.ThreeofDiamonds;
 		}
 		else if (CurrentCard == "Four of Diamonds") {
 			return Assets.FourofDiamonds;
 		}
 		else if (CurrentCard == "Five of Diamonds") {
 			return Assets.FiveofDiamonds;
 		}
 		else if (CurrentCard == "Six of Diamonds") {
 			return Assets.SixofDiamonds;
 		}
 		else if (CurrentCard == "Seven of Diamonds") {
 			return Assets.SevenofDiamonds;
 		}
 		else if (CurrentCard == "Eight of Diamonds") {
 			return Assets.EightofDiamonds;
 		}
 		else if (CurrentCard == "Nine of Diamonds") {
 			return Assets.NineofDiamonds;
 		}
 		else if (CurrentCard == "Ten of Diamonds") {
 			return Assets.TenofDiamonds;
 		}
 		else if (CurrentCard == "Jack of Diamonds") {
 			return Assets.JackofDiamonds;
 		}
 		else if (CurrentCard == "Queen of Diamonds") {
 			return Assets.QueenofDiamonds;
 		}
 		else if (CurrentCard == "King of Diamonds") {
 			return Assets.KingofDiamonds;
 		}
 		else if (CurrentCard == "Ace of Spades") {
 	 		return Assets.AceofSpades;
 		}
 		else if (CurrentCard == "Two of Spades") {
 	 		return Assets.TwoofSpades;
 		}
 		else if (CurrentCard == "Three of Spades") {
 	 		return Assets.ThreeofSpades;
 		}
 		else if (CurrentCard == "Four of Spades") {
 	 		return Assets.FourofSpades;
 		}
 		else if (CurrentCard == "Five of Spades") {
 	 		return Assets.FiveofSpades;
 		}
 		else if (CurrentCard == "Six of Spades") {
 	 		return Assets.SixofSpades;
 		}
 		else if (CurrentCard == "Seven of Spades") {
 	 		return Assets.SevenofSpades;
 		}
 		else if (CurrentCard == "Eight of Spades") {
 	 		return Assets.EightofSpades;
 		}
 		else if (CurrentCard == "Nine of Spades") {
 	 		return Assets.NineofSpades;
 		}
 		else if (CurrentCard == "Ten of Spades") {
 	 		return Assets.TenofSpades;
 		}
 		else if (CurrentCard == "Jack of Spades") {
 	 		return Assets.JackofSpades;
 		}
 		else if (CurrentCard == "Queen of Spades") {
 	 		return Assets.QueenofSpades;
 		}
 		else if (CurrentCard == "King of Spades") {
 	 		return Assets.KingofSpades;
 		}
 		else if (CurrentCard == "Ace of Hearts") {
 	 		return Assets.AceofHearts;
 		}
 		else if (CurrentCard == "Two of Hearts") {
 	 		return Assets.TwoofHearts;
 		}
 		else if (CurrentCard == "Three of Hearts") {
 	 		return Assets.ThreeofHearts;
 		}
 		else if (CurrentCard == "Four of Hearts") {
 	 		return Assets.FourofHearts;
 		}
 		else if (CurrentCard == "Five of Hearts") {
 	 		return Assets.FiveofHearts;
 		}
 		else if (CurrentCard == "Six of Hearts") {
 	 		return Assets.SixofHearts;
 		}
 		else if (CurrentCard == "Seven of Hearts") {
 	 		return Assets.SevenofHearts;
 		}
 		else if (CurrentCard == "Eight of Hearts") {
 	 		return Assets.EightofHearts;
 		}
 		else if (CurrentCard == "Nine of Hearts") {
 	 		return Assets.NineofHearts;
 		}
 		else if (CurrentCard == "Ten of Hearts") {
 	 		return Assets.TenofHearts;
 		}
 		else if (CurrentCard == "Jack of Hearts") {
 	 		return Assets.JackofHearts;
 		}
 		else if (CurrentCard == "Queen of Hearts") {
 	 		return Assets.QueenofHearts;
 		}
 		else if (CurrentCard == "King of Hearts") {
 	 		return Assets.KingofHearts;
 		}
 		
 		else{
 		JOptionPane.showMessageDialog(null, "Error in Determining Card Name Method");	
 		}

 		return Assets.BackOfCard;
	}
 	
 	
 	
 	
 	 
 	public static int DisplayPlayerHand() {

 		
 			// *******************************************************************************************************************************************************
 			// Method                  :   	DisplayPlayerHand
 			//
 			// Method  parameters      :    None
 			// 
 			// Method return           :    void
 			//
 			// Synopsis                :    This method calculates and display PlayerHand
 			//
 			// Modifications           :    
 			//                              Date           Developer              Notes
 			//                             ------         -----------            -------
 			//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
 	        //
 			//*********************************************************************************************************************************************************
 		
 		
		BlackJack.setBtnPlay(GameEnd = false);		// Set play button to false in the game
		BlackJack.setBtnHit(GameEnd = true);		// Set Hit button to false in the game
		BlackJack.setBtnStand(GameEnd = true);		// Set Stand button to True in the game
		
		/*Condition that Increments the dealers's hand*/
		
 		if (PlayerFirstCards == "Ace of Clubs" || PlayerSecondCards == "Ace of Clubs"){
 			
 			if ((PlayerHand + 11)  > 21) {
 		        PlayerHand += 1;
 			}
 		   else {
 			   PlayerHand += 11;
 		   }
 		}
 		if (PlayerFirstCards == "Two of Clubs" || PlayerSecondCards == "Two of Clubs") {
 			PlayerHand += 2;
 		}
 		if (PlayerFirstCards == "Three of Clubs" || PlayerSecondCards == "Three of Clubs") {
 			PlayerHand += 3;
 		}
 		if (PlayerFirstCards == "Four of Clubs" || PlayerSecondCards == "Four of Clubs") {
 			PlayerHand += 4;
 		}
 	    if (PlayerFirstCards == "Five of Clubs" || PlayerSecondCards == "Five of Clubs") {
 			PlayerHand += 5;
 		}
 		if (PlayerFirstCards == "Six of Clubs" || PlayerSecondCards == "Six of Clubs") {
 			PlayerHand += 6;
 		}
 		if (PlayerFirstCards == "Seven of Clubs" || PlayerSecondCards == "Seven of Clubs") {
 			PlayerHand += 7;
 		}
 		if (PlayerFirstCards == "Eight of Clubs" || PlayerSecondCards == "Eight of Clubs") {
 			PlayerHand += 8;
 		}
 		if (PlayerFirstCards == "Nine of Clubs" || PlayerSecondCards == "Nine of Clubs") {
 			PlayerHand += 9;
 		}
 		if (PlayerFirstCards == "Ten of Clubs" || PlayerSecondCards == "Ten of Clubs") {
 			PlayerHand += 10;
 		}
 		if (PlayerFirstCards == "Jack of Clubs" || PlayerSecondCards == "Jack of Clubs") {
 			PlayerHand += 10;
 		}
 		if (PlayerFirstCards == "Queen of Clubs" || PlayerSecondCards == "Queen of Clubs") {
 			PlayerHand += 10;
 		}
 		if (PlayerFirstCards == "King of Clubs" || PlayerSecondCards == "King of Clubs") {
 			PlayerHand += 10;
 		}
 		if (PlayerFirstCards == "Ace of Diamonds" || PlayerSecondCards == "Ace of Diamonds"){
 			if ((PlayerHand + 11)  > 21) {
 		        PlayerHand += 1;
 			}
 		   else {
		        PlayerHand += 11;
 		   }
 		}
 		if (PlayerFirstCards == "Two of Diamonds" || PlayerSecondCards == "Two of Diamonds") {
 			PlayerHand += 2;
 		}
 		if (PlayerFirstCards == "Three of Diamonds" || PlayerSecondCards == "Three of Diamonds") {
 			PlayerHand += 3;
 		}
 		if (PlayerFirstCards == "Four of Diamonds" || PlayerSecondCards == "Four of Diamonds") {
 			PlayerHand += 4;
 		}
 		if (PlayerFirstCards == "Five of Diamonds" || PlayerSecondCards == "Five of Diamonds") {
 			PlayerHand += 5;
 		}
 		if (PlayerFirstCards == "Six of Diamonds" || PlayerSecondCards == "Six of Diamonds") {
 			PlayerHand += 6;
 		}
 		if (PlayerFirstCards == "Seven of Diamonds" || PlayerSecondCards == "Seven of Diamonds") {
 			PlayerHand += 7;
 		}
 		if (PlayerFirstCards == "Eight of Diamonds" || PlayerSecondCards == "Eight of Diamonds") {
 			PlayerHand += 8;
 		}
 		if (PlayerFirstCards == "Nine of Diamonds" || PlayerSecondCards == "Nine of Diamonds") {
 			PlayerHand += 9;
 		}
 		if (PlayerFirstCards == "Ten of Diamonds" || PlayerSecondCards == "Ten of Diamonds") {
 			PlayerHand += 10;
 		}
 		if (PlayerFirstCards == "Jack of Diamonds" || PlayerSecondCards == "Jack of Diamonds") {
 			PlayerHand += 10;
 		}
 		if (PlayerFirstCards == "Queen of Diamonds" || PlayerSecondCards == "Queen of Diamonds") {
 			PlayerHand += 10;
 		}
 		if (PlayerFirstCards == "King of Diamonds" || PlayerSecondCards == "King of Diamonds") {
 			PlayerHand += 10;
 		}
 		if (PlayerFirstCards == "Ace of Hearts" || PlayerSecondCards == "Ace of Hearts"){
 			if ((PlayerHand + 11)  > 21) {
 		        PlayerHand += 1;
 			}
 		   else {
		        PlayerHand += 11;
 		   }
 		}
 		if (PlayerFirstCards == "Two of Hearts" || PlayerSecondCards == "Two of Hearts") {
 			PlayerHand += 2;
 		}
 		if (PlayerFirstCards == "Three of Hearts" || PlayerSecondCards == "Three of Hearts") {
 			PlayerHand += 3;
 		}
 		if (PlayerFirstCards == "Four of Hearts" || PlayerSecondCards == "Four of Hearts") {
 			PlayerHand += 4;
 		}
 		if (PlayerFirstCards == "Five of Hearts" || PlayerSecondCards == "Five of Hearts") {
 			PlayerHand += 5;
 		}
 		if (PlayerFirstCards == "Six of Hearts" || PlayerSecondCards == "Six of Hearts") {
 			PlayerHand += 6;
 		}
 		if (PlayerFirstCards == "Seven of Hearts" || PlayerSecondCards == "Seven of Hearts") {
 			PlayerHand += 7;
 		}
 		if (PlayerFirstCards == "Eight of Hearts" || PlayerSecondCards == "Eight of Hearts") {
 			PlayerHand += 8;
 		}
 		if (PlayerFirstCards == "Nine of Hearts" || PlayerSecondCards == "Nine of Hearts") {
 			PlayerHand += 9;
 		}
 		if (PlayerFirstCards == "Ten of Hearts" || PlayerSecondCards == "Ten of Hearts") {
 			PlayerHand += 10;
 		}
 		if (PlayerFirstCards == "Jack of Hearts" || PlayerSecondCards == "Jack of Hearts") {
 			PlayerHand += 10;
 		}
 		if (PlayerFirstCards == "Queen of Hearts" || PlayerSecondCards == "Queen of Hearts") {
 			PlayerHand += 10;
 		}
 		if (PlayerFirstCards == "King of Hearts" || PlayerSecondCards == "King of Hearts") {
 			PlayerHand += 10;
 		}
 		if (PlayerFirstCards == "Ace of Spades" || PlayerSecondCards == "Ace of Spades"){
 			if ((PlayerHand + 11)  > 21) {
 		        PlayerHand += 1;
 			}
 		   else {
		        PlayerHand += 11;
 		   }
 		}
 		if (PlayerFirstCards == "Two of Spades" || PlayerSecondCards == "Two of Spades") {
 			PlayerHand += 2;
 		}
 		if (PlayerFirstCards == "Three of Spades" || PlayerSecondCards == "Three of Spades") {
 			PlayerHand += 3;
 		}
 		if (PlayerFirstCards == "Four of Spades" || PlayerSecondCards == "Four of Spades") {
 			PlayerHand += 4;
 		}
 		if (PlayerFirstCards == "Five of Spades" || PlayerSecondCards == "Five of Spades") {
 			PlayerHand += 5;
 		}
 		if (PlayerFirstCards == "Six of Spades" || PlayerSecondCards == "Six of Spades") {
 			PlayerHand += 6;
 		}
 		if (PlayerFirstCards == "Seven of Spades" || PlayerSecondCards == "Seven of Spades") {
 			PlayerHand += 7;
 		}
 		if (PlayerFirstCards == "Eight of Spades" || PlayerSecondCards == "Eight of Spades") {
 			PlayerHand += 8;
 		}
 		if (PlayerFirstCards == "Nine of Spades" || PlayerSecondCards == "Nine of Spades") {
 			PlayerHand += 9;
 		}
 		if (PlayerFirstCards == "Ten of Spades" || PlayerSecondCards == "Ten of Spades") {
 			PlayerHand += 10;
 		}
 		if (PlayerFirstCards == "Jack of Spades" || PlayerSecondCards == "Jack of Spades") {
 			PlayerHand += 10;
 		}
 		if (PlayerFirstCards == "Queen of Spades" || PlayerSecondCards == "Queen of Spades") {
 			PlayerHand += 10;
 		}
 		if (PlayerFirstCards == "King of Spades" || PlayerSecondCards == "King of Spades") {
 			PlayerHand += 10;
 		}

 	//	JOptionPane.showMessageDialog(null, "Your hand is " + PlayerHand);
 		BlackJack.SetLblPlayerHand(PlayerHand);
 		
 		if (PlayerHand == 21) {
 			BlackJack.WinSound();
 			BlackJack.CoinsSound();
 			JOptionPane.showMessageDialog(null, "Congratulations!!!!! You Won!!!! ");
 			PlayerWins += 1;
 			BlackJack.SetLblPlayerWins(PlayerWins);
 			BlackJack.SetLblDealerWins(DealerWins);
 	 		BlackJack.setBtnHit(GameEnd = false);
 	 		BlackJack.setBtnStand(GameEnd = false);
 	 		BetValue += Bet;
 	 		BetValue2 -= Bet;
 	 		BlackJack.SetLblPWallet(BetValue);
 	 		BlackJack.SetLblDWallet(BetValue2);
 	 		if(BetValue <= 0 || BetValue2 <= 0) {
 	 			BlackJack.setBtnPlay(GameEnd = false);
 	 			BlackJack.btnNewGame.setEnabled(true);
 	 			if(BetValue <= 0) {
 	 				BlackJack.GameOverSound();
 	 				JOptionPane.showMessageDialog(null, "Sorry you can't play anymore because your wallet is empty");
 	 			}
 	 			else if(BetValue2 <= 0){
 	 				BlackJack.LevelWinSound();
 	 				JOptionPane.showMessageDialog(null, "Congratulations you won the dealer, his wallet is empty");
 	 			}
 	 		}
 	 		else {
 	 			BlackJack.setBtnPlay(GameEnd = true);
 	 		}
 	 		ClearPandDHand();	// Clears the PlayerHand and DealerHannd
 		}
 		if (PlayerHand > 21) {
 			BlackJack.LoseSound();
 			BlackJack.LoseSound();
			JOptionPane.showMessageDialog(null, "GameOver.... The Dealer wins!");
			DealerWins += 1;
			BlackJack.SetLblPlayerWins(PlayerWins);
 			BlackJack.SetLblDealerWins(DealerWins);
			BlackJack.setBtnHit(GameEnd = false);
 	 		BlackJack.setBtnStand(GameEnd = false);
 	 		BetValue2 += Bet;
 	 		BetValue -= Bet;
			BlackJack.SetLblDWallet(BetValue2);
			BlackJack.SetLblPWallet(BetValue);
			if(BetValue <= 0 || BetValue2 <= 0) {
 	 			BlackJack.setBtnPlay(GameEnd = false);
 	 			BlackJack.btnNewGame.setEnabled(true);
 	 			if(BetValue <= 0) {
 	 				BlackJack.GameOverSound();
 	 				JOptionPane.showMessageDialog(null, "Sorry you can't play anymore because your wallet is empty");
 	 			}
 	 			else if(BetValue2 <= 0){
 	 				BlackJack.LevelWinSound();
 	 				JOptionPane.showMessageDialog(null, "Congratulations you won the dealer, his wallet is empty");
 	 			}
 	 		}
 	 		else {
 	 			BlackJack.setBtnPlay(GameEnd = true);
 	 		}
 	 		ClearPandDHand();	// Clears the PlayerHand and DealerHannd


		}
 		
 		return(PlayerHand);
 	}
 	
 	
 	
 	public static int DisplayDealerHand() {
 		
 			// *******************************************************************************************************************************************************
 			// Method                  :   	DisplayDealerHand
 			//
 			// Method  parameters      :    None
 			// 
 			// Method return           :    void
 			//
 			// Synopsis                :    Calculates and displays Dealer hand
 			//
 			// Modifications           :    
 			//                              Date           Developer              Notes
 			//                             ------         -----------            -------
 			//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
 	        //
 			//*********************************************************************************************************************************************************
 		
		
		/*Condition that Increments the dealers's hand*/
		
 		if (DealerFirstCards == "Ace of Clubs" || DealerSecondCards == "Ace of Clubs"){
 			if ((DealerHand + 11)  > 21) {
 		        DealerHand += 1;
 			}
 		   else {
		        DealerHand += 11;
 		   }
 		}
 		if (DealerFirstCards == "Two of Clubs" || DealerSecondCards == "Two of Clubs") {
 			DealerHand += 2;
 		}
 		if (DealerFirstCards == "Three of Clubs" || DealerSecondCards == "Three of Clubs") {
 			DealerHand += 3;
 		}
 		if (DealerFirstCards == "Four of Clubs" || DealerSecondCards == "Four of Clubs") {
 			DealerHand += 4;
 		}
 		if (DealerFirstCards == "Five of Clubs" || DealerSecondCards == "Five of Clubs") {
 			DealerHand += 5;
 		}
 		if (DealerFirstCards == "Six of Clubs" || DealerSecondCards == "Six of Clubs") {
 			DealerHand += 6;
 		}
 		if (DealerFirstCards == "Seven of Clubs" || DealerSecondCards == "Seven of Clubs") {
 			DealerHand += 7;
 		}
 		if (DealerFirstCards == "Eight of Clubs" || DealerSecondCards == "Eight of Clubs") {
 			DealerHand += 8;
 		}
 		if (DealerFirstCards == "Nine of Clubs" || DealerSecondCards == "Nine of Clubs") {
 			DealerHand += 9;
 		}
 		if (DealerFirstCards == "Ten of Clubs" || DealerSecondCards == "Ten of Clubs") {
 			DealerHand += 10;
 		}
 		if (DealerFirstCards == "Jack of Clubs" || DealerSecondCards == "Jack of Clubs") {
 			DealerHand += 10;
 		}
 		if (DealerFirstCards == "Queen of Clubs" || DealerSecondCards == "Queen of Clubs") {
 			DealerHand += 10;
 		}
 		if (DealerFirstCards == "King of Clubs" || DealerSecondCards == "King of Clubs") {
 			DealerHand += 10;
 		}
 		if (DealerFirstCards == "Ace of Diamonds" || DealerSecondCards == "Ace of Diamonds"){
 			if ((DealerHand + 11)  > 21) {
 		        DealerHand += 1;
 			}
 		   else {
		        DealerHand += 11;
 		   }
 		}
 		if (DealerFirstCards == "Two of Diamonds" || DealerSecondCards == "Two of Diamonds") {
 			DealerHand += 2;
 		}
 		if (DealerFirstCards == "Three of Diamonds" || DealerSecondCards == "Three of Diamonds") {
 			DealerHand += 3;
 		}
 		if (DealerFirstCards == "Four of Diamonds" || DealerSecondCards == "Four of Diamonds") {
 			DealerHand += 4;
 		}
 		if (DealerFirstCards == "Five of Diamonds" || DealerSecondCards == "Five of Diamonds") {
 			DealerHand += 5;
 		}
 		if (DealerFirstCards == "Six of Diamonds" || DealerSecondCards == "Six of Diamonds") {
 			DealerHand += 6;
 		}
 		if (DealerFirstCards == "Seven of Diamonds" || DealerSecondCards == "Seven of Diamonds") {
 			DealerHand += 7;
 		}
 		if (DealerFirstCards == "Eight of Diamonds" || DealerSecondCards == "Eight of Diamonds") {
 			DealerHand += 8;
 		}
 		if (DealerFirstCards == "Nine of Diamonds" || DealerSecondCards == "Nine of Diamonds") {
 			DealerHand += 9;
 		}
 		if (DealerFirstCards == "Ten of Diamonds" || DealerSecondCards == "Ten of Diamonds") {
 			DealerHand += 10;
 		}
 		if (DealerFirstCards == "Jack of Diamonds" || DealerSecondCards == "Jack of Diamonds") {
 			DealerHand += 10;
 		}
 		if (DealerFirstCards == "Queen of Diamonds" || DealerSecondCards == "Queen of Diamonds") {
 			DealerHand += 10;
 		}
 		if (DealerFirstCards == "King of Diamonds" || DealerSecondCards == "King of Diamonds") {
 			DealerHand += 10;
 		}
 		if (DealerFirstCards == "Ace of Hearts" || DealerSecondCards == "Ace of Hearts"){
 			if ((DealerHand + 11)  > 21) {
 		        DealerHand += 1;
 			}
 		   else {
		        DealerHand += 11;
 		   }
 		}
 		if (DealerFirstCards == "Two of Hearts" || DealerSecondCards == "Two of Hearts") {
 			DealerHand += 2;
 		}
 		if (DealerFirstCards == "Three of Hearts" || DealerSecondCards == "Three of Hearts") {
 			DealerHand += 3;
 		}
 	    if (DealerFirstCards == "Four of Hearts" || DealerSecondCards == "Four of Hearts") {
 			DealerHand += 4;
 		}
 		if (DealerFirstCards == "Five of Hearts" || DealerSecondCards == "Five of Hearts") {
 			DealerHand += 5;
 		}
 		if (DealerFirstCards == "Six of Hearts" || DealerSecondCards == "Six of Hearts") {
 			DealerHand += 6;
 		}
 		if (DealerFirstCards == "Seven of Hearts" || DealerSecondCards == "Seven of Hearts") {
 			DealerHand += 7;
 		}
 		if (DealerFirstCards == "Eight of Hearts" || DealerSecondCards == "Eight of Hearts") {
 			DealerHand += 8;
 		}
 		if (DealerFirstCards == "Nine of Hearts" || DealerSecondCards == "Nine of Hearts") {
 			DealerHand += 9;
 		}
 		if (DealerFirstCards == "Ten of Hearts" || DealerSecondCards == "Ten of Hearts") {
 			DealerHand += 10;
 		}
 		if (DealerFirstCards == "Jack of Hearts" || DealerSecondCards == "Jack of Hearts") {
 			DealerHand += 10;
 		}
 		if (DealerFirstCards == "Queen of Hearts" || DealerSecondCards == "Queen of Hearts") {
 			DealerHand += 10;
 		}
 		if (DealerFirstCards == "King of Hearts" || DealerSecondCards == "King of Hearts") {
 			DealerHand += 10;
 		}
 		if (DealerFirstCards == "Ace of Spades" || DealerSecondCards == "Ace of Spades"){
 			if ((DealerHand + 11)  > 21) {
 		        DealerHand += 1;
 			}
 		   else {
		        DealerHand += 11;
 		   }
 		}
 		if (DealerFirstCards == "Two of Spades" || DealerSecondCards == "Two of Spades") {
 			DealerHand += 2;
 		}
 		if (DealerFirstCards == "Three of Spades" || DealerSecondCards == "Three of Spades") {
 			DealerHand += 3;
 		}
 		if (DealerFirstCards == "Four of Spades" || DealerSecondCards == "Four of Spades") {
 			DealerHand += 4;
 		}
 		if (DealerFirstCards == "Five of Spades" || DealerSecondCards == "Five of Spades") {
 			DealerHand += 5;
 		}
 		if (DealerFirstCards == "Six of Spades" || DealerSecondCards == "Six of Spades") {
 			DealerHand += 6;
 		}
 		if (DealerFirstCards == "Seven of Spades" || DealerSecondCards == "Seven of Spades") {
 			DealerHand += 7;
 		}
 		if (DealerFirstCards == "Eight of Spades" || DealerSecondCards == "Eight of Spades") {
 			DealerHand += 8;
 		}
 		if (DealerFirstCards == "Nine of Spades" || DealerSecondCards == "Nine of Spades") {
 			DealerHand += 9;
 		}
 		if (DealerFirstCards == "Ten of Spades" || DealerSecondCards == "Ten of Spades") {
 			DealerHand += 10;
 		}
 		if (DealerFirstCards == "Jack of Spades" || DealerSecondCards == "Jack of Spades") {
 			DealerHand += 10;
 		}
 		if (DealerFirstCards == "Queen of Spades" || DealerSecondCards == "Queen of Spades") {
 			DealerHand += 10;
 		}
 		if (DealerFirstCards == "King of Spades" || DealerSecondCards == "King of Spades") {
 			DealerHand += 10;
 		}

 	//	JOptionPane.showMessageDialog(null, "The Dealer hand is " + DealerHand);
 		BlackJack.SetLblDealerHand(DealerHand);
 		
 		if(DealerHand < 21) {
 			BlackJack.TensionSound();
 		}
 		
 		if(DealerHand == 21) {
 			BlackJack.LoseSound();
 			BlackJack.LoseSound();
 			JOptionPane.showMessageDialog(null, "Gameover...\nThe Dealer Won!!!!");
 			BlackJack.setBtnHit(GameEnd = false);
 			BlackJack.setBtnStand(GameEnd = false);
 			DealerWins += 1;
			BlackJack.SetLblPlayerWins(PlayerWins);
 			BlackJack.SetLblDealerWins(DealerWins);
 			BetValue2 += Bet;
 	 		BetValue -= Bet;
			BlackJack.SetLblDWallet(BetValue2);
			BlackJack.SetLblPWallet(BetValue);
			if(BetValue <= 0 || BetValue2 <= 0) {
 	 			BlackJack.setBtnPlay(GameEnd = false);
 	 			BlackJack.btnNewGame.setEnabled(true);
 	 			if(BetValue <= 0) {
 	 				BlackJack.GameOverSound();
 	 				JOptionPane.showMessageDialog(null, "Sorry you can't play anymore because your wallet is empty");
 	 			}
 	 			else if(BetValue2 <= 0){
 	 				BlackJack.LevelWinSound();
 	 				JOptionPane.showMessageDialog(null, "Congratulations you won the dealer, his wallet is empty");
 	 			}
 	 		}
 	 		else {
 	 			BlackJack.setBtnPlay(GameEnd = true);
 	 		}
 	 		ClearPandDHand();	// Clears the PlayerHand and DealerHannd

 		}
 		if (DealerHand > 21) {
 			BlackJack.WinSound();
 			BlackJack.CoinsSound();
			JOptionPane.showMessageDialog(null, "Congratulations!!!! You Won!!!!!");	// Displays Congratulations!!!!! You Won!!!!
			PlayerWins += 1;		// Increments PlayerWins
			BlackJack.SetLblPlayerWins(PlayerWins);
 			BlackJack.SetLblDealerWins(DealerWins);
			BlackJack.setBtnHit(GameEnd = false);
 			BlackJack.setBtnStand(GameEnd = false);
 			BetValue += Bet;
 	 		BetValue2 -= Bet;
 	 		BlackJack.SetLblPWallet(BetValue);
 	 		BlackJack.SetLblDWallet(BetValue2);
 	 		if(BetValue <= 0 || BetValue2 <= 0) {
 	 			BlackJack.setBtnPlay(GameEnd = false);
 	 			BlackJack.btnNewGame.setEnabled(true);
 	 			if(BetValue <= 0) {
 	 				BlackJack.GameOverSound();
 	 				JOptionPane.showMessageDialog(null, "Sorry you can't play anymore because your wallet is empty");
 	 			}
 	 			else if(BetValue2 <= 0){
 	 				BlackJack.LevelWinSound();
 	 				JOptionPane.showMessageDialog(null, "Congratulations you won the dealer, his wallet is empty");
 	 			}
 	 		}
 	 		else {
 	 			BlackJack.setBtnPlay(GameEnd = true);
 	 		}
 	 		ClearPandDHand();		// Clears the PlayerHand and DealerHannd
 	 		

		}
 		
 		
 		return (DealerHand);
 	}
 	

 	public static void DisplayPlayerThirdCards() {
	
 		
 			// *******************************************************************************************************************************************************
 			// Method                  :   	DisplaysPlayerThirdCards
 			//
 			// Method  parameters      :    None
 			// 
 			// Method return           :    void
 			//
 			// Synopsis                :    This method Displays Player Third Card and Increments PlayerHand based on the PlayersThirdCards
 			//
 			// Modifications           :    
 			//                              Date           Developer              Notes
 			//                             ------         -----------            -------
 			//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
 	        //
 			//*********************************************************************************************************************************************************
 		
 		
 	/*Condition that runs only when PlayerHand is less than 21*/	
 		if (PlayerHand < 21) {
		
 	/*Generates PlayersThirdCards using the same mechanisms as the previous one*/
			Random rand = new Random();
	 		int TemporaryCardIndex10 = 0;
	 		
	 		TemporaryCardIndex10 = rand.nextInt(51);
	 		PlayerThirdCards = DeckOfCards[TemporaryCardIndex10];
	 		
	        if (PlayerThirdCards == PlayerFirstCards || PlayerThirdCards == PlayerSecondCards || PlayerThirdCards == DealerFirstCards) {
				
				do {
					Random random = new Random();
					
					TemporaryCardIndex10 = rand.nextInt(51);
					PlayerThirdCards = DeckOfCards[TemporaryCardIndex10];
				}while (PlayerThirdCards == PlayerFirstCards || PlayerThirdCards == PlayerSecondCards || PlayerThirdCards == DealerFirstCards );
				
		//		JOptionPane.showMessageDialog(null, "Your Third card is " + PlayerThirdCards);
				ImageIcon image = DeterminingCardImage(PlayerThirdCards);
				BlackJack.CardSound();
				BlackJack.SetLblPlayerThirdCards(image);

			}
	        
	        else {
	     		
	  //      	JOptionPane.showMessageDialog(null, "Your Third card is " + PlayerThirdCards); 
	        	ImageIcon image = DeterminingCardImage(PlayerThirdCards);
	        	BlackJack.CardSound();
	        	BlackJack.SetLblPlayerThirdCards(image);
	        }
	
	  /*Conditional statements that handles the incrementing of the PlayerHand*/      
	        if (PlayerThirdCards == "Ace of Clubs"){
	        	if ((PlayerHand + 11)  > 21) {
	 		        PlayerHand += 1;
	 			}
	 		   else {
			        PlayerHand += 11;
	 		   }
	 		}
	 		if (PlayerThirdCards == "Two of Clubs") {
	 			PlayerHand += 2;
	 		}
	 		if (PlayerThirdCards == "Three of Clubs") {
	 			PlayerHand += 3;
	 		}
	 		if (PlayerThirdCards == "Four of Clubs") {
	 			PlayerHand += 4;
	 		}
	 	    if (PlayerThirdCards == "Five of Clubs") {
	 			PlayerHand += 5;
	 		}
	 		if (PlayerThirdCards == "Six of Clubs") {
	 			PlayerHand += 6;
	 		}
	 		if (PlayerThirdCards == "Seven of Clubs") {
	 			PlayerHand += 7;
	 		}
	 		if (PlayerThirdCards == "Eight of Clubs") {
	 			PlayerHand += 8;
	 		}
	 		if (PlayerThirdCards == "Nine of Clubs") {
	 			PlayerHand += 9;
	 		}
	 		if (PlayerThirdCards == "Ten of Clubs") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerThirdCards == "Jack of Clubs") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerThirdCards == "Queen of Clubs") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerThirdCards == "King of Clubs") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerThirdCards == "Ace of Diamonds"){
	 			if ((PlayerHand + 11)  > 21) {
	 		        PlayerHand += 1;
	 			}
	 		   else {
			        PlayerHand += 11;
	 		   }
	 		}
	 		if (PlayerThirdCards == "Two of Diamonds") {
	 			PlayerHand += 2;
	 		}
	 		if (PlayerThirdCards == "Three of Diamonds") {
	 			PlayerHand += 3;
	 		}
	 		if (PlayerThirdCards == "Four of Diamonds") {
	 			PlayerHand += 4;
	 		}
	 		if (PlayerThirdCards == "Five of Diamonds") {
	 			PlayerHand += 5;
	 		}
	 		if (PlayerThirdCards == "Six of Diamonds") {
	 			PlayerHand += 6;
	 		}
	 		if (PlayerThirdCards == "Seven of Diamonds") {
	 			PlayerHand += 7;
	 		}
	 		if (PlayerThirdCards == "Eight of Diamonds") {
	 			PlayerHand += 8;
	 		}
	 		if (PlayerThirdCards == "Nine of Diamonds") {
	 			PlayerHand += 9;
	 		}
	 		if (PlayerThirdCards == "Ten of Diamonds") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerThirdCards == "Jack of Diamonds") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerThirdCards == "Queen of Diamonds") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerThirdCards == "King of Diamonds") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerThirdCards == "Ace of Hearts"){
	 			if ((PlayerHand + 11)  > 21) {
	 		        PlayerHand += 1;
	 			}
	 		   else {
			        PlayerHand += 11;
	 		   }
	 		}
	 		if (PlayerThirdCards == "Two of Hearts") {
	 			PlayerHand += 2;
	 		}
	 		if (PlayerThirdCards == "Three of Hearts") {
	 			PlayerHand += 3;
	 		}
	 		if (PlayerThirdCards == "Four of Hearts") {
	 			PlayerHand += 4;
	 		}
	 		if (PlayerThirdCards == "Five of Hearts") {
	 			PlayerHand += 5;
	 		}
	 		if (PlayerThirdCards == "Six of Hearts") {
	 			PlayerHand += 6;
	 		}
	 		if (PlayerThirdCards == "Seven of Hearts") {
	 			PlayerHand += 7;
	 		}
	 		if (PlayerThirdCards == "Eight of Hearts") {
	 			PlayerHand += 8;
	 		}
	 		if (PlayerThirdCards == "Nine of Hearts") {
	 			PlayerHand += 9;
	 		}
	 		if (PlayerThirdCards == "Ten of Hearts") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerThirdCards == "Jack of Hearts") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerThirdCards == "Queen of Hearts") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerThirdCards == "King of Hearts") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerThirdCards == "Ace of Spades"){
	 			if ((PlayerHand + 11)  > 21) {
	 		        PlayerHand += 1;
	 			}
	 		   else {
			        PlayerHand += 11;
	 		   }
	 		}
	 		if (PlayerThirdCards == "Two of Spades") {
	 			PlayerHand += 2;
	 		}
	 		if (PlayerThirdCards == "Three of Spades") {
	 			PlayerHand += 3;
	 		}
	 		if (PlayerThirdCards == "Four of Spades") {
	 			PlayerHand += 4;
	 		}
	 		if (PlayerThirdCards == "Five of Spades") {
	 			PlayerHand += 5;
	 		}
	 		if (PlayerThirdCards == "Six of Spades") {
	 			PlayerHand += 6;
	 		}
	 		if (PlayerThirdCards == "Seven of Spades") {
	 			PlayerHand += 7;
	 		}
	 		if (PlayerThirdCards == "Eight of Spades") {
	 			PlayerHand += 8;
	 		}
	 		if (PlayerThirdCards == "Nine of Spades") {
	 			PlayerHand += 9;
	 		}
	 		if (PlayerThirdCards == "Ten of Spades") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerThirdCards == "Jack of Spades") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerThirdCards == "Queen of Spades") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerThirdCards == "King of Spades") {
	 			PlayerHand += 10;
	 		}

	// 		JOptionPane.showMessageDialog(null, "Your hand is " + PlayerHand);		// Displays PlayerHand
	 		BlackJack.SetLblPlayerHand(PlayerHand);
	 		
	 		if (PlayerHand == 21) {
	 			BlackJack.TensionSound.stop();
	 			BlackJack.WinSound();
	 			BlackJack.CoinsSound();
	 			JOptionPane.showMessageDialog(null, "Congratulations!!!!! You Won!!!! ");	// Displays Congratulations!!!!! You Won!!!!
	 			PlayerWins += 1;		// Increments PlayerWins by 1
	 			BlackJack.SetLblPlayerWins(PlayerWins);		// SetLblPlayerWins in BlackJack.java accesses PlayerWins value To display in the game
	 			BlackJack.SetLblDealerWins(DealerWins);		// SetLblPlayerWins in BlackJack.java accesses DealerWins value To display in the game
	 			BlackJack.setBtnHit(GameEnd = false);		// Set Hit button to false
	 	 		BlackJack.setBtnStand(GameEnd = false);		// Set Stand button to false
	 	 		BetValue += Bet;
	 	 		BetValue2 -= Bet;
	 	 		BlackJack.SetLblPWallet(BetValue);
	 	 		BlackJack.SetLblDWallet(BetValue2);			// SetLblPWallet accessing bet value to display it in the game
	 	 		if(BetValue <= 0 || BetValue2 <= 0) {
	 	 			BlackJack.setBtnPlay(GameEnd = false);
	 	 			BlackJack.btnNewGame.setEnabled(true);
	 	 			if(BetValue <= 0) {
	 	 				BlackJack.GameOverSound();
	 	 				JOptionPane.showMessageDialog(null, "Sorry you can't play anymore because your wallet is empty");
	 	 			}
	 	 			else if(BetValue2 <= 0){
	 	 				BlackJack.LevelWinSound();
	 	 				JOptionPane.showMessageDialog(null, "Congratulations you won the dealer, his wallet is empty");
	 	 			}
	 	 		}
	 	 		else {
	 	 			BlackJack.setBtnPlay(GameEnd = true);
	 	 		}
	 	 		ClearPandDHand();							// Clears the PlayerHand and DealerHannd

	 		}
	 		else if (PlayerHand > 21) {
	 			BlackJack.TensionSound.stop();
	 			BlackJack.LoseSound();
	 			BlackJack.LoseSound();
				JOptionPane.showMessageDialog(null, "GameOver.... The Dealer wins!");
				DealerWins += 1;	// Increments DealerWins by 1
				BlackJack.SetLblPlayerWins(PlayerWins);		// SetLblPlayerWins in BlackJack.java accesses PlayerWins value To display in the game
	 			BlackJack.SetLblDealerWins(DealerWins);		// SetLblPlayerWins in BlackJack.java accesses DealerWins value To display in the game
				BlackJack.setBtnHit(GameEnd = false);		// Set Hit button to false
	 	 		BlackJack.setBtnStand(GameEnd = false);		// Set Stand button to false
	 	 		BetValue2 += Bet;
	 	 		BetValue -= Bet;
				BlackJack.SetLblDWallet(BetValue2);
				BlackJack.SetLblPWallet(BetValue);		// SetLblDWallet accessing bet value to display it in the game
				if(BetValue <= 0 || BetValue2 <= 0) {
	 	 			BlackJack.setBtnPlay(GameEnd = false);
	 	 			BlackJack.btnNewGame.setEnabled(true);
	 	 			if(BetValue <= 0) {
	 	 				BlackJack.GameOverSound();
	 	 				JOptionPane.showMessageDialog(null, "Sorry you can't play anymore because your wallet is empty");
	 	 			}
	 	 			else if(BetValue2 <= 0){
	 	 				BlackJack.LevelWinSound();
	 	 				JOptionPane.showMessageDialog(null, "Congratulations you won the dealer, his wallet is empty");
	 	 			}
	 	 		}
	 	 		else {
	 	 			BlackJack.setBtnPlay(GameEnd = true);
	 	 		}
				ClearPandDHand();							// Clears the PlayerHand and DealerHannd


			}
		}
		
		
        
	}
 	
	public static void DisplayPlayerFourthCards() {
		
		// *******************************************************************************************************************************************************
			// Method                  :   	DisplaysPlayerFourthCards
			//
			// Method  parameters      :    None
			// 
			// Method return           :    void
			//
			// Synopsis                :    This method Displays Player Fourth Card
			//
			// Modifications           :    
			//                              Date           Developer              Notes
			//                             ------         -----------            -------
			//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
	        //
			//*********************************************************************************************************************************************************
		
		if (PlayerHand < 21) {
			
			Random rand2 = new Random();
	 		int TemporaryCardIndex11 = 0;
	 		
	 		TemporaryCardIndex11 = rand2.nextInt(51);
	 		PlayerFourthCards = DeckOfCards[TemporaryCardIndex11];
	 		
	        if (PlayerFourthCards == PlayerFirstCards || PlayerFourthCards == PlayerSecondCards || PlayerFourthCards == DealerFirstCards || PlayerFourthCards == PlayerThirdCards || PlayerFourthCards == DealerSecondCards) {
				
				do {
					Random random = new Random();
					
					TemporaryCardIndex11 = random.nextInt(51);
					PlayerFourthCards = DeckOfCards[TemporaryCardIndex11];
				}while (PlayerFourthCards == PlayerFirstCards || PlayerFourthCards == PlayerSecondCards || PlayerFourthCards == DealerFirstCards || PlayerFourthCards == PlayerThirdCards || PlayerFourthCards == DealerSecondCards);
				
		//		JOptionPane.showMessageDialog(null, "Your Fourth card is " + PlayerFourthCards);
				ImageIcon image = DeterminingCardImage(PlayerFourthCards);
				BlackJack.CardSound();
				BlackJack.SetLblPlayerFourthCards(image);

			}
	        
	        else {
	     		
	   //     	JOptionPane.showMessageDialog(null, "Your Fourth card is " + PlayerFourthCards); 
	        	ImageIcon image = DeterminingCardImage(PlayerFourthCards);
	        	BlackJack.CardSound();
	        	BlackJack.SetLblPlayerFourthCards(image);
	        }
	        
	        
	        
	        
	        if (PlayerFourthCards == "Ace of Clubs"){
	        	if ((PlayerHand + 11)  > 21) {
	 		        PlayerHand += 1;
	 			}
	 		   else {
			        PlayerHand += 11;
	 		   }
	 		}
	 		if (PlayerFourthCards == "Two of Clubs") {
	 			PlayerHand += 2;
	 		}
	 		if (PlayerFourthCards == "Three of Clubs") {
	 			PlayerHand += 3;
	 		}
	 		if (PlayerFourthCards == "Four of Clubs") {
	 			PlayerHand += 4;
	 		}
	 	    if (PlayerFourthCards == "Five of Clubs") {
	 			PlayerHand += 5;
	 		}
	 		if (PlayerFourthCards == "Six of Clubs") {
	 			PlayerHand += 6;
	 		}
	 		if (PlayerFourthCards == "Seven of Clubs") {
	 			PlayerHand += 7;
	 		}
	 		if (PlayerFourthCards == "Eight of Clubs") {
	 			PlayerHand += 8;
	 		}
	 		if (PlayerFourthCards == "Nine of Clubs") {
	 			PlayerHand += 9;
	 		}
	 		if (PlayerFourthCards == "Ten of Clubs") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerFourthCards == "Jack of Clubs") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerFourthCards == "Queen of Clubs") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerFourthCards == "King of Clubs") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerFourthCards == "Ace of Diamonds"){
	 			if ((PlayerHand + 11)  > 21) {
	 		        PlayerHand += 1;
	 			}
	 		   else {
			        PlayerHand += 11;
	 		   }
	 		}
	 		if (PlayerFourthCards == "Two of Diamonds") {
	 			PlayerHand += 2;
	 		}
	 		if (PlayerFourthCards == "Three of Diamonds") {
	 			PlayerHand += 3;
	 		}
	 		if (PlayerFourthCards == "Four of Diamonds") {
	 			PlayerHand += 4;
	 		}
	 		if (PlayerFourthCards == "Five of Diamonds") {
	 			PlayerHand += 5;
	 		}
	 		if (PlayerFourthCards == "Six of Diamonds") {
	 			PlayerHand += 6;
	 		}
	 		if (PlayerFourthCards == "Seven of Diamonds") {
	 			PlayerHand += 7;
	 		}
	 		if (PlayerFourthCards == "Eight of Diamonds") {
	 			PlayerHand += 8;
	 		}
	 		if (PlayerFourthCards == "Nine of Diamonds") {
	 			PlayerHand += 9;
	 		}
	 		if (PlayerFourthCards == "Ten of Diamonds") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerFourthCards == "Jack of Diamonds") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerFourthCards == "Queen of Diamonds") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerFourthCards == "King of Diamonds") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerFourthCards == "Ace of Hearts"){
	 			if ((PlayerHand + 11)  > 21) {
	 		        PlayerHand += 1;
	 			}
	 		   else {
			        PlayerHand += 11;
	 		   }
	 		}
	 		if (PlayerFourthCards == "Two of Hearts") {
	 			PlayerHand += 2;
	 		}
	 		if (PlayerFourthCards == "Three of Hearts") {
	 			PlayerHand += 3;
	 		}
	 		if (PlayerFourthCards == "Four of Hearts") {
	 			PlayerHand += 4;
	 		}
	 		if (PlayerFourthCards == "Five of Hearts") {
	 			PlayerHand += 5;
	 		}
	 		if (PlayerFourthCards == "Six of Hearts") {
	 			PlayerHand += 6;
	 		}
	 		if (PlayerFourthCards == "Seven of Hearts") {
	 			PlayerHand += 7;
	 		}
	 		if (PlayerFourthCards == "Eight of Hearts") {
	 			PlayerHand += 8;
	 		}
	 		if (PlayerFourthCards == "Nine of Hearts") {
	 			PlayerHand += 9;
	 		}
	 		if (PlayerFourthCards == "Ten of Hearts") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerFourthCards == "Jack of Hearts") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerFourthCards == "Queen of Hearts") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerFourthCards == "King of Hearts") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerFourthCards == "Ace of Spades"){
	 			if ((PlayerHand + 11)  > 21) {
	 		        PlayerHand += 1;
	 			}
	 		   else {
			        PlayerHand += 11;
	 		   }
	 		}
	 		if (PlayerFourthCards == "Two of Spades") {
	 			PlayerHand += 2;
	 		}
	 		if (PlayerFourthCards == "Three of Spades") {
	 			PlayerHand += 3;
	 		}
	 		if (PlayerFourthCards == "Four of Spades") {
	 			PlayerHand += 4;
	 		}
	 		if (PlayerFourthCards == "Five of Spades") {
	 			PlayerHand += 5;
	 		}
	 		if (PlayerFourthCards == "Six of Spades") {
	 			PlayerHand += 6;
	 		}
	 		if (PlayerFourthCards == "Seven of Spades") {
	 			PlayerHand += 7;
	 		}
	 		if (PlayerFourthCards == "Eight of Spades") {
	 			PlayerHand += 8;
	 		}
	 		if (PlayerFourthCards == "Nine of Spades") {
	 			PlayerHand += 9;
	 		}
	 		if (PlayerFourthCards == "Ten of Spades") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerFourthCards == "Jack of Spades") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerFourthCards == "Queen of Spades") {
	 			PlayerHand += 10;
	 		}
	 		if (PlayerFourthCards == "King of Spades") {
	 			PlayerHand += 10;
	 		}

	// 		JOptionPane.showMessageDialog(null, "Your hand is " + PlayerHand);
	 		BlackJack.SetLblPlayerHand(PlayerHand);
	 		
	 		if (PlayerHand == 21) {
	 			BlackJack.TensionSound.stop();
	 			BlackJack.WinSound();
	 			BlackJack.CoinsSound();
	 			JOptionPane.showMessageDialog(null, "Congratulations!!!!! You Won!!!! ");	// Displays Congratulations!!!!! You Won!!!!
	 			PlayerWins += 1;		// Increments PlayerWins by 1
	 			BlackJack.SetLblPlayerWins(PlayerWins);
	 			BlackJack.SetLblDealerWins(DealerWins);
	 			BlackJack.setBtnHit(GameEnd = false);
	 	 		BlackJack.setBtnStand(GameEnd = false);
	 	 		BetValue += Bet;
	 	 		BetValue2 -= Bet;
	 	 		BlackJack.SetLblPWallet(BetValue);
	 	 		BlackJack.SetLblDWallet(BetValue2);
	 	 		if(BetValue <= 0 || BetValue2 <= 0) {
	 	 			BlackJack.setBtnPlay(GameEnd = false);
	 	 			BlackJack.btnNewGame.setEnabled(true);
	 	 			if(BetValue <= 0) {
	 	 				BlackJack.GameOverSound();
	 	 				JOptionPane.showMessageDialog(null, "Sorry you can't play anymore because your wallet is empty");
	 	 			}
	 	 			else if(BetValue2 <= 0){
	 	 				BlackJack.LevelWinSound();
	 	 				JOptionPane.showMessageDialog(null, "Congratulations you won the dealer, his wallet is empty");
	 	 			}
	 	 		}
	 	 		else {
	 	 			BlackJack.setBtnPlay(GameEnd = true);
	 	 		}
	 	 		ClearPandDHand();		// Clears the PlayerHand and DealerHannd


	 		}
	 		else if (PlayerHand > 21) {
	 			BlackJack.TensionSound.stop();
	 			BlackJack.LoseSound();
	 			BlackJack.LoseSound();
				JOptionPane.showMessageDialog(null, "GameOver.... The Dealer wins!");
				DealerWins += 1;		// Increments DealerWins by 1
				BlackJack.SetLblPlayerWins(PlayerWins);			
	 			BlackJack.SetLblDealerWins(DealerWins);
				BlackJack.setBtnHit(GameEnd = false);
	 	 		BlackJack.setBtnStand(GameEnd = false);
	 	 		BetValue2 += Bet;
	 	 		BetValue -= Bet;
				BlackJack.SetLblDWallet(BetValue2);
				BlackJack.SetLblPWallet(BetValue);
				if(BetValue <= 0 || BetValue2 <= 0) {
	 	 			BlackJack.setBtnPlay(GameEnd = false);
	 	 			BlackJack.btnNewGame.setEnabled(true);
	 	 			if(BetValue <= 0) {
	 	 				BlackJack.GameOverSound();
	 	 				JOptionPane.showMessageDialog(null, "Sorry you can't play anymore because your wallet is empty");
	 	 			}
	 	 			else if(BetValue2 <= 0){
	 	 				BlackJack.LevelWinSound();
	 	 				JOptionPane.showMessageDialog(null, "Congratulations you won the dealer, his wallet is empty");
	 	 			}
	 	 		}
	 	 		else {
	 	 			BlackJack.setBtnPlay(GameEnd = true);
	 	 		}
				ClearPandDHand();	// Clears the PlayerHand and DealerHannd

			}
		}
		
        
	}
	
	public static void DisplayPlayerFifthCards() {
		
		// *******************************************************************************************************************************************************
			// Method                  :   	DisplaysPlayerFifthCards
			//
			// Method  parameters      :    None
			// 
			// Method return           :    void
			//
			// Synopsis                :    This method Displays Player Fifth Card
			//
			// Modifications           :    
			//                              Date           Developer              Notes
			//                             ------         -----------            -------
			//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
	        //
			//*********************************************************************************************************************************************************
		
		if (PlayerHand < 21) {
			
			Random rand3 = new Random();
	 		int TemporaryCardIndex12 = 0;
	 		
	 		TemporaryCardIndex12 = rand3.nextInt(51);
	 		PlayerFifthCards = DeckOfCards[TemporaryCardIndex12];
	 		
	        if (PlayerFifthCards == PlayerFirstCards || PlayerFifthCards == PlayerSecondCards || PlayerFifthCards == DealerFirstCards || PlayerFifthCards == DealerSecondCards|| PlayerFifthCards == PlayerThirdCards || PlayerFifthCards == PlayerFourthCards) {
				
				do {
					Random random = new Random();
					
					TemporaryCardIndex12 = random.nextInt(51);
					PlayerFifthCards = DeckOfCards[TemporaryCardIndex12];
				}while (PlayerFifthCards == PlayerFirstCards || PlayerFifthCards == PlayerSecondCards || PlayerFifthCards == DealerFirstCards || PlayerFifthCards == DealerSecondCards|| PlayerFifthCards == PlayerThirdCards || PlayerFifthCards == PlayerFourthCards);
				
		//		JOptionPane.showMessageDialog(null, "Your Fifth card is " + PlayerFifthCards);
				ImageIcon Image = DeterminingCardImage(PlayerFifthCards);
				BlackJack.CardSound();
				BlackJack.SetLblPlayerFifthCards(Image);

			}
	        
	        else {
	     		
	    //    	JOptionPane.showMessageDialog(null, "Your Fifth card is " + PlayerFifthCards); 
	        	ImageIcon Image = DeterminingCardImage(PlayerFifthCards);
	        	BlackJack.CardSound();
	        	BlackJack.SetLblPlayerFifthCards(Image);
	        }
				
				
				if (PlayerFifthCards == "Ace of Clubs"){
					if ((PlayerHand + 11)  > 21) {
		 		        PlayerHand += 1;
		 			}
		 		   else {
				        PlayerHand += 11;
		 		   }
		 		}
		 		if (PlayerFifthCards == "Two of Clubs") {
		 			PlayerHand += 2;
		 		}
		 		if (PlayerFifthCards == "Three of Clubs") {
		 			PlayerHand += 3;
		 		}
		 		if (PlayerFifthCards == "Four of Clubs") {
		 			PlayerHand += 4;
		 		}
		 	    if (PlayerFifthCards == "Five of Clubs") {
		 			PlayerHand += 5;
		 		}
		 		if (PlayerFifthCards == "Six of Clubs") {
		 			PlayerHand += 6;
		 		}
		 		if (PlayerFifthCards == "Seven of Clubs") {
		 			PlayerHand += 7;
		 		}
		 		if (PlayerFifthCards == "Eight of Clubs") {
		 			PlayerHand += 8;
		 		}
		 		if (PlayerFifthCards == "Nine of Clubs") {
		 			PlayerHand += 9;
		 		}
		 		if (PlayerFifthCards == "Ten of Clubs") {
		 			PlayerHand += 10;
		 		}
		 		if (PlayerFifthCards == "Jack of Clubs") {
		 			PlayerHand += 10;
		 		}
		 		if (PlayerFifthCards == "Queen of Clubs") {
		 			PlayerHand += 10;
		 		}
		 		if (PlayerFifthCards == "King of Clubs") {
		 			PlayerHand += 10;
		 		}
		 		if (PlayerFifthCards == "Ace of Diamonds"){
		 			if ((PlayerHand + 11)  > 21) {
		 		        PlayerHand += 1;
		 			}
		 		   else {
				        PlayerHand += 11;
		 		   }
		 		}
		 		if (PlayerFifthCards == "Two of Diamonds") {
		 			PlayerHand += 2;
		 		}
		 		if (PlayerFifthCards == "Three of Diamonds") {
		 			PlayerHand += 3;
		 		}
		 		if (PlayerFifthCards == "Four of Diamonds") {
		 			PlayerHand += 4;
		 		}
		 		if (PlayerFifthCards == "Five of Diamonds") {
		 			PlayerHand += 5;
		 		}
		 		if (PlayerFifthCards == "Six of Diamonds") {
		 			PlayerHand += 6;
		 		}
		 		if (PlayerFifthCards == "Seven of Diamonds") {
		 			PlayerHand += 7;
		 		}
		 		if (PlayerFifthCards == "Eight of Diamonds") {
		 			PlayerHand += 8;
		 		}
		 		if (PlayerFifthCards == "Nine of Diamonds") {
		 			PlayerHand += 9;
		 		}
		 		if (PlayerFifthCards == "Ten of Diamonds") {
		 			PlayerHand += 10;
		 		}
		 		if (PlayerFifthCards == "Jack of Diamonds") {
		 			PlayerHand += 10;
		 		}
		 		if (PlayerFifthCards == "Queen of Diamonds") {
		 			PlayerHand += 10;
		 		}
		 		if (PlayerFifthCards == "King of Diamonds") {
		 			PlayerHand += 10;
		 		}
		 		if (PlayerFifthCards == "Ace of Hearts"){
		 			if ((PlayerHand + 11)  > 21) {
		 		        PlayerHand += 1;
		 			}
		 		   else {
				        PlayerHand += 11;
		 		   }
		 		}
		 		if (PlayerFifthCards == "Two of Hearts") {
		 			PlayerHand += 2;
		 		}
		 		if (PlayerFifthCards == "Three of Hearts") {
		 			PlayerHand += 3;
		 		}
		 		if (PlayerFifthCards == "Four of Hearts") {
		 			PlayerHand += 4;
		 		}
		 		if (PlayerFifthCards == "Five of Hearts") {
		 			PlayerHand += 5;
		 		}
		 		if (PlayerFifthCards == "Six of Hearts") {
		 			PlayerHand += 6;
		 		}
		 		if (PlayerFifthCards == "Seven of Hearts") {
		 			PlayerHand += 7;
		 		}
		 		if (PlayerFifthCards == "Eight of Hearts") {
		 			PlayerHand += 8;
		 		}
		 		if (PlayerFifthCards == "Nine of Hearts") {
		 			PlayerHand += 9;
		 		}
		 		if (PlayerFifthCards == "Ten of Hearts") {
		 			PlayerHand += 10;
		 		}
		 		if (PlayerFifthCards == "Jack of Hearts") {
		 			PlayerHand += 10;
		 		}
		 		if (PlayerFifthCards == "Queen of Hearts") {
		 			PlayerHand += 10;
		 		}
		 		if (PlayerFifthCards == "King of Hearts") {
		 			PlayerHand += 10;
		 		}
		 		if (PlayerFifthCards == "Ace of Spades"){
		 			if ((PlayerHand + 11)  > 21) {
		 		        PlayerHand += 1;
		 			}
		 		   else {
				        PlayerHand += 11;
		 		   }
		 		}
		 		if (PlayerFifthCards == "Two of Spades") {
		 			PlayerHand += 2;
		 		}
		 		if (PlayerFifthCards == "Three of Spades") {
		 			PlayerHand += 3;
		 		}
		 		if (PlayerFifthCards == "Four of Spades") {
		 			PlayerHand += 4;
		 		}
		 		if (PlayerFifthCards == "Five of Spades") {
		 			PlayerHand += 5;
		 		}
		 		if (PlayerFifthCards == "Six of Spades") {
		 			PlayerHand += 6;
		 		}
		 		if (PlayerFifthCards == "Seven of Spades") {
		 			PlayerHand += 7;
		 		}
		 		if (PlayerFifthCards == "Eight of Spades") {
		 			PlayerHand += 8;
		 		}
		 		if (PlayerFifthCards == "Nine of Spades") {
		 			PlayerHand += 9;
		 		}
		 		if (PlayerFifthCards == "Ten of Spades") {
		 			PlayerHand += 10;
		 		}
		 		if (PlayerFifthCards == "Jack of Spades") {
		 			PlayerHand += 10;
		 		}
		 		if (PlayerFifthCards == "Queen of Spades") {
		 			PlayerHand += 10;
		 		}
		 		if (PlayerFifthCards == "King of Spades") {
		 			PlayerHand += 10;
		 		}

	//	 		JOptionPane.showMessageDialog(null, "Your hand is " + PlayerHand);
		 		BlackJack.SetLblPlayerHand(PlayerHand);
		 		
		 		if (PlayerHand == 21) {
		 			BlackJack.TensionSound.stop();
		 			BlackJack.WinSound();
		 			BlackJack.CoinsSound();
		 			JOptionPane.showMessageDialog(null, "Congratulations!!!!! You Won!!!! ");
		 			PlayerWins += 1;
		 			BlackJack.SetLblPlayerWins(PlayerWins);
		 			BlackJack.SetLblDealerWins(DealerWins);
		 			BlackJack.setBtnHit(GameEnd = false);
		 	 		BlackJack.setBtnStand(GameEnd = false);
		 	 		BetValue += Bet;
		 	 		BetValue2 -= Bet;
		 	 		BlackJack.SetLblPWallet(BetValue);
		 	 		BlackJack.SetLblDWallet(BetValue2);
		 	 		if(BetValue <= 0 || BetValue2 <= 0) {
		 	 			BlackJack.setBtnPlay(GameEnd = false);
		 	 			BlackJack.btnNewGame.setEnabled(true);
		 	 			if(BetValue <= 0) {
		 	 				BlackJack.GameOverSound();
		 	 				JOptionPane.showMessageDialog(null, "Sorry you can't play anymore because your wallet is empty");
		 	 			}
		 	 			else if(BetValue2 <= 0){
		 	 				BlackJack.LevelWinSound();
		 	 				JOptionPane.showMessageDialog(null, "Congratulations you won the dealer, his wallet is empty");
		 	 			}
		 	 		}
		 	 		else {
		 	 			BlackJack.setBtnPlay(GameEnd = true);
		 	 		}
		 	 		ClearPandDHand();


		 		}
		 		else if (PlayerHand > 21) {
		 			BlackJack.TensionSound.stop();
		 			BlackJack.LoseSound();
		 			BlackJack.LoseSound();
					JOptionPane.showMessageDialog(null, "GameOver.... The Dealer wins!");
					DealerWins += 1;
					BlackJack.SetLblPlayerWins(PlayerWins);
		 			BlackJack.SetLblDealerWins(DealerWins);
					BlackJack.setBtnHit(GameEnd = false);
		 	 		BlackJack.setBtnStand(GameEnd = false);
		 	 		BetValue2 += Bet;
		 	 		BetValue -= Bet;
					BlackJack.SetLblDWallet(BetValue2);
					BlackJack.SetLblPWallet(BetValue);
					if(BetValue <= 0 || BetValue2 <= 0) {
		 	 			BlackJack.setBtnPlay(GameEnd = false);
		 	 			BlackJack.btnNewGame.setEnabled(true);
		 	 			if(BetValue <= 0) {
		 	 				BlackJack.GameOverSound();
		 	 				JOptionPane.showMessageDialog(null, "Sorry you can't play anymore because your wallet is empty");
		 	 			}
		 	 			else if(BetValue2 <= 0){
		 	 				BlackJack.LevelWinSound();
		 	 				JOptionPane.showMessageDialog(null, "Congratulations you won the dealer, his wallet is empty");
		 	 			}
		 	 		}
		 	 		else {
		 	 			BlackJack.setBtnPlay(GameEnd = true);
		 	 		}
					ClearPandDHand();


				}
		 	
		}
	
	
		
	}
 	
	
	
	
	public static void DisplayDealerThirdCards() {
		
		// *******************************************************************************************************************************************************
			// Method                  :   	DisplaysDealerThirdCards
			//
			// Method  parameters      :    None
			// 
			// Method return           :    void
			//
			// Synopsis                :    This method Displays Dealer Third Card
			//
			// Modifications           :    
			//                              Date           Developer              Notes
			//                             ------         -----------            -------
			//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
	        //
			//*********************************************************************************************************************************************************

		/*Condition that Displays the DealerThirdCards and Increments DealerHand*/
		
		if (DealerHand < 21 && DealerHand < PlayerHand || DealerHand == PlayerHand) {
			
			Random rand = new Random();
	 		int TemporaryCardIndex20 = 0;
	 		
	 		TemporaryCardIndex20 = rand.nextInt(51);
	 		DealerThirdCards = DeckOfCards[TemporaryCardIndex20];
	 		
	        if (DealerThirdCards == PlayerFirstCards || DealerThirdCards == PlayerSecondCards || DealerThirdCards == DealerFirstCards || DealerThirdCards == DealerSecondCards || DealerThirdCards == PlayerThirdCards || DealerThirdCards == PlayerFourthCards || DealerThirdCards == PlayerFifthCards) {
				
				do {
					Random random = new Random();
					
					TemporaryCardIndex20 = rand.nextInt(51);
					DealerThirdCards = DeckOfCards[TemporaryCardIndex20];
				}while (DealerThirdCards == PlayerFirstCards || DealerThirdCards == PlayerSecondCards || DealerThirdCards == DealerFirstCards || DealerThirdCards == DealerSecondCards || DealerThirdCards == PlayerThirdCards || DealerThirdCards == PlayerFourthCards || DealerThirdCards == PlayerFifthCards );
				
	//			JOptionPane.showMessageDialog(null, "The Dealer Third card is " + DealerThirdCards);
				ImageIcon image = DeterminingCardImage(DealerThirdCards);
				BlackJack.CardSound();
				BlackJack.SetLblDealerThirdCards(image);

			}
	        
	        else {
	     		
	//        	JOptionPane.showMessageDialog(null, "The Dealer Third card is " + DealerThirdCards); 
	        	ImageIcon image = DeterminingCardImage(DealerThirdCards);
	        	BlackJack.CardSound();
	        	BlackJack.SetLblDealerThirdCards(image);
	        }
	        
	        
	        if (DealerThirdCards == "Ace of Clubs"){
	        	if ((DealerHand + 11)  > 21) {
	 		        DealerHand += 1;
	 			}
	 		   else {
			        DealerHand += 11;
	 		   }
	 		}
	 		if (DealerThirdCards == "Two of Clubs") {
	 			DealerHand += 2;
	 		}
	 		if (DealerThirdCards == "Three of Clubs") {
	 			DealerHand += 3;
	 		}
	 		if (DealerThirdCards == "Four of Clubs") {
	 			DealerHand += 4;
	 		}
	 	    if (DealerThirdCards == "Five of Clubs") {
	 			DealerHand += 5;
	 		}
	 		if (DealerThirdCards == "Six of Clubs") {
	 			DealerHand += 6;
	 		}
	 		if (DealerThirdCards == "Seven of Clubs") {
	 			DealerHand += 7;
	 		}
	 		if (DealerThirdCards == "Eight of Clubs") {
	 			DealerHand += 8;
	 		}
	 		if (DealerThirdCards == "Nine of Clubs") {
	 			DealerHand += 9;
	 		}
	 		if (DealerThirdCards == "Ten of Clubs") {
	 			DealerHand += 10;
	 		}
	 		if (DealerThirdCards == "Jack of Clubs") {
	 			DealerHand += 10;
	 		}
	 		if (DealerThirdCards == "Queen of Clubs") {
	 			DealerHand += 10;
	 		}
	 		if (DealerThirdCards == "King of Clubs") {
	 			DealerHand += 10;
	 		}
	 		if (DealerThirdCards == "Ace of Diamonds"){
	 			if ((DealerHand + 11)  > 21) {
	 		        DealerHand += 1;
	 			}
	 		   else {
			        DealerHand += 11;
	 		   }
	 		}
	 		if (DealerThirdCards == "Two of Diamonds") {
	 			DealerHand += 2;
	 		}
	 		if (DealerThirdCards == "Three of Diamonds") {
	 			DealerHand += 3;
	 		}
	 		if (DealerThirdCards == "Four of Diamonds") {
	 			DealerHand += 4;
	 		}
	 		if (DealerThirdCards == "Five of Diamonds") {
	 			DealerHand += 5;
	 		}
	 		if (DealerThirdCards == "Six of Diamonds") {
	 			DealerHand += 6;
	 		}
	 		if (DealerThirdCards == "Seven of Diamonds") {
	 			DealerHand += 7;
	 		}
	 		if (DealerThirdCards == "Eight of Diamonds") {
	 			DealerHand += 8;
	 		}
	 		if (DealerThirdCards == "Nine of Diamonds") {
	 			DealerHand += 9;
	 		}
	 		if (DealerThirdCards == "Ten of Diamonds") {
	 			DealerHand += 10;
	 		}
	 		if (DealerThirdCards == "Jack of Diamonds") {
	 			DealerHand += 10;
	 		}
	 		if (DealerThirdCards == "Queen of Diamonds") {
	 			DealerHand += 10;
	 		}
	 		if (DealerThirdCards == "King of Diamonds") {
	 			DealerHand += 10;
	 		}
	 		if (DealerThirdCards == "Ace of Hearts"){
	 			if ((DealerHand + 11)  > 21) {
	 		        DealerHand += 1;
	 			}
	 		   else {
			        DealerHand += 11;
	 		   }
	 		}
	 		if (DealerThirdCards == "Two of Hearts") {
	 			DealerHand += 2;
	 		}
	 		if (DealerThirdCards == "Three of Hearts") {
	 			DealerHand += 3;
	 		}
	 		if (DealerThirdCards == "Four of Hearts") {
	 			DealerHand += 4;
	 		}
	 		if (DealerThirdCards == "Five of Hearts") {
	 			DealerHand += 5;
	 		}
	 		if (DealerThirdCards == "Six of Hearts") {
	 			DealerHand += 6;
	 		}
	 		if (DealerThirdCards == "Seven of Hearts") {
	 			DealerHand += 7;
	 		}
	 		if (DealerThirdCards == "Eight of Hearts") {
	 			DealerHand += 8;
	 		}
	 		if (DealerThirdCards == "Nine of Hearts") {
	 			DealerHand += 9;
	 		}
	 		if (DealerThirdCards == "Ten of Hearts") {
	 			DealerHand += 10;
	 		}
	 		if (DealerThirdCards == "Jack of Hearts") {
	 			DealerHand += 10;
	 		}
	 		if (DealerThirdCards == "Queen of Hearts") {
	 			DealerHand += 10;
	 		}
	 		if (DealerThirdCards == "King of Hearts") {
	 			DealerHand += 10;
	 		}
	 		if (DealerThirdCards == "Ace of Spades"){
	 			if ((DealerHand + 11)  > 21) {
	 		        DealerHand += 1;
	 			}
	 		   else {
			        DealerHand += 11;
	 		   }
	 		}
	 		if (DealerThirdCards == "Two of Spades") {
	 			DealerHand += 2;
	 		}
	 		if (DealerThirdCards == "Three of Spades") {
	 			DealerHand += 3;
	 		}
	 		if (DealerThirdCards == "Four of Spades") {
	 			DealerHand += 4;
	 		}
	 		if (DealerThirdCards == "Five of Spades") {
	 			DealerHand += 5;
	 		}
	 		if (DealerThirdCards == "Six of Spades") {
	 			DealerHand += 6;
	 		}
	 		if (DealerThirdCards == "Seven of Spades") {
	 			DealerHand += 7;
	 		}
	 		if (DealerThirdCards == "Eight of Spades") {
	 			DealerHand += 8;
	 		}
	 		if (DealerThirdCards == "Nine of Spades") {
	 			DealerHand += 9;
	 		}
	 		if (DealerThirdCards == "Ten of Spades") {
	 			DealerHand += 10;
	 		}
	 		if (DealerThirdCards == "Jack of Spades") {
	 			DealerHand += 10;
	 		}
	 		if (DealerThirdCards == "Queen of Spades") {
	 			DealerHand += 10;
	 		}
	 		if (DealerThirdCards == "King of Spades") {
	 			DealerHand += 10;
	 		}

	 //		JOptionPane.showMessageDialog(null, "The Dealer hand is " + DealerHand);
	 		BlackJack.SetLblDealerHand(DealerHand);
	 		
	 		if (DealerHand == 21) {
	 			BlackJack.TensionSound.stop();
	 			BlackJack.LoseSound();
	 			BlackJack.LoseSound();
	 			JOptionPane.showMessageDialog(null, "GameOver.... The Dealer wins!");
	 			DealerWins += 1;		// Increments DealerWins by 1
				BlackJack.SetLblPlayerWins(PlayerWins);
	 			BlackJack.SetLblDealerWins(DealerWins);
	 			BetValue2 += Bet;
	 	 		BetValue -= Bet;
				BlackJack.SetLblDWallet(BetValue2);
				BlackJack.SetLblPWallet(BetValue);
	 			

	 		}
	 		else if (DealerHand > 21) {
	 			BlackJack.TensionSound.stop();
	 			BlackJack.WinSound();
	 			BlackJack.CoinsSound();
	 			JOptionPane.showMessageDialog(null, "Congratulations!!!!! You Won!!!! ");		// Displays Congratulations!!!!! You Won!!!!
	 			PlayerWins += 1;	// Increments PlayerWins by 1
	 			BlackJack.SetLblPlayerWins(PlayerWins);
	 			BlackJack.SetLblDealerWins(DealerWins);
	 			BetValue += Bet;
	 	 		BetValue2 -= Bet;
	 	 		BlackJack.SetLblPWallet(BetValue);
	 	 		BlackJack.SetLblDWallet(BetValue2);

			}
	 		
			

		}
		
	}

	





	
	public static void DisplayDealerFourthCards() {

		
			// *******************************************************************************************************************************************************
			// Method                  :   	DisplaysDealerFourthCards
			//
			// Method  parameters      :    None
			// 
			// Method return           :    void
			//
			// Synopsis                :    This method Displays Dealer Fourth Card
			//
			// Modifications           :    
			//                              Date           Developer              Notes
			//                             ------         -----------            -------
			//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
	        //
			//*********************************************************************************************************************************************************
	
	
		/*Condition that Displays DealerFourthCards and Increments the DealerHand*/
		
		if (DealerHand < 21 && DealerHand < PlayerHand || DealerHand == PlayerHand) {
			Random rand = new Random();
	 		int TemporaryCardIndex21 = 0;
	 		
	 		TemporaryCardIndex21 = rand.nextInt(51);
	 		DealerFourthCards = DeckOfCards[TemporaryCardIndex21];
	 		
	        if (DealerFourthCards == PlayerFirstCards || DealerFourthCards == PlayerSecondCards || DealerFourthCards == DealerFirstCards || DealerFourthCards == DealerSecondCards || DealerFourthCards == DealerThirdCards || DealerFourthCards == PlayerThirdCards || DealerFourthCards == PlayerFourthCards || DealerFourthCards == PlayerFifthCards) {
				
				do {
					Random random = new Random();
					
					TemporaryCardIndex21 = rand.nextInt(51);
					DealerFourthCards = DeckOfCards[TemporaryCardIndex21];
				}while (DealerFourthCards == PlayerFirstCards || DealerFourthCards == PlayerSecondCards || DealerFourthCards == DealerFirstCards || DealerFourthCards == DealerSecondCards || DealerFourthCards == DealerThirdCards || DealerFourthCards == PlayerThirdCards || DealerFourthCards == PlayerFourthCards || DealerFourthCards == PlayerFifthCards );
				
		//		JOptionPane.showMessageDialog(null, "The Dealer Fourth card is " + DealerFourthCards);
				ImageIcon image = DeterminingCardImage(DealerFourthCards);
				BlackJack.CardSound();
				BlackJack.SetLblDealerFourthCards(image);

			}
	        
	        else {
	     		
	    //    	JOptionPane.showMessageDialog(null, "The Dealer Fourth card is " + DealerThirdCards); 
	        	ImageIcon image = DeterminingCardImage(DealerFourthCards);
	        	BlackJack.CardSound();
	        	BlackJack.SetLblDealerFourthCards(image);
	        }
	        
	        
	        if (DealerFourthCards == "Ace of Clubs"){
	        	if ((DealerHand + 11)  > 21) {
	 		        DealerHand += 1;
	 			}
	 		   else {
			        DealerHand += 11;
	 		   }
	 		}
	 		if (DealerFourthCards == "Two of Clubs") {
	 			DealerHand += 2;
	 		}
	 		if (DealerFourthCards == "Three of Clubs") {
	 			DealerHand += 3;
	 		}
	 		if (DealerFourthCards == "Four of Clubs") {
	 			DealerHand += 4;
	 		}
	 	    if (DealerFourthCards == "Five of Clubs") {
	 			DealerHand += 5;
	 		}
	 		if (DealerFourthCards == "Six of Clubs") {
	 			DealerHand += 6;
	 		}
	 		if (DealerFourthCards == "Seven of Clubs") {
	 			DealerHand += 7;
	 		}
	 		if (DealerFourthCards == "Eight of Clubs") {
	 			DealerHand += 8;
	 		}
	 		if (DealerFourthCards == "Nine of Clubs") {
	 			DealerHand += 9;
	 		}
	 		if (DealerFourthCards == "Ten of Clubs") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFourthCards == "Jack of Clubs") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFourthCards == "Queen of Clubs") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFourthCards == "King of Clubs") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFourthCards == "Ace of Diamonds"){
	 			if ((DealerHand + 11)  > 21) {
	 		        DealerHand += 1;
	 			}
	 		   else {
			        DealerHand += 11;
	 		   }
	 		}
	 		if (DealerFourthCards == "Two of Diamonds") {
	 			DealerHand += 2;
	 		}
	 		if (DealerFourthCards == "Three of Diamonds") {
	 			DealerHand += 3;
	 		}
	 		if (DealerFourthCards == "Four of Diamonds") {
	 			DealerHand += 4;
	 		}
	 		if (DealerFourthCards == "Five of Diamonds") {
	 			DealerHand += 5;
	 		}
	 		if (DealerFourthCards == "Six of Diamonds") {
	 			DealerHand += 6;
	 		}
	 		if (DealerFourthCards == "Seven of Diamonds") {
	 			DealerHand += 7;
	 		}
	 		if (DealerFourthCards == "Eight of Diamonds") {
	 			DealerHand += 8;
	 		}
	 		if (DealerFourthCards == "Nine of Diamonds") {
	 			DealerHand += 9;
	 		}
	 		if (DealerFourthCards == "Ten of Diamonds") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFourthCards == "Jack of Diamonds") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFourthCards == "Queen of Diamonds") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFourthCards == "King of Diamonds") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFourthCards == "Ace of Hearts"){
	 			if ((DealerHand + 11)  > 21) {
	 		        DealerHand += 1;
	 			}
	 		   else {
			        DealerHand += 11;
	 		   }
	 		}
	 		if (DealerFourthCards == "Two of Hearts") {
	 			DealerHand += 2;
	 		}
	 		if (DealerFourthCards == "Three of Hearts") {
	 			DealerHand += 3;
	 		}
	 		if (DealerFourthCards == "Four of Hearts") {
	 			DealerHand += 4;
	 		}
	 		if (DealerFourthCards == "Five of Hearts") {
	 			DealerHand += 5;
	 		}
	 		if (DealerFourthCards == "Six of Hearts") {
	 			DealerHand += 6;
	 		}
	 		if (DealerFourthCards == "Seven of Hearts") {
	 			DealerHand += 7;
	 		}
	 		if (DealerFourthCards == "Eight of Hearts") {
	 			DealerHand += 8;
	 		}
	 		if (DealerFourthCards == "Nine of Hearts") {
	 			DealerHand += 9;
	 		}
	 		if (DealerFourthCards == "Ten of Hearts") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFourthCards == "Jack of Hearts") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFourthCards == "Queen of Hearts") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFourthCards == "King of Hearts") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFourthCards == "Ace of Spades"){
	 			if ((DealerHand + 11)  > 21) {
	 		        DealerHand += 1;
	 			}
	 		   else {
			        DealerHand += 11;
	 		   }
	 		}
	 		if (DealerFourthCards == "Two of Spades") {
	 			DealerHand += 2;
	 		}
	 		if (DealerFourthCards == "Three of Spades") {
	 			DealerHand += 3;
	 		}
	 		if (DealerFourthCards == "Four of Spades") {
	 			DealerHand += 4;
	 		}
	 		if (DealerFourthCards == "Five of Spades") {
	 			DealerHand += 5;
	 		}
	 		if (DealerFourthCards == "Six of Spades") {
	 			DealerHand += 6;
	 		}
	 		if (DealerFourthCards == "Seven of Spades") {
	 			DealerHand += 7;
	 		}
	 		if (DealerFourthCards == "Eight of Spades") {
	 			DealerHand += 8;
	 		}
	 		if (DealerFourthCards == "Nine of Spades") {
	 			DealerHand += 9;
	 		}
	 		if (DealerFourthCards == "Ten of Spades") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFourthCards == "Jack of Spades") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFourthCards == "Queen of Spades") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFourthCards == "King of Spades") {
	 			DealerHand += 10;
	 		}

	 //		JOptionPane.showMessageDialog(null, "The Dealer hand is " + DealerHand);
	 		BlackJack.SetLblDealerHand(DealerHand);
	 		
	 		if (DealerHand == 21) {
	 			BlackJack.TensionSound.stop();
	 			BlackJack.LoseSound();
	 			BlackJack.LoseSound();
	 			JOptionPane.showMessageDialog(null, "GameOver.... The Dealer wins!");
	 			DealerWins += 1;		// Increments PlayerWins by 1
				BlackJack.SetLblPlayerWins(PlayerWins);
	 			BlackJack.SetLblDealerWins(DealerWins);
	 			BetValue2 += Bet;
	 	 		BetValue -= Bet;
				BlackJack.SetLblDWallet(BetValue2);
				BlackJack.SetLblPWallet(BetValue);

	 		}
	 		else if (DealerHand > 21) {
	 			BlackJack.TensionSound.stop();
	 			BlackJack.WinSound();
	 			BlackJack.CoinsSound();
	 			JOptionPane.showMessageDialog(null, "Congratulations!!!!! You Won!!!! ");		// Displays Congratulations!!!!! You Won!!!!
	 			PlayerWins += 1;		// Increments DealerWins by 1
	 			BlackJack.SetLblPlayerWins(PlayerWins);
	 			BlackJack.SetLblDealerWins(DealerWins);
	 			BetValue += Bet;
	 	 		BetValue2 -= Bet;
	 	 		BlackJack.SetLblPWallet(BetValue);
	 	 		BlackJack.SetLblDWallet(BetValue2);

			}	
	 		
			
		}
		
	}

	public static void DisplayDealerFifthCards() {
 		
			// *******************************************************************************************************************************************************
			// Method                  :   	DisplaysDealerFifthCards
			//
			// Method  parameters      :    None
			// 
			// Method return           :    void
			//
			// Synopsis                :    This method Displays Dealer Fifth Card
			//
			// Modifications           :    
			//                              Date           Developer              Notes
			//                             ------         -----------            -------
			//                  		  2022-04-08      Larry Kemmo  		Initial setup and commenting
	        //
			//*********************************************************************************************************************************************************
		
		/*Condition that Displays DealerFifthCards and Increments the DealerHand*/
		
		if (DealerHand < 21 && DealerHand < PlayerHand || DealerHand == PlayerHand) {
			
			Random rand = new Random();
	 		int TemporaryCardIndex22 = 0;
	 		
	 		TemporaryCardIndex22 = rand.nextInt(51);
	 		DealerFifthCards = DeckOfCards[TemporaryCardIndex22];
	 		
	        if (DealerFifthCards == PlayerFirstCards || DealerFifthCards == PlayerSecondCards || DealerFifthCards == DealerFirstCards || DealerFifthCards == DealerSecondCards || DealerFifthCards == DealerThirdCards || DealerFifthCards == DealerFourthCards || DealerFifthCards == PlayerThirdCards || DealerFifthCards == PlayerFourthCards || DealerFifthCards == PlayerFifthCards) {
				
				do {
					Random random = new Random();
					
					TemporaryCardIndex22 = rand.nextInt(51);
					DealerFifthCards = DeckOfCards[TemporaryCardIndex22];
				}while (DealerFifthCards == PlayerFirstCards || DealerFifthCards == PlayerSecondCards || DealerFifthCards == DealerFirstCards || DealerFifthCards == DealerSecondCards || DealerFifthCards == DealerThirdCards || DealerFifthCards == DealerFourthCards || DealerFifthCards == PlayerThirdCards || DealerFifthCards == PlayerFourthCards || DealerFifthCards == PlayerFifthCards );
				
		//		JOptionPane.showMessageDialog(null, "The Dealer Fifth card is " + DealerFifthCards);
				ImageIcon image = DeterminingCardImage(DealerFifthCards);
				BlackJack.CardSound();
				BlackJack.SetLblDealerFifthCards(image);

			}
	        
	        else {
	     		
	    //    	JOptionPane.showMessageDialog(null, "The Dealer Fifth card is " + DealerFifthCards); 
	        	ImageIcon image = DeterminingCardImage(DealerFifthCards);
	        	BlackJack.CardSound();
	        	BlackJack.SetLblDealerFifthCards(image);
	        }
	        
	        
	        if (DealerFifthCards == "Ace of Clubs"){
	        	if ((DealerHand + 11)  > 21) {
	 		        DealerHand += 1;
	 			}
	 		   else {
			        DealerHand += 11;
	 		   }
	 		}
	 		if (DealerFifthCards == "Two of Clubs") {
	 			DealerHand += 2;
	 		}
	 		if (DealerFifthCards == "Three of Clubs") {
	 			DealerHand += 3;
	 		}
	 		if (DealerFifthCards == "Four of Clubs") {
	 			DealerHand += 4;
	 		}
	 	    if (DealerFifthCards == "Five of Clubs") {
	 			DealerHand += 5;
	 		}
	 		if (DealerFifthCards == "Six of Clubs") {
	 			DealerHand += 6;
	 		}
	 		if (DealerFifthCards == "Seven of Clubs") {
	 			DealerHand += 7;
	 		}
	 		if (DealerFifthCards == "Eight of Clubs") {
	 			DealerHand += 8;
	 		}
	 		if (DealerFifthCards == "Nine of Clubs") {
	 			DealerHand += 9;
	 		}
	 		if (DealerFifthCards == "Ten of Clubs") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFifthCards == "Jack of Clubs") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFifthCards == "Queen of Clubs") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFifthCards == "King of Clubs") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFifthCards == "Ace of Diamonds"){
	 			if ((DealerHand + 11)  > 21) {
	 		        DealerHand += 1;
	 			}
	 		   else {
			        DealerHand += 11;
	 		   }
	 		}
	 		if (DealerFifthCards == "Two of Diamonds") {
	 			DealerHand += 2;
	 		}
	 		if (DealerFifthCards == "Three of Diamonds") {
	 			DealerHand += 3;
	 		}
	 		if (DealerFifthCards == "Four of Diamonds") {
	 			DealerHand += 4;
	 		}
	 		if (DealerFifthCards == "Five of Diamonds") {
	 			DealerHand += 5;
	 		}
	 		if (DealerFifthCards == "Six of Diamonds") {
	 			DealerHand += 6;
	 		}
	 		if (DealerFifthCards == "Seven of Diamonds") {
	 			DealerHand += 7;
	 		}
	 		if (DealerFifthCards == "Eight of Diamonds") {
	 			DealerHand += 8;
	 		}
	 		if (DealerFifthCards == "Nine of Diamonds") {
	 			DealerHand += 9;
	 		}
	 		if (DealerFifthCards == "Ten of Diamonds") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFifthCards == "Jack of Diamonds") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFifthCards == "Queen of Diamonds") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFifthCards == "King of Diamonds") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFifthCards == "Ace of Hearts"){
	 			if ((DealerHand + 11)  > 21) {
	 		        DealerHand += 1;
	 			}
	 		   else {
			        DealerHand += 11;
	 		   }
	 		}
	 		if (DealerFifthCards == "Two of Hearts") {
	 			DealerHand += 2;
	 		}
	 		if (DealerFifthCards == "Three of Hearts") {
	 			DealerHand += 3;
	 		}
	 		if (DealerFifthCards == "Four of Hearts") {
	 			DealerHand += 4;
	 		}
	 		if (DealerFifthCards == "Five of Hearts") {
	 			DealerHand += 5;
	 		}
	 		if (DealerFifthCards == "Six of Hearts") {
	 			DealerHand += 6;
	 		}
	 		if (DealerFifthCards == "Seven of Hearts") {
	 			DealerHand += 7;
	 		}
	 		if (DealerFifthCards == "Eight of Hearts") {
	 			DealerHand += 8;
	 		}
	 		if (DealerFifthCards == "Nine of Hearts") {
	 			DealerHand += 9;
	 		}
	 		if (DealerFifthCards == "Ten of Hearts") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFifthCards == "Jack of Hearts") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFifthCards == "Queen of Hearts") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFifthCards == "King of Hearts") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFifthCards == "Ace of Spades"){
	 			if ((DealerHand + 11)  > 21) {
	 		        DealerHand += 1;
	 			}
	 		   else {
			        DealerHand += 11;
	 		   }
	 		}
	 		if (DealerFifthCards == "Two of Spades") {
	 			DealerHand += 2;
	 		}
	 		if (DealerFifthCards == "Three of Spades") {
	 			DealerHand += 3;
	 		}
	 		if (DealerFifthCards == "Four of Spades") {
	 			DealerHand += 4;
	 		}
	 		if (DealerFifthCards == "Five of Spades") {
	 			DealerHand += 5;
	 		}
	 		if (DealerFifthCards == "Six of Spades") {
	 			DealerHand += 6;
	 		}
	 		if (DealerFifthCards == "Seven of Spades") {
	 			DealerHand += 7;
	 		}
	 		if (DealerFifthCards == "Eight of Spades") {
	 			DealerHand += 8;
	 		}
	 		if (DealerFifthCards == "Nine of Spades") {
	 			DealerHand += 9;
	 		}
	 		if (DealerFifthCards == "Ten of Spades") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFifthCards == "Jack of Spades") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFifthCards == "Queen of Spades") {
	 			DealerHand += 10;
	 		}
	 		if (DealerFifthCards == "King of Spades") {
	 			DealerHand += 10;
	 		}

	 //		JOptionPane.showMessageDialog(null, "The Dealer hand is " + DealerHand);
	 		BlackJack.SetLblDealerHand(DealerHand);
	 		
	 		if (DealerHand == 21) {
	 			BlackJack.TensionSound.stop();
	 			BlackJack.LoseSound();
	 			BlackJack.LoseSound();
	 			JOptionPane.showMessageDialog(null, "GameOver.... The Dealer wins!");		// Displays Congratulations!!!!! You Won!!!!
	 			DealerWins += 1;		// Increments PlayerWins by 1
				BlackJack.SetLblPlayerWins(PlayerWins);
	 			BlackJack.SetLblDealerWins(DealerWins);
	 			BetValue2 += Bet;
	 	 		BetValue -= Bet;
				BlackJack.SetLblDWallet(BetValue2);
				BlackJack.SetLblPWallet(BetValue);
	 		}
	 		else if (DealerHand > 21) {
	 			BlackJack.TensionSound.stop();
	 			BlackJack.WinSound();
	 			BlackJack.CoinsSound();
	 			JOptionPane.showMessageDialog(null, "Congratulations!!!!! You Won!!!! ");		// Displays Congratulations!!!!! You Won!!!!
	 			PlayerWins += 1;		// Increments PlayerWins by 1
	 			BlackJack.SetLblPlayerWins(PlayerWins);
	 			BlackJack.SetLblDealerWins(DealerWins);
	 			BetValue += Bet;
	 	 		BetValue2 -= Bet;
	 	 		BlackJack.SetLblPWallet(BetValue);
	 	 		BlackJack.SetLblDWallet(BetValue2);

			}
	 		else if (DealerHand < 21 && DealerHand < PlayerHand) {
	 			BlackJack.TensionSound.stop();
	 			BlackJack.WinSound();
	 			BlackJack.CoinsSound();
				JOptionPane.showMessageDialog(null, "Congratulations!!!!!! You Won");		// Displays Congratulations!!!!! You Won!!!!
				PlayerWins += 1;			// Increments PlayerWins by 1
	 			BlackJack.SetLblPlayerWins(PlayerWins);
	 			BlackJack.SetLblDealerWins(DealerWins);
	 			BetValue += Bet;
	 	 		BetValue2 -= Bet;
	 	 		BlackJack.SetLblPWallet(BetValue);
	 	 		BlackJack.SetLblDWallet(BetValue2);
			}
			
			else if (DealerHand == 21 && PlayerHand == 21) {
				BlackJack.TensionSound.stop();
				BlackJack.WinSound();
				BlackJack.CoinsSound();
				JOptionPane.showMessageDialog(null, "Congratulations!!!!!! You Won");		// Displays Congratulations!!!!! You Won!!!!
				PlayerWins += 1;		// Increments PlayerWins by 1
	 			BlackJack.SetLblPlayerWins(PlayerWins);
	 			BlackJack.SetLblDealerWins(DealerWins);
	 			BetValue += Bet;
	 	 		BetValue2 -= Bet;
	 	 		BlackJack.SetLblPWallet(BetValue);
	 	 		BlackJack.SetLblDWallet(BetValue2);
			}
		}
		if (DealerHand < 21 && DealerHand >PlayerHand) {
			BlackJack.TensionSound.stop();
			BlackJack.LoseSound();
			BlackJack.LoseSound();
			JOptionPane.showMessageDialog(null, "GameOver.... The Dealer wins!");
			DealerWins += 1;
			BlackJack.SetLblPlayerWins(PlayerWins);
 			BlackJack.SetLblDealerWins(DealerWins);
 			BetValue2 += Bet;
 	 		BetValue -= Bet;
			BlackJack.SetLblDWallet(BetValue2);
			BlackJack.SetLblPWallet(BetValue);
		}
		
	}
	
	

		
	
	
}
