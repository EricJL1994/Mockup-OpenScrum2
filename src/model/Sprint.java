package model;

import java.util.ArrayList;

public class Sprint {
    private static int currentOrder = 0;
    
    int order;
    ArrayList<UserStory> stories;

    public Sprint() {
        order = setOrder();
        this.stories = new ArrayList<>();
    }
    
    public boolean insertStory(UserStory story){
        return stories.add(story);
    }
    
    public int totalEstimation(){
        int total = 0;
        for (UserStory story : stories) {
            total += story.getEstimation();
        }
        return total;
        
    }

    public int getOrder() {
        return order;
    }

    public ArrayList<UserStory> getStories() {
        return stories;
    }

    @Override
    public String toString() {
        return "Sprint " + order;
    }
    
    private static int setOrder(){
        return ++currentOrder;
    }
}
