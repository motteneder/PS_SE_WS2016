/*** Interface for assignment 05: Check */

public interface Check {
	
	/**
	 * integer constant for indicating that no king is in check
	 */
	public static final int NONE_IN_CHECK = 0;
	
	/** integer constant for indicating that the black king is in check */
	public static final int BLACK_IN_CHECK = 1;
	
	/**
	 * integer constant for indicating that the white king is in check
	 */
	public static final int WHITE_IN_CHECK = 2;
	
	/**
	 * Sample chess board configurations for testing; The correct return value
	 * for SAMPLE1 is BLACK_IN_CHECK
	 */
	public static final String SAMPLE1 = "..k....." 
										+ "ppp.pppp" 
										+ "........"
										+ ".R...B.." 
										+ "........" 
										+ "........"
										+ "PPPPPPPP" 
										+ "K.......";
	
	/**
	 * Sample chess board configurations for testing; The correct return value
	 * for SAMPLE 2 is NONE_IN_CHECK
	 */
	public static final String SAMPLE2 = "rnbqkbnr" 
										+ "pppppppp" 
										+ "........" 
										+ "........" 
										+ "........" 
										+ "........"
										+ "PPPPPPPP" 
										+ "RNBQKBNR";
	
	/**
	 * Sample chess board configurations for testing; The correct return value
	 * for SAMPLE 3 is WHITE_IN_CHECK
	 */
	
	public static final String SAMPLE3 = "rnbqk.nr" 
										+ "ppp..ppp" 
										+ "....p..." 
										+ "...p...." 
										+ ".bPP...." 
										+ ".....N.."
										+ "PP..PPPP" 
										+ "RNBQKB.R";

	/**
	 * Checks if a king is in check in the supplied chess board configuration;
	 *
	 * @param chessConfiguration
	 *            A 64 character String containing a chess board configuration
	 *            (see SAMPLEx);
	 * @return one of the predefined integer values NONE_IN_CHECK,
	 *         BLACK_IN_CHECK or WHITE_IN_CHECK.
	 * @throws Exception
	 *             if anything goes wrong
	 */
	public int whoIsInCheck(String chessConfiguration) /* throws Exception */;
}