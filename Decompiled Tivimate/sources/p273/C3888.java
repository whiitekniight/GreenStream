package p273;

import p005j$.util.Objects;

/* JADX INFO: renamed from: ـʽ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C3888 extends AbstractC3892 {

    /* JADX INFO: renamed from: ʿ */
    public String f14287;

    /* JADX INFO: renamed from: ˈⁱ */
    public int f14288;

    /* JADX INFO: renamed from: ˉـ */
    public long f14289;

    /* JADX INFO: renamed from: ᴵˑ */
    public byte[] f14290;

    /* JADX INFO: renamed from: ﹳـ */
    public int f14291;

    public C3888() {
        this.f4770 = 3;
    }

    @Override // p273.AbstractC3892
    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L24:
        return false;
    L8:
        if (C3888.class != r7.getClass()) goto L24;
        if (super.equals(r7) == true) goto L13;
        return false;
    L13:
        C3888 r72 = (C3888) r7;
        C3886 r2 = this.f14315;
        if (r2 == null) goto L16;
        long r22 = r2.f14283;
    L17:
        C3886 r4 = r72.f14315;
        if (r4 == null) goto L20;
        long r42 = r4.f14283;
    L22:
        if (r22 != r42) goto L24;
        return true;
    L20:
        r42 = r72.f14289;
        goto L22
    L16:
        r22 = this.f14289;
        goto L17
    }

    public final int hashCode() {
        String r0 = this.f14322;
        C3886 r1 = this.f14315;
        if (r1 == null) goto L5;
        long r12 = r1.f14283;
    L7:
        return Objects.hash(new Object[]{r0, Long.valueOf(r12)});
    L5:
        r12 = this.f14289;
        goto L7
    }

    @Override // p024.AbstractC1388
    public final String toString() {
        return this.f14322;
    }
}
