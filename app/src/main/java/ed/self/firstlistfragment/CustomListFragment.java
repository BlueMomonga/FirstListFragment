package ed.self.firstlistfragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;

/**
 * Created by Akiko Mikami on 2018/05/05.
 */

public class CustomListFragment extends ListFragment {

    // 所有元の Activity の onCreate 終了を知らせる
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        // データを作成する
        java.util.List<CustomData> objects = new ArrayList<CustomData>();

        for (int i=0;i<4;i++) {
            CustomData itm = new CustomData();
            itm.setmTextData(String.format("%d", i));
            objects.add(itm);

        }
        CustomAdapter customAdapter = new CustomAdapter(getActivity(), 0,objects);
        setListAdapter(customAdapter);


    };

    @Override
    public void onViewCreated(final View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CheckBox chkbox = view.findViewById(R.id.checkBox);





    }
}
