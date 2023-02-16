package com.aem.geeks.core.models.impl;
import com.day.cq.wcm.api.Page;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.injectorspecific.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.*;


import com.aem.geeks.core.models.Programmer;

@Model(
    adaptables = Resource.class,
    adapters = Programmer.class,
    defaultInjectionStrategy =  DefaultInjectionStrategy.OPTIONAL
)
public class ProgrammerImpl implements Programmer{
    

    private String fname;


    private String lname;

    
    private boolean isEmployed;

    @Override
    public String getFname(){
        return fname;
    }

    @Override
    public String getLname(){
        return lname;
    }

    @Override
    public boolean getIsEmployed(){
        return isEmployed;
    }

}
