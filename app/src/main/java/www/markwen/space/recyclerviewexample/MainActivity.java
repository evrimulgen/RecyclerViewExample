package www.markwen.space.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    // Simpler and more understandable syntax to get the view with ButterKnife
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    RecyclerViewAdapter recyclerViewAdapter;
    EndlessRecyclerViewScrollListener scrollListener;
    ArrayList<Integer> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize ButterKnife view binding
        ButterKnife.bind(this);

        // Set data
        for(int i = 0; i < 16; i++) {
            data.add(i);
        }


        // Set up recycler view
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        recyclerViewAdapter = new RecyclerViewAdapter(data);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setHasFixedSize(true);

        scrollListener = new EndlessRecyclerViewScrollListener(layoutManager, recyclerViewAdapter) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                int length = data.size();
                for (int i = 0; i < 15; i++) {
                    data.add(length + i);
                }
                recyclerViewAdapter.notifyItemRangeInserted(page, 15);
            }
        };
        recyclerView.addOnScrollListener(scrollListener);

    }
}
