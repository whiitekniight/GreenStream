package p029;

import java.io.Serializable;

/* JADX INFO: renamed from: ʼʻ.ˉـ */
/* JADX INFO: loaded from: classes.dex */
public final class C1449 extends AbstractC1438 implements Serializable {

    /* JADX INFO: renamed from: ʽʽ */
    public static final C1449 f4863 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final C1449 f4864 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f4865;

    static {
        f4864 = new C1449(0);
        f4863 = new C1449(1);
    }

    public /* synthetic */ C1449(int r1) {
        this.f4865 = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r2, Object r3) {
        switch(this.f4865) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        Comparable r22 = (Comparable) r2;
        Comparable r32 = (Comparable) r3;
        r22.getClass();
        if (r22 != r32) goto L8;
        return 0;
    L8:
        return r32.compareTo(r22);
    L9:
        Comparable r23 = (Comparable) r2;
        Comparable r33 = (Comparable) r3;
        r23.getClass();
        r33.getClass();
        return r23.compareTo(r33);
    }

    public final String toString() {
        switch(this.f4865) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return "Ordering.natural().reverse()";
    L6:
        return "Ordering.natural()";
    }

    @Override // p029.AbstractC1438
    /* JADX INFO: renamed from: ﹳٴ */
    public final AbstractC1438 mo3953() {
        switch(this.f4865) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return f4864;
    L7:
        return f4863;
    }
}
