package p303;

import android.support.v4.media.session.AbstractC0002;
import p317.AbstractC4214;

/* JADX INFO: renamed from: ٴᴵ.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public final class C4096 {

    /* JADX INFO: renamed from: ʽ */
    public final String f15079;

    /* JADX INFO: renamed from: ˈ */
    public int f15080;

    /* JADX INFO: renamed from: ⁱˊ */
    public final long f15081;

    /* JADX INFO: renamed from: ﹳٴ */
    public final long f15082;

    public C4096(long r1, long r3, String r5) {
        if (r5 != null) goto L5;
        r5 = "";
    L5:
        this.f15079 = r5;
        this.f15082 = r1;
        this.f15081 = r3;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L17:
        return false;
    L8:
        if (C4096.class != r7.getClass()) goto L17;
        C4096 r72 = (C4096) r7;
        if (this.f15082 != r72.f15082) goto L17;
        if (this.f15081 != r72.f15081) goto L17;
        if (this.f15079.equals(r72.f15079) == false) goto L17;
        return true;
    }

    public final int hashCode() {
        if (this.f15080 != 0) goto L6;
        int r1 = (((527 + ((int) this.f15082)) * 31) + ((int) this.f15081)) * 31;
        this.f15080 = this.f15079.hashCode() + r1;
    L6:
        return this.f15080;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("RangedUri(referenceUri=");
        r0.append(this.f15079);
        r0.append(", start=");
        r0.append(this.f15082);
        r0.append(", length=");
        return AbstractC0002.m8(r0, this.f15081, ")");
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final C4096 m8287(C4096 r17, String r18) {
        String r9 = AbstractC4214.m8557(r18, this.f15079);
        if (r17 == null) goto L6;
        long r4 = r17.f15081;
        if (r9.equals(AbstractC4214.m8557(r18, r17.f15079)) == false) goto L6;
        long r6 = this.f15081;
        long r10 = -1;
        if (r6 == (-1)) goto L17;
        long r7 = r4;
        long r5 = this.f15082;
        C4096 r2 = null;
        if ((r5 + r6) != r17.f15082) goto L19;
        if (r7 == (-1)) goto L16;
        r10 = r6 + r7;
    L16:
        return new C4096(r5, r10, r9);
    L19:
        if (r7 == (-1)) goto L29;
        long r52 = r17.f15082;
        if ((r52 + r7) == this.f15082) goto L23;
        return r2;
    L23:
        if (r6 == (-1)) goto L27;
        r10 = r7 + r6;
    L27:
        return new C4096(r52, r10, r9);
    L29:
        return r2;
    L17:
        r2 = null;
        r7 = r4;
    L6:
        return null;
    }
}
