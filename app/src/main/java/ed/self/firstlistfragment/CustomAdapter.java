package ed.self.firstlistfragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Akiko Mikami on 2018/05/05.
 */

public class CustomAdapter extends ArrayAdapter<CustomData>{
    protected LayoutInflater layoutInflater;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull java.util.List<CustomData> objects) {
        super(context, resource, objects);
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    public View getView(int position, View contentView, ViewGroup parent) {
        // position のデータを作る
        CustomData item = getItem(position);
        if (null == contentView) contentView=layoutInflater.inflate(R.layout.list_item, null);

        // CustomData のデータをViewの各Widgetにセットする
        TextView textView = (TextView)contentView.findViewById(R.id.checkBox);
        textView.setText(item.getmTextData());
        return  contentView;

    }

}
