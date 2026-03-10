package p463;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ﾞʾ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C5846 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final long f21345;

    public C5846(long r1) {
        this.f21345 = r1;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L13:
        return false;
    L8:
        if (C5846.class != r7.getClass()) goto L13;
        if (this.f21345 != ((C5846) r7).f21345) goto L13;
        return true;
    }

    public final int hashCode() {
        long r1 = this.f21345;
        return (int) (r1 ^ (r1 >>> 32));
    }

    public final String toString() {
        return new Date(TimeUnit.MILLISECONDS.convert((this.f21345 - 116444736000000000L) * 100, TimeUnit.NANOSECONDS)).toString();
    }
}
