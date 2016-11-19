package at.fh.swengb.guardianlist;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import at.fh.swengb.guardianlist.model.Guardian;

public class ShowUserActivity extends AppCompatActivity {

    private Guardian guardian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_user);

        Intent intent = getIntent();
        guardian = (Guardian) intent.getExtras().get("guardian");

        TextView viewFirstName = (TextView) findViewById(R.id.textViewName);
        TextView viewLastName = (TextView) findViewById(R.id.textViewDescription);
        TextView viewAddress = (TextView) findViewById(R.id.textViewAddress);
        TextView viewPhone = (TextView) findViewById(R.id.textViewPhone);

        viewFirstName.setText(guardian.getName());
        viewLastName.setText(guardian.getDescription());
        viewAddress.setText(guardian.getPantheonLocation());
        viewPhone.setText(guardian.getPhoneNumber());

    }

    public void showOnMap(View view) {
        // Map point based on address
        Uri location = Uri.parse("geo:0,0?q="+guardian.getPantheonLocation());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    public void call(View view) {
        Uri number = Uri.parse("tel:"+guardian.getPhoneNumber());
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }
}
