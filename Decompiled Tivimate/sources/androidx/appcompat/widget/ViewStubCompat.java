package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p149.InterfaceC2736;
import p362.AbstractC4778;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: ʽʽ */
    public WeakReference f247;

    /* JADX INFO: renamed from: ʾˋ */
    public int f248;

    /* JADX INFO: renamed from: ˈٴ */
    public LayoutInflater f249;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f250;

    public ViewStubCompat(Context r4, AttributeSet r5) {
        super(r4, r5, 0);
        this.f248 = 0;
        TypedArray r42 = r4.obtainStyledAttributes(r5, AbstractC4778.f16846, 0, 0);
        this.f250 = r42.getResourceId(2, -1);
        this.f248 = r42.getResourceId(1, 0);
        setId(r42.getResourceId(0, -1));
        r42.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas r1) {
    }

    @Override // android.view.View
    public final void draw(Canvas r1) {
    }

    public int getInflatedId() {
        return this.f250;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f249;
    }

    public int getLayoutResource() {
        return this.f248;
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int r1) {
        this.f250 = r1;
    }

    public void setLayoutInflater(LayoutInflater r1) {
        this.f249 = r1;
    }

    public void setLayoutResource(int r1) {
        this.f248 = r1;
    }

    public void setOnInflateListener(InterfaceC2736 r1) {
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
        WeakReference r0 = this.f247;
        if (r0 == null) goto L10;
        View r02 = (View) r0.get();
        if (r02 == null) goto L9;
        r02.setVisibility(r2);
        return;
    L9:
        throw new IllegalStateException("setVisibility called on un-referenced view");
    L10:
        super.setVisibility(r2);
        if (r2 != 0) goto L13;
    L16:
        m83();
        return;
    L13:
        if (r2 == 4) goto L16;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final View m83() {
        ViewParent r0 = getParent();
        if ((r0 instanceof ViewGroup) == false) goto L22;
        if (this.f248 == 0) goto L20;
        ViewGroup r02 = (ViewGroup) r0;
        LayoutInflater r1 = this.f249;
        if (r1 != null) goto L10;
        r1 = LayoutInflater.from(getContext());
    L10:
        View r12 = r1.inflate(this.f248, r02, false);
        int r2 = this.f250;
        if (r2 == (-1)) goto L13;
        r12.setId(r2);
    L13:
        int r22 = r02.indexOfChild(this);
        r02.removeViewInLayout(this);
        ViewGroup.LayoutParams r3 = getLayoutParams();
        if (r3 == null) goto L16;
        r02.addView(r12, r22, r3);
    L17:
        this.f247 = new WeakReference(r12);
        return r12;
    L16:
        r02.addView(r12, r22);
        goto L17
    L20:
        throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    L22:
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }
}
