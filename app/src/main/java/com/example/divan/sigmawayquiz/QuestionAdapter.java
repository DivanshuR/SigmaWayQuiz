package com.example.divan.sigmawayquiz;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by divan on 12-11-2017.
 */

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.ProductViewHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Questions> questionList;

    //getting the context and product list with constructor
    public QuestionAdapter(Context mCtx, List<Questions> questionList) {
        this.mCtx = mCtx;
        this.questionList = questionList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_questions, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        //getting the product of the specified position
        Questions product = questionList.get(position);

        //binding the data with the viewholder views
        holder.textViewQuestion.setText(product.getQuestion());
        holder.textViewAnswer1.setText(product.getAnswer1());
        holder.textViewAnswer2.setText(String.valueOf(product.getAnswer2()));
        holder.textViewAnswer3.setText(String.valueOf(product.getAnswer3()));
        holder.textViewAnswer4.setText(String.valueOf(product.getAnswer4()));



    }


    @Override
    public int getItemCount() {
        return questionList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewQuestion, textViewAnswer1, textViewAnswer2,textViewAnswer3,textViewAnswer4;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textViewQuestion = (TextView) itemView.findViewById(R.id.textViewTitle);
            textViewAnswer1 = (TextView) itemView.findViewById(R.id.answer1);
            textViewAnswer2 = (TextView) itemView.findViewById(R.id.answer2);
            textViewAnswer3 = (TextView) itemView.findViewById(R.id.answer3);
            textViewAnswer4 = (TextView) itemView.findViewById(R.id.answer4);
        }
    }


}