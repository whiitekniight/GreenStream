package p423;

import java.io.File;
import p134.C2579;

/* JADX INFO: renamed from: ﹳˎ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C5388 {

    /* JADX INFO: renamed from: ʽ */
    public final File f19247;

    /* JADX INFO: renamed from: ⁱˊ */
    public final String f19248;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C2579 f19249;

    public C5388(C2579 r1, String r2, File r3) {
        this.f19249 = r1;
        if (r2 == null) goto L7;
        this.f19248 = r2;
        this.f19247 = r3;
        return;
    L7:
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object r3) {
        if (r3 != this) goto L5;
        return true;
    L5:
        if ((r3 instanceof C5388) == false) goto L14;
        C5388 r32 = (C5388) r3;
        if (this.f19249.equals(r32.f19249) == true) goto L9;
        return false;
    L9:
        if (this.f19248.equals(r32.f19248) == true) goto L11;
        return false;
    L11:
        if (this.f19247.equals(r32.f19247) == false) goto L19;
        return true;
    L19:
        return false;
    L14:
        return false;
    }

    public final int hashCode() {
        return ((((this.f19249.hashCode() ^ 1000003) * 1000003) ^ this.f19248.hashCode()) * 1000003) ^ this.f19247.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f19249 + ", sessionId=" + this.f19248 + ", reportFile=" + this.f19247 + "}";
    }
}
