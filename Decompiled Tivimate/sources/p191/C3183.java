package p191;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: ˋˋ.ˊᵔ */
/* JADX INFO: loaded from: classes.dex */
public class C3183 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ʽ */
    public boolean f11222;

    /* JADX INFO: renamed from: ˈ */
    public boolean f11223;

    /* JADX INFO: renamed from: ⁱˊ */
    public final Rect f11224;

    /* JADX INFO: renamed from: ﹳٴ */
    public AbstractC3156 f11225;

    public C3183(int r1, int r2) {
        super(r1, r2);
        this.f11224 = new Rect();
        this.f11222 = true;
        this.f11223 = false;
    }

    public C3183(Context r1, AttributeSet r2) {
        super(r1, r2);
        this.f11224 = new Rect();
        this.f11222 = true;
        this.f11223 = false;
    }

    public C3183(ViewGroup.LayoutParams r1) {
        super(r1);
        this.f11224 = new Rect();
        this.f11222 = true;
        this.f11223 = false;
    }

    public C3183(ViewGroup.MarginLayoutParams r1) {
        super(r1);
        this.f11224 = new Rect();
        this.f11222 = true;
        this.f11223 = false;
    }

    public C3183(C3183 r1) {
        super(r1);
        this.f11224 = new Rect();
        this.f11222 = true;
        this.f11223 = false;
    }
}
