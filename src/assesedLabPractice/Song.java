package assesedLabPractice;

	public class Song implements Comparable{

	
		//Attributes
	
		private String Title;
		private String Name;
		private int Year;
		
		//Constructor
		public Song ()
		{
			this.Name = "";
			this.Title = "";
			this.Year = 0;
			
		}
		public Song (String SongName, String Artist, int songYear)
		{
			this.Name = Artist;
			this.Title = SongName;
			this.Year = songYear;
		}
		

		//setters and getters//
		public String getTitle() {
			return Title;
		}

		public void setTitle(String title) {
			Title = title;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public int getYear() {
			return Year;
		}

		public void setYear(int year) {
			Year = year;
		}
		
	@Override // This overrides the to string because otherwise you just get the memory location of the object.
	public String toString(){
		return  Title + " by " + Name + " from "  + Year ;
	}
	
	
	
	@Override // this is overriding the compareTo method in the comparable class
	public int compareTo(Object Args0) { //has to be passed in an object (so it can compare them )
		Song Aux = (Song) Args0; // the Aux variable is then assigned the value thats passed in by the Object and casted down to Song.
		
		int answer = this.Year - Aux.getYear(); // comparing the years using if statement.
		if (answer == 0)
		{
			answer = this.Title.compareToIgnoreCase(Aux.getTitle()); // if the year is the same (difference = 0) then call the comparing of the titles(string) whilst ignoring case. This is part of the string class.
		}
		else if (answer > 0)
		{
			answer = 1;
		}
		else if (answer < 0)
		{
			answer = -1;
		}		
		
		return answer; //will return either 1 or -1 and will allow the methods to sort the songs in the array in the InsertionSort method.
		
	}
		
		
		
	
	
	
}
