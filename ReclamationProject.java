/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 *  This program finds words within 2 different compound words that are the same.
 *  But it doesn't necessarily have to be dictionary words, its just
 *  the exact same series of letters of both Strings
 */
public class ReclamationProject {

    /**
     * @param a is a string.
     * @param b also a string.
     * @return gives the largest series of letters that coincide with
     */

    static String doit(final String a, final String b) {

        String aTemp = "";
        String bTemp = "";

        //aTemp is always the bigger string
        if (a.length() > b.length()) {
            aTemp = b;
            bTemp = a;

        } else {
            aTemp = a;
            bTemp = b;
        }

        String r = "";
        /*
         * For loop with i
         */

        //This function returns the value of the longest identical words in each of the two strings.
        //For example, in "Amazon" and "Amaze", r would be "Amaz"
        for (int i = 0; i < aTemp.length(); i++) {
            for (int j = aTemp.length() - i; j > 0; j--) {
                for (int k = 0; k < bTemp.length() - j; k++) {
                    if (aTemp.regionMatches(i, bTemp, k, j) && j > r.length()) {
                        r = aTemp.substring(i, i + j);
                            }
                        }
                } // Ah yeah
        }
        return r;
    }
}
