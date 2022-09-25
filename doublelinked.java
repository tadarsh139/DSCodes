package dlinkedlist;

public class dNode {
	int data;
	dNode next;
	dNode prev;
}
public class dlistfunctions {
	dNode head = null;
	public void insertstart(int data){
		dNode n = new dNode();
		n.data=data;
		if(head==null) {
			n.prev=null;
			n.next=null;
			head=n;
		}
		else {
			n.prev=null;
			n.next=head;
			head.prev=n;
			head=n;
		}
	}
	public void insertend(int data) { /*null condition left*/
		dNode n = new dNode();
		dNode p = new dNode();
		p.data=data;
		p.next=null;
		n= head;
		while(n.next!=null) {
			n=n.next;
		}
		n.next=p;
		p.prev=n;
		
	}
	public void deletestart(){
		dNode n = head;
		dNode p = n.next;
		if(head!=null) {
			p.prev=null;
			n.next=null;
			head=p;
			int k = n.data;
		}
		else {
			System.out.println("The list is Empty");
		}
	}
	public void deletend() {
		dNode n = new dNode();
		n = head;
		if(head!=null) {
		while(n.next!=null) {
			n=n.next;
		}
		dNode p = n.prev;
		p.next=null;
		n.prev=null;
		int k = n.data;
	}
		else {
			System.out.println("The list is Empty");
		}
	}
	public void show() {
		dNode p = head;
		if(head!=null) {
		while(p.next!=null) {
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println(p.data+" ");
		}
		else {
			System.out.println("The list is Empty");
		}
	}
}
public class doublelinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dlistfunctions list = new dlistfunctions();
		list.insertstart(15);
		list.insertend(24);
		list.deletend();
		list.show();

	}

}
