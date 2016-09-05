
public class Field 
{
		private final int blockSize = 4;
		private final int subFieldSize = 4;
		private Cell[][] wholeField;
	
		public Field()
		{
			// skapar Celler för hela spelfältet
			wholeField = new Cell[subFieldSize][subFieldSize];
	        for (int i = 0; i < subFieldSize; ++i) 
	        {
	            for (int j = 0; j < subFieldSize; ++j)
	            {
	                wholeField[i][j] = new Cell();
	            }
	        }
	        
	        // genererar nummer
	        firstField();
	        secondField();
	        thirdField();
	        forthField();
		}
		
		
		public int GetBlockSize() 
		{
			return blockSize;
		}

		public int GetSubFieldSize()
		{
			return subFieldSize;
		}
		public int numberOfCells() 
		{
	        return subFieldSize * subFieldSize;
	    }
		public void clear(final int row, final int column) //Tar bort nummer från specifik cell.
		{
			wholeField[row - 1][column - 1].clearValue();
		}
		public void clearAllCells() // Tar bort alla nummer från alla celler.
		{
			for (int i = 0; i < subFieldSize; ++i) 
			{
				for (int j = 0; j < subFieldSize; ++j) 
				{
					wholeField[i][j].clearValue();
				}
			}
		}
		public int getCellValue(final int row, final int column)
		{
	        return wholeField[row - 1][column - 1].getValue();
	    }
		public void setCellValue(final int number, final int row, final int column) 
		{
	        wholeField[row - 1][column - 1].setValue(number);
	    }
		public int getRandomNumber() 
		{
	        return (int) (Math.random() * 10) % subFieldSize + 1;
	    }
		public int[][] getWholeField() // returnerar en 2D array med alla nummer.
		{
			int[][] temp = new int[subFieldSize][subFieldSize];
			for (int i = 0; i < subFieldSize; ++i) 
			{
				for (int j = 0; j < subFieldSize; ++j)
				{
					temp[i][j]= wholeField[i][j].getValue();
				}
			}	
			
			return temp;
		}

		
		
		
		
		
		
		// **************************--------------------------*******************************************		
	
		
		
		
		
		
		
		public boolean firstField()

		{
			boolean one = false;
			boolean two = false;
			boolean three = false;
			boolean four = false;
			boolean okeyNr = false;
			
			int tempNr = getRandomNumber();
			if (tempNr == 1){one = true;} if (tempNr == 2){two = true;} if (tempNr == 3){three = true;} if (tempNr == 4){four = true;}
			wholeField[0][0].setValue(tempNr); // första numret
			// -----------------------------
			while(!okeyNr)
			{
				okeyNr = true;
				tempNr = getRandomNumber();
				if (tempNr == 1 && one == true )
				{okeyNr = false;} 
				if (tempNr == 2 && two == true)
				{okeyNr = false;}
				if (tempNr == 3 && three == true)
				{okeyNr = false;} 
				if (tempNr == 4 && four == true)
				{okeyNr = false;}
				if (okeyNr == true)
				{if (tempNr == 1){one = true;} if (tempNr == 2){two = true;} if (tempNr == 3){three = true;} if (tempNr == 4){four = true;}}
			}
			okeyNr = false;
			wholeField[0][1].setValue(tempNr); // andra numret
			// -----------------------------
			while(!okeyNr)
			{
				okeyNr = true;
				tempNr = getRandomNumber();
				if (tempNr == 1 && one == true )
				{okeyNr = false;} 
				if (tempNr == 2 && two == true)
				{okeyNr = false;}
				if (tempNr == 3 && three == true)
				{okeyNr = false;} 
				if (tempNr == 4 && four == true)
				{okeyNr = false;}
				if (okeyNr == true)
				{if (tempNr == 1){one = true;} if (tempNr == 2){two = true;} if (tempNr == 3){three = true;} if (tempNr == 4){four = true;}}
			}
			okeyNr = false;
			wholeField[0][2].setValue(tempNr); // tredje numret
			// -----------------------------
			while(!okeyNr)
			{
				okeyNr = true;
				tempNr = getRandomNumber();
				if (tempNr == 1 && one == true )
				{okeyNr = false;} 
				if (tempNr == 2 && two == true)
				{okeyNr = false;}
				if (tempNr == 3 && three == true)
				{okeyNr = false;} 
				if (tempNr == 4 && four == true)
				{okeyNr = false;}
				if (okeyNr == true)
				{if (tempNr == 1){one = true;} if (tempNr == 2){two = true;} if (tempNr == 3){three = true;} if (tempNr == 4){four = true;}}
			}
			okeyNr = false;
			wholeField[0][3].setValue(tempNr); // fjärde numret
			// -----------------------------
			return true;
		}
		
