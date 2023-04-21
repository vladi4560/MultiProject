package com.example.common;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.common.utils.DataMn;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
public abstract class ReviewActivity_Parent extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ReviewAdapter adapter;
    private LinearLayoutManager manager;
    private NumberPicker numberPickerPopUp;
    private int numberPickerValue=1;

    private TextInputLayout namePopUp,reviewPopUp;
    private MaterialButton submitBtn;
    private DataMn dataMn;
    protected abstract void getData();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataMn.initHelper();
        dataMn = DataMn.getInstance();
        getData();
        findView();

    }

    public void btnAction() {
        numberPickerPopUp.setMaxValue(5);
        numberPickerPopUp.setMinValue(1);
        numberPickerPopUp.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {
                numberPickerValue = i1;
            }
        });
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(!checkReview()){
                   return;
               }
            }
        });
    }
    public void actionBtn(int position) {
//        numberPickerPopUp = findViewById(R.id.rate_NUP_popupWindow);
//        namePopUp = findViewById(R.id.name_TXT_popupWindow);
//        reviewPopUp = findViewById(R.id.review_TXT_popupWindow);
//        submitBtn = findViewById(R.id.submit_BTN_popupWindow);
        AlertDialog.Builder mbuilder = new AlertDialog.Builder(ReviewActivity_Parent.this);
        View view = getLayoutInflater().inflate(R.layout.popup_window1,null);
        mbuilder.setView(view);
        AlertDialog dialog = mbuilder.create();
        dialog.show();
        numberPickerPopUp = view.findViewById(R.id.rate_NUP_popupWindow1);
        namePopUp = view.findViewById(R.id.name_TXT_popupWindow1);
        reviewPopUp = view.findViewById(R.id.review_TXT_popupWindow1);
        submitBtn = view.findViewById(R.id.submit_BTN_popupWindow1);
        numberPickerPopUp.setMaxValue(5);
        numberPickerPopUp.setMinValue(1);
        numberPickerPopUp.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {
                numberPickerValue = i1;
                Log.d("pttt",""+numberPicker);
            }
        });
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkReview()){
                    return;
                }
                //listItem.get(position).addReview(new UserReview(namePopUp.getEditText().getText().toString(),numberPickerValue,reviewPopUp.getEditText().getText().toString()));
                dialog.cancel();
                adapter.notifyDataSetChanged();
            }
        });
    }

    private void findView() {
        adapter = new ReviewAdapter(dataMn.getItemList(),getApplicationContext());
        adapter.setCallBackAddReview(callBackAddReview);
        manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView = findViewById(R.id.itemList_RYC_main);
        Log.d("pttt",recyclerView+"");
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }


    private boolean checkReview(){
        int i= namePopUp.getEditText().getText().length();
        if(i<4) {
            Toast.makeText(getApplicationContext(),"At Least 4 letters in the name field ", Toast.LENGTH_SHORT).show();
            return false;
            }
        i= reviewPopUp.getEditText().getText().length();
        if(i<10) {
            Toast.makeText(getApplicationContext(),"At Least 10 letters in the describe field ", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private CallBackAddReview callBackAddReview = new CallBackAddReview() {
        @Override
        public void openPopUpPage(int position) {
            actionBtn(position);

        }
    };
}