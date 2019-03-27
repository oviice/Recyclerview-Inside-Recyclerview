package com.bdtask.recyclerviewinsiderecyclerview;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;


public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder>{

    private List<OrderinfoItem> items;
    private Context context;

    public OrderAdapter(Context applicationContext, List<OrderinfoItem> itemArrayList) {
        this.context = applicationContext;
        this.items = itemArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = mInflater.inflate(R.layout.design_order_items, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.orderId.setText(items.get(i).getOrderId());
        viewHolder.asd.setLayoutManager(new LinearLayoutManager(context));
        try {
            List<IteminfoItem> iteminfoItems = items.get(i).getIteminfo();
            viewHolder.asd.setAdapter(new ItemAdapter(context, iteminfoItems));
        }
        catch (Exception e){
            Log.d("ppp", "onBindViewHolder: "+e.getLocalizedMessage());
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView orderId,customerName,table,date,amount;
        RecyclerView asd;
        public ViewHolder(View view) {
            super(view);

            asd = view.findViewById(R.id.asd);
            orderId = view.findViewById(R.id.product);
            LinearLayout linearLayout=view.findViewById(R.id.layout);

        }
    }
}

