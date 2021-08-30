package curtin.edu.madworkshop2final;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;


public class Market extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.market);
        FragmentManager frag = getSupportFragmentManager();
        StatusBar statusBar = (StatusBar) frag.findFragmentById(R.id.fragment);
        if (statusBar == null) {
            statusBar = new StatusBar();
            frag.beginTransaction().add(R.id.fragment, statusBar).commit();
        }
        Area area = new Area();
        Button firstItem = (Button) findViewById(R.id.item1);
        firstItem.setText(area.getItems().get(0).getDescription());
        Button secondItem = (Button) findViewById(R.id.item2);
        secondItem.setText(area.getItems().get(1).getDescription());
        Button thirdItem = (Button) findViewById(R.id.item3);
        thirdItem.setText(area.getItems().get(2).getDescription());
        Button fourthItem = (Button) findViewById(R.id.item4);
        fourthItem.setText(area.getItems().get(3).getDescription());
        Button fifthItem = (Button) findViewById(R.id.item5);
        fifthItem.setText(area.getItems().get(4).getDescription());
        Button sixthItem = (Button) findViewById(R.id.item6);
        sixthItem.setText(area.getItems().get(5).getDescription());
        Button seventhItem = (Button) findViewById(R.id.item7);
        seventhItem.setText(area.getItems().get(6).getDescription());
        Button eighthItem = (Button) findViewById(R.id.item8);
        eighthItem.setText(area.getItems().get(7).getDescription());
        Button ninthItem = (Button) findViewById(R.id.item9);
        ninthItem.setText(area.getItems().get(8).getDescription());
        Button tenthItem = (Button) findViewById(R.id.item10);
        tenthItem.setText(area.getItems().get(9).getDescription());
        Button leave = (Button) findViewById(R.id.leaveButton);
    }
    public void end(View v)
    {
        finish();
    }
}
