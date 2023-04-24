/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package videostore;

/**
 *
 * @author User
 */
class Video
{
  private String  title;    // name of the item
  private int     length;   // number of minutes
  private boolean avail;    // is the video in the store?

  // constructor
  public Video( String ttl )
  {
    title = ttl; length = 90; avail = true; 
  }

  // constructor
  public Video( String ttl, int lngth )
  {
    title = ttl; length = lngth; avail = true; 
  }

  public void show()
  {
   System.out.print(title + ", " + length + " min. available:" + avail );
  }
}

/*public class VideoStore
{
  public static void main ( String args[] )
  {
    Video item1 = new Video("Jaws", 120 );
    Video item2 = new Video("Star Wars" );

    item1.show();
    item2.show();
  }
}
*/
public class VideoStore
{
  public static void main ( String args[] )
  {
    Video item1 = new Video("Microcosmos", 90 );
    Movie item2 = new Movie("Jaws", 120, "Spielberg", "PG" );
    Movie item3 = new Movie("Jumanji", 120 , "Ray", "iJabove" );
    item1.show();
    item2.show();
    item3.show();
  }
}

class Movie extends Video
{
  private String  director;     // name of the director
  private String  rating;       // U, SG, SX

  // constructor
  public Movie( String ttl, int lngth, String dir, String rtng )
  {
    super( ttl);            //use the super class's constructor
    director = dir;  rating = rtng; 
  }
public void show()
  {
      super.show();
   System.out.println(", director : " +director + ", rating : " + rating);
  }
} 


