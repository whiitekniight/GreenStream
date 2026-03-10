package p196;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p148.C2702;

/* JADX INFO: renamed from: ˋᴵ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3247 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final int[] f11466 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final int[] f11467 = null;

    static {
        f11467 = new int[]{R.attr.theme, ar.tvplayer.p002tv.R.attr.u};
        f11466 = new int[]{ar.tvplayer.p002tv.R.attr.u};
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static Context m6874(Context r1, AttributeSet r2, int r3, int r4) {
        return m6875(r3, r4, r1, r2, new int[0]);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static Context m6875(int r6, int r7, Context r8, AttributeSet r9, int[] r10) {
        TypedArray r2 = r8.obtainStyledAttributes(r9, f11466, r6, r7);
        int[] r1 = {r2.getResourceId(0, 0)};
        r2.recycle();
        int r12 = r1[0];
        if ((r8 instanceof C2702) == true) goto L5;
    L7:
        boolean r22 = false;
    L8:
        if (r12 == 0) goto L31;
        if (r22 == true) goto L31;
        C2702 r23 = new C2702(r8, r12);
        int r13 = r10.length;
        int[] r4 = new int[r13];
        if (r10.length <= 0) goto L18;
        TypedArray r62 = r8.obtainStyledAttributes(r9, r10, r6, r7);
        int r72 = 0;
    L15:
        if (r72 >= r10.length) goto L17;
        r4[r72] = r62.getResourceId(r72, 0);
        r72 = r72 + 1;
        goto L15
    L17:
        r62.recycle();
    L18:
        int r63 = 0;
    L19:
        if (r63 >= r13) goto L24;
        int r73 = r4[r63];
        if (r73 == 0) goto L23;
        r23.getTheme().applyStyle(r73, true);
    L23:
        r63 = r63 + 1;
        goto L19
    L24:
        TypedArray r64 = r8.obtainStyledAttributes(r9, f11467);
        int r74 = r64.getResourceId(0, 0);
        int r82 = r64.getResourceId(1, 0);
        r64.recycle();
        if (r74 != 0) goto L28;
        r74 = r82;
    L28:
        if (r74 == 0) goto L30;
        r23.getTheme().applyStyle(r74, true);
    L30:
        return r23;
    L31:
        return r8;
    L5:
        if (((C2702) r8).f9641 != r12) goto L7;
        r22 = true;
        goto L8
    }
}
