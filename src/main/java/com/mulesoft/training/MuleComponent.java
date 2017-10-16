package com.mulesoft.training;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import org.mule.api.annotations.param.*;

public class MuleComponent {
	

  public Map<String,String> processMap(Map<String,String> input) {
    // processMap implementation
	  input.put("processed by","processMap");
	  return input;    
  }

  public Map<String,String> processArray(List<String> input) {
    // processArray implementation
	  Map<String,String> output = new HashMap<String,String>();
	  output.put("message", input.get(0));
	  output.put("processedBy", "processArray");
    return output;
  }

  public Map<String,String> processString(String input) {
    // processString implementation
	  Map<String,String> output = new HashMap<String,String>();
	  output.put("message", input);
	  output.put("processedBy", "processArray");
    return output;
  }
  
  public Map<String,String> processAll(@Payload Object input,@InboundHeaders("http.method") String method) {
	    // processString implementation
		  Map<String,String> output = new HashMap<String,String>();
		  output.put("message", input.toString());
		  output.put("http.method", method);
		  output.put("processedBy","processAll");
	    return output;
	  } 
 

} 
