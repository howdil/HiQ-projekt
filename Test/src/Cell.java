
public class Cell 
{
		private int value;
		private boolean filled;
		
		public Cell()
		{
			filled = false;
			value = 1;
		}
		public boolean isFilled() 
		{
	        return filled;
	    }

	    public int getValue() 
	    {
	        return value;
	    }
	    public void setValue(final int number) 
	    {
	        filled = true;
	        value = number;
	    }
	    public void clearValue() 
	    {
	    	filled = false;
	        value = 0;
	    }


}
