package magdalena.pl.military.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import magdalena.pl.military.R;
import magdalena.pl.military.model.Category;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    List<Category> categoryList = new ArrayList<>();

    public CategoryAdapter(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemCategory = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_category, viewGroup, false);
        return new ViewHolder(itemCategory);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Category category = categoryList.get(i);
        viewHolder.categoryImage.setImageResource(category.getCategoryImageView());
        viewHolder.categoryName.setText(category.getCategoryName());
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView categoryImage;
        TextView categoryName;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryImage = (ImageView) itemView.findViewById(R.id.category_image);
            categoryName = (TextView) itemView.findViewById(R.id.category_text_view);
        }
    }
}
