package com.thomas.customglide;

import android.graphics.Bitmap;

public interface RequestListener {

    boolean onSuccess(Bitmap bitmap);

    boolean onFaile();

}
