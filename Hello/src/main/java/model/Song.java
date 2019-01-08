package model;

public class Song implements Comparable<Song>{

	
	private String title;;
	private String movie;
	private String singer;
	private int bps;
	
	public int compareTo(Song o) {
		
		if(this.bps>o.getBps())
			return 1;
		else 
			return -1;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getBps() {
		return bps;
	}
	public void setBps(int bps) {
		this.bps = bps;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", movie=" + movie + ", singer=" + singer + ", bps=" + bps + "]";
	}

	
	
}
