package p154;

import android.graphics.Rect;
import java.util.Comparator;
import p170.C3018;
import ᵎˉ.ⁱˊ;

/* JADX INFO: renamed from: ˉـ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C2862 implements Comparator {

    /* JADX INFO: renamed from: ʽʽ */
    public final boolean f10114;

    /* JADX INFO: renamed from: ʾˋ */
    public final Rect f10115;

    /* JADX INFO: renamed from: ˈٴ */
    public final ⁱˊ f10116;

    /* JADX INFO: renamed from: ᴵˊ */
    public final Rect f10117;

    public C2862(boolean r2, ⁱˊ r3) {
        this.f10115 = new Rect();
        this.f10117 = new Rect();
        this.f10114 = r2;
        this.f10116 = r3;
    }

    @Override // java.util.Comparator
    public final int compare(Object r4, Object r5) {
        this.f10116.getClass();
        Rect r0 = this.f10115;
        ((C3018) r4).m6390(r0);
        Rect r42 = this.f10117;
        ((C3018) r5).m6390(r42);
        int r52 = r0.top;
        int r1 = r42.top;
        if (r52 < r1) goto L33;
        if (r52 > r1) goto L37;
        int r53 = r0.left;
        int r12 = r42.left;
        boolean r2 = this.f10114;
        if (r53 >= r12) goto L11;
        if (r2 == true) goto L38;
        return -1;
    L38:
        return 1;
    L11:
        if (r53 <= r12) goto L14;
        if (r2 == true) goto L34;
        return 1;
    L34:
        return -1;
    L14:
        int r54 = r0.bottom;
        int r13 = r42.bottom;
        if (r54 < r13) goto L35;
        if (r54 > r13) goto L39;
        int r55 = r0.right;
        int r43 = r42.right;
        if (r55 >= r43) goto L23;
        if (r2 == true) goto L40;
        return -1;
    L40:
        return 1;
    L23:
        if (r55 <= r43) goto L29;
        if (r2 == false) goto L36;
        return -1;
    L36:
        return 1;
    L29:
        return 0;
    L39:
        return 1;
    L35:
        return -1;
    L37:
        return 1;
    L33:
        return -1;
    }
}
