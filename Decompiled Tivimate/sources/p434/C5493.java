package p434;

import java.io.InputStream;

/* JADX INFO: renamed from: ﹳﹳ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C5493 extends C5491 {
    public C5493(InputStream r2) {
        super(r2);
        if (r2.markSupported() == false) goto L7;
        this.f19688.mark(Integer.MAX_VALUE);
        return;
    L7:
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }

    public C5493(byte[] r2) {
        super(r2);
        this.f19688.mark(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final void m10603(long r4) {
        int r0 = this.f19687;
        if (r0 <= r4) goto L5;
        this.f19687 = 0;
        this.f19688.reset();
    L6:
        m10602((int) r4);
        return;
    L5:
        r4 = r4 - ((long) r0);
        goto L6
    }
}
