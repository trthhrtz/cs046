// Complete the method getLength() which takes a Comparable object as its parameter.
// If the parameter references a String object, return the length of the String
// otherwise return -1.

public class DataMethods
{
    public int getLength(Comparable c)
    {
        if(c instanceof String)
        {   
            String test = (String) c;
            return test.length();
        }
        else
        {
            return -1;
        }
    }
    
   
    /**
     * Gets the length of the object if it is a string
     * @param c the object wehose length we want
     * @return the length if the object is a string otherwise -1
     */

    // TODO: implement the method described by this javadoc
}
