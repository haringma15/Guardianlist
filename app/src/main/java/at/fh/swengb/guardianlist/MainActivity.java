package at.fh.swengb.guardianlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import at.fh.swengb.guardianlist.model.Guardian;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<Guardian> listGuardians;
    private ListView myListView;
    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listGuardians = new ArrayList<>();
        listGuardians.add(new Guardian("Ymir","Norse","Father of the Frostgiants","Shards of Ice", 200, 510, 38, false, "Sjogata 1, 9008 Tromso", "+47 77 64 70 20 -1"));
        listGuardians.add(new Guardian("Fafnir","Norse","Lord of Glittering Gold","Dragonic Corruption", 200, 495, 37, false, "Sjogata 1, 9008 Tromso", "+47 77 64 70 20 -2"));
        listGuardians.add(new Guardian("Ares","Greek","God of War","No Escape", 200, 485, 38, false, "Mount Olympus, Litochoro 402 00", "+30 1 123 4567 -1"));
        listGuardians.add(new Guardian("Bacchus","Roman","God of Wine","Intoxicate", 200, 495, 37, false, "Piazza della Rotanda, 00186 Roma", "+39 06 6830 0230 -1"));
        listGuardians.add(new Guardian("Khepri","Egyptian","The Dawn Bringer","Scarab's Blessing", 190, 460, 38, false, "Giza City, Giza", "+20 00 229 351 5189 -1"));
        listGuardians.add(new Guardian("Xing Tian","Chinese","The Relentless","Whirlwind of Rage and Steel", 200, 485, 35, false, "Yuzhong Qu, Chongqing Shi", "+86 23 6367 9066 -1"));

        myAdapter = new CustomAdapter(this,listGuardians);
        myListView.setAdapter(myAdapter);

        myListView = (ListView) findViewById(R.id.myGuardianList);

        myListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Guardian selectedGuardian = listGuardians.get(i);
        Intent intent = new Intent(view.getContext(),ShowUserActivity.class);
        intent.putExtra("guardian",selectedGuardian);
        startActivity(intent);

    }
}
