package p005j$.time.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p005j$.time.ZoneId;
import p005j$.time.temporal.EnumC0843a;
import p005j$.time.temporal.InterfaceC0857o;
import p005j$.util.Objects;

/* JADX INFO: renamed from: j$.time.format.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C0824v {

    /* JADX INFO: renamed from: a */
    public final DateTimeFormatter f3308a;

    /* JADX INFO: renamed from: b */
    public boolean f3309b;

    /* JADX INFO: renamed from: c */
    public boolean f3310c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f3311d;

    /* JADX INFO: renamed from: e */
    public ArrayList f3312e;

    public C0824v(DateTimeFormatter r3) {
        this.f3309b = true;
        this.f3310c = true;
        ArrayList r0 = new ArrayList();
        this.f3311d = r0;
        this.f3312e = null;
        this.f3308a = r3;
        r0.add(new C0799D());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3078b(char r2, char r3) {
        if (r2 != r3) goto L4;
        return true;
    L4:
        if (Character.toUpperCase(r2) != Character.toUpperCase(r3)) goto L6;
        return true;
    L6:
        if (Character.toLowerCase(r2) == Character.toLowerCase(r3)) goto L13;
        return false;
    L13:
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3079a(char r2, char r3) {
        if (this.f3309b == false) goto L10;
        if (r2 != r3) goto L7;
        return true;
    L7:
        return false;
    L10:
        return m3078b(r2, r3);
    }

    /* JADX INFO: renamed from: c */
    public final C0799D m3080c() {
        return (C0799D) this.f3311d.get(r0.size() - 1);
    }

    /* JADX INFO: renamed from: d */
    public final Long m3081d(EnumC0843a r2) {
        return (Long) ((HashMap) m3080c().f3223a).get(r2);
    }

    /* JADX INFO: renamed from: e */
    public final void m3082e(ZoneId r2) {
        Objects.requireNonNull(r2, "zone");
        m3080c().f3224b = r2;
    }

    /* JADX INFO: renamed from: f */
    public final int m3083f(InterfaceC0857o r3, long r4, int r6, int r7) {
        Objects.requireNonNull(r3, "field");
        Map r0 = m3080c().f3223a;
        HashMap r02 = (HashMap) r0;
        Long r32 = (Long) r02.put(r3, Long.valueOf(r4));
        if (r32 != null) goto L5;
    L8:
        return r7;
    L5:
        if (r32.longValue() == r4) goto L8;
        return ~r6;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3084g(CharSequence r7, int r8, CharSequence r9, int r10, int r11) {
        if ((r8 + r11) <= r7.length()) goto L5;
    L27:
        return false;
    L5:
        if ((r10 + r11) > r9.length()) goto L27;
        if (this.f3309b == false) goto L15;
        int r0 = 0;
    L10:
        if (r0 >= r11) goto L25;
        if (r7.charAt(r8 + r0) != r9.charAt(r10 + r0)) goto L27;
        r0 = r0 + 1;
        goto L10
    L25:
        return true;
    L15:
        int r02 = 0;
    L16:
        if (r02 >= r11) goto L35;
        char r1 = r7.charAt(r8 + r02);
        char r3 = r9.charAt(r10 + r02);
        if (r1 == r3) goto L24;
        if (Character.toUpperCase(r1) == Character.toUpperCase(r3)) goto L24;
        if (Character.toLowerCase(r1) != Character.toLowerCase(r3)) goto L27;
    L24:
        r02 = r02 + 1;
        goto L16
    L35:
        return true;
    }

    public final String toString() {
        return m3080c().toString();
    }
}
