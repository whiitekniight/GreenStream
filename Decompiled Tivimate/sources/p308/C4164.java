package p308;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import p249.C3685;
import p343.C4673;
import p343.C4679;

/* JADX INFO: renamed from: ٴﾞ.ᴵᵔ */
/* JADX INFO: loaded from: classes.dex */
public final class C4164 implements Handler.Callback {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f15348;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ Object f15349;

    public /* synthetic */ C4164(int r1, Object r2) {
        this.f15348 = r1;
        this.f15349 = r2;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    private final boolean m8428(Message r2) {
        if (r2.what == 0) goto L6;
        return false;
    L6:
        C3685 r0 = (C3685) this.f15349;
        if (r2.obj != null) goto L16;
        monitor-enter(r0.f13196);
        throw null;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    L16:
        throw new ClassCastException();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r7) {
        switch(this.f15348) {
            case 0: goto L14;
            case 1: goto L13;
            default: goto L4;
        };
    L4:
        C4679 r0 = (C4679) this.f15349;
        int r1 = r7.what;
        if (r1 != 1) goto L8;
        r0.m9301((C4673) r7.obj);
        return true;
    L8:
        if (r1 != 2) goto L10;
        C4673 r72 = (C4673) r7.obj;
        r0.f16569.m1223(r72);
    L10:
        return false;
    L14:
        int r12 = r7.what;
        if (r12 == 0) goto L36;
        if (r12 != 1) goto L58;
        HashMap r13 = ((C4156) this.f15349).f15310;
        monitor-enter(r13);
        C4147 r73 = (C4147) r7.obj;     // Catch: Throwable -> L27
        ServiceConnectionC4152 r2 = (ServiceConnectionC4152) ((C4156) this.f15349).f15310.get(r73);     // Catch: Throwable -> L27
        if (r2 != null) goto L23;
    L32:
        monitor-exit(r13);     // Catch: Throwable -> L27
    L50:
        return true;
    L23:
        if (r2.f15296 != 3) goto L32;
        "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(r73));     // Catch: Throwable -> L27
        new Exception();     // Catch: Throwable -> L27
        ComponentName r02 = r2.f15294;     // Catch: Throwable -> L27
        if (r02 != null) goto L29;
        r73.getClass();     // Catch: Throwable -> L27
        r02 = null;
    L29:
        if (r02 != null) goto L31;
        String r74 = r73.f15286;     // Catch: Throwable -> L27
        AbstractC4142.m8398(r74);     // Catch: Throwable -> L27
        r02 = new ComponentName(r74, "unknown");     // Catch: Throwable -> L27
    L31:
        r2.onServiceDisconnected(r02);     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        throw th;
    L58:
        return false;
    L36:
        HashMap r03 = ((C4156) this.f15349).f15310;
        monitor-enter(r03);
        C4147 r75 = (C4147) r7.obj;     // Catch: Throwable -> L46
        ServiceConnectionC4152 r14 = (ServiceConnectionC4152) ((C4156) this.f15349).f15310.get(r75);     // Catch: Throwable -> L46
        if (r14 != null) goto L41;
    L48:
        monitor-exit(r03);     // Catch: Throwable -> L46
        goto L50
    L41:
        if (r14.f15292.isEmpty() == false) goto L48;
        if (r14.f15291 == false) goto L45;
        C4147 r4 = r14.f15297;     // Catch: Throwable -> L46
        r14.f15295.f15306.removeMessages(1, r4);     // Catch: Throwable -> L46
        C4156 r42 = r14.f15295;     // Catch: Throwable -> L46
        r42.f15307.m7331(r42.f15309, r14);     // Catch: Throwable -> L46
        r14.f15291 = false;     // Catch: Throwable -> L46
        r14.f15296 = 2;     // Catch: Throwable -> L46
    L45:
        ((C4156) this.f15349).f15310.remove(r75);     // Catch: Throwable -> L46
    L46:
        th = move-exception;
        throw th;
    L13:
        return m8428(r7);
    }
}
