package p459;

import android.os.Parcel;
import android.os.Parcelable;
import p308.AbstractC4142;
import p351.AbstractC4711;
import ﹳـ.ᵎﹶ;

/* JADX INFO: renamed from: ﹶﾞ.ʿˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C5724 extends AbstractC4711 {
    public static final Parcelable.Creator<C5724> CREATOR = null;

    /* JADX INFO: renamed from: ʽʽ */
    public final long f20642;

    /* JADX INFO: renamed from: ʾˋ */
    public final int f20643;

    /* JADX INFO: renamed from: ˈٴ */
    public final Long f20644;

    /* JADX INFO: renamed from: ˊʻ */
    public final String f20645;

    /* JADX INFO: renamed from: ٴᵢ */
    public final Double f20646;

    /* JADX INFO: renamed from: ᴵˊ */
    public final String f20647;

    /* JADX INFO: renamed from: ᴵᵔ */
    public final String f20648;

    static {
        CREATOR = new ᵎﹶ(10);
    }

    public C5724(int r1, String r2, long r3, Long r5, Float r6, String r7, String r8, Double r9) {
        this.f20643 = r1;
        this.f20647 = r2;
        this.f20642 = r3;
        this.f20644 = r5;
        if (r1 != 1) goto L7;
        if (r6 == null) goto L6;
        r9 = Double.valueOf(r6.doubleValue());
        goto L7
    L6:
        r9 = null;
    L7:
        this.f20646 = r9;
        this.f20648 = r7;
        this.f20645 = r8;
    }

    public C5724(long r2, Object r4, String r5, String r6) {
        AbstractC4142.m8391(r5);
        this.f20643 = 2;
        this.f20647 = r5;
        this.f20642 = r2;
        this.f20645 = r6;
        if (r4 != null) goto L7;
        this.f20644 = null;
        this.f20646 = null;
        this.f20648 = null;
        return;
    L7:
        if ((r4 instanceof Long) == false) goto L11;
        this.f20644 = (Long) r4;
        this.f20646 = null;
        this.f20648 = null;
        return;
    L11:
        if ((r4 instanceof String) == false) goto L15;
        this.f20644 = null;
        this.f20646 = null;
        this.f20648 = (String) r4;
        return;
    L15:
        if ((r4 instanceof Double) == false) goto L19;
        this.f20644 = null;
        this.f20646 = (Double) r4;
        this.f20648 = null;
        return;
    L19:
        throw new IllegalArgumentException("User attribute given of un-supported type");
    }

    public C5724(C5776 r7) {
        String r4 = r7.f20905;
        this(r7.f20906, r7.f20907, r4, r7.f20908);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        ᵎﹶ.ⁱˊ(this, r1);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final Object m11024() {
        Long r0 = this.f20644;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Double r02 = this.f20646;
        if (r02 == null) goto L8;
        return r02;
    L8:
        String r03 = this.f20648;
        if (r03 == null) goto L11;
        return r03;
    L11:
        return null;
    }
}
