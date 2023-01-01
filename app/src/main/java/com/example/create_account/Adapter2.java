package com.example.create_account;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Adapter2 extends PagerAdapter {

    private Context ctx2;
    private int[] ImageArray2 = new int[] {R.drawable.profile3,R.drawable.person2_image2};

    Adapter2(Context context){ctx2 = context;}

    @Override
    public int getCount() {
        return ImageArray2.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView2 = new ImageView(ctx2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView2.setImageResource(ImageArray2[position]);
        container.addView(imageView2,0);
        return imageView2;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}