		// **************************--------------------------*******************************************		
		
		
		public boolean secondField()
		{
			
			boolean one = false;
			boolean two = false;
			boolean three = false;
			boolean four = false;
			boolean okeyNr = false;
			
			int tempNr = 0;
			// -----------------------------
			while(!okeyNr)
			{
				okeyNr = true;
				boolean checkForSameNumber = false;
				while(!checkForSameNumber)
				{
					checkForSameNumber = true;
					tempNr = getRandomNumber();
					if (tempNr == wholeField[0][0].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[0][1].getValue()) {checkForSameNumber = false;}
				}
				if (okeyNr == true)
				{if (tempNr == 1){one = true;} if (tempNr == 2){two = true;} if (tempNr == 3){three = true;} if (tempNr == 4){four = true;}}
			}
			okeyNr = false;
			wholeField[1][0].setValue(tempNr); // första numret
			// -----------------------------
			while(!okeyNr)
			{
				okeyNr = true;
				tempNr = getRandomNumber();
				if (tempNr == 1 && one == true )
				{okeyNr = false;} 
				if (tempNr == 2 && two == true)
				{okeyNr = false;}
				if (tempNr == 3 && three == true)
				{okeyNr = false;} 
				if (tempNr == 4 && four == true)
				{okeyNr = false;}
				
				boolean checkForSameNumber = false;
				while(!checkForSameNumber)
				{
					checkForSameNumber = true;
					tempNr = getRandomNumber();
					if (tempNr == wholeField[0][0].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[0][1].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[1][0].getValue()) {checkForSameNumber = false;}
				}
				
				if (okeyNr == true)
				{if (tempNr == 1){one = true;} if (tempNr == 2){two = true;} if (tempNr == 3){three = true;} if (tempNr == 4){four = true;}}
			}
			okeyNr = false;
			wholeField[1][1].setValue(tempNr); // andra numret
			// -----------------------------
			while(!okeyNr)
			{
				okeyNr = true;
				tempNr = getRandomNumber();
				if (tempNr == 1 && one == true )
				{okeyNr = false;} 
				if (tempNr == 2 && two == true)
				{okeyNr = false;}
				if (tempNr == 3 && three == true)
				{okeyNr = false;} 
				if (tempNr == 4 && four == true)
				{okeyNr = false;}
				
				boolean checkForSameNumber = false;
				while(!checkForSameNumber)
				{
					checkForSameNumber = true;
					tempNr = getRandomNumber();
					if (tempNr == wholeField[0][2].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[0][3].getValue()) {checkForSameNumber = false;}
				}
				
				if (okeyNr == true)
				{if (tempNr == 1){one = true;} if (tempNr == 2){two = true;} if (tempNr == 3){three = true;} if (tempNr == 4){four = true;}}
			}
			okeyNr = false;
			wholeField[1][2].setValue(tempNr); // tredje numret
			// -----------------------------
			while(!okeyNr)
			{
				okeyNr = true;
				tempNr = getRandomNumber();
				if (tempNr == 1 && one == true )
				{okeyNr = false;} 
				if (tempNr == 2 && two == true)
				{okeyNr = false;}
				if (tempNr == 3 && three == true)
				{okeyNr = false;} 
				if (tempNr == 4 && four == true)
				{okeyNr = false;}
				
				boolean checkForSameNumber = false;
				while(!checkForSameNumber)
				{
					checkForSameNumber = true;
					tempNr = getRandomNumber();
					if (tempNr == wholeField[0][2].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[0][3].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[1][2].getValue()) {checkForSameNumber = false;}
				}
				
				if (okeyNr == true)
				{if (tempNr == 1){one = true;} if (tempNr == 2){two = true;} if (tempNr == 3){three = true;} if (tempNr == 4){four = true;}}
			}
			okeyNr = false;
			wholeField[1][3].setValue(tempNr); // fjärde numret
			// -----------------------------
			return true;
		}

		
		// **************************--------------------------*******************************************		
		
		
		
