package p005j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: j$.util.stream.u1 */
/* JADX INFO: loaded from: classes2.dex */
public class C1200u1 extends CountedCompleter {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1001G0 f4000a;

    /* JADX INFO: renamed from: b */
    public final int f4001b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f4002c;

    /* JADX INFO: renamed from: d */
    public final Object f4003d;

    public C1200u1(InterfaceC1001G0 r1, Object r2, int r3) {
        this.f4002c = r3;
        this.f4000a = r1;
        this.f4001b = 0;
        this.f4003d = r2;
    }

    public C1200u1(C1200u1 r2, InterfaceC0996F0 r3, int r4) {
        this.f4002c = 0;
        this(r2, r3, r4, (byte) 0);
        this.f4003d = r2.f4003d;
    }

    public C1200u1(C1200u1 r2, InterfaceC1001G0 r3, int r4) {
        this.f4002c = 1;
        this(r2, r3, r4, (byte) 0);
        this.f4003d = (Object[]) r2.f4003d;
    }

    public C1200u1(C1200u1 r1, InterfaceC1001G0 r2, int r3, byte r4) {
        super(r1);
        this.f4000a = r2;
        this.f4001b = r3;
    }

    /* JADX INFO: renamed from: a */
    public final C1200u1 m3395a(int r3, int r4) {
        switch(this.f4002c) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new C1200u1(this, this.f4000a.mo3271a(r3), r4);
    L7:
        return new C1200u1(this, ((InterfaceC0996F0) this.f4000a).mo3271a(r3), r4);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        C1200u1 r0 = this;
    L4:
        if (r0.f4000a.mo3278o() == 0) goto L6;
        r0.setPendingCount(r0.f4000a.mo3278o() - 1);
        int r1 = 0;
        int r2 = 0;
    L13:
        if (r1 >= (r0.f4000a.mo3278o() - 1)) goto L15;
        C1200u1 r3 = r0.m3395a(r1, r0.f4001b + r2);
        r2 = (int) (r3.f4000a.count() + r2);
        r3.fork();
        r1 = r1 + 1;
        goto L13
    L15:
        r0 = r0.m3395a(r1, r0.f4001b + r2);
        goto L4
    L6:
        switch(r0.f4002c) {
            case 0: goto L8;
            default: goto L7;
        };
    L7:
        r0.f4000a.mo3276k((Object[]) r0.f4003d, r0.f4001b);
    L9:
        r0.propagateCompletion();
        return;
    L8:
        ((InterfaceC0996F0) r0.f4000a).mo3273f(r0.f4001b, r0.f4003d);
        goto L9
    }
}
