package p005j$.util.stream;

import java.util.Arrays;
import p005j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.U2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1072U2 extends AbstractC1108c implements Iterable {

    /* JADX INFO: renamed from: e */
    public Object f3806e;

    /* JADX INFO: renamed from: f */
    public Object[] f3807f;

    public AbstractC1072U2() {
        this.f3806e = newArray(16);
    }

    public AbstractC1072U2(int r2) {
        super(r2);
        this.f3806e = newArray(1 << this.f3885a);
    }

    /* JADX INFO: renamed from: b */
    public Object mo3272b() {
        long r0 = count();
        if (r0 >= 2147483639) goto L7;
        Object r02 = newArray((int) r0);
        mo3273f(0, r02);
        return r02;
    L7:
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // p005j$.util.stream.AbstractC1108c
    public final void clear() {
        Object[] r0 = this.f3807f;
        if (r0 == null) goto L5;
        this.f3806e = r0[0];
        this.f3807f = null;
        this.f3888d = null;
    L5:
        this.f3886b = 0;
        this.f3887c = 0;
    }

    /* JADX INFO: renamed from: f */
    public void mo3273f(int r7, Object r8) {
        long r0 = r7;
        long r2 = count() + r0;
        if (r2 > mo3304q(r8)) goto L19;
        if (r2 < r0) goto L19;
        if (this.f3887c != 0) goto L10;
        System.arraycopy(this.f3806e, 0, r8, r7, this.f3886b);
        return;
    L10:
        int r02 = 0;
    L12:
        if (r02 >= this.f3887c) goto L14;
        Object r22 = this.f3807f[r02];
        System.arraycopy(r22, 0, r8, r7, mo3304q(r22));
        r7 = r7 + mo3304q(this.f3807f[r02]);
        r02 = r02 + 1;
        goto L12
    L14:
        int r03 = this.f3886b;
        if (r03 <= 0) goto L21;
        System.arraycopy(this.f3806e, 0, r8, r7, r03);
        return;
    L21:
        return;
    L19:
        throw new IndexOutOfBoundsException("does not fit");
    }

    /* JADX INFO: renamed from: g */
    public void mo3274g(Object r5) {
        int r1 = 0;
    L4:
        if (r1 >= this.f3887c) goto L6;
        Object r2 = this.f3807f[r1];
        mo3303p(r2, 0, mo3304q(r2), r5);
        r1 = r1 + 1;
        goto L4
    L6:
        mo3303p(this.f3806e, 0, this.f3886b, r5);
    }

    public abstract Object newArray(int r1);

    /* JADX INFO: renamed from: p */
    public abstract void mo3303p(Object r1, int r2, int r3, Object r4);

    /* JADX INFO: renamed from: q */
    public abstract int mo3304q(Object r1);

    /* JADX INFO: renamed from: r */
    public final int m3317r(long r7) {
        int r1 = 0;
        if (this.f3887c != 0) goto L10;
        if (r7 >= this.f3886b) goto L8;
        return 0;
    L8:
        throw new IndexOutOfBoundsException(Long.toString(r7));
    L10:
        if (r7 >= count()) goto L20;
    L12:
        if (r1 > this.f3887c) goto L18;
        if (r7 < (this.f3888d[r1] + ((long) mo3304q(this.f3807f[r1])))) goto L15;
        r1 = r1 + 1;
        goto L12
    L15:
        return r1;
    L18:
        throw new IndexOutOfBoundsException(Long.toString(r7));
    L20:
        throw new IndexOutOfBoundsException(Long.toString(r7));
    }

    /* JADX INFO: renamed from: s */
    public final void m3318s(long r12) {
        int r0 = this.f3887c;
        if (r0 != 0) goto L5;
        long r02 = mo3304q(this.f3806e);
    L7:
        if (r12 > r02) goto L9;
        return;
    L9:
        if (this.f3807f != null) goto L11;
        Object[] r2 = mo3305t();
        this.f3807f = r2;
        this.f3888d = new long[8];
        r2[0] = this.f3806e;
    L11:
        int r22 = this.f3887c + 1;
    L13:
        if (r12 <= r02) goto L28;
        Object[] r4 = this.f3807f;
        if (r22 < r4.length) goto L17;
        int r5 = r4.length * 2;
        this.f3807f = Arrays.copyOf(r4, r5);
        this.f3888d = Arrays.copyOf(this.f3888d, r5);
    L17:
        int r42 = this.f3885a;
        if (r22 == 0) goto L22;
        if (r22 == 1) goto L22;
        r42 = Math.min((r42 + r22) - 1, 30);
    L22:
        int r43 = 1 << r42;
        this.f3807f[r22] = newArray(r43);
        long[] r52 = this.f3888d;
        int r6 = r22 - 1;
        r52[r22] = r52[r6] + ((long) mo3304q(this.f3807f[r6]));
        r02 = r02 + ((long) r43);
        r22 = r22 + 1;
        goto L13
    L28:
        return;
    L5:
        r02 = ((long) mo3304q(this.f3807f[r0])) + this.f3888d[r0];
        goto L7
    }

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    /* JADX INFO: renamed from: t */
    public abstract Object[] mo3305t();

    /* JADX INFO: renamed from: u */
    public final void m3319u() {
        if (this.f3886b == mo3304q(this.f3806e)) goto L5;
        return;
    L5:
        if (this.f3807f != null) goto L7;
        Object[] r0 = mo3305t();
        this.f3807f = r0;
        this.f3888d = new long[8];
        r0[0] = this.f3806e;
    L7:
        int r02 = this.f3887c;
        int r2 = r02 + 1;
        Object[] r3 = this.f3807f;
        if (r2 < r3.length) goto L10;
    L11:
        if (r02 != 0) goto L13;
        long r22 = mo3304q(this.f3806e);
    L14:
        m3318s(r22 + 1);
    L15:
        this.f3886b = 0;
        int r03 = this.f3887c + 1;
        this.f3887c = r03;
        this.f3806e = this.f3807f[r03];
        return;
    L13:
        r22 = ((long) mo3304q(r3[r02])) + this.f3888d[r02];
        goto L14
    L10:
        if (r3[r2] != null) goto L15;
        goto L11
    }
}
