package magdalena.pl.military.model;

import android.widget.ImageView;

public class Category  {

    private int categoryImageView;
    private String categoryName;

    public Category(int categoryImageView, String categoryName) {
        this.categoryImageView = categoryImageView;
        this.categoryName = categoryName;
    }

    public int getCategoryImageView() {
        return categoryImageView;
    }

    public void setCategoryImageView(int categoryImageView) {
        this.categoryImageView = categoryImageView;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
