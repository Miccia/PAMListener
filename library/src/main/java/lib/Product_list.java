package main.java.lib;

import java.util.ArrayList;
import java.util.List;

public class Product_list implements java.io.Serializable {

	static final long serialVersionUID = 1L;
    private java.util.List<Product> list = new ArrayList<Product>();

	public Product_list() {
	}

	public java.util.List<Product> getList() {
		return this.list;
	}

	public void setList(java.util.List<Product> list) {
		this.list = list;
	}

	public Product_list(java.util.List<Product> list) {
		this.list = list;
    }
    
    public void add(Product pro){
        this.list.add(pro);
    }

    public String toString(){
    	String str ="Product_List :- ";
    	for(Product p : list)
    		str+=p.toString();
    	return str;
    }

}
