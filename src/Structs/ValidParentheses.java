package Structs;
import java.util.Stack;
/*
 * 括号匹配问题
 *    { [ (   给定以上三个字符组成任意字符串，编写算法判断是否正确匹配
 *     
 */
public class ValidParentheses {
	  public static void main(String[] args) {
		String s="[[[{}]]]";
		System.out.println(isValid(s));
	}
      public static boolean isValid(String s){
    	 
    	  Stack<Character> stack=new Stack<>();
    	  for(int i=0;i<s.length();i++){
    		  char c=s.charAt(i);
    		  if(c=='{'||c=='['||c=='(')
    			  stack.push(c);
    		  else{
    			  if(stack.isEmpty())
    				  return false;
    			  char topchar=stack.pop();
    			  if(c==')'&&topchar!='(')
    				  return false;
    			  if(c=='}'&&topchar!='{')
    				  return false;
    			  if(c==']'&&topchar!='[')
    				  return false;
    		  }  
    	  }
    	  return stack.isEmpty();//当整个栈为空的时候字符串匹配成功
      }
} 
