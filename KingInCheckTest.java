import static org.junit.Assert.*;

import org.junit.Test;

public class KingInCheckTest {

	@Test
	public final void test() {
		KingInCheck inCheck = new KingInCheck();
		String kInCheckbyP = "........" 
							+ "ppp.pppp" 
							+ "........"
							+ ".R...B.." 
							+ "........" 
							+ "....k..."
							+ "PPPPPPPP" 
							+ "K.......";
		
		String KInCheckbyp = "rnbqkbnr" 
							+ "ppppp.pp" 
							+ "........" 
							+ ".....p.." 
							+ "....P.K." 
							+ "........"
							+ "PPPP.PPP" 
							+ "RNBQ.BNR";
		
		String kInCheckbyQ = "rnbqkbnr"   //vertically
							+ "pppp.ppp" 
							+ "........" 
							+ "........" 
							+ "........" 
							+ "........"
							+ "PPPPQPPP" 
							+ "RNB.KBNR";
		
		String KInCheckbyq =  "rnb.kbnr" // vertically
							+ "ppppqppp" 
							+ "........" 
							+ "...P...." 
							+ "........" 
							+ "........"
							+ "PPPP.PPP" 
							+ "RNBQKBNR";
							
		String KInCheckbyb  = "rnbqk.nr" 
							+ "ppppp..p" 
							+ "........" 
							+ ".....PP." 
							+ "......Pb" 
							+ "........"
							+ "PPPP...P" 
							+ "RNBQKBNR";
		
		String kInCheckbyB =  "rnbqkbnr" 
							+ "ppp..ppp" 
							+ "........" 
							+ ".B..p..." 
							+ "........" 
							+ "........"
							+ "PPPP.PPP" 
							+ "RNBQK.NR";
		
		String kInCheckbyR = "rnbq.bnr" // horizontally
							+ "ppp.pppp" 
							+ "P......." 
							+ "R..k...." 
							+ "...p...." 
							+ "........"
							+ ".PPPPPPP" 
							+ ".NBQKBNR";

		String KInCheckbyr =  ".nbqkbnr"  // horizontally
							+ ".ppppppp" 
							+ "........" 
							+ "....P..." 
							+ "r...K..." 
							+ "p......."
							+ "PPPP.PPP" 
							+ "RNBQKBNR";
		
		String kInCheckbyN =  "rnbq.bnr" 
							+ "pppp.ppp" 
							+ "........" 
							+ "........" 
							+ ".....k.." 
							+ "....P..N"
							+ "PPPPP.PP" 
							+ "RNBQKB.R";
		String KInCheckbyn =  "rnbqkb.r" 
							+ "ppppp.pp" 
							+ "....p..." 
							+ "........" 
							+ "........" 
							+ ".....n.."
							+ "PPPP.PPP" 
							+ "RNBQKBNR";
		
		assertEquals(1, inCheck.whoIsInCheck(KingInCheck.SAMPLE1));
		assertEquals(0, inCheck.whoIsInCheck(KingInCheck.SAMPLE2));
		assertEquals(2, inCheck.whoIsInCheck(KingInCheck.SAMPLE3));
		
		assertEquals(1, inCheck.whoIsInCheck(kInCheckbyP));
		assertEquals(2, inCheck.whoIsInCheck(KInCheckbyp));
		assertEquals(1, inCheck.whoIsInCheck(kInCheckbyQ));
		assertEquals(2, inCheck.whoIsInCheck(KInCheckbyq));
		assertEquals(1, inCheck.whoIsInCheck(kInCheckbyB));
		assertEquals(2, inCheck.whoIsInCheck(KInCheckbyb));
		assertEquals(1, inCheck.whoIsInCheck(kInCheckbyR));
		assertEquals(2, inCheck.whoIsInCheck(KInCheckbyr));
		assertEquals(1, inCheck.whoIsInCheck(kInCheckbyN));
		assertEquals(2, inCheck.whoIsInCheck(KInCheckbyn));
	}

}
