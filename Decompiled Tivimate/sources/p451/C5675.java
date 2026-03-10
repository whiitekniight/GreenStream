package p451;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import ﹳˋ.ٴﹶ;

/* JADX INFO: renamed from: ﹶᐧ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C5675 extends ٴﹶ {

    /* JADX INFO: renamed from: ˆﾞ */
    public boolean f20454;

    /* JADX INFO: renamed from: ᵎˊ */
    public final TextView f20455;

    /* JADX INFO: renamed from: ᵔי */
    public final C5669 f20456;

    public C5675(TextView r2) {
        this.f20455 = r2;
        this.f20454 = true;
        this.f20456 = new C5669(r2);
    }

    /* JADX INFO: renamed from: ʾˋ */
    public final boolean m10881() {
        return this.f20454;
    }

    /* JADX INFO: renamed from: ˆﾞ */
    public final TransformationMethod m10882(TransformationMethod r2) {
        if (this.f20454 == false) goto L13;
        if ((r2 instanceof C5667) == false) goto L8;
        return r2;
    L8:
        if ((r2 instanceof PasswordTransformationMethod) == false) goto L11;
        return r2;
    L11:
        return new C5667(r2);
    L13:
        if ((r2 instanceof C5667) == true) goto L15;
        return r2;
    L15:
        return ((C5667) r2).f20438;
    }

    /* JADX INFO: renamed from: ـˆ */
    public final InputFilter[] m10883(InputFilter[] r7) {
        int r1 = 0;
        if (this.f20454 == true) goto L21;
        SparseArray r0 = new SparseArray(1);
        int r2 = 0;
    L6:
        if (r2 >= r7.length) goto L12;
        InputFilter r3 = r7[r2];
        if ((r3 instanceof C5669) == false) goto L10;
        r0.put(r2, r3);
    L10:
        r2 = r2 + 1;
        goto L6
    L12:
        if (r0.size() != 0) goto L14;
        return r7;
    L14:
        int r22 = r7.length;
        InputFilter[] r32 = new InputFilter[r7.length - r0.size()];
        int r4 = 0;
    L15:
        if (r1 >= r22) goto L20;
        if (r0.indexOfKey(r1) >= 0) goto L19;
        r32[r4] = r7[r1];
        r4 = r4 + 1;
    L19:
        r1 = r1 + 1;
        goto L15
    L20:
        return r32;
    L21:
        int r02 = r7.length;
        int r33 = 0;
    L22:
        C5669 r42 = this.f20456;
        if (r33 >= r02) goto L28;
        if (r7[r33] == r42) goto L26;
        r33 = r33 + 1;
        goto L22
    L26:
        return r7;
    L28:
        InputFilter[] r23 = new InputFilter[r7.length + 1];
        System.arraycopy(r7, 0, r23, 0, r02);
        r23[r02] = r42;
        return r23;
    }

    /* JADX INFO: renamed from: ٴᵢ */
    public final void m10884(boolean r2) {
        if (r2 == false) goto L5;
        TextView r22 = this.f20455;
        r22.setTransformationMethod(m10882(r22.getTransformationMethod()));
        return;
    }

    /* JADX INFO: renamed from: ᵎⁱ */
    public final void m10885(boolean r2) {
        this.f20454 = r2;
        TextView r22 = this.f20455;
        r22.setTransformationMethod(m10882(r22.getTransformationMethod()));
        r22.setFilters(m10883(r22.getFilters()));
    }
}
