package com.intelliviz.stockhawk.touch_helper;

import android.view.View;

/**
 * Created by sans on 06/19/2016.
 * Interface to enable swipe to delete
 */
public interface ItemTouchHelperAdapter {

  void onItemDismiss(int position);
}
