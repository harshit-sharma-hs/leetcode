/*
 * 678. Valid Parenthesis String
 */
package leetcode;

class CheckValidString {
    public boolean checkValidString(String s) {
        
        int low=0;
        int high =0;
        for(char c:s.toCharArray())
        {
            low+=c=='('?1:-1;
            high+= c!=')'?1:-1;
            if(high<0)
                return false;
            low=Math.max(0,low);
        }
        return low==0;
    }
}
