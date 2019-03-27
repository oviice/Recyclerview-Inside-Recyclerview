package com.bdtask.recyclerviewinsiderecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;


public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder>{

    private List<IteminfoItem> items;
    private Context context;

    public ItemAdapter(Context applicationContext, List<IteminfoItem> itemArrayList) {
        this.context = applicationContext;
        this.items = itemArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.design_order_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.orderId.setText(items.get(i).getProductName());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView orderId,customerName,table,date,amount;
        public ViewHolder(View view) {
            super(view);
            orderId = view.findViewById(R.id.orderId);
            customerName = view.findViewById(R.id.customerId);
            table = view.findViewById(R.id.tableId);
            date = view.findViewById(R.id.dateId);
            amount = view.findViewById(R.id.amountId);
            LinearLayout linearLayout=view.findViewById(R.id.layout);

        }
    }
}

