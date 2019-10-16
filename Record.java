package record;

/**
 *
 * @author Andrew
 */
public class Record {

   
    private String artist;
    private String album;
    private boolean lp;
    private int numOfTracks;
    private String speed;


public void setRecord(String art, String alb, boolean size, int t, String rpm) {
        artist = art;
        album = alb;
        lp = size;
        numOfTracks = t;
        speed = rpm;
    }

public String getArtist()
{
    return artist;
}
    

    

}

