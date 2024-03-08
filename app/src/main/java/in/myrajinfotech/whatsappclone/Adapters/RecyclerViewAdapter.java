package in.myrajinfotech.whatsappclone.Adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import in.myrajinfotech.whatsappclone.Activities.ChatScreen;
import in.myrajinfotech.whatsappclone.Models.ChatsModel;
import in.myrajinfotech.whatsappclone.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mcontext;
    List<ChatsModel> mData;

    public RecyclerViewAdapter(Context mcontext, List<ChatsModel> mData) {
        this.mcontext = mcontext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.chat_list_item, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        ChatsModel details = mData.get(position);

        holder.chatName.setText(details.getName());
        holder.chatMessage.setText(details.getMessage());
        holder.image.setImageResource(details.getPhoto());
        holder.chatTime.setText(details.getTime());
        holder.chatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    holder.image.setDrawingCacheEnabled(true);
                    Bitmap b=holder.image.getDrawingCache();

                    Intent intent = new Intent(mcontext, ChatScreen.class);
                    intent.putExtra("username", details.getName());
                    intent.putExtra("img", b);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mcontext.startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView chatName;
        private TextView chatMessage;
        private ImageView image;
        private TextView chatTime;

        RelativeLayout chatbtn;

        public MyViewHolder(View view) {
            super(view);

            chatName = (TextView) itemView.findViewById(R.id.chatName);
            chatMessage = (TextView) itemView.findViewById(R.id.chatMessage);
            image = (ImageView) itemView.findViewById(R.id.chat_img);
            chatTime = (TextView) itemView.findViewById(R.id.timestamp);
            chatbtn = (RelativeLayout) itemView.findViewById(R.id.chat_btn);

        }
    }
}
