package model;

import java.util.ArrayList;

public class UserStory {
    private String name;
    private String description;
    private int estimation;
    private ArrayList<Resource> resources;

    public UserStory(String name, String description, int estimation) {
        this.name = name;
        this.description = description;
        this.estimation = estimation;
        resources = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEstimation() {
        return estimation;
    }

    public void setEstimation(int estimation) {
        this.estimation = estimation;
    }
    
     public boolean addResource(Resource r){
        for (Resource resource : resources) {
            if(resource.equals(r))return false;
        }
        return resources.add(r);
    }
    
    public boolean removeResource(Resource r){
        return resources.remove(r);
    }

    public ArrayList<Resource> getResources() {
        return resources;
    }
    

    @Override
    public String toString() {
        return name;
    }
    
    
}
