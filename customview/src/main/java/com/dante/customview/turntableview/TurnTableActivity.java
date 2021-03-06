package com.dante.customview.turntableview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.dante.customview.R;
import com.dante.customview.turntableview.model.TurnItemModel;

import java.util.ArrayList;
import java.util.List;

public class TurnTableActivity extends AppCompatActivity {

    private TurnAwardView turnAwardView;
    private List<TurnItemModel> turnItemModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turn_table);
        turnAwardView = findViewById(R.id.turnAwardView);
        turnItemModels.add(new TurnItemModel("现金奖0", 10));
        turnItemModels.add(new TurnItemModel("现金奖1", 20));
        turnItemModels.add(new TurnItemModel("现金奖2", 30));
        turnItemModels.add(new TurnItemModel("现金奖3", 40));
        turnItemModels.add(new TurnItemModel("现金奖4", 50));
        turnItemModels.add(new TurnItemModel("现金奖5", 60));
        turnItemModels.add(new TurnItemModel("现金奖6", 70));
        turnItemModels.add(new TurnItemModel("现金奖7", 80));
        turnAwardView.updateTurnAwardView(turnItemModels);
        start();
    }

    private void start() {
//        turnAwardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                turnAwardView.startRotate();
//            }
//        });
        turnAwardView.setListener(new TurnAwardView.TurnAwardListener() {
            @Override
            public void start() {
                //作弊，指定转盘结束的位置
                turnAwardView.updateTurnAwardView(4);
                turnAwardView.startRotate();
            }

            @Override
            public void end() {
//                turnAwardView.updateTurnAwardView(turnItemModels);
            }
        });
    }
}
