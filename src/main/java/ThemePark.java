import attractions.Attraction;
import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewedAttractions;

    public ThemePark(String name, ArrayList attractions, ArrayList stalls){
        this.name = name;
        this.attractions = attractions;
        this.stalls = stalls;
        this.reviewedAttractions = new ArrayList<>();
    }

    public String hasName(){
        return name;
    }

    public ArrayList getAttractions(){
        return attractions;
    }

    public ArrayList getStalls(){
        return stalls;
    }

    public ArrayList getReviewed(){
        reviewedAttractions.addAll(attractions);
        reviewedAttractions.addAll(stalls);
        return reviewedAttractions;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.addVisitCount();
        visitor.addVisitedAttraction(attraction);
    }

    public HashMap<String, Integer> reviews(){
        HashMap<String, Integer> reviewedThings = new HashMap();
        for(int i = 0; i < reviewedAttractions.size(); i++){
            reviewedThings.put(reviewedAttractions.get(i).getName(), reviewedAttractions.get(i).getRating());
        }
        return reviewedThings;
    }

    public ArrayList getAllAllowedFor(Visitor visitor){
        for(int i = 0; i < reviewedAttractions.size(); i++){
            if(reviewedAttractions.get(i).)
        }
    }
}
