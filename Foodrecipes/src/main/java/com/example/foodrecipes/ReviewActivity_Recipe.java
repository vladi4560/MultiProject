package com.example.foodrecipes;

import com.example.common.Item;
import com.example.common.ReviewActivity_Parent;
import com.example.common.UserReview;
import com.example.common.utils.DataMn;

import java.util.ArrayList;

public class ReviewActivity_Recipe extends ReviewActivity_Parent {

    private DataMn dataMn;
    @Override
    protected void getData() {
        dataMn = DataMn.getInstance();
        ArrayList<Item> itemList  = new ArrayList<>();
        ArrayList<UserReview> list  = new ArrayList<>();
        list.add(new UserReview("Vladi",2,"Tried it to use up ingredients. Sad combination of a bit bland and a bit odd."));
        list.add(new UserReview("James",3,"I use spicy chorizo, less gnocchi and add 2 chicken breasts. Always goes into the oven for 20-30 mins as I find the mozzarella goes perfect.A decent mid week meal, with minimal fuss!"));
        list.add(new UserReview("Michael",1,"It really isn't good at all."));
        itemList.add(new Item("Chorizo & mozzarella gnocchi bake",list));
        ArrayList<UserReview> list2  = new ArrayList<>();
        list2.add(new UserReview("Wade",4,"Made with 500g of gnocchi instead. So only used one can of chopped tomatoes and 1 tbsp of tomato paste. I also added in some chilli flakes and herbs. Delicious!"));
        list2.add(new UserReview("Omer",5,"Great, rich flavour. Didn’t have any spinach but added some mushrooms for a bit of veg and it was lovely. Also added some smoked paprika."));
        list2.add(new UserReview("Chris",4," don't eat beef or pork, so just fry up ground bison, turkey or chicken. Such a perfect meal for a group of people!"));
        itemList.add(new Item("Easy chocolate fudge cake",list2));
        itemList.add(new Item("Cowboy pie",list));
        itemList.add(new Item("Vegetarian lasagne",list2));
        dataMn.setData(itemList);
    }

}