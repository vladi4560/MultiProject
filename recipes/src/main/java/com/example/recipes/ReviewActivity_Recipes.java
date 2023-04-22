package com.example.recipes;

import com.example.common.Item;
import com.example.common.ReviewActivity_Parent;
import com.example.common.UserReview;
import com.example.common.utils.DataMn;

import java.util.ArrayList;

public class ReviewActivity_Recipes extends ReviewActivity_Parent {
    private DataMn dataMn;
    @Override
    protected void getData() {
        dataMn = DataMn.getInstance();
        ArrayList<Item> itemList  = new ArrayList<>();
        ArrayList<UserReview> list  = new ArrayList<>();
        list.add(new UserReview("Vladi",4,"Tried it to use up ingredients. Sad combination of a bit bland and a bit odd"));
        list.add(new UserReview("James",3,"Regular food , nothing special"));
        list.add(new UserReview("Michael",1,"The people who are saying this is good know nothing about complimentary flavours. It does not work and it tastes awful.Sorry"));
        itemList.add(new Item("Chorizo & mozzarella gnocchi bake \n Recipe:\nHeat the oil in a medium pan over a medium heat. Fry the onion and garlic for 8-10 mins until soft. Add the chorizo and fry for 5 mins more. Tip in the tomatoes and sugar, and season. Bring to a simmer, then add the gnocchi and cook for 8 mins, stirring often, until soft. Heat the grill to high.",list));
        ArrayList<UserReview> list2  = new ArrayList<>();
        list2.add(new UserReview("Wade",4,"Great, rich flavour. Didn’t have any spinach but added some mushrooms for a bit of veg and it was lovely. Also added some smoked paprika."));
        list2.add(new UserReview("Omer",5,"Good but very rich"));
        list2.add(new UserReview("Chris",4,"How long can this be kept in the fridge after cooking?"));
        itemList.add(new Item("Easy chocolate fudge cake \n Recipe:\n Heat the oven to 180C/160C fan/gas 4. Oil and line the base of two 18cm sandwich tins. Sieve the flour, cocoa powder and bicarbonate of soda into a bowl. Add the caster sugar and mix well.",list2));
        itemList.add(new Item("Cowboy pie \n Recipe: First, make the mashed potato. Bring a large pan of salted water to the boil over a medium heat, then carefully tip in the chopped potatoes. Cook for 15-20 mins until tender. Drain, then tip back into the pan and leave to air-dry for a couple of minutes before mashing. Tip in the butter and milk, and stir through until combined. Set aside with the lid on to keep warm.",list));
        itemList.add(new Item("Easy chicken fajitas \n Recipe:\n Heat the oil in a large saucepan over a low-medium heat and fry the carrots, celery, onions and mixed herbs for 10-12 mins, stirring occasionally until the veg is soft but not golden. You may need to add a splash of water if the veg starts to catch.",list2));
        dataMn.setData(itemList);
    }

    @Override
    protected int getIMG() {
        return R.drawable.ic_recipe;
    }

}