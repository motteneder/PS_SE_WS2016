
public class KingInCheck implements Check{
	
	public static final int NONE_IN_CHECK = 0;
	public static final int BLACK_IN_CHECK = 1;
	public static final int WHITE_IN_CHECK = 2;

	public static final String SAMPLE1 = "..k....." 
										+ "ppp.pppp" 
										+ "........"
										+ ".R...B.." 
										+ "........" 
										+ "........"
										+ "PPPPPPPP" 
										+ "K.......";

	public static final String SAMPLE2 = "rnbqkbnr" 
										+ "pppppppp" 
										+ "........" 
										+ "........" 
										+ "........" 
										+ "........"
										+ "PPPPPPPP" 
										+ "RNBQKBNR";
	
	public static final String SAMPLE3 = "rnbqk.nr" 
										+ "ppp..ppp" 
										+ "....p..." 
										+ "...p...." 
										+ ".bPP...." 
										+ ".....N.."
										+ "PP..PPPP" 
										+ "RNBQKB.R";
	
	public int whoIsInCheck(String chessConfiguration) /* throws Exception*/ {
		int indexOfBlackKing = chessConfiguration.indexOf('k');
		int indexOfWhiteKing = chessConfiguration.indexOf('K');
		
		if(Checker.isInCheck(indexOfBlackKing, chessConfiguration)){
			return BLACK_IN_CHECK;
		}
		if(Checker.isInCheck(indexOfWhiteKing, chessConfiguration)){
			return WHITE_IN_CHECK;
		}
		else return NONE_IN_CHECK;
	}
}
