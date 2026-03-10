package p367;

import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: ᵔˆ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C4819 extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ C4820 f17084;

    public C4819(C4820 r1, int r2) {
        this.f17084 = r1;
        super(r2);
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int r0 = ((ByteArrayOutputStream) this).count;
        if (r0 > 0) goto L5;
    L12:
        return new String(((ByteArrayOutputStream) this).buf, 0, r0, this.f17084.f17088.name());
    L9:
        e = move-exception;
        throw new AssertionError(e);
    L5:
        if (((ByteArrayOutputStream) this).buf[r0 - 1] != 13) goto L12;
        r0 = r0 - 1;
        goto L12
    }
}
