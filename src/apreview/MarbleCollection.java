package apreview;
import java.util.*;
public class MarbleCollection
{
/** This is a list of all marble sets*/
private List<MarbleSet> sets;
/** Constructs a new MarbleSet object*/
public MarbleCollection()
{ sets= new ArrayList<MarbleSet>();}

/** Adds theSet to the marble collection
* @param theSet the marble set to add to the marble collection
*/
public void addSet(MarbleSet theSet)
{ sets.add(theSet); }

/** @return the total number of marbles*/
public int getTotalMarbles()
{ /* to be implemented in part (a)*/
    int sum = 0;
    for(MarbleSet temp : sets){
        sum += temp.getNumber();
    }
    return sum;
}

/** Removes all the marble sets from the marble collection that have the same
color as
* marbleColor and returns the total number of marbles removed
* @param marbleColor the color of the marble sets to be removed
* @return the total number of marbles of marbleColor in the marble sets removed
*/
public int removeColor(String marbleCol){
     /* to be implemented in part (b)*/
     for(int i = sets.size() -1 ; i >= 0; i--)
         if(sets.get(i).getColor() == marbleCol)
             sets.remove(i);
         
    return sets.size();
}
}