		public boolean thirdField()
		{
			
			boolean one = false;
			boolean two = false;
			boolean three = false;
			boolean four = false;
			boolean okeyNr = false;
			
			int tempNr = 0;
			// ----------------------------- 
			while(!okeyNr)
			{
				okeyNr = true;
				boolean checkForSameNumber = false;
				while(!checkForSameNumber)
				{
					checkForSameNumber = true;
					tempNr = getRandomNumber();
					if (tempNr == wholeField[0][0].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[0][2].getValue()) {checkForSameNumber = false;}
				}
				if (okeyNr == true)
				{if (tempNr == 1){one = true;} if (tempNr == 2){two = true;} if (tempNr == 3){three = true;} if (tempNr == 4){four = true;}}
			}
			okeyNr = false;
			wholeField[2][0].setValue(tempNr); // första numret
			// -----------------------------
			while(!okeyNr)
			{
				okeyNr = true;
				tempNr = getRandomNumber();
				if (tempNr == 1 && one == true )
				{okeyNr = false;} 
				if (tempNr == 2 && two == true)
				{okeyNr = false;}
				if (tempNr == 3 && three == true)
				{okeyNr = false;} 
				if (tempNr == 4 && four == true)
				{okeyNr = false;}
				
				boolean checkForSameNumber = false;
				while(!checkForSameNumber)
				{
					checkForSameNumber = true;
					tempNr = getRandomNumber();
					if (tempNr == wholeField[0][1].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[0][3].getValue()) {checkForSameNumber = false;}
				
				}
				
				if (okeyNr == true)
				{if (tempNr == 1){one = true;} if (tempNr == 2){two = true;} if (tempNr == 3){three = true;} if (tempNr == 4){four = true;}}
			}
			okeyNr = false;
			wholeField[2][1].setValue(tempNr); // andra numret
			// -----------------------------
			while(!okeyNr)
			{
				okeyNr = true;
				tempNr = getRandomNumber();
				if (tempNr == 1 && one == true )
				{okeyNr = false;} 
				if (tempNr == 2 && two == true)
				{okeyNr = false;}
				if (tempNr == 3 && three == true)
				{okeyNr = false;} 
				if (tempNr == 4 && four == true)
				{okeyNr = false;}
				
				boolean checkForSameNumber = false;
				while(!checkForSameNumber)
				{
					checkForSameNumber = true;
					tempNr = getRandomNumber();
					if (tempNr == wholeField[0][0].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[0][2].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[2][0].getValue()) {checkForSameNumber = false;}
				}
				
				if (okeyNr == true)
				{if (tempNr == 1){one = true;} if (tempNr == 2){two = true;} if (tempNr == 3){three = true;} if (tempNr == 4){four = true;}}
			}
			okeyNr = false;
			wholeField[2][2].setValue(tempNr); // tredje numret
			// -----------------------------
			while(!okeyNr)
			{
				okeyNr = true;
				tempNr = getRandomNumber();
				if (tempNr == 1 && one == true )
				{okeyNr = false;} 
				if (tempNr == 2 && two == true)
				{okeyNr = false;}
				if (tempNr == 3 && three == true)
				{okeyNr = false;} 
				if (tempNr == 4 && four == true)
				{okeyNr = false;}
				
				boolean checkForSameNumber = false;
				while(!checkForSameNumber)
				{
					checkForSameNumber = true;
					tempNr = getRandomNumber();
					if (tempNr == wholeField[0][1].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[0][3].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[2][1].getValue()) {checkForSameNumber = false;}
				}
				
				if (okeyNr == true)
				{if (tempNr == 1){one = true;} if (tempNr == 2){two = true;} if (tempNr == 3){three = true;} if (tempNr == 4){four = true;}}
			}
			okeyNr = false;
			wholeField[2][3].setValue(tempNr); // fjärde numret
			// -----------------------------
			return true;
		}

		
		// **************************--------------------------*******************************************
		
				
		
