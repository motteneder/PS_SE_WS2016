public class Checker {
	
	public static boolean isInCheck(int indexOfKing, String chessBoard){
		char[] firstDiagonal = 	  {'e','e','e','e','e','e','e','e'};
		char[] secondDiagonal =   {'e','e','e','e','e','e','e','e'};
		char[] thirdDiagonal = 	  {'e','e','e','e','e','e','e','e'};
		char[] fourthDiagonal =   {'e','e','e','e','e','e','e','e'};
		char[] knight = 		  {'e','e','e','e','e','e','e','e'};
		char[] firstVertical = 	  {'e','e','e','e','e','e','e','e'};
		char[] secondVertical =   {'e','e','e','e','e','e','e','e'};
		char[] firstHorizontal =  {'e','e','e','e','e','e','e','e'};
		char[] secondHorizontal = {'e','e','e','e','e','e','e','e'};
		char king;
		
		// first diagonal (down right)
		for(int i=0; i<8; i++){
			if(indexOfKing + i*9 < 64){
				firstDiagonal[i] = chessBoard.charAt(indexOfKing + i*9);
			}
			if(indexOfKing + i*9 == 15 || indexOfKing + i*9 == 23 ||	// if diagonal reaches the boarder of the chess board, break
			   indexOfKing + i*9 == 31 || indexOfKing + i*9 == 39 ||
			   indexOfKing + i*9 == 47 || indexOfKing + i*9 == 55){
				break;
			}
		}

		// second diagonal (down left)
		for(int i=0; i<8; i++){
			if(indexOfKing + i*7 < 64){
				secondDiagonal[i] = chessBoard.charAt(indexOfKing + i*7);
			}
			if(indexOfKing + i*7 == 8 || indexOfKing + i*7 == 16 ||	// if diagonal reaches the boarder of the chess board, break
			   indexOfKing + i*7 == 24 || indexOfKing + i*7 == 32 ||
			   indexOfKing + i*7 == 40 || indexOfKing + i*7 == 48){
				break;
			}
		}
		// third diagonal (up right)
		for(int i=0; i<8; i++){
			if(indexOfKing - i*7 >= 0){
				thirdDiagonal[i] = chessBoard.charAt(indexOfKing - i*7);
			}
			if(indexOfKing - i*7 == 15 || indexOfKing - i*7 == 23 ||	// if diagonal reaches the boarder of the chess board, break
			   indexOfKing - i*7 == 31 || indexOfKing - i*7 == 39 ||
			   indexOfKing - i*7 == 47 || indexOfKing - i*7 == 55){
				break;
			}
		}
		
		// fourth diagonal (up left)	
		for(int i=0; i<8; i++){
			if(indexOfKing - i*9 >= 0){
				fourthDiagonal[i] = chessBoard.charAt(indexOfKing - i*9);
			}
			if(indexOfKing - i*9 == 8 || indexOfKing - i*9 == 16 ||	// if diagonal reaches the boarder of the chess board, break
			   indexOfKing - i*9 == 24 || indexOfKing - i*9 == 32 ||
			   indexOfKing - i*9 == 40 || indexOfKing - i*9 == 48){
				break;
			}
		}
		
		// fields where a knight could endanger the king.	
		if(indexOfKing - 17 >= 0){
			knight[0] = chessBoard.charAt(indexOfKing - 17);
			knight[1] = chessBoard.charAt(indexOfKing - 15);
		}
		else{
			knight[0] = '.';
			knight[1] = '.';
		}	
		if(indexOfKing - 10 >= 0){
			knight[2] = chessBoard.charAt(indexOfKing - 10);
			knight[3] = chessBoard.charAt(indexOfKing - 6);
		}
		else{
			knight[2] = '.';
			knight[3] = '.';
		}	
		if(indexOfKing + 10 < 64){
			knight[4] = chessBoard.charAt(indexOfKing + 10);
			knight[5] = chessBoard.charAt(indexOfKing + 6);
		}
		else{
			knight[4] = '.';
			knight[5] = '.';
		}	
		if(indexOfKing + 17 < 64){
			knight[6] = chessBoard.charAt(indexOfKing + 17);
			knight[7] = chessBoard.charAt(indexOfKing + 15);
		}
		else{
			knight[6] = '.';
			knight[7] = '.';
		}
		
		// first horizontal (right)
		for(int i=0; i<8; i++){
			if(indexOfKing + i < 64){
				firstHorizontal[i] = chessBoard.charAt(indexOfKing + i);
			}
			if(indexOfKing + i == 7 || indexOfKing + i == 15 || // if diagonal reaches the boarder of the chess board, break
			   indexOfKing + i == 23 ||	indexOfKing + i == 31 ||
			   indexOfKing + i == 39 || indexOfKing + i == 47 ||
			   indexOfKing + i == 55){
						break;
					}
		}		
		// second horizontal (left)
		for(int i=0; i<8; i++){
			if(indexOfKing - i >= 0){
				secondHorizontal[i] = chessBoard.charAt(indexOfKing - i);
			}
			if(indexOfKing - i == 8 || indexOfKing - i == 16 ||	// if diagonal reaches the boarder of the chess board, break
			   indexOfKing - i == 24 || indexOfKing - i == 32 ||
			   indexOfKing - i == 40 || indexOfKing - i == 48 ||
			   indexOfKing - i == 56){
				break;
			}
		}
		
		// first vertical line (down)
		for(int i=0; i<8; i++){
			if(indexOfKing + i*8 < 64){
				firstVertical[i] = chessBoard.charAt(indexOfKing + i*8);
			}
		}
		
		// second vertical line (up)
		for(int i=0; i<8; i++){
			if(indexOfKing - i*8 >= 0){
				secondVertical[i] = chessBoard.charAt(indexOfKing - i*8);
			}
		}
		
		// Checking if king is in check.
		king = chessBoard.charAt(indexOfKing);
		switch (king) {
		case 'k':		//black king
			for(int i=1; i<8 && knight[i] != 'e'; i++){ // Checking if Knight endangers King.
				if(knight[i] == 'N'){
					return true;
				}
			}
			
			if(firstDiagonal[1] == 'P'){ // Checking if Pawn endangers King
				return true;
			}
			if(secondDiagonal[1] == 'P'){ // Checking if Pawn endangers King
				return true;
			}
			
			// Checking if Bishop or Queen (diagonally) endangers king.
			
			if(bishopOrQueenDanger(firstDiagonal) || bishopOrQueenDanger(secondDiagonal) ||
			   bishopOrQueenDanger(thirdDiagonal) || bishopOrQueenDanger(fourthDiagonal)){
				return true;
			}

			// Checking if Rook or Queen (vertically or horizontally) endangers king.
			if(rookOrQueenDanger(firstHorizontal) || rookOrQueenDanger(secondHorizontal) ||
			   rookOrQueenDanger(firstVertical) || rookOrQueenDanger(secondVertical)){
						return true;
			}
		case 'K': //white king;
			for(int i=1; i<8 && knight[i] != 'e'; i++){ // Checking if Knight endangers King.
				if(knight[i] == 'n'){
					return true;
				}
			}
			
			if(thirdDiagonal[1] == 'p'){ // Checking if Pawn endangers King
				return true;
			}
			if(fourthDiagonal[1] == 'p'){ // Checking if Pawn endangers King
				return true;
			}
			
			// Checking if bishop or queen (diagonally) endangers king.
			
			if(bishopOrQueenDanger(firstDiagonal) || bishopOrQueenDanger(secondDiagonal) ||
			   bishopOrQueenDanger(thirdDiagonal) || bishopOrQueenDanger(fourthDiagonal)){
				return true;
			}
	
			// Checking if rook or queen (vertically or horizontally) endangers king.
			if(rookOrQueenDanger(firstHorizontal) || rookOrQueenDanger(secondHorizontal) ||
			   rookOrQueenDanger(firstVertical) || rookOrQueenDanger(secondVertical)){
				return true;
			}
		}
		return false;
	}
	
	// Checking if a diagonal contains an enemy bishop or queen which endangers the king.
	public static boolean bishopOrQueenDanger(char[] diagonal){
		if(diagonal[0] == 'k'){	// black King
			for(int i=1; i<8; i++){
				if(diagonal[i] == 'B' || diagonal[i] == 'Q'){
					return true;
				}
				else if (diagonal[i] != '.'){ // if another chess piece is in the way or border is reached.
						break;
				}
			}
			return false;
		}
		else{	// white King
			for(int i=1; i<8; i++){
				if(diagonal[i] == 'b' || diagonal[i] == 'q'){
					return true;
				}
				else if (diagonal[i] != '.'){ // if another chess piece is in the way or border is reached.
						break;
				}
			}
			return false;
		}
	}
	
	// Checking if a horizontal or vertical straight contains an enemy rook or queen which endangers the king.
	public static boolean rookOrQueenDanger(char[] line){
		if(line[0] == 'k'){ // black King
			for(int i=1; i<8; i++){
				if(line[i] == 'R' || line[i] == 'Q'){
				return true;
				}
				else if (line[i] != '.'){ // if another chess piece is in the way or border is reached.
					break;
				}
			}
			return false;
		}
		else{ // white King
			for(int i=1; i<8; i++){
				if(line[i] == 'r' || line[i] == 'q'){
				return true;
				}
				else if (line[i] != '.'){ // if another chess piece is in the way or border is reached.
					break;
				}
			}
			return false;
		}
	}
}
