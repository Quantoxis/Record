package record;

/**
 *
 * @author Andrew
 */
public class RecordTest {
    public static void main(String[] args) 
    {
    Record r1 = new Record();
    Record r2 = new Record();
    
    
        r1.setRecord("The Human League", "Dare", true, 7, "33");
        r2.setRecord("Barb and Wire", "XTC", true, 5, "33");
        
        r1.getArtist();
        System.out.println(r1.getArtist());
    }
}
