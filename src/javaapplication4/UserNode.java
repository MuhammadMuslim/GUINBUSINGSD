package javaapplication4;
import javaapplication4.User;

// UserNode.java

class UserNode
{
   User data;
   UserNode next;

   UserNode(User d)
   {
      data = d;
      next = null;
   }  // constructor
   
   public UserNode(User d, UserNode n){
		data = d;
		next = n;
		
	}
   
}  // class UserNode

