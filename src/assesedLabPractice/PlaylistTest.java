package assesedLabPractice;

public class PlaylistTest {

	public static void main(String[] args) {
		
		Playlist myPlaylist = new Playlist(3); //Instantiates the playlist and passes the size of the array into the playlist class
		
		int userInput = -1;
		
		do { // this is a loop to show the menu... it will show the menu - ask for an input - and then do the thing it needs to for the relevant input.
			ShowMenu();
			userInput = askForInput();
			evaluateInput (userInput, myPlaylist);
			
		} while (userInput !=10); // 10 will be the exit criteria for the loop as i will not need 10 menu options. User will be asked to enter 10 to quit.
		
		
		
		
		

	}

	private static void evaluateInput(int userInput, Playlist myPlaylist) {
		// creates a switch to give the user the ability to choose.
		switch(userInput)
		{
			case 1: 
				addSongToPlaylist(myPlaylist); // calls the Add song to playlist if user chooses option 1
				break;
			
			case 2:
				showSongs(myPlaylist); // calls show song methods
				break;
			
			case 3:
				sortPlaylist(myPlaylist); // calls sort Playlist 
				break;
			
			case 10://this is the exit condition
				break;
			
			default: // this is incase they select anything elses
				System.out.println("Please select a correct option");
				break;
					
		}
		
	}

	private static void sortPlaylist(Playlist myPlaylist) {
		myPlaylist.sort(); //this is going to call the method in the playlist class that actually sorts the songs
		
		
	}

	private static void showSongs(Playlist myPlaylist) {
		// method to show the songs in the playlist.
	Song[] list = myPlaylist.getSongs();
	
	System.out.println("Here is your playlist "); 
	//this loops through the list we just created and prints them to string which has been overridden to display them.
		for(int i = 0; i< list.length; i++)
		{
			Song AuxVar = list[i];
			if(AuxVar != null) {
				System.out.println(" " + AuxVar.toString());
			}
		
		}
	}

	private static void addSongToPlaylist(Playlist myPlaylist) {
		//adding the song to the playlist
		
		String Title = Input.getString("Please enter the song title ");
		String Artist = Input.getString("Please enter the artist ");
		int Year = Input.getInteger("PLease enter the year of the song ");
		
		Song toBeAdded = new Song (Title,Artist,Year); // creates the song object to add to the array with the information we just got from the user above.
		myPlaylist.addsong(toBeAdded);// Adds the song object we just created to the 
		
	}

	private static int askForInput() {
		// returns the input from the user and as declared above this is then set to userInput Variable
		return Input.getInteger("Please select an option");
	}

	private static void ShowMenu() {
		// method to show the menu options.
		
		System.out.println("Welcome to the playlist. Please choose an option");
		System.out.println(" 1: Add a song");
		System.out.println(" 2: Show songs");
		System.out.println(" 3: Sort Songs");
		System.out.println("10: Exit playlist");
	
	}

}
