package iteratorPattern;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey {

	SongsOfThe70s songsOfThe70s;
	SongsOfThe80s songsOfThe80s;
	SongsOfThe90s songsOfThe90s;

	SongIteratorInterface iter70sSongs;
	SongIteratorInterface iter80sSongs;
	SongIteratorInterface iter90sSongs;

	public DiscJockey(SongIteratorInterface songsOfThe70s, SongIteratorInterface songsOfThe80s,
			SongIteratorInterface songsOfThe90s) {
		iter70sSongs = songsOfThe70s;
		iter80sSongs = songsOfThe80s;
		iter90sSongs = songsOfThe90s;
	}

	// The traditional way without the pattern
	/*
	 * public void showTheSongs() {
	 * 
	 * ArrayList aL70sSongs = songsOfThe70s.getBestSongs();
	 * System.out.println("Songs of the 70s\n");
	 * 
	 * for (int i = 0; i < aL70sSongs.size(); i++) { SongInfo bestSongs =
	 * (SongInfo) aL70sSongs.get(i);
	 * 
	 * System.out.println(bestSongs.getSongName());
	 * System.out.println(bestSongs.getBandName());
	 * System.out.println(bestSongs.getYearReleased());
	 * 
	 * 
	 * } System.out.println();
	 * 
	 * SongInfo[] array80sSongs = songsOfThe80s.getBestSongs();
	 * System.out.println("Songs of the 80s\n");
	 * 
	 * for (int i = 0; i < array80sSongs.length; i++) { SongInfo bestSongs =
	 * array80sSongs[i];
	 * 
	 * System.out.println(bestSongs.getSongName());
	 * System.out.println(bestSongs.getBandName());
	 * System.out.println(bestSongs.getYearReleased());
	 * 
	 * 
	 * } System.out.println();
	 * 
	 * Hashtable<Integer, SongInfo> ht90sSongs = songsOfThe90s.getBestSongs();
	 * System.out.println("Songs of the 90s\n");
	 * 
	 * for (Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();) {
	 * SongInfo bestSongs = ht90sSongs.get(e.nextElement());
	 * 
	 * System.out.println(bestSongs.getSongName());
	 * System.out.println(bestSongs.getBandName());
	 * System.out.println(bestSongs.getYearReleased());
	 * 
	 * 
	 * }
	 * 
	 * 
	 * }// End of show the songs()
	 */

	public void showTheSongs2() {

		Iterator songs70s = iter70sSongs.createIterator();
		Iterator songs80s = iter80sSongs.createIterator();
		Iterator songs90s = iter90sSongs.createIterator();

		System.out.println("Songs of the 70s\n");
		printTheSongs(songs70s);

		System.out.println("Songs of the 80s\n");
		printTheSongs(songs80s);

		System.out.println("Songs of the 90s\n");
		printTheSongs(songs90s);

	}

	private void printTheSongs(Iterator iterator) {

		while (iterator.hasNext()) {

			SongInfo songInfo = (SongInfo) iterator.next();

			System.out.println(songInfo.getSongName());
			System.out.println(songInfo.getBandName());
			System.out.println(songInfo.getYearReleased());

		}

	}

}// End of DiscJockey
