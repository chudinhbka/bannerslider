package com.dinhcv.bannerslider.indicators;

import android.content.Context;
import android.widget.LinearLayout;

import androidx.core.content.res.ResourcesCompat;

import com.dinhcv.bannerslider.R;


/**
 * Created by dinhcv on 2019-08-20.
 * Copyright (c) 2019 Pacom-Solution. All rights reserved.
 */

public class DashIndicator extends IndicatorShape {


    public DashIndicator(Context context, int indicatorSize, boolean mustAnimateChanges) {
        super(context, indicatorSize, mustAnimateChanges);
        setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_dash_unselected, null));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = getResources().getDimensionPixelSize(R.dimen.default_dash_indicator_width);
            setLayoutParams(layoutParams);
        }
    }

    @Override
    public void onCheckedChange(boolean isChecked) {
        super.onCheckedChange(isChecked);
        if (isChecked) {
            setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_dash_selected, null));
        } else {
            setImageDrawable(ResourcesCompat.getDrawable(getResources(), R.drawable.indicator_dash_unselected, null));
        }

    }
}
