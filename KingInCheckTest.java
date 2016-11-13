import static org.junit.Assert.*;

import org.junit.Test;

public class KingInCheckTest {
	
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
	
	@Test
	public final void testSample1() {
		assertEquals(1, inCheck.whoIsInCheck(KingInCheck.SAMPLE1));
	}

	@Test
	public final void testSample2() {
		assertEquals(0, inCheck.whoIsInCheck(KingInCheck.SAMPLE2));
	}
	
	@Test
	public final void testSample3() {
		assertEquals(2, inCheck.whoIsInCheck(KingInCheck.SAMPLE3));
	}

	@Test
	public final void testP() {
		assertEquals(1, inCheck.whoIsInCheck(kInCheckbyP));
	}
	
	@Test
	public final void testp() {
		assertEquals(2, inCheck.whoIsInCheck(KInCheckbyp));
	}
	
	@Test
	public final void testQ() {
		assertEquals(1, inCheck.whoIsInCheck(kInCheckbyQ));
	}
	
	@Test
	public final void testq() {
		assertEquals(2, inCheck.whoIsInCheck(KInCheckbyq));
	}
	
	@Test
	public final void testB() {
		assertEquals(1, inCheck.whoIsInCheck(kInCheckbyB));
	}
	
	@Test
	public final void testb() {
		assertEquals(2, inCheck.whoIsInCheck(KInCheckbyb));
	}
	
	@Test
	public final void testR() {
		assertEquals(1, inCheck.whoIsInCheck(kInCheckbyR));
	}
	
	@Test
	public final void testr() {
		assertEquals(2, inCheck.whoIsInCheck(KInCheckbyr));
	}	
	
	@Test
	public final void testN() {
		assertEquals(1, inCheck.whoIsInCheck(kInCheckbyN));
	}	
	
	@Test
	public final void testn() {
		assertEquals(2, inCheck.whoIsInCheck(KInCheckbyn));
	}
}
