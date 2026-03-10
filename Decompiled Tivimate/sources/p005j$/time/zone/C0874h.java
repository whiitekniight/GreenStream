package p005j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: j$.time.zone.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C0874h implements PrivilegedAction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f3445a;

    public C0874h(List r1) {
        this.f3445a = r1;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String r1 = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (r1 != null) goto L12;
        C0875i.m3176b(new C0875i());
        return null;
    L12:
        C0875i r0 = (C0875i) C0875i.class.cast(Class.forName(r1, true, C0875i.class.getClassLoader()).newInstance());     // Catch: Exception -> L6
        C0875i.m3176b(r0);     // Catch: Exception -> L6
        ((ArrayList) this.f3445a).add(r0);     // Catch: Exception -> L6
        return null;
    L6:
        e = move-exception;
        throw new Error(e);
    }
}
