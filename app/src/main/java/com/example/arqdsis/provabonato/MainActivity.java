package com.example.arqdsis.provabonato;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;




public class list1 extends ListActivity {

    private String[] lstTime;

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        //Criar um array de Strings, que será utilizado em seu ListActivity
        lstTimes = new String[] {"1 Corinthians 54", "2 Santos 44", "3 Gremio 43", "4 Palmeiras 43",
                "5 Cruzeiro 40", "6 Botafogo 40", "7 Flamengo 39",};

//Criar um ArrayAdapter, que vai fazer aparecer as Strings acima
        //em seu ListView
        this.setListAdapter(new ArrayAdapter<string>(this, android.R.layout.simple_list_item_1, lstTimes));

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);


        Object o = this.getListAdapter().getItem(position);
        String lstrTime = o.toString();

        Toast.makeText(this, " Time : " + lstrTime, Toast.LENGTH_LONG).show();
    }
}




