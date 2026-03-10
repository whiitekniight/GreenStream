package p024;

import java.util.ArrayList;

/* JADX INFO: renamed from: ʻᴵ.ـˆ */
/* JADX INFO: loaded from: classes.dex */
public final class C1378 implements Comparable {

    /* JADX INFO: renamed from: ʾˋ */
    public final ArrayList f4712;

    /* JADX INFO: renamed from: ᴵˊ */
    public long f4713;

    public C1378() {
        this.f4713 = -9223372036854775807L;
        this.f4712 = new ArrayList();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r5) {
        return Long.compare(this.f4713, ((C1378) r5).f4713);
    }
}
