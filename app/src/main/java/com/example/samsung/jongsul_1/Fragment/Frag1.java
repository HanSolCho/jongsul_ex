package com.example.samsung.jongsul_1.Fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.samsung.jongsul_1.R;

/**
 * Created by samsung on 2019-04-16.
 */

public class Frag1 extends Fragment /*implements View.OnClickListener*/ {
//라이브 스트리밍 목록 보여줄 프레그먼트
    // 리사이클러뷰 구현해서 리스트 형식으로 나올수 있도록
    //잠시주석
   /* private static String TAG = "recyclerview_example";

    private ArrayList<Dictionary> mArrayList;
    private CustomAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private int count = -1;*/

    public Frag1() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.frag1, container, false);
        //여기를 OnCreate처럼 썻던거 같음
        //잠시주석
       /* mRecyclerView = (RecyclerView) layout.findViewById(R.id.recyclerview_main_list);
        mLinearLayoutManager = new LinearLayoutManager(this.getActivity());
        mRecyclerView.setLayoutManager(mLinearLayoutManager);


        // MainActivity에서 RecyclerView의 데이터에 접근시 사용됩니다.
        mArrayList = new ArrayList<>();



        // RecyclerView를 위해 CustomAdapter를 사용합니다.
        mAdapter = new CustomAdapter( mArrayList);
        mRecyclerView.setAdapter(mAdapter);



        // RecyclerView의 줄(row) 사이에 수평선을 넣기위해 사용됩니다.
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(mRecyclerView.getContext(),
                mLinearLayoutManager.getOrientation());
        mRecyclerView.addItemDecoration(dividerItemDecoration);



        Button buttonInsert = (Button)layout.findViewById(R.id.button_main_insert);
        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;

                // Dictionary 생성자를 사용하여 ArrayList에 삽입할 데이터를 만듭니다.
                Dictionary dict = new Dictionary(count+"",
                        "apple" + count, "사과" + count);

                //mArrayList.add(0, dict); //RecyclerView의 첫 줄에 삽입
                mArrayList.add(dict); // RecyclerView의 마지막 줄에 삽입

                mAdapter.notifyDataSetChanged(); //변경된 데이터를 화면에 반영
            }
        });*/
        return layout;
    }

}