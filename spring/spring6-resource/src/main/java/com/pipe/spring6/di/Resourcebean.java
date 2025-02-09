package com.pipe.spring6.di;


import org.springframework.core.io.Resource;

public class Resourcebean {
    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public void parse()
    {
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
    }

}
