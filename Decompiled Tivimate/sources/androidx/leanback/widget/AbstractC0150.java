package androidx.leanback.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.leanback.widget.ﹳـ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0150 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Rect f1015 = null;

    static {
        f1015 = new Rect();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static int m667(View r8, C0124 r9, int r10) {
        C0152 r0 = (C0152) r8.getLayoutParams();
        int r1 = r9.f969;
        if (r1 == 0) goto L6;
        View r12 = r8.findViewById(r1);
        if (r12 == null) goto L6;
    L7:
        int r2 = r9.f968;
        Rect r3 = f1015;
        if (r10 != 0) goto L51;
        if (r8.getLayoutDirection() != 1) goto L33;
        if (r12 != r8) goto L13;
        r0.getClass();
        int r102 = (r12.getWidth() - r0.f1019) - r0.f1021;
    L14:
        int r103 = r102 - r2;
        if (r9.f966 == false) goto L23;
        float r22 = r9.f965;
        if (r22 != 0.0f) goto L20;
        r103 = r103 - r12.getPaddingRight();
        goto L23
    L20:
        if (r22 != 100.0f) goto L23;
        r103 = r103 + r12.getPaddingLeft();
    L23:
        if (r9.f965 == (-1.0f)) goto L28;
        if (r12 != r8) goto L26;
        r0.getClass();
        int r23 = (r12.getWidth() - r0.f1019) - r0.f1021;
    L27:
        r103 = r103 - ((int) ((r23 * r9.f965) / 100.0f));
        goto L28
    L26:
        r23 = r12.getWidth();
    L28:
        if (r8 == r12) goto L31;
        r3.right = r103;
        ((ViewGroup) r8).offsetDescendantRectToMyCoords(r12, r3);
        return r3.right + r0.f1021;
    L31:
        return r103;
    L13:
        r102 = r12.getWidth();
        goto L14
    L33:
        if (r9.f966 == false) goto L41;
        float r104 = r9.f965;
        if (r104 != 0.0f) goto L38;
        r2 = r2 + r12.getPaddingLeft();
        goto L41
    L38:
        if (r104 != 100.0f) goto L41;
        r2 = r2 - r12.getPaddingRight();
    L41:
        if (r9.f965 == (-1.0f)) goto L46;
        if (r12 != r8) goto L44;
        r0.getClass();
        int r105 = (r12.getWidth() - r0.f1019) - r0.f1021;
    L45:
        r2 = r2 + ((int) ((r105 * r9.f965) / 100.0f));
        goto L46
    L44:
        r105 = r12.getWidth();
    L46:
        if (r8 == r12) goto L49;
        r3.left = r2;
        ((ViewGroup) r8).offsetDescendantRectToMyCoords(r12, r3);
        return r3.left - r0.f1019;
    L49:
        return r2;
    L51:
        if (r9.f966 == false) goto L59;
        float r106 = r9.f965;
        if (r106 != 0.0f) goto L56;
        r2 = r2 + r12.getPaddingTop();
        goto L59
    L56:
        if (r106 != 100.0f) goto L59;
        r2 = r2 - r12.getPaddingBottom();
    L59:
        if (r9.f965 == (-1.0f)) goto L64;
        if (r12 != r8) goto L62;
        r0.getClass();
        int r107 = (r12.getHeight() - r0.f1024) - r0.f1022;
    L63:
        r2 = r2 + ((int) ((r107 * r9.f965) / 100.0f));
        goto L64
    L62:
        r107 = r12.getHeight();
    L64:
        if (r8 == r12) goto L67;
        r3.top = r2;
        ((ViewGroup) r8).offsetDescendantRectToMyCoords(r12, r3);
        r2 = r3.top - r0.f1024;
    L67:
        if (r9.f967 == true) goto L69;
        return r2;
    L69:
        return r12.getBaseline() + r2;
    L6:
        r12 = r8;
        goto L7
    }
}
