package p269;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import p099.AbstractC2234;
import p416.C5273;
import ʽⁱ.ᵎﹶ;

/* JADX INFO: renamed from: יᐧ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C3880 {

    /* JADX INFO: renamed from: ʽ */
    public final HashMap f14204;

    /* JADX INFO: renamed from: ˈ */
    public final HashMap f14205;

    /* JADX INFO: renamed from: ˑﹳ */
    public final int f14206;

    /* JADX INFO: renamed from: ⁱˊ */
    public final C3874 f14207;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C5273 f14208;

    /* JADX INFO: renamed from: ﾞᴵ */
    public int f14209;

    public C3880(int r3) {
        this.f14208 = new C5273(29);
        this.f14207 = new C3874(0);
        this.f14204 = new HashMap();
        this.f14205 = new HashMap();
        this.f14206 = r3;
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final synchronized void m8002(int r2) {
        monitor-enter(this);
        if (r2 < 40) goto L9;
        m8009();     // Catch: Throwable -> L6
    L17:
    L13:
        monitor-exit(this);
        return;
    L9:
        if (r2 < 20) goto L11;
    L12:
        m8003(this.f14206 / 2);     // Catch: Throwable -> L6
        goto L17
    L11:
        if (r2 != 15) goto L13;
    L6:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m8003(int r6) {
    L3:
        if (this.f14209 <= r6) goto L7;
        Object r0 = this.f14208.m10286();
        AbstractC2234.m5423(r0);
        C3878 r1 = m8005(r0.getClass());
        this.f14209 = this.f14209 - (r1.m8000() * r1.m8001(r0));
        m8008(r1.m8001(r0), r0.getClass());
        if (Log.isLoggable(r1.m7999(), 2) == false) goto L3;
        r1.m7999();
        String r02 = "evicted: " + r1.m8001(r0);
        goto L3
    }

    /* JADX INFO: renamed from: ˈ */
    public final synchronized Object m8004(int r4, Class r5) {
        monitor-enter(this);
        Integer r0 = (Integer) m8006(r5).ceilingKey(Integer.valueOf(r4));     // Catch: Throwable -> L16
        if (r0 == null) goto L18;
        int r1 = this.f14209;     // Catch: Throwable -> L16
        if (r1 != 0) goto L8;
    L12:
        C3874 r42 = this.f14207;     // Catch: Throwable -> L16
        int r02 = r0.intValue();     // Catch: Throwable -> L16
        InterfaceC3877 r12 = (InterfaceC3877) ((ArrayDeque) ((ᵎﹶ) r42).ʾˋ).poll();     // Catch: Throwable -> L16
        if (r12 != null) goto L15;
        r12 = r42.m7985();     // Catch: Throwable -> L16
    L15:
        C3873 r13 = (C3873) r12;     // Catch: Throwable -> L16
        r13.f14182 = r02;     // Catch: Throwable -> L16
        r13.f14181 = r5;     // Catch: Throwable -> L16
    L22:
        Object r43 = m8010(r13, r5);     // Catch: Throwable -> L16
        monitor-exit(this);
        return r43;
    L8:
        if ((this.f14206 / r1) >= 2) goto L12;
        if (r0.intValue() <= (r4 * 8)) goto L12;
    L18:
        C3874 r03 = this.f14207;     // Catch: Throwable -> L16
        InterfaceC3877 r14 = (InterfaceC3877) ((ArrayDeque) ((ᵎﹶ) r03).ʾˋ).poll();     // Catch: Throwable -> L16
        if (r14 != null) goto L21;
        r14 = r03.m7985();     // Catch: Throwable -> L16
    L21:
        r13 = (C3873) r14;     // Catch: Throwable -> L16
        r13.f14182 = r4;     // Catch: Throwable -> L16
        r13.f14181 = r5;     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final C3878 m8005(Class r4) {
        HashMap r0 = this.f14205;
        C3878 r1 = (C3878) r0.get(r4);
        if (r1 == null) goto L5;
        return r1;
    L5:
        if (r4.equals(int[].class) == false) goto L8;
        C3878 r12 = new C3878(1);
    L10:
        r0.put(r4, r12);
        return r12;
    L8:
        if (r4.equals(byte[].class) == false) goto L13;
        r12 = new C3878(0);
        goto L10
    L13:
        throw new IllegalArgumentException("No array pool found for: ".concat(r4.getSimpleName()));
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final NavigableMap m8006(Class r3) {
        HashMap r0 = this.f14204;
        NavigableMap r1 = (NavigableMap) r0.get(r3);
        if (r1 != null) goto L6;
        TreeMap r12 = new TreeMap();
        r0.put(r3, r12);
        return r12;
    L6:
        return r1;
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public final synchronized void m8007(Object r6) {
        monitor-enter(this);
        Class<?> r0 = r6.getClass();     // Catch: Throwable -> L15
        C3878 r1 = m8005(r0);     // Catch: Throwable -> L15
        int r2 = r1.m8001(r6);     // Catch: Throwable -> L15
        int r12 = r1.m8000() * r2;     // Catch: Throwable -> L15
        if (r12 > (this.f14206 / 2)) goto L17;
        C3874 r3 = this.f14207;     // Catch: Throwable -> L15
        InterfaceC3877 r4 = (InterfaceC3877) ((ArrayDeque) ((ᵎﹶ) r3).ʾˋ).poll();     // Catch: Throwable -> L15
        if (r4 != null) goto L8;
        r4 = r3.m7985();     // Catch: Throwable -> L15
    L8:
        C3873 r42 = (C3873) r4;     // Catch: Throwable -> L15
        r42.f14182 = r2;     // Catch: Throwable -> L15
        r42.f14181 = r0;     // Catch: Throwable -> L15
        this.f14208.m10285(r42, r6);     // Catch: Throwable -> L15
        NavigableMap r62 = m8006(r0);     // Catch: Throwable -> L15
        Integer r02 = (Integer) r62.get(Integer.valueOf(r42.f14182));     // Catch: Throwable -> L15
        Integer r22 = Integer.valueOf(r42.f14182);     // Catch: Throwable -> L15
        int r32 = 1;
        if (r02 == null) goto L12;
        r32 = 1 + r02.intValue();     // Catch: Throwable -> L15
    L12:
        r62.put(r22, Integer.valueOf(r32));     // Catch: Throwable -> L15
        this.f14209 += r12;
        m8003(this.f14206);     // Catch: Throwable -> L15
        monitor-exit(this);
        return;
    L17:
        monitor-exit(this);
        return;
    L15:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m8008(int r4, Class r5) {
        NavigableMap r52 = m8006(r5);
        Integer r0 = (Integer) r52.get(Integer.valueOf(r4));
        if (r0 == null) goto L11;
        if (r0.intValue() != 1) goto L8;
        r52.remove(Integer.valueOf(r4));
        return;
    L8:
        r52.put(Integer.valueOf(r4), Integer.valueOf(r0.intValue() - 1));
        return;
    L11:
        throw new NullPointerException("Tried to decrement empty size, size: " + r4 + ", this: " + this);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final synchronized void m8009() {
        monitor-enter(this);
        m8003(0);     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final Object m8010(C3873 r6, Class r7) {
        C3878 r0 = m8005(r7);
        Object r1 = this.f14208.m10290(r6);
        if (r1 == null) goto L5;
        this.f14209 = this.f14209 - (r0.m8000() * r0.m8001(r1));
        m8008(r0.m8001(r1), r7);
    L5:
        if (r1 == null) goto L7;
        return r1;
    L7:
        if (Log.isLoggable(r0.m7999(), 2) == false) goto L9;
        r0.m7999();
        String r02 = "Allocated " + r6.f14182 + " bytes";
    L9:
        int r62 = r6.f14182;
        switch(r0.f14203) {
            case 0: goto L13;
            default: goto L15;
        };
    L15:
        return new int[r62];
    L13:
        return new byte[r62];
    }
}
