class Solution {
    public int singleNumber(int[] nums) {
        int ret=0;
        for(int i=0;i<nums.length;i++){
            ret^=nums[i];
        }
        return ret;
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        int ret=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==ret){
                count++;
            }else{
                count--;
            }
            if(count==0){
                ret=nums[i];
                count=1;
            }
        }
        return ret;
    }
}

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int sum=0;
        for(int i=0;i<32;i++){
            sum+=(n&1)<<(31-i);
            n>>>=1;
        }
        return sum;
    }
}

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            count++;
            n&=(n-1);
        }
        return count;
    }
}

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        n-=1;
       while((n&1)!=0){
           n>>>=1;
       }
       return n==0;
    }
}

class Solution {
    public int missingNumber(int[] nums) {
        int ret=0;
        for(int i=0;i<nums.length;i++){
            ret^=nums[i];
            ret^=(i+1);
        }
        return ret;
    }
}

class Solution {
    public boolean isPowerOfFour(int num) {
        if(num<=0){
            return false;
        }
        while(num%4==0){
            num/=4;
        }
        return num==1;
    }
}

class Solution {
    public int getSum(int a, int b) {
        int sum=a^b;
        int carry=(a&b)<<1;
        if(carry!=0){
            return getSum(sum,carry);
        }
        return sum;
    }
}

class Solution {
    public char findTheDifference(String s, String t) {
        int ret=0;
        for(int i=0;i<s.length();i++){
            ret^=s.charAt(i);
            ret^=t.charAt(i);
        }
        ret^=t.charAt(s.length());
        return (char)ret;
    }
}

class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        char[] c={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuffer sb=new StringBuffer();
        while(num!=0){
            int tmp=num&15;
            sb.append(c[tmp]);
            num>>>=4;
        }
        return new String(sb.reverse());
    }
}

class Solution {
    public int hammingDistance(int x, int y) {
        int a=x^y;
        int count=0;
        while(a!=0){
            count++;
            a&=(a-1);
        }
        return count;
    }
}

class Solution {
    public int findComplement(int num) {
        int ret=0;
        int i=0;
        while(num!=0){
            int tmp=(1^(num&1))<<i;
            ret+=tmp;
            i++;
            num>>>=1;
        }
        return ret;
    }
}

class Solution {
    public boolean hasAlternatingBits(int n) {
        int m=(n)^(n>>>1);
        while(m!=0){
            if((m&1)!=1){
                return false;
            }
            m>>>=1;
        }
        return true;
    }
}

class Solution {
    public int countPrimeSetBits(int L, int R) {
        int num=0;
        for(int i=L;i<=R;i++){
            int n=func(i);
            if(isPrim(n)){
                num++;
            }
        }
        return num;
    }
    private int func(int n){
        int count=0;
        while(n!=0){
            count++;
            n&=(n-1);
        }
        return count;
    }
    private boolean isPrim(int n){
        if(n==1){
            return false;
        }
        int i=2;
        for(;i<=Math.sqrt(n);i++){
            if(n%i==0){
                break;
            }
        }
        return  i>Math.sqrt(n);
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        if(head==null){
            return 0;
        }
        int len=getLen(head)-1;
        int ret=0;
        ListNode cur=head;
        while(cur!=null){
            int num=cur.val;
            ret+=(num<<len);
            len--;
            cur=cur.next;
        }
        return ret;
    }
    private int getLen(ListNode head){
        int len=0;
        ListNode cur=head;
        while(cur!=null){
            len++;
            cur=cur.next;
        }
        return len;
    }
}