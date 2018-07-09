package ed.self.firstlistfragment;

import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/*
    CheckBox chkBox=(CheckBox) findViewById(R.id.checkBox);

    public void setChkBox(final CheckBox chkBox) {
        this.chkBox = chkBox;
        chkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textTset = findViewById(R.id.txtTest);
                textTset.setText(String.format("%d", chkBox.getId()));

            }
        });
    }
*/

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void  onCheckboxClicked(View view) {
        CheckBox chkBox=(CheckBox) findViewById(R.id.checkBox);

        // 現在日時の取得
        Date now = new Date(System.currentTimeMillis());

        // 日時のフォーマットオブジェクト作成
        DateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分");

        // フォーマット
        String nowText = formatter.format(now);

        TextView textTset = findViewById(R.id.txtTest);
        textTset.setText(String.format("%d, Time: %s", chkBox.getId(), nowText));


    }

}
