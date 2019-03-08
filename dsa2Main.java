// import required packages

// hard-coded map will be added soon.

class godown{		
	// Sakshi Joshi.
	
	/* variables: 
	 godown.id
	 5 waiting queues with capacity of 5 each.
	(5 Delivery-man with capacity of 5 orders each.)
	  */
	 
	// Decide who will ship the order ( or which waiting queue) based on area of delivery or some other logic.
	
	void sendDelivery() {
		// decide the delivery.
		// The order will be shipped, 
		// else in the waiting queue - consider the priority.
	}
	
	void complete() {
		// one delivery complete. Allocate one order in the waiting queue.
		// decide the priority.
		// this function will be called manually in the main.
	}
}

class order{
	// Sakshi Jain
	
	/* variables: 
	 object of arraylist ( or any appropriate data structure from frameworks - dynamic allocation) to store the products ordered by a 'single' customer.
	 give hard - coded graph of the recommendations.
	 allocate variables for info like address, name, mobile number, etc. But no need to accept them yet.
	
	 */
	
	void takeOrder() {
		// 1. take order
		// 2. give recommendations.
		// 3. keep adding the ordered products in the arraylist/else.
	}
}

class centre{
	/* variables: 
	 hard coded map object.
	 order object.
	 godown class objects, say 4. 
	 godownID 
	 */
	
	void order() {
		// call takeorder().
		// accept the info of the order: address, name, mobile number.
	}
	
	void shortest() {
		// calculate the distances of the order from the godowns. Find shortest.
		// godownID = shortest distance godown.id
	}
	
	void shipOrder() {
		// call sendDelivery() for the godownID object.
	}
	
}


public class dsa2Main {
	public static void main(String args[]) {
		// object of centre class.
		// menu driven.
		
		// if needed, complete() can be called for appropriate godown. Just for generalization.
	}
}
