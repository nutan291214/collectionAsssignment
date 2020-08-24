package com.demo;
/*"Hotel serves delicious Menus to its Customers. It maintains list of Orders given on daily basis. 
 * Order list is maintained as ArrayList<Order>. Each Order contains orderid, MenuName, price,  qtyOrdered. 
 * (Price of same Menu may vary according hours).
From ArrayLsit of Orders create a map <String,Float> where Menu Name is key and total sale in a day for theMenu as Value. 
(sale for the menu is Price*qty ordered).Eg. Order List for a day is :

[(80,”Pav Bhajee”,120.00,5), (90,”Grilled Sandwitch”,72.00,10),   (92,”Hakka Noodles”,220.00,2), (96,”Pav Bhajee”,125.00,8),     
   (101,”Grilled Sandwitch”,70.00,2)]

Then Map would be like this :
{{“Pav Bhajee”,(120*5)+(125*8) ie.1600},   {“Hakka Noodles”, 440}, {“Grilled Sandwitch”,860}}
"
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Order{
	private int oid;
	private String menuName;
	private float price;
	private int qty;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", menuName=" + menuName + ", price=" + price + ", qty=" + qty + "]";
	}
	
}

public class Que13Hotel {
	public static void main(String[] args) {
		ArrayList<Order> oal=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
			System.out.println("enter order id,menu name,price,quantity");
			Order o=new Order();
			o.setOid(sc.nextInt());
			o.setMenuName(sc.next());
			o.setPrice(sc.nextFloat());
			o.setQty(sc.nextInt());
			System.out.println("Do you want to add one more order y/n");
			ch=sc.next().charAt(0);
			oal.add(o);
		}while(ch=='y'||ch=='Y');
		HashMap<String, Float> hm=new HashMap<>();
		for(Order ol:oal) {
			String mname=ol.getMenuName();
			float p=ol.getPrice();
			int q=ol.getQty();
			float total=p*q;
			if(hm.containsKey(mname)) {
				float t=hm.get(mname);
				t=t+total;
				hm.put(mname, t);
			}
			else {
				hm.put(mname, total);
			}
		}
		System.out.println(hm);
	}


}
