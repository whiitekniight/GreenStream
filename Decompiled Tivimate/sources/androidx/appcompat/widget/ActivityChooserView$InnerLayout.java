package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import ᴵˋ.ˊʻ;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* JADX INFO: renamed from: ʾˋ */
    public static final int[] f141 = null;

    static {
        f141 = new int[]{R.attr.background};
    }

    public ActivityChooserView$InnerLayout(Context r3, AttributeSet r4) {
        super(r3, r4);
        TypedArray r42 = r3.obtainStyledAttributes(r4, f141);
        if (r42.hasValue(0) == false) goto L7;
        int r1 = r42.getResourceId(0, 0);
        if (r1 == 0) goto L7;
        Drawable r32 = ˊʻ.ﹳᐧ(r3, r1);
    L8:
        setBackgroundDrawable(r32);
        r42.recycle();
        return;
    L7:
        r32 = r42.getDrawable(0);
        goto L8
    }
}
