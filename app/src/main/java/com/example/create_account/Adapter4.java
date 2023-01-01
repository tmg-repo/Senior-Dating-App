package com.example.create_account;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Adapter4 extends PagerAdapter {
    private Context ctx4;
    private int[] ImageArray4 = new int[] {R.drawable.person1,R.drawable.profile4_image2};

    Adapter4(Context context){ctx4 = context;}

    @Override
    public int getCount() {
        return ImageArray4.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView4 = new ImageView(ctx4);
        imageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView4.setImageResource(ImageArray4[position]);
        container.addView(imageView4,0);
        return imageView4;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
