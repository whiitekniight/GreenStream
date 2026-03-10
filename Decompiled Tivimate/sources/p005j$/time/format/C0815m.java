package p005j$.time.format;

import java.text.ParsePosition;

/* JADX INFO: renamed from: j$.time.format.m */
/* JADX INFO: loaded from: classes2.dex */
public class C0815m {

    /* JADX INFO: renamed from: a */
    public String f3271a;

    /* JADX INFO: renamed from: b */
    public String f3272b;

    /* JADX INFO: renamed from: c */
    public final char f3273c;

    /* JADX INFO: renamed from: d */
    public C0815m f3274d;

    /* JADX INFO: renamed from: e */
    public C0815m f3275e;

    public C0815m(String r1, String r2, C0815m r3) {
        this.f3271a = r1;
        this.f3272b = r2;
        this.f3274d = r3;
        if (r1.isEmpty() == false) goto L6;
        this.f3273c = '\uffff';
        return;
    L6:
        this.f3273c = this.f3271a.charAt(0);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3056a(String r8, String r9) {
        int r1 = 0;
    L4:
        if (r1 >= r8.length()) goto L12;
        if (r1 >= this.f3271a.length()) goto L12;
        if (mo3053b(r8.charAt(r1), this.f3271a.charAt(r1)) == false) goto L12;
        r1 = r1 + 1;
    L12:
        if (r1 == this.f3271a.length()) goto L14;
        C0815m r2 = mo3054d(this.f3271a.substring(r1), this.f3272b, this.f3274d);
        this.f3271a = r8.substring(0, r1);
        this.f3274d = r2;
        if (r1 >= r8.length()) goto L30;
        this.f3274d.f3275e = mo3054d(r8.substring(r1), r9, null);
        this.f3272b = null;
        return true;
    L30:
        this.f3272b = r9;
        return true;
    L14:
        if (r1 >= r8.length()) goto L24;
        String r82 = r8.substring(r1);
        C0815m r12 = this.f3274d;
    L16:
        if (r12 == null) goto L22;
        if (mo3053b(r12.f3273c, r82.charAt(0)) == true) goto L20;
        r12 = r12.f3275e;
        goto L16
    L20:
        return r12.m3056a(r82, r9);
    L22:
        C0815m r83 = mo3054d(r82, r9, null);
        r83.f3275e = this.f3274d;
        this.f3274d = r83;
        return true;
    L24:
        this.f3272b = r9;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo3053b(char r1, char r2) {
        if (r1 != r2) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final String m3057c(CharSequence r5, ParsePosition r6) {
        int r0 = r6.getIndex();
        int r1 = r5.length();
        if (mo3055e(r5, r0, r1) == true) goto L6;
        return null;
    L6:
        int r2 = this.f3271a.length() + r0;
        C0815m r02 = this.f3274d;
        if (r02 == null) goto L16;
        if (r2 == r1) goto L16;
    L10:
        if (mo3053b(r02.f3273c, r5.charAt(r2)) == true) goto L11;
        r02 = r02.f3275e;
        if (r02 != null) goto L10;
    L11:
        r6.setIndex(r2);
        String r52 = r02.m3057c(r5, r6);
        if (r52 == null) goto L16;
        return r52;
    L16:
        r6.setIndex(r2);
        return this.f3272b;
    }

    /* JADX INFO: renamed from: d */
    public C0815m mo3054d(String r2, String r3, C0815m r4) {
        return new C0815m(r2, r3, r4);
    }

    /* JADX INFO: renamed from: e */
    public boolean mo3055e(CharSequence r5, int r6, int r7) {
        if ((r5 instanceof String) == true) goto L5;
        int r0 = this.f3271a.length();
        if (r0 <= (r7 - r6)) goto L9;
        return false;
    L9:
        int r72 = 0;
    L10:
        int r2 = r0 - 1;
        if (r0 <= 0) goto L16;
        int r3 = r72 + 1;
        int r02 = r6 + 1;
        if (mo3053b(this.f3271a.charAt(r72), r5.charAt(r6)) == false) goto L14;
        r6 = r02;
        r0 = r2;
        r72 = r3;
        goto L10
    L14:
        return false;
    L16:
        return true;
    L5:
        return ((String) r5).startsWith(this.f3271a, r6);
    }
}
