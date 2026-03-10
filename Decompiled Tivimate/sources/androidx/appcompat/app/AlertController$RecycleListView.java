package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p362.AbstractC4778;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: ʾˋ */
    public final int f38;

    /* JADX INFO: renamed from: ᴵˊ */
    public final int f39;

    public AlertController$RecycleListView(Context r2, AttributeSet r3) {
        super(r2, r3);
        TypedArray r22 = r2.obtainStyledAttributes(r3, AbstractC4778.f16852);
        this.f39 = r22.getDimensionPixelOffset(0, -1);
        this.f38 = r22.getDimensionPixelOffset(1, -1);
    }
}
