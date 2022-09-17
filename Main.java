package linkedlist;

import java.util.*;

public class Main {

	public static void main(String[] args) {
int num,data;
		int p,k;
		// TODO Auto-generated method stub
		listfunctions list = new listfunctions();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Choose an option \n 1->Insert \n 2-> Delete \n 3->Show \n 4->Exit");
			int n = sc.nextInt();
			switch(n) {
			case 1:
				System.out.println("1->at start \n 2->At end \n 3->In between");
				p = sc.nextInt();
				switch(p) {
				case 1:
					System.out.println("Enter data to be inserted: ");
					num=sc.nextInt();
					list.insertstart(num);
					list.show();
					break;
				case 2:
					System.out.println("Enter data to be inserted: ");
					num = sc.nextInt();
					list.insertend(num);
					list.show();
					break;
				case 3:
					System.out.println("Enter data to be inserted: ");
					num = sc.nextInt();
					System.out.println("Enter data after which given data should be inserted: ");
					data=sc.nextInt();
					list.insertafterdata(num,data);
					list.show();
					break;
				}
				break;
			case 2:
				System.out.println("1->At start \n 2->At end");
				k = sc.nextInt();
				switch(k) {
				case 1:
					list.deleteatstart();
					list.show();
					break;
				case 2:
					list.deleteatend();
					list.show();
				}
				break;
			case 3:
				list.show();
				break;
			case 4:
				return;
			}
		}

		

	}

}
public  class Node {
	int data;
	Node next;

}
public class listfunctions {

	static Node head;
	int nodenum=0;
	public  void insertend(int data){
		Node node = new Node();
		node.data=data;
		node.next=null;
		if(head==null) {
			head=node;
			nodenum=nodenum+1;
		}
		else {
			Node n = head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
			nodenum=nodenum+1;
		}
	}
	public  void show() {
		Node p = head;
		if(head!=null) {
			System.out.println("The list is: ");
		while(p.next!=null) {
			System.out.print(p.data);
			p=p.next;
		}
		System.out.print(p.data);
		}
		else {
			System.out.println("List is empty");
		}
		}
	public void insertstart(int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		if(head==null) {
			head=node;
			nodenum=nodenum+1;
		}
		else {
			node.next=head;
			head=node;
		}
	}
	public void insertafterdata(int data1,int data2) {
		Node node = new Node();
		node.data=data1;
		node.next=null;
		Node n = head;
		while(n.data!=data2) {
			n=n.next;
		}
		node.next=n.next; 
		n.next=node;
		
		
	}
	public void deleteatstart() {
		Node n= head;
		head=n.next;
		int j = n.data;
		System.out.println("Deleted element is: "+j);
	}
	public void deleteatend() {
		Node n = head;
		while(n.next!=null) {
			n=n.next;
		}
		
	}
}
