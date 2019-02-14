package main.java.lib;


public class RawInData implements java.io.Serializable {

    private static final long serialVersionUID = 6L;
	private java.lang.Integer id;
	private java.lang.String  data;
	private java.lang.String  user;
	private java.lang.Integer seed;


	public RawInData(Integer id,String data,String user,Integer seed){
		this.id=id;
		this.data=data;
		this.user=user;
		this.seed=seed;}
	
	public RawInData(){
		this(new Integer(0),"kafkjhfkehf","",new Integer(666));
	}


	public Integer getId(){return id;}
	public Integer getSeed(){return seed;}
	public String getData(){return data;}
	public String getUser(){return user;}

	public void setId(Integer d){ id=d;}
	public void setSeed(Integer d){ seed=d;}
	public void setData(String d){ data=d;}
	public void setUser(String d){ user=d;}				

	public String toString(){
		return ""+id+"\t"+user+"\t"+seed+"\t"+data;}
		}//EOF