package p029;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ʼʻ.ʽʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1434 {

    /* JADX INFO: renamed from: ʽ */
    public boolean f4836;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f4837;

    /* JADX INFO: renamed from: ﹳٴ */
    public Object[] f4838;

    public AbstractC1434(int r2) {
        AbstractC1487.m3993(r2, "initialCapacity");
        this.f4838 = new Object[r2];
        this.f4837 = 0;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static int m3945(int r1, int r2) {
        if (r2 < 0) goto L12;
        if (r2 > r1) goto L5;
        return r1;
    L5:
        int r12 = (r1 + (r1 >> 1)) + 1;
        if (r12 >= r2) goto L8;
        r12 = Integer.highestOneBit(r2 - 1) << 1;
    L8:
        if (r12 >= 0) goto L13;
        return Integer.MAX_VALUE;
    L13:
        return r12;
    L12:
        throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
    }

    /* JADX INFO: renamed from: ʽ */
    public abstract AbstractC1434 mo3946(Object r1);

    /* JADX INFO: renamed from: ˈ */
    public final void m3947(Iterable r3) {
        if ((r3 instanceof Collection) == false) goto L8;
        Collection r0 = (Collection) r3;
        m3948(r0.size());
        if ((r0 instanceof AbstractC1445) == false) goto L8;
        Object[] r32 = this.f4838;
        this.f4837 = ((AbstractC1445) r0).mo3918(this.f4837, r32);
        return;
    L8:
        Iterator r33 = r3.iterator();
    L10:
        if (r33.hasNext() == false) goto L12;
        mo3946(r33.next());
        goto L10
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final void m3948(int r4) {
        Object[] r0 = this.f4838;
        int r42 = m3945(r0.length, this.f4837 + r4);
        if (r42 <= r0.length) goto L5;
    L8:
        this.f4838 = Arrays.copyOf(this.f4838, r42);
        this.f4836 = false;
        return;
    L5:
        if (this.f4836 == true) goto L8;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m3949(Object... r5) {
        int r0 = r5.length;
        AbstractC1487.m4004(r0, r5);
        m3948(r0);
        System.arraycopy(r5, 0, this.f4838, this.f4837, r0);
        this.f4837 += r0;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m3950(Object r4) {
        r4.getClass();
        m3948(1);
        Object[] r0 = this.f4838;
        int r1 = this.f4837;
        this.f4837 = r1 + 1;
        r0[r1] = r4;
    }
}
