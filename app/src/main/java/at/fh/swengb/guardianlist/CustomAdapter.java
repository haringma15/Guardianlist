package at.fh.swengb.guardianlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import at.fh.swengb.guardianlist.model.Guardian;

/**
 * Created by Martin on 19.11.2016.
 */

public class CustomAdapter extends BaseAdapter {

    List<Guardian> listGuardians;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Guardian> listGuardians) {
        this.context = applicationContext;
        this.listGuardians= listGuardians;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listGuardians.size();
    }

    @Override
    public Object getItem(int i) {
        return listGuardians.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewName=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewAddress=(TextView)view.findViewById(R.id.textViewListAddress);
        TextView viewPhone=(TextView)view.findViewById(R.id.textViewListPhone);

        Guardian guardian = listGuardians.get(i);
        viewName.setText(guardian.getName()+", "+guardian.getDescription());
        viewAddress.setText(guardian.getPantheonLocation());
        viewPhone.setText(guardian.getPhoneNumber());

        return view;
    }
}
