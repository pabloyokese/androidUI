package jp.com.exampleui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends ArrayAdapter<Category> {

    private Context context;

    public CategoryAdapter( Context context, int resource, List<Category> list) {
        super(context, resource,list);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView ==null){
            convertView = View.inflate(context,R.layout.layout_select,null);
            TextView tvCategory = convertView.findViewById(R.id.tvcategory);
            tvCategory.setText(this.getItem(position).getName());
        }
        return convertView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = View.inflate(context,R.layout.item_spinner_category,null);
        TextView tvCategoryName = view.findViewById(R.id.tv_category_name);
        tvCategoryName.setText(this.getItem(position).getName());
        return view;
    }
}
