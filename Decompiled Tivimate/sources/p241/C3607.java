package p241;

import java.io.Writer;

/* JADX INFO: renamed from: ˑʼ.ᵎʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C3607 extends Writer {

    /* JADX INFO: renamed from: ʾˋ */
    public final String f12881;

    /* JADX INFO: renamed from: ᴵˊ */
    public final StringBuilder f12882;

    public C3607() {
        this.f12882 = new StringBuilder(128);
        this.f12881 = "FragmentManager";
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m7524();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m7524();
    }

    @Override // java.io.Writer
    public final void write(char[] r4, int r5, int r6) {
        int r0 = 0;
    L3:
        if (r0 >= r6) goto L9;
        char r1 = r4[r5 + r0];
        if (r1 != '\n') goto L7;
        m7524();
    L8:
        r0 = r0 + 1;
        goto L3
    L7:
        this.f12882.append(r1);
        goto L8
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m7524() {
        StringBuilder r0 = this.f12882;
        if (r0.length() <= 0) goto L6;
        String r1 = this.f12881;
        r0.toString();
        r0.delete(0, r0.length());
        return;
    }
}
