package magdalena.pl.military.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import magdalena.pl.military.R;
import magdalena.pl.military.adapter.CategoryAdapter;
import magdalena.pl.military.model.Category;

public class CategoriesFragments extends Fragment {


    private List<Category> categoryList = new ArrayList<>();

    public CategoriesFragments() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_category, container, false);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.categoryRecyclerView);


        Category category = new Category(R.drawable.army, "Army");
        categoryList.add(category);
        category = new Category(R.drawable.army, "Navy");
        categoryList.add(category);
        category = new Category(R.drawable.army, "Cost Guard");
        categoryList.add(category);
        category = new Category(R.drawable.army, "Marine Corps");
        categoryList.add(category);
        category = new Category(R.drawable.army, "Air Force");
        categoryList.add(category);
        category = new Category(R.drawable.army, "Education");
        categoryList.add(category);
        category = new Category(R.drawable.army, "Veterans");
        categoryList.add(category);
        category = new Category(R.drawable.army, "Stories");
        categoryList.add(category);
        category = new Category(R.drawable.army, "Government");
        categoryList.add(category);


        CategoryAdapter categoryAdapter = new CategoryAdapter(categoryList);
        LinearLayoutManager linearLayoutManager = new GridLayoutManager(getActivity(), 3);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(categoryAdapter);


        return rootView;
    }
}
