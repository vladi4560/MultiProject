package com.example.common;

import java.util.ArrayList;

public class Item {
    private ArrayList<UserReview> reviewList;
    private String itemName;

    private boolean  isExpandable= false;
    public Item() {}

    public boolean isExpandable() {
        return this.isExpandable;
    }
    public void setExpandable(boolean bool){
        this.isExpandable= bool;
    }
    public ArrayList<UserReview> getReviewList() {
        return reviewList;
    }

    public String getItemName() {
        return itemName;
    }

    public double getOverAllRate() {
        return calculateOverAllRate();
    }

    private double calculateOverAllRate() {
        if(getNumOfReviews()==0){
            return 0;
        }
        double sum=0;

        for (int i=0;i<reviewList.size();i++){
           sum+= reviewList.get(i).getRate();
        }
        sum= ((sum/(5*getNumOfReviews()))*500)/100;
        return (sum);
    }

    public int getNumOfReviews() {
        return (reviewList==null)?0:reviewList.size();
    }

    public void addReview(UserReview userReview){
        if(reviewList==null){
            reviewList = new ArrayList<>();
            reviewList.add(userReview);
            return;
        }
        reviewList.add(userReview);
    }
    public Item( String itemName,ArrayList<UserReview> reviewList) {
        this.reviewList = reviewList;
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "Item{" +
                "reviewList=" + reviewList +
                ", itemName='" + itemName + '\'' +
                ", isExpandable=" + isExpandable +
                '}'+"\n";
    }
}
