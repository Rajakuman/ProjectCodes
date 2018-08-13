package sampleapp.ll;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author IDC-205
 */
class Linkedlist{
	Node head;
        int noOfNodes=0;
        String values=null;
        
	public void moveLastElementToHead()
	{
        Node last = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current=next;
            if (next!=null) last=next;
        }
         last.next=head;
         head= last;
         int i=1;
 		while (last != null)
		{
                    if (i==noOfNodes){
                        last.next=null;
                    }
                    i++;
//			System.out.print(last.data+" ");
			last = last.next;
		}
	}
        
	public void push(int data)
   	 {
             Node n = new Node(data);
    	}
        
	public void printList()
   	{
        		Node n = head;
		while (n != null)
		{
			System.out.print(n.data+" ");
			n = n.next;
		}
        }
        
       class Node
	{
		int data;
		Node next;
		Node(int d) 
		{
			this.data = d; 
			this.next = null; 
                }
                
   }
   
        public void setNodeData (Linkedlist llist, int noofNodes,String values){
            StringTokenizer st= new StringTokenizer(values, " ");
            Node Old=null;
            int rows=0;
           while(st.hasMoreTokens()){
               if (rows<noOfNodes){
               int in =Integer.parseInt((String)st.nextElement());
                if (rows==0){
                    Node n1 = new Node(in);
                    llist.head=n1;
                    Old=n1;
                }else{
                    Node n2 = new Node(in);
                    Old.next=n2;
                    Old=n2;
                }
                }else{
                   st.nextElement();
               } 
               rows++;
            }
        }

        public static void main (String arg[]) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Linkedlist llist = new Linkedlist();
            llist.noOfNodes=Integer.valueOf(br.readLine());
            llist.values=br.readLine();
            llist.setNodeData(llist,llist.noOfNodes,llist.values);
            llist.printList();
            System.out.println("");
            llist.moveLastElementToHead();
            llist.printList();
        }
}

