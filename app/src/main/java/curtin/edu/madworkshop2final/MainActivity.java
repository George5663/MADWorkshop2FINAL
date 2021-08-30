package curtin.edu.madworkshop2final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import javax.net.ssl.SSLEngineResult;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Player player = new Player();
        GameMap map = new GameMap();

        FragmentManager frag = getSupportFragmentManager();
        StatusBar statusBar = (StatusBar) frag.findFragmentById(R.id.fragment2);
        if (statusBar == null) {
            statusBar = new StatusBar();
            frag.beginTransaction().add(R.id.fragment2, statusBar).commit();
        }

        //Set default area
        TextView area = (TextView) findViewById(R.id.areaText);
        area.setText("Wilderness");
        //Open Market
        Button market = (Button) findViewById(R.id.optionsButton);
        market.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Market.class);
                startActivity(intent);
            }
        });

        //Initialise reset btn
        Button b = findViewById(R.id.resetButton);
        //Start listening for button click
        StatusBar newStatusBar = statusBar;
        b.setOnClickListener(view ->

        {
            newStatusBar.reset();
            player.playerReset();
            area.setText("Wilderness");
        });

        //Going North
        Button north = findViewById(R.id.buttonNorth);
        //Reduce HP
        north.setOnClickListener(view ->

        {
            player.setHealth(newStatusBar.reduceHP(Math.max(0.0, 5.0 - (player.getEquipmentMass() / 2.0)), player.getHealth()));
            player.setRow(map.moveNorth(player.currRow()));
            if (map.isTown(player.currCol(), player.currRow())) {
                area.setText("Town");
            } else {
                area.setText("Wilderness");
            }
        });

        //Going East
        Button east = findViewById(R.id.buttonEast);
        //Reduce HP
        east.setOnClickListener(view ->

        {
            player.setHealth(newStatusBar.reduceHP(Math.max(0.0, 5.0 - (player.getEquipmentMass() / 2.0)), player.getHealth()));
            player.setCol(map.moveEast(player.currCol()));
            if (map.isTown(player.currCol(), player.currRow())) {
                area.setText("Town");
            } else {
                area.setText("Wilderness");
            }
        });

        //Going South
        Button south = findViewById(R.id.buttonSouth);
        //Reduce HP
        south.setOnClickListener(view ->

        {
            player.setHealth(newStatusBar.reduceHP(Math.max(0.0, 5.0 - (player.getEquipmentMass() / 2.0)), player.getHealth()));
            player.setRow(map.moveSouth(player.currRow()));
            if (map.isTown(player.currCol(), player.currRow())) {
                area.setText("Town");
            } else {
                area.setText("Wilderness");
            }
        });

        //Going West
        Button west = findViewById(R.id.buttonWest);
        //Reduce HP
        west.setOnClickListener(view ->

        {
            player.setHealth(newStatusBar.reduceHP(Math.max(0.0, 5.0 - (player.getEquipmentMass() / 2.0)), player.getHealth()));
            player.setCol(map.moveWest(player.currCol()));
            if (map.isTown(player.currCol(), player.currRow())) {
                area.setText("Town");
            } else {
                area.setText("Wilderness");
            }
        });
    }

}