package model;

import java.util.ArrayList;

public class ProductBacklog {
    private final ArrayList<UserStory> backlog;

    public ProductBacklog() {
        backlog = new ArrayList<>();
    }
    
   public boolean add(UserStory story){
        return backlog.add(story);
   }
   
   public boolean remove(UserStory story){
       return backlog.remove(story);
   }

    public ArrayList<UserStory> getBacklog() {
        return backlog;
    }
   
   

    @Override
    public String toString() {
        
        return backlog.toString();
    }
   
}
