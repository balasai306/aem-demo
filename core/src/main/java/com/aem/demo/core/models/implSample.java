package com.aem.demo.core.models;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;
// we can use adaptable or sling servlet

@Model(adaptables = Resource.class,
adapters=Sample.class
)
public class implSample implements Sample{

	
	@Inject
	String fullname;
	

	@Override
	public String getFullName() {
		// TODO Auto-generated method stub
		return fullname;
	}

}
