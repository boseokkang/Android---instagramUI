package com.cos.instagramui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main_Activity";
    private RecyclerView rvStory, rvPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvStory = findViewById(R.id.rv_story);
        rvPost = findViewById(R.id.rv_post);

        StoryAdapter storyAdapter = new StoryAdapter();
        PostAdapter postAdapter = new PostAdapter();

        storyAdapter.addItem(new Story("내 스토리", R.drawable.profile1));
        storyAdapter.addItem(new Story("sojujjang", R.drawable.profile2));
        storyAdapter.addItem(new Story("dreamforyou", R.drawable.profile3));
        storyAdapter.addItem(new Story("djwonao", R.drawable.profile4));
        storyAdapter.addItem(new Story("jehyeon", R.drawable.profile5));
        storyAdapter.addItem(new Story("bogopa", R.drawable.profile6));
        storyAdapter.addItem(new Story("maaya", R.drawable.profile7));

        postAdapter.addItem(new Post("sojujjang", "sojujjang", R.drawable.post1, R.drawable.profile2, "하루의 끝은 소주!"));
        postAdapter.addItem(new Post("luda", "luda", R.drawable.post2, R.drawable.profile1, "나는 너무 귀여워~.."));
        postAdapter.addItem(new Post("djwonao", "djwonao", R.drawable.post3, R.drawable.profile4, "💘💝💕💜🧡💛💖", "#신곡 #추천 #아이유"));
        postAdapter.addItem(new Post("luda", "luda", R.drawable.post4, R.drawable.profile1, "맛있으면 0칼로리", "#아이스크림 #냬꺼★ #이구"));

        rvPost.setLayoutManager(new LinearLayoutManager(this));
        rvPost.setAdapter(postAdapter);
        rvStory.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvStory.setAdapter(storyAdapter);
    }
}