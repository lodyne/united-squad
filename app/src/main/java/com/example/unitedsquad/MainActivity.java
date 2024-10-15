package com.example.unitedsquad;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    public List<Player> playerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleView);

        playerList = new ArrayList<>();

        PlayerAdapter adapter = new PlayerAdapter(playerList);


        Player player1 = new Player(R.drawable.onana, "Andre Onana","24");
        Player player2 = new Player(R.drawable.bayindir, "  Altay Bayindir","1");
        Player player3 = new Player(R.drawable.heaton, "Tom Heaton","22");
        Player player4 = new Player(R.drawable.dalot, "Diogo Dalot","20");
        Player player5 = new Player(R.drawable.mazraoui, "Noussir Mazraoui","3");
        Player player6 = new Player(R.drawable.deligt, "Matthijs De Ligt","4");
        Player player7 = new Player(R.drawable.maguire, "Harry Maguire","5");
        Player player8 = new Player(R.drawable.evans, "Johny Evans","35");
        Player player9 = new Player(R.drawable.martinez, "Lisandro Martinez","6");
        Player player10 = new Player(R.drawable.ugarte, "Manuel Ugarte","25");
        Player player11 = new Player(R.drawable.casemiro, "Casemiro","18");
        Player player12 = new Player(R.drawable.eriksen, "Christian Eriksen","14");
        Player player13 = new Player(R.drawable.mainoo, "Kobbie Mainoo","37");
        Player player14 = new Player(R.drawable.bruno, "Bruno Fernandes","8");
        Player player15 = new Player(R.drawable.mount, "Mason Mount","7");
        Player player16 = new Player(R.drawable.amad, "Amad Diallo","16");
        Player player17 = new Player(R.drawable.antony, "Antony dos Santos","21");
        Player player18 = new Player(R.drawable.rashford, "Marcus Rashford","10");
        Player player19 = new Player(R.drawable.garnacho, "Alejandro Garnacho","17");
        Player player20 = new Player(R.drawable.zirkzee, "Joshua Zirkzee","11");
        Player player21 = new Player(R.drawable.hojlund, "Rasmus Hojlund","9");
        Player player22 = new Player(R.drawable.lindelof, "Victor Lindelof","3");
        Player player23 = new Player(R.drawable.amas, "Harry Amass","41");
        Player player24 = new Player(R.drawable.collyer, "Toby Collyer","43");
        Player player25 = new Player(R.drawable.wheately, "Ethan Wheatley","36");

        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
        playerList.add(player4);
        playerList.add(player5);
        playerList.add(player6);
        playerList.add(player7);
        playerList.add(player8);
        playerList.add(player9);
        playerList.add(player10);
        playerList.add(player11);
        playerList.add(player12);
        playerList.add(player13);
        playerList.add(player14);
        playerList.add(player15);
        playerList.add(player16);
        playerList.add(player17);
        playerList.add(player18);
        playerList.add(player19);
        playerList.add(player20);
        playerList.add(player21);
        playerList.add(player22);
        playerList.add(player23);
        playerList.add(player24);
        playerList.add(player25);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }
}