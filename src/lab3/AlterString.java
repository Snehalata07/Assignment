package lab3;

public class AlterString {
	    static boolean isVowel(char ch)
	    {
	        if (ch != 'a' && ch != 'e' && ch != 'i'
	                && ch != 'o' && ch != 'u')
	        {
	            return false;
	        }
	        return true;
	    }
	 
	    // Function that replaces consonant with next immediate consonant alphabatically
	    static String alterString(char[] s)
	    {
	        // Start traversing the string
	        for (int i = 0; i < s.length; i++)
	        {
	            if (!isVowel(s[i]))
	            {
	 
	                // if character is z,then replace it with character b
	                if (s[i] == 'z')
	                {
	                    s[i] = 'b';
	                }
	                 
	                // if the alphabet is not z
	                else
	                {
	 
	                    // replace the element with next immediate alphabet
	                    s[i] = (char) (s[i] + 1);
	 
	                    //checking if next immediate alphabet is vowel.
	                    
	                    if (isVowel(s[i]))
	                    {
	                        s[i] = (char) (s[i] + 1);
	                    }
	                }
	            }
	        }
	        return String.valueOf(s);
	    }
	 
	   
	    public static void main(String[] args)
	    {
	        String str = "java";
	        System.out.println(alterString(str.toCharArray()));
	    }
	}

