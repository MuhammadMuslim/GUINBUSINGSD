// PlayerNode.java

class PlayerNode
{
   User data;
   PlayerNode next;

   PlayerNode(User d)
   {
      data = d;
      next = null;
   }  // constructor
   
   public PlayerNode(User d, PlayerNode n){
		data = d;
		next = n;
		
	}
   
}  // class PlayerNode

