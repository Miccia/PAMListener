package main.java.lib;


public class CookedOutData{
	
	private Integer id;
	private String  data;
	private String  user;


	public CookedOutData(){
	this(0,"kafkjhfkehf","p");
	}

	public CookedOutData(java.lang.Integer id,java.lang.String data,java.lang.String user){
		this.id=id;
		this.data=data;
		this.user=user;}

	public Integer getId(){return id;}
	public String getData(){return data;}
	public String getUser(){return user;}

	public void setId(java.lang.Integer d){ id=d;}
	public void setData(java.lang.String d){ data=d;}
	public void setUser(java.lang.String d){ user=d;}			}//EOF