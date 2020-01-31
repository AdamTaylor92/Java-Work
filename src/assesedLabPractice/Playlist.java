package assesedLabPractice;

public class Playlist {

	private Song[] songs;
	private int index;
	
	public Playlist(int sizeOfArray)
	{
		this.setSongs(new Song[sizeOfArray]);
		this.index = 0;
		
	}

	public Song[] getSongs() {
		return songs;
	}

	public void setSongs(Song[] songs) {
		this.songs = songs;
	}
	
	public void addsong(Song S) // this is the add songs method
	{
		if (index > this.songs.length) // Checking if the current index is larger than the length then throw an exception
		{
			throw new IndexOutOfBoundsException("No Space left in array"); //throw an array out of bounds exception
					
		}
		else
		{
			this.songs[this.index] = S; //take the current value of S (thats passed in to the method) and set it to the current location of index in the array
			index++; //add one to the index so that it doesn't try and keep filling the same space in the array
		}
		
	}
	
	public void removeSong (Song S) // remove song method
	{
		
	}
	
	public Song getSong (Song S) {
	
		return null;
		
	}
	
	public Song[] getSong() {
		return this.songs;
	}

	public void sort() { // This method calls the library class InsertionSort and uses the function Sort and passes the song array in.
		InsertionSort.sort(this.songs);
	}
	
}