		public boolean forthField() 
		{
			
			boolean one = false;
			boolean two = false;
			boolean three = false;
			boolean four = false;
			boolean okeyNr = false;
			
			int tempNr = 0;
			// ----------------------------- 
			while(!okeyNr)
			{
				okeyNr = true;
				boolean checkForSameNumber = false;
				while(!checkForSameNumber)
				{
					checkForSameNumber = true;
					tempNr = getRandomNumber();
					if (tempNr == wholeField[2][0].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[2][1].getValue()) {checkForSameNumber = false;}
					
					if (tempNr == wholeField[1][0].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[1][2].getValue()) {checkForSameNumber = false;}
				}
				if (okeyNr == true)
				{if (tempNr == 1){one = true;} if (tempNr == 2){two = true;} if (tempNr == 3){three = true;} if (tempNr == 4){four = true;}}
			}
			okeyNr = false;
			wholeField[3][0].setValue(tempNr); // första numret
			// -----------------------------
			while(!okeyNr)
			{
				okeyNr = true;
				tempNr = getRandomNumber();
				if (tempNr == 1 && one == true )
				{okeyNr = false;} 
				if (tempNr == 2 && two == true)
				{okeyNr = false;}
				if (tempNr == 3 && three == true)
				{okeyNr = false;} 
				if (tempNr == 4 && four == true)
				{okeyNr = false;}
				
				boolean checkForSameNumber = false;
				while(!checkForSameNumber)
				{
					checkForSameNumber = true;
					tempNr = getRandomNumber();
					if (tempNr == wholeField[2][0].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[2][1].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[3][0].getValue()) {checkForSameNumber = false;}
					
					if (tempNr == wholeField[1][1].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[1][3].getValue()) {checkForSameNumber = false;}
				
				}
				
				if (okeyNr == true)
				{if (tempNr == 1){one = true;} if (tempNr == 2){two = true;} if (tempNr == 3){three = true;} if (tempNr == 4){four = true;}}
			}
			okeyNr = false;
			wholeField[3][1].setValue(tempNr); // andra numret
			// -----------------------------
			while(!okeyNr)
			{
				okeyNr = true;
				tempNr = getRandomNumber();
				if (tempNr == 1 && one == true )
				{okeyNr = false;} 
				if (tempNr == 2 && two == true)
				{okeyNr = false;}
				if (tempNr == 3 && three == true)
				{okeyNr = false;} 
				if (tempNr == 4 && four == true)
				{okeyNr = false;}
				
				boolean checkForSameNumber = false;
				while(!checkForSameNumber)
				{
					checkForSameNumber = true;
					tempNr = getRandomNumber();
					if (tempNr == wholeField[2][2].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[2][3].getValue()) {checkForSameNumber = false;}
					
					if (tempNr == wholeField[1][0].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[1][2].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[3][0].getValue()) {checkForSameNumber = false;}
				}
				
				if (okeyNr == true)
				{if (tempNr == 1){one = true;} if (tempNr == 2){two = true;} if (tempNr == 3){three = true;} if (tempNr == 4){four = true;}}
			}
			okeyNr = false;
			wholeField[3][2].setValue(tempNr); // tredje numret
			// -----------------------------
			while(!okeyNr)
			{
				okeyNr = true;
				tempNr = getRandomNumber();
				if (tempNr == 1 && one == true )
				{okeyNr = false;} 
				if (tempNr == 2 && two == true)
				{okeyNr = false;}
				if (tempNr == 3 && three == true)
				{okeyNr = false;} 
				if (tempNr == 4 && four == true)
				{okeyNr = false;}
				
				boolean checkForSameNumber = false;
				while(!checkForSameNumber)
				{
					checkForSameNumber = true;
					tempNr = getRandomNumber();
					if (tempNr == wholeField[2][2].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[2][3].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[3][2].getValue()) {checkForSameNumber = false;}
					
					if (tempNr == wholeField[1][1].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[1][3].getValue()) {checkForSameNumber = false;}
					if (tempNr == wholeField[3][1].getValue()) {checkForSameNumber = false;}
				}
				
				if (okeyNr == true)
				{if (tempNr == 1){one = true;} if (tempNr == 2){two = true;} if (tempNr == 3){three = true;} if (tempNr == 4){four = true;}}
			}
			okeyNr = false;
			wholeField[3][3].setValue(tempNr); // fjärde numret
			// -----------------------------
			return true;
		}

		
		// **************************--------------------------*******************************************
		
}
