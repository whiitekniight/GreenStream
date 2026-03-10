package p005j$.util;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: j$.util.s0 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0969s0 implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3637a;

    public /* synthetic */ C0969s0(int r1) {
        this.f3637a = r1;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch(this.f3637a) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
    L7:
        return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
    L9:
        return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
    }
}
