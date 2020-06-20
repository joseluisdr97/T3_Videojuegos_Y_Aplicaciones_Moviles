package com.jose.diaz.myapplication.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jose.diaz.myapplication.Entidades.Anime;
import com.jose.diaz.myapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MyStringAdapter1 extends RecyclerView.Adapter<MyStringAdapter1.MyStringViewHolder1>{

    private List<Anime> mData;
    public MyStringAdapter1(List<Anime> data){//Recibir mi lista enviada desde el main activity
        mData=data;
    }

    @NonNull
    @Override
    public MyStringViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());

        View view=inflater.inflate(R.layout.itm_string2,parent,false);
        MyStringAdapter1.MyStringViewHolder1 viewHolder=new MyStringAdapter1.MyStringViewHolder1(view, context);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyStringViewHolder1 holder, final int position) {
        TextView tvStringName=holder.mView.findViewById(R.id.tv_Name);
        TextView tvStringDescripcion=holder.mView.findViewById(R.id.tv_Inicial);
        ImageView tv_Image=holder.mView.findViewById(R.id.iAvatar);
        ImageView tv_ImageEstrella=holder.mView.findViewById(R.id.i_estrella);
        final Anime anime=mData.get(position);

        tvStringName.setText(anime.FullName);
        tvStringDescripcion.setText(anime.Descripcion);
        Picasso.get().load(anime.Imagen).into(tv_Image);

        if(anime.Estrella==true){
            Picasso.get().load("https://i0.pngocean.com/files/217/1024/917/computer-icons-star-symbol-black-star.jpg").into(tv_ImageEstrella);
        }else{
            Picasso.get().load("https://w7.pngwing.com/pngs/545/679/png-transparent-independence-day-free-content-website-white-star-angle-white-triangle.png").into(tv_ImageEstrella);
        }

         holder.mView.setOnClickListener(new View.OnClickListener(){

             @Override
             public void onClick(View view) {
                 //Toast.makeText(holder.context, "Este mensaje de click "+ position,Toast.LENGTH_SHORT).show();
                 ImageView tv_ImageEstrella=holder.mView.findViewById(R.id.i_estrella);
                 Anime anime=mData.get(position);
                 if(anime.Estrella ==true)
                 {
                     anime.Estrella =false;
                     Picasso.get().load("https://w7.pngwing.com/pngs/545/679/png-transparent-independence-day-free-content-website-white-star-angle-white-triangle.png").into(tv_ImageEstrella);
                 }
                 else {anime.Estrella=true;
                     Picasso.get().load("https://i0.pngocean.com/files/217/1024/917/computer-icons-star-symbol-black-star.jpg").into(tv_ImageEstrella);
                 }
             }
         });
    }

    @Override
    public int getItemCount() {
        return mData.size();//Calcular el numero de elementos de mi lista
    }

    public class MyStringViewHolder1 extends RecyclerView.ViewHolder{//CREAR EL CONTRUCTOR DE MI CLASE

        public View mView;
        public Context context;

        public MyStringViewHolder1(@NonNull View itemView, Context context) {
            super(itemView);
            mView=itemView;//Almacenar en una variable mi itemView para poder acceder a los views
            this.context=context;
        }

    }
}
