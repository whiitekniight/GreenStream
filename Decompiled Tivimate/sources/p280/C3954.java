package p280;

import java.util.ArrayList;

/* JADX INFO: renamed from: ـˎ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3954 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final ArrayList f14576;

    /* JADX INFO: renamed from: ﹳٴ */
    public final String f14577;

    public C3954(String r1, ArrayList r2) {
        if (r1 == null) goto L7;
        this.f14577 = r1;
        this.f14576 = r2;
        return;
    L7:
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object r3) {
        if (r3 != this) goto L5;
        return true;
    L5:
        if ((r3 instanceof C3954) == false) goto L12;
        C3954 r32 = (C3954) r3;
        if (this.f14577.equals(r32.f14577) == true) goto L9;
        return false;
    L9:
        if (this.f14576.equals(r32.f14576) == false) goto L16;
        return true;
    L16:
        return false;
    L12:
        return false;
    }

    public final int hashCode() {
        return ((this.f14577.hashCode() ^ 1000003) * 1000003) ^ this.f14576.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f14577 + ", usedDates=" + this.f14576 + "}";
    }
}
