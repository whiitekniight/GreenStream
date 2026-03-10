package p319;

import com.google.android.gms.internal.play_billing.ʽﹳ;
import p022.AbstractC1327;

/* JADX INFO: renamed from: ᐧـ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C4225 {

    /* JADX INFO: renamed from: ʽ */
    public final int f15523;

    /* JADX INFO: renamed from: ⁱˊ */
    public final long f15524;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f15525;

    public C4225(String r1, long r2, int r4) {
        this.f15525 = r1;
        this.f15524 = r2;
        this.f15523 = r4;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static ʽﹳ m8662() {
        ʽﹳ r0 = new ʽﹳ((byte) 0, 18);
        r0.ˈٴ = 0L;
        return r0;
    }

    public final boolean equals(Object r6) {
        if (r6 != this) goto L5;
        return true;
    L5:
        if ((r6 instanceof C4225) == false) goto L22;
        C4225 r62 = (C4225) r6;
        int r0 = r62.f15523;
        String r1 = r62.f15525;
        String r2 = this.f15525;
        if (r2 != null) goto L11;
        if (r1 == null) goto L13;
        return false;
    L13:
        if (this.f15524 != r62.f15524) goto L28;
        int r63 = this.f15523;
        if (r63 != 0) goto L19;
        if (r0 != 0) goto L29;
        return true;
    L29:
        return false;
    L19:
        if (AbstractC1327.m3732(r63, r0) == false) goto L30;
        return true;
    L30:
        return false;
    L28:
        return false;
    L11:
        if (r2.equals(r1) == true) goto L13;
        return false;
    L22:
        return false;
    }

    public final int hashCode() {
        int r0 = 0;
        String r1 = this.f15525;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        long r4 = this.f15524;
        int r13 = (((r12 ^ 1000003) * 1000003) ^ ((int) (r4 ^ (r4 >>> 32)))) * 1000003;
        int r2 = this.f15523;
        if (r2 == 0) goto L11;
        r0 = AbstractC1327.m3729(r2);
    L11:
        return r0 ^ r13;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("TokenResult{token=");
        r0.append(this.f15525);
        r0.append(", tokenExpirationTimestamp=");
        r0.append(this.f15524);
        r0.append(", responseCode=");
        int r2 = this.f15523;
        if (r2 != 1) goto L5;
        String r1 = "OK";
    L12:
        r0.append(r1);
        r0.append("}");
        return r0.toString();
    L5:
        if (r2 != 2) goto L7;
        r1 = "BAD_CONFIG";
        goto L12
    L7:
        if (r2 == 3) goto L9;
        r1 = "null";
        goto L12
    L9:
        r1 = "AUTH_ERROR";
        goto L12
    }
}
