package com.jose.diaz.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jose.diaz.myapplication.Adapters.MyStringAdapter1;
import com.jose.diaz.myapplication.Entidades.Anime;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    //LLAMAR A TODOS MIS VIEW
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private MyStringAdapter1 mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mRecyclerView=findViewById(R.id.rv_string_list_Main2);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager=new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //specify an adapter (see also next example)
        mAdapter=new MyStringAdapter1(dataSet());//List<String>
        mRecyclerView.setAdapter(mAdapter);

    }
    private List<Anime> dataSet() {
         List<Anime> data=new ArrayList<>();
         data.add(new Anime("Anime1","Descripcion1","https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Forig13.deviantart.net%2F0965%2Ff%2F2012%2F046%2F7%2Fb%2Fanime_girl_png_by_sofabunny-d4psnv0.png&f=1&nofb=1",false));
        data.add(new Anime("Anime2","Descripcion2","https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2F3.bp.blogspot.com%2F-UV0hUUt7NM4%2FUDfIVRodKxI%2FAAAAAAAAACY%2F_EOGx_zhY_A%2Fs1600%2F970995%2Bas%2BSmart%2BObject-1.png&f=1&nofb=1",false));
        data.add(new Anime("Anime3","Descripcion3","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.freeiconspng.com%2Fuploads%2Fanime-png-24.png&f=1&nofb=1",false));
        data.add(new Anime("Anime4","Descripcion4","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2F78.media.tumblr.com%2F7747603ed8b8de9b4b0da61ae3469d12%2Ftumblr_oqb4nyLU5R1tb2c9jo1_500.png&f=1&nofb=1",false));
        data.add(new Anime("Anime5","Descripcion5","https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fimg2.wikia.nocookie.net%2F__cb20140328220438%2Floveroleplay%2Fimages%2F2%2F20%2FRender_anime_boy.png&f=1&nofb=1",false));
        data.add(new Anime("Anime6","Descripcion5","https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fstatic.tumblr.com%2Fa2fd52b212065f09a500dca8943dfada%2Fsklzqaf%2F5k3nifgzn%2Ftumblr_static_61tpcsgb83cw440kk8o0scs0s.png&f=1&nofb=1",false));
        data.add(new Anime("Anime7","Descripcion5","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ffreepngimg.com%2Fdownload%2Fmanga_boy%2F8-2-manga-boy-png-hd.png&f=1&nofb=1",false));
        data.add(new Anime("Anime8","Descripcion5","https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fcommons%2Fthumb%2F7%2F7a%2FWikipe-tan_full_length.svg%2F1200px-Wikipe-tan_full_length.svg.png&f=1&nofb=1",false));
        data.add(new Anime("Anime9","Descripcion5","https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2F3.bp.blogspot.com%2F-wFUNDFQc56Y%2FVdO93I88KvI%2FAAAAAAAA80s%2FAxU9NXeLBIg%2Fs1600%2F233463_full.png&f=1&nofb=1",false));
        data.add(new Anime("Anime10","Descripcion5","https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2F3.bp.blogspot.com%2F-UV0hUUt7NM4%2FUDfIVRodKxI%2FAAAAAAAAACY%2F_EOGx_zhY_A%2Fs1600%2F970995%2Bas%2BSmart%2BObject-1.png&f=1&nofb=1",false));
         return  data;
    }


}