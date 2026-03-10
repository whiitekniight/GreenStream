package p200;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import ar.tvplayer.p002tv.R;
import p271.AbstractC3882;
import ˉˆ.ʿ;

/* JADX INFO: renamed from: ˋⁱ.ʽʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C3330 {

    /* JADX INFO: renamed from: ʽ */
    public int[][] f11635;

    /* JADX INFO: renamed from: ˈ */
    public ʿ[] f11636;

    /* JADX INFO: renamed from: ⁱˊ */
    public ʿ f11637;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f11638;

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m7054(Context r12, XmlResourceParser r13, AttributeSet r14, Resources.Theme r15) {
        int r0 = r13.getDepth() + 1;
    L3:
        int r2 = r13.next();
        if (r2 == 1) goto L48;
        int r3 = r13.getDepth();
        if (r3 >= r0) goto L10;
        if (r2 != 3) goto L10;
        return;
    L10:
        if (r2 != 2) goto L3;
        if (r3 > r0) goto L3;
        if (r13.getName().equals("item") == false) goto L3;
        Resources r22 = r12.getResources();
        int[] r32 = AbstractC3882.f14217;
        if (r15 != null) goto L18;
        TypedArray r23 = r22.obtainAttributes(r14, r32);
    L19:
        TypedValue r33 = r23.peekValue(0);
        if (r33 == null) goto L28;
        int r6 = r33.type;
        if (r6 != 5) goto L26;
        C3343 r62 = new C3343(2, TypedValue.complexToDimensionPixelSize(r33.data, r23.getResources().getDisplayMetrics()));
    L29:
        r23.recycle();
        int r24 = r14.getAttributeCount();
        int[] r34 = new int[r24];
        int r4 = 0;
        int r7 = 0;
    L30:
        if (r4 >= r24) goto L39;
        int r8 = r14.getAttributeNameResource(r4);
        if (r8 == R.attr.u) goto L38;
        int r9 = r7 + 1;
        if (r14.getAttributeBooleanValue(r4, false) == true) goto L37;
        r8 = -r8;
    L37:
        r34[r7] = r8;
        r7 = r9;
    L38:
        r4 = r4 + 1;
        goto L30
    L39:
        int[] r25 = StateSet.trimStateSet(r34, r7);
        ʿ r35 = new ʿ(12, false);
        r35.ᴵˊ = r62;
        int r42 = this.f11638;
        if (r42 != 0) goto L42;
    L43:
        this.f11637 = r35;
    L44:
        int[][] r63 = this.f11635;
        if (r42 < r63.length) goto L47;
        int r72 = r42 + 10;
        int[][] r82 = new int[r72][];
        System.arraycopy(r63, 0, r82, 0, r42);
        this.f11635 = r82;
        ʿ[] r64 = new ʿ[r72];
        System.arraycopy(this.f11636, 0, r64, 0, r42);
        this.f11636 = r64;
    L47:
        int[][] r43 = this.f11635;
        int r5 = this.f11638;
        r43[r5] = r25;
        this.f11636[r5] = r35;
        this.f11638 = r5 + 1;
        goto L3
    L42:
        if (r25.length != 0) goto L44;
    L26:
        if (r6 != 6) goto L28;
        r62 = new C3343(1, r33.getFraction(1.0f, 1.0f));
    L28:
        r62 = null;
        goto L29
    L18:
        r23 = r15.obtainStyledAttributes(r14, r32, 0, 0);
        goto L19
    }
}
