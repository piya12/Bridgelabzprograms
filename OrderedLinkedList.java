package com.bridgelabz.programs;
/* create a new OrderedList
   add the item in the list
   search the data in the list
   remove the data from list
   display the data from list
*/
import com.bridgelabz.util.Utility;
import com.bridgelabz.util.LinkedList;
import com.bridgelabz.util.Node;
// Creating the class
class OrderedLinkedList
{
	int choice,index;
	int data;

	OrderedLinkedList()throws Exception
	{
		Utility u = new Utility();
		LinkedList<String> ll = new LinkedList<>();
		System.out.println("***************   Ordered Linked List    ***************");
		System.out.println("1. Add item\n2. Remove item\n3. Search item\n4. Display list\n5.exit");
		while(choice != 5)
		{
			System.out.println("Enter your choice:");
			choice = u.getIntegerInput();
			switch(choice)
			{
				case 1:
				System.out.print("Enter data to add: "); // add the data
				ll.add(u.getIntegerInput());
				System.out.println("data added");
				break;
				case 2:
				System.out.print("Enter data to remove: "); // remove the data
				data = u.getIntegerInput();
				if(ll.searchData(data))
					ll.removeData(data);
				else
					System.out.println("Data not found in the list");
				break;
				case 3:
				System.out.println("Enter item to search");  // Searching data
				index = ll.searchDataIndex(u.getIntegerInput());
				if(index==-1)
					System.out.println("Data not found");
				else
				System.out.println("Data found at "+index+" index");// data found or not
				break;
				case 4:
				ll.displayData();  // Display Function
				break;
				case 5:
				System.exit(0);
				break;
				default:
				System.out.println("Wrong input");
				System.exit(0);
				break;
			}
		}
	}
	public static void main(String args[])throws Exception
	{
		new OrderedLinkedList();
	}
}
