package main.java.businessProcessListener;

import org.kie.api.event.process.*;
import org.kie.api.runtime.process.*;

//import main.java.loglib.AMQProducer;

public class BPListener implements org.kie.api.event.process.ProcessEventListener{
	
	//ActiveMQ Connection params
	public String brokerUrl;
	public String queueName;


	public BPListener(String brokerUrl,String queueName){
		this.brokerUrl=brokerUrl;
		this.queueName=queueName;
	}

	public BPListener(){
		this("tcp://192.198.1.214:61616","businessEvents");
	}
/*
*
*			PROCESS LISTENERS
*
*/
public void beforeProcessCompleted(ProcessCompletedEvent event){
	ProcessInstance pi = event.getProcessInstance();
	String msg = "[BEFORE_PROCESS_COMPLETED]";

	//TO-DO append objects to msg...

	System.out.println("\n\n\n"+msg+"\n\n\n");

	//try{new AMQProducer(brokerUrl,queueName,msg).start();}
	//catch(Exception e){e.printStackTrace();}

}
public void beforeProcessStarted(ProcessStartedEvent event){
	ProcessInstance pi = event.getProcessInstance();
	String msg = "[BEFORE_PROCESS_START]";

	//TO-DO append objects to msg...


	System.out.println("\n\n\n"+msg+"\n\n\n");
    sendToAMQ(msg);
///	try{new AMQProducer(brokerUrl,queueName,msg).start();}
	//catch(Exception e){
	//	System.out.println("\n\n\n \t\tOMG \n");
	//	e.printStackTrace();
	//	System.out.println("\n\n\n");}

} 

public void afterProcessCompleted(ProcessCompletedEvent event){
	ProcessInstance pi = event.getProcessInstance();
	String msg = "[AFTER_PROCESS_COMPLETED]";

	//TO-DO append objects to msg...


	System.out.println("\n\n\n"+msg+"\n\n\n");

	//try{new AMQProducer(brokerUrl,queueName,msg).start();}
	//catch(Exception e){e.printStackTrace();}

}
public void afterProcessStarted(ProcessStartedEvent event){
	ProcessInstance pi = event.getProcessInstance();
	String msg = "[AFTER_PROCESS_STARTED]";

	//TO-DO append objects to msg...


	System.out.println("\n\n\n"+msg+"\n\n\n");

	//try{new AMQProducer(brokerUrl,queueName,msg).start();}
	//catch(Exception e){e.printStackTrace();}

}

/*
*
*			NODE LISTENERS
*
*/

public void beforeNodeLeft(ProcessNodeLeftEvent event){
	NodeInstance ni = event.getNodeInstance();
	long pid 		= event.getProcessInstance().getId();
	String msg = "[BEFORE_NODE_LEFT]";


	System.out.println("\n\n\n"+msg+"\n\n\n");

	//try{new AMQProducer(brokerUrl,queueName,msg).start();}
	//catch(Exception e){e.printStackTrace();}


}

public void beforeNodeTriggered(ProcessNodeTriggeredEvent event){
	NodeInstance ni = event.getNodeInstance();
	long pid 		= event.getProcessInstance().getId();
	String msg = "[BEFORE_NODE_TRIGGERED]";


	System.out.println("\n\n\n"+msg+"\n\n\n");

	//try{new AMQProducer(brokerUrl,queueName,msg).start();}
	//catch(Exception e){e.printStackTrace();}

}

public void afterNodeTriggered(ProcessNodeTriggeredEvent event){
	NodeInstance ni = event.getNodeInstance();
	long pid 		= event.getProcessInstance().getId();
	String msg = "[AFTER_NODE_TRIGGERED]";


	System.out.println("\n\n\n"+msg+"\n\n\n");

	//try{new AMQProducer(brokerUrl,queueName,msg).start();}
	//catch(Exception e){e.printStackTrace();}

}

public void afterNodeLeft(ProcessNodeLeftEvent event){
	NodeInstance ni = event.getNodeInstance();
	long pid 		= event.getProcessInstance().getId();
	String msg = "[AFTER_NODE_LEFT]";


	System.out.println("\n\n\n"+msg+"\n\n\n");

	//try{new AMQProducer(brokerUrl,queueName,msg).start();}
	//catch(Exception e){e.printStackTrace();}

}


/*
*
*			PROCESS VARIABLE LISTENERS
*
*/

public void beforeVariableChanged(ProcessVariableChangedEvent event){

	String msg = "[BEFORE_VARIABLE_CHANGED]";
	
	System.out.println("\n\n\n"+msg+"\n\n\n");
}
public void afterVariableChanged(ProcessVariableChangedEvent event){

		String msg ="[AFTER_VARIABLE_CHANGED]";


	System.out.println("\n\n\n"+msg+"\n\n\n");
}

//Utils
    public boolean sendToAMQ(String message){

    try{

            new PAMQProducer(queueName,message).start();
    }catch(Exception e){
        e.printStackTrace();

        return false;
    }
    return true;
    }

}