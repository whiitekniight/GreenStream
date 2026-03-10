package p005j$.time.zone;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import p005j$.util.Objects;
import p005j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.zone.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C0875i {

    /* JADX INFO: renamed from: b */
    public static final CopyOnWriteArrayList f3446b = null;

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f3447c = null;

    /* JADX INFO: renamed from: d */
    public static volatile Set f3448d;

    /* JADX INFO: renamed from: a */
    public final Set f3449a;

    static {
        CopyOnWriteArrayList r0 = new CopyOnWriteArrayList();
        f3446b = r0;
        f3447c = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList r1 = new ArrayList();
        AccessController.doPrivileged(new C0874h(r1));
        r0.addAll(r1);
    }

    public C0875i() {
        LinkedHashSet r0 = new LinkedHashSet();
        String[] r1 = TimeZone.getAvailableIDs();
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        r0.add(r1[r3]);
        r3 = r3 + 1;
        goto L3
    L5:
        this.f3449a = Collections.unmodifiableSet(r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static C0872f m3175a(String r3) {
        Objects.requireNonNull(r3, "zoneId");
        ConcurrentHashMap r0 = f3447c;
        C0875i r1 = (C0875i) r0.get(r3);
        if (r1 != null) goto L11;
        if (r0.isEmpty() == false) goto L9;
        throw new C0873g("No time-zone data files registered");
    L9:
        throw new C0873g("Unknown time-zone ID: " + r3);
    L11:
        if (r1.f3449a.contains(r3) == false) goto L15;
        return new C0872f(TimeZone.getTimeZone(r3));
    L15:
        throw new C0873g("Not a built-in time zone: " + r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m3176b(C0875i r5) {
        Objects.requireNonNull(r5, "provider");
        monitor-enter(C0875i.class);
        Iterator r1 = r5.f3449a.iterator();     // Catch: Throwable -> L12
    L6:
        if (r1.hasNext() == false) goto L14;
        String r2 = (String) r1.next();     // Catch: Throwable -> L12
        Objects.requireNonNull(r2, "zoneId");     // Catch: Throwable -> L12
        if (((C0875i) f3447c.putIfAbsent(r2, r5)) == null) goto L6;
        throw new C0873g("Unable to register zone as one already registered with that ID: " + r2 + ", currently loading from provider: " + r5);     // Catch: Throwable -> L12
    L14:
        f3448d = Collections.unmodifiableSet(new HashSet(f3447c.keySet()));     // Catch: Throwable -> L12
        monitor-exit(C0875i.class);
        f3446b.add(r5);
        return;
    L12:
        th = move-exception;
        throw th;
    }
}
