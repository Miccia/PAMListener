package main.java.lib;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

public class CustomWorkItemHandler implements WorkItemHandler {

//necessary????
  public CustomWorkItemHandler(){
    super();
  }

  public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
    // extract parameters
    String from = (String) workItem.getParameter("From");
    String to =           (String) workItem.getParameter("To");
    String message =   (String) workItem.getParameter("Message");
    String priority = (String) workItem.getParameter("Priority");

     System.out.println("CustomWorkItemHandler is running : ");

    System.out.println("msg from\t"+from+"\nto\t"+to+"\t\t___message___\n"+message+"\n\npriority\t"+priority);

    // notify manager that work item has been completed
    manager.completeWorkItem(workItem.getId(), null); 
  }

  public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
    System.out.println("\n\nAborted!!!  "+workItem.getId()+"\n\n");
  }

}