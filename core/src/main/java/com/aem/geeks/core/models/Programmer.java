package com.aem.geeks.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

@Model(adaptables = { SlingHttpServletRequest.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL )
public class Programmer {
    @ValueMapValue
	@Default(values ="Enter First Name")
	private String fname;
	

	@ValueMapValue
	@Default(values ="Enter Last Name")
	private String lname;

	@ValueMapValue
    @Default(values ="False")
	private Boolean isEmployed;
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

    public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

    public Boolean getIsEmployed() {
		return isEmployed;
	}

	public void setIsEmployed(Boolean isEmployed) {
		this.isEmployed = isEmployed;
	}

}    

