package com.example.create_account;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Adapter3 extends PagerAdapter {

    private Context ctx3;
    private int[] ImageArray3 = new int[] {R.drawable.profile4,R.drawable.profile3_image2};

    Adapter3(Context context){ctx3 = context;}

    @Override
    public int getCount() {
        return ImageArray3.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView3 = new ImageView(ctx3);
        imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView3.setImageResource(ImageArray3[position]);
        container.addView(imageView3,0);
        return imageView3;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
