package p063;

/* JADX INFO: renamed from: ʽᐧ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C1882 implements Comparable {

    /* JADX INFO: renamed from: ʾˋ */
    public final long f6420;

    /* JADX INFO: renamed from: ᴵˊ */
    public final byte[] f6421;

    public C1882(long r1, byte[] r3) {
        this.f6420 = r1;
        this.f6421 = r3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r5) {
        return Long.compare(this.f6420, ((C1882) r5).f6420);
    }
}
