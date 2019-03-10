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
								//Adding variables for djisktra
	int cost[][]=new int[10][10];
	int dist[]=new int[10];
	int visited[]=new int[10];
	int pred[]=new int[10];
	int cnt=0;
	
	void initialize(int v)					//function to initialize cost(compulsory)
	{
		//int cost[][]=new int[v][v];
		for(int i=0;i<v;i++)
		{
			for (int j=0;j<v;j++)
			{
				cost[i][j]=999;
			}
		}
	}
	void create(int x,int y,int wt)				//Removing the function and Adding hard coded map..
	{
		cost[x-1][y-1]=wt;
		cost[y-1][x-1]=wt;
	}
	
	void order() {
		// call takeorder().
		// accept the info of the order: address, name, mobile number.
	}
	
	void shortest() {
		//Need to add following parameters:int (no_of_vertices)v,int st(start),int dest(destination)
		// calculate the distances of the order from the godowns. Find shortest.
		int min=999,next=0;				//algo to find shortest path
		for(int i=0;i<v;i++)
		{
			dist[i]=cost[st-1][i];
			visited[i]=0;
			pred[i]=st-1;
		}
		
		visited[st-1]=1;
		dist[st-1]=0;
		while(cnt<dest-2)
		{
			min=999;
			for(int i=0;i<v;i++)
			{
				if(visited[i]!=1&&dist[i]<min)
				{
					min=dist[i];
					next=i;
				}
			}
			cnt++;
			visited[next]=1;
			for(int w=0;w<v;w++)
			{
				if(cost[next][w]!=9999&&visited[w]!=1)
				{
					if(dist[w]>(dist[next]+cost[next][w]))
					{
						dist[w]=(dist[next]+cost[next][w]);
						pred[w]=next;
					}
				}
			}
		}
	
		// godownID = shortest distance godown.id	
	}
	
	void display(int st,int dest)						//Function to display
	{
		System.out.println("Shortest distance is:"+dist[dest-1]);
		System.out.println(dest);
		int a=pred[dest-1];
		System.out.println(a+1);
		while(a!=st-1)
		{
			a=pred[a];
			System.out.println(a+1);
		}
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
