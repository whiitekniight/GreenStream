package androidx.leanback.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
class CheckableImageView extends ImageView implements Checkable {

    /* JADX INFO: renamed from: ᴵˊ */
    public static final int[] f590 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public boolean f591;

    static {
        f590 = new int[]{R.attr.state_checked};
    }

    public CheckableImageView(Context r2, AttributeSet r3) {
        super(r2, r3, 0);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f591;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        int[] r22 = super.onCreateDrawableState(r2 + 1);
        if (this.f591 == false) goto L5;
        View.mergeDrawableStates(r22, f590);
    L5:
        return r22;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean r2) {
        if (this.f591 == r2) goto L6;
        this.f591 = r2;
        refreshDrawableState();
        return;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f591);
    }
}
