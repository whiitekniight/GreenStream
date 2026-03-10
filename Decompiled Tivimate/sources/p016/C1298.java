package p016;

import android.support.v4.media.session.ⁱˊ;
import java.util.Arrays;
import p183.C3128;
import p183.InterfaceC3104;
import p183.InterfaceC3105;
import p317.AbstractC4195;
import p317.AbstractC4214;
import p317.C4207;
import p317.C4215;

/* JADX INFO: renamed from: ʻˆ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C1298 implements InterfaceC3104 {

    /* JADX INFO: renamed from: ʽʽ */
    public Object f4418;

    /* JADX INFO: renamed from: ʾˋ */
    public int f4419;

    /* JADX INFO: renamed from: ˈٴ */
    public Object f4420;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f4421;

    public C1298() {
        this.f4418 = new long[10];
        this.f4420 = new Object[10];
    }

    public C1298(int r7, float[] r8, float[] r9, int r10) {
        this.f4419 = r7;
        if ((((long) r8.length) * 2) != (((long) r9.length) * 3)) goto L5;
        boolean r72 = true;
    L6:
        AbstractC4214.m8560(r72);
        this.f4418 = r8;
        this.f4420 = r9;
        this.f4421 = r10;
        return;
    L5:
        r72 = false;
        goto L6
    }

    public C1298(C1298 r3) {
        float[] r0 = (float[]) r3.f4418;
        this.f4419 = r0.length / 3;
        this.f4418 = AbstractC4214.m8572(r0);
        this.f4420 = AbstractC4214.m8572((float[]) r3.f4420);
        int r32 = r3.f4421;
        if (r32 != 1) goto L5;
        this.f4421 = 5;
        return;
    L5:
        if (r32 == 2) goto L8;
        this.f4421 = 4;
        return;
    L8:
        this.f4421 = 6;
    }

    /* JADX INFO: renamed from: ʼˎ */
    public Object m3669() {
        if (this.f4421 <= 0) goto L5;
        boolean r0 = true;
    L6:
        AbstractC4214.m8568(r0);
        Object[] r02 = (Object[]) this.f4420;
        int r2 = this.f4419;
        Object r3 = r02[r2];
        r02[r2] = null;
        this.f4419 = (r2 + 1) % r02.length;
        this.f4421--;
        return r3;
    L5:
        r0 = false;
        goto L6
    }

    @Override // p183.InterfaceC3104
    /* JADX INFO: renamed from: ʽ */
    public C3128 mo3670(InterfaceC3105 r19, long r20) {
        long r5 = r19.getPosition();
        int r1 = (int) Math.min(this.f4421, r19.getLength() - r5);
        C4215 r2 = (C4215) this.f4420;
        r2.m8597(r1);
        r19.mo5287(r2.f15476, 0, r1);
        int r12 = r2.f15474;
        long r3 = -1;
        long r9 = -1;
        long r13 = -9223372036854775807L;
    L4:
        if (r2.m8615() < 188) goto L30;
        byte[] r11 = r2.f15476;
        int r122 = r2.f15475;
    L6:
        if (r122 >= r12) goto L10;
        long r16 = -9223372036854775807L;
        if (r11[r122] == 71) goto L11;
        r122 = r122 + 1;
    L11:
        int r7 = r122 + 188;
        if (r7 > r12) goto L32;
        long r32 = ⁱˊ.ˉˆ(r2, r122, this.f4419);
        if (r32 == r16) goto L29;
        long r33 = ((C4207) this.f4418).m8542(r32);
        if (r33 > r20) goto L19;
        if ((100000 + r33) > r20) goto L27;
        r13 = r33;
        r9 = r122;
        goto L29
    L27:
        return new C3128(0, -9223372036854775807L, r5 + ((long) r122));
    L19:
        if (r13 != r16) goto L23;
        return new C3128(-1, r33, r5);
    L23:
        return new C3128(0, -9223372036854775807L, r5 + r9);
    L29:
        r2.m8607(r7);
        r3 = r7;
    L32:
        if (r13 == r16) goto L36;
        return new C3128(-2, r13, r5 + r3);
    L36:
        return C3128.f10971;
    L10:
        r16 = -9223372036854775807L;
        goto L11
    L30:
        r16 = -9223372036854775807L;
        goto L32
    }

    /* JADX INFO: renamed from: ˆʾ */
    public synchronized int m3671() {
        monitor-enter(this);
        int r0 = this.f4421;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ˈ */
    public void m3672() {
        int r0 = ((Object[]) this.f4420).length;
        if (this.f4421 >= r0) goto L5;
        return;
    L5:
        int r1 = r0 * 2;
        long[] r2 = new long[r1];
        Object[] r12 = new Object[r1];
        int r3 = this.f4419;
        int r02 = r0 - r3;
        System.arraycopy((long[]) this.f4418, r3, r2, 0, r02);
        System.arraycopy((Object[]) this.f4420, this.f4419, r12, 0, r02);
        int r32 = this.f4419;
        if (r32 <= 0) goto L8;
        System.arraycopy((long[]) this.f4418, 0, r2, r02, r32);
        System.arraycopy((Object[]) this.f4420, 0, r12, r02, this.f4419);
    L8:
        this.f4418 = r2;
        this.f4420 = r12;
        this.f4419 = 0;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public Object m3673(boolean r9, long r10) {
        Object r0 = null;
        long r1 = Long.MAX_VALUE;
    L4:
        if (this.f4421 <= 0) goto L12;
        long r4 = r10 - ((long[]) this.f4418)[this.f4419];
        if (r4 >= 0) goto L11;
        if (r9 == true) goto L12;
        if ((-r4) >= r1) goto L12;
    L11:
        r0 = m3669();
        r1 = r4;
    L12:
        return r0;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public synchronized Object m3674() {
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L4:
        if (this.f4421 != 0) goto L6;
        Object r0 = null;
    L7:
        monitor-exit(this);
        return r0;
    L6:
        r0 = m3669();     // Catch: Throwable -> L9
        goto L7
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public synchronized Object m3675(long r2) {
        monitor-enter(this);
        Object r22 = m3673(true, r2);     // Catch: Throwable -> L7
        monitor-exit(this);
        return r22;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public synchronized void m3676() {
        monitor-enter(this);
        this.f4419 = 0;     // Catch: Throwable -> L7
        this.f4421 = 0;     // Catch: Throwable -> L7
        Arrays.fill((Object[]) this.f4420, null);     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public synchronized void m3677(long r5, Object r7) {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (this.f4421 > 0) goto L6;
    L8:
        m3672();     // Catch: Throwable -> L11
        int r0 = this.f4419;     // Catch: Throwable -> L11
        int r1 = this.f4421;     // Catch: Throwable -> L11
        Object[] r2 = (Object[]) this.f4420;     // Catch: Throwable -> L11
        int r02 = (r0 + r1) % r2.length;     // Catch: Throwable -> L11
        ((long[]) this.f4418)[r02] = r5;     // Catch: Throwable -> L11
        r2[r02] = r7;     // Catch: Throwable -> L11
        this.f4421 = r1 + 1;     // Catch: Throwable -> L11
        monitor-exit(this);
        return;
    L6:
        if (r5 > ((long[]) this.f4418)[((this.f4419 + r0) - 1) % ((Object[]) this.f4420).length]) goto L8;
        m3676();     // Catch: Throwable -> L11
        goto L8
    }

    @Override // p183.InterfaceC3104
    /* JADX INFO: renamed from: ﾞᴵ */
    public void mo3678() {
        C4215 r0 = (C4215) this.f4420;
        byte[] r1 = AbstractC4195.f15422;
        r0.getClass();
        r0.m8608(r1.length, r1);
    }
}
