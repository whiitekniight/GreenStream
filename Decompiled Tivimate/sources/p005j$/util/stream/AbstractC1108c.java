package p005j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1108c {

    /* JADX INFO: renamed from: a */
    public final int f3885a;

    /* JADX INFO: renamed from: b */
    public int f3886b;

    /* JADX INFO: renamed from: c */
    public int f3887c;

    /* JADX INFO: renamed from: d */
    public long[] f3888d;

    public AbstractC1108c() {
        this.f3885a = 4;
    }

    public AbstractC1108c(int r4) {
        if (r4 < 0) goto L7;
        this.f3885a = Math.max(4, 32 - Integer.numberOfLeadingZeros(r4 - 1));
        return;
    L7:
        throw new IllegalArgumentException("Illegal Capacity: " + r4);
    }

    public abstract void clear();

    public final long count() {
        int r0 = this.f3887c;
        if (r0 != 0) goto L7;
        return this.f3886b;
    L7:
        return this.f3888d[r0] + ((long) this.f3886b);
    }
}
