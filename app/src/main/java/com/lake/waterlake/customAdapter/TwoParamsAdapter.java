package com.lake.waterlake.customAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.lake.waterlake.R;
import com.lake.waterlake.home.BaseViewHolder;
import com.lake.waterlake.model.TwoParams;

import java.util.List;

/**
 * Created by yyh on 16/9/21.
 */
public class TwoParamsAdapter extends BaseAdapter {

    private Context mcontext;
    List<TwoParams> twoParamsList;

    public TwoParamsAdapter(Context context, int resource, List<TwoParams> mlist) {

        this.mcontext = context;
        this.twoParamsList = mlist;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {//inflate(R.layout.my_listitem,parent,false);
            convertView = LayoutInflater.from(mcontext).inflate(R.layout.twoparams_view, parent, false);
        }

        TextView id = BaseViewHolder.get(convertView, R.id.obj);
        TextView name = BaseViewHolder.get(convertView, R.id.obj2);

        id.setText(twoParamsList.get(position).getObj1());
        name.setText(twoParamsList.get(position).getObj2());

        return convertView;
    }


    @Override
    public int getCount() {
        return twoParamsList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}