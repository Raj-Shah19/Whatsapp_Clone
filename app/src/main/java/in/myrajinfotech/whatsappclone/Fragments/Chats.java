package in.myrajinfotech.whatsappclone.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import in.myrajinfotech.whatsappclone.Adapters.RecyclerViewAdapter;
import in.myrajinfotech.whatsappclone.Models.ChatsModel;
import in.myrajinfotech.whatsappclone.R;

public class Chats extends Fragment {

    private RecyclerView mRecyclerView;
    public List<ChatsModel> listChat;

    public Chats() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chats, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.chats_recView);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), listChat);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Chat list items
        listChat = new ArrayList<>();
        listChat.add(new ChatsModel("Mark Zuckerberg", "Introducing IGTV on Instagram!", R.drawable.zuckerberg, "9:11 PM"));
        listChat.add(new ChatsModel("Bill Gates", "Tried Linux and I loved it! :p", R.drawable.gates, "8:47 PM"));
        listChat.add(new ChatsModel("Sundar Pichai", "Gotta add a pinch of ML in every single tech!", R.drawable.pichai, "7:07 PM"));
        listChat.add(new ChatsModel("Elon Musk", "You need some funding?", R.drawable.musk, "6:33 PM"));
        listChat.add(new ChatsModel("Tim Cook", "Finally, switching to Android..", R.drawable.cook, "3:55 PM"));
        listChat.add(new ChatsModel("Satya Nadella", "Alexa sucks! Google Assistant is the boss!", R.drawable.nadella, "1:27 PM"));
        listChat.add(new ChatsModel("Warren Buffet", "I'm the richest in the list nigga!", R.drawable.buffet, "11:08 AM"));
        listChat.add(new ChatsModel("Steve Jobs", "Tim couldn't continue my legacy, unfortunately!", R.drawable.jobs, "YESTERDAY"));
        listChat.add(new ChatsModel("Marissa Mayer", "Hey! Up for a lunch tomorrow?", R.drawable.mayer, "YESTERDAY"));
        listChat.add(new ChatsModel("Shantanu Narayen", "What's up dude?", R.drawable.narayen, "11 JULY"));
        listChat.add(new ChatsModel("Mark Zuckerberg", "Introducing IGTV on Instagram!", R.drawable.zuckerberg, "9:11 PM"));
        listChat.add(new ChatsModel("Bill Gates", "Tried Linux and I loved it! :p", R.drawable.gates, "8:47 PM"));
        listChat.add(new ChatsModel("Sundar Pichai", "Gotta add a pinch of ML in every single tech!", R.drawable.pichai, "7:07 PM"));
        listChat.add(new ChatsModel("Elon Musk", "You need some funding?", R.drawable.musk, "6:33 PM"));
        listChat.add(new ChatsModel("Tim Cook", "Finally, switching to Android..", R.drawable.cook, "3:55 PM"));
        listChat.add(new ChatsModel("Satya Nadella", "Alexa sucks! Google Assistant is the boss!", R.drawable.nadella, "1:27 PM"));
        listChat.add(new ChatsModel("Warren Buffet", "I'm the richest in the list nigga!", R.drawable.buffet, "11:08 AM"));
        listChat.add(new ChatsModel("Steve Jobs", "Tim couldn't continue my legacy, unfortunately! ", R.drawable.jobs, "YESTERDAY"));
        listChat.add(new ChatsModel("Marissa Mayer", "Hey! Up for a lunch tomorrow? ", R.drawable.mayer, "YESTERDAY"));
        listChat.add(new ChatsModel("Shantanu Narayen", "What's up dude?", R.drawable.narayen, "11 JULY"));
    }
}
