package p176;

import java.io.File;
import java.util.ArrayList;
import p164.AbstractC2927;
import p405.AbstractC5184;
import ᵎˉ.ⁱˊ;

/* JADX INFO: renamed from: ˊᐧ.ʽﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C3058 implements Comparable {

    /* JADX INFO: renamed from: ᴵˊ */
    public static final String f10718 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final C3054 f10719;

    static {
        f10718 = File.separator;
    }

    public C3058(C3054 r1) {
        this.f10719 = r1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r2) {
        return this.f10719.m6470(((C3058) r2).f10719);
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C3058) == true) goto L5;
        return false;
    L5:
        if (AbstractC2927.m6273(((C3058) r2).f10719, this.f10719) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return this.f10719.hashCode();
    }

    public final File toFile() {
        return new File(this.f10719.m6459());
    }

    public final String toString() {
        return this.f10719.m6459();
    }

    /* JADX INFO: renamed from: ʽ */
    public final C3058 m6478() {
        C3054 r0 = AbstractC5184.f18703;
        C3054 r1 = this.f10719;
        if (AbstractC2927.m6273(r1, r0) == true) goto L52;
        C3054 r2 = AbstractC5184.f18706;
        if (AbstractC2927.m6273(r1, r2) == true) goto L54;
        C3054 r3 = AbstractC5184.f18705;
        if (AbstractC2927.m6273(r1, r3) == true) goto L55;
        C3054 r4 = AbstractC5184.f18704;
        int r5 = r1.mo6460();
        byte[] r6 = r4.f10709;
        if (r1.mo6466(r5 - r6.length, r4, r6.length) == true) goto L11;
    L19:
        r1.getClass();
        int r22 = r1.mo6458(r2.mo6467());
        if (r22 != (-1)) goto L24;
        r1.getClass();
        r22 = r1.mo6458(r3.mo6467());
    L24:
        if (r22 == 2) goto L26;
    L32:
        if (r22 == 1) goto L34;
    L36:
        if (r22 == (-1)) goto L38;
    L44:
        if (r22 == (-1)) goto L46;
        if (r22 != 0) goto L51;
        return new C3058(C3054.m6456(r1, 0, 1, 1));
    L51:
        return new C3058(C3054.m6456(r1, 0, r22, 1));
    L46:
        return new C3058(r0);
    L38:
        if (m6483() == null) goto L44;
        if (r1.mo6460() != 2) goto L43;
        return null;
    L43:
        return new C3058(C3054.m6456(r1, 0, 2, 1));
    L34:
        if (r1.mo6466(0, r3, r3.mo6460()) == false) goto L36;
        return null;
    L26:
        if (m6483() == null) goto L32;
        if (r1.mo6460() != 3) goto L31;
        return null;
    L31:
        return new C3058(C3054.m6456(r1, 0, 3, 1));
    L11:
        if (r1.mo6460() != 2) goto L14;
        return null;
    L14:
        if (r1.mo6466(r1.mo6460() - 3, r2, 1) == false) goto L17;
        return null;
    L17:
        if (r1.mo6466(r1.mo6460() - 3, r3, 1) == false) goto L19;
        return null;
    L55:
        return null;
    L54:
        return null;
    L52:
        return null;
    }

    /* JADX INFO: renamed from: ˈ */
    public final C3058 m6479(C3058 r12) {
        C3054 r0 = r12.f10719;
        int r1 = AbstractC5184.m10126(this);
        C3054 r2 = this.f10719;
        C3058 r3 = null;
        if (r1 != (-1)) goto L5;
        C3058 r6 = null;
    L6:
        int r13 = AbstractC5184.m10126(r12);
        if (r13 == (-1)) goto L11;
        r3 = new C3058(r12.f10719.mo6463(0, r13));
    L11:
        if (AbstractC2927.m6273(r6, r3) == false) goto L43;
        ArrayList r14 = m6482();
        ArrayList r62 = r12.m6482();
        int r7 = Math.min(r14.size(), r62.size());
        int r8 = 0;
    L13:
        if (r8 >= r7) goto L17;
        if (AbstractC2927.m6273(r14.get(r8), r62.get(r8)) == false) goto L17;
        r8 = r8 + 1;
    L17:
        if (r8 != r7) goto L23;
        if (r2.mo6460() != r0.mo6460()) goto L23;
        return ⁱˊ.ᵔᵢ(".", false);
    L23:
        if (r62.subList(r8, r62.size()).indexOf(AbstractC5184.f18704) != (-1)) goto L41;
        if (AbstractC2927.m6273(r0, AbstractC5184.f18703) == false) goto L27;
        return this;
    L27:
        C3082 r02 = new C3082();
        C3054 r122 = AbstractC5184.m10122(r12);
        if (r122 != null) goto L32;
        r122 = AbstractC5184.m10122(this);
        if (r122 != null) goto L32;
        r122 = AbstractC5184.m10127(f10718);
    L32:
        int r22 = r62.size();
        int r32 = r8;
    L33:
        if (r32 >= r22) goto L35;
        r02.m6549(AbstractC5184.f18704);
        r02.m6549(r122);
        r32 = r32 + 1;
        goto L33
    L35:
        int r23 = r14.size();
    L36:
        if (r8 >= r23) goto L39;
        r02.m6549((C3054) r14.get(r8));
        r02.m6549(r122);
        r8 = r8 + 1;
        goto L36
    L39:
        return AbstractC5184.m10123(r02, false);
    L41:
        throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + r12).toString());
    L43:
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + r12).toString());
    L5:
        r6 = new C3058(r2.mo6463(0, r1));
        goto L6
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final C3058 m6480(String r2) {
        C3082 r0 = new C3082();
        r0.m6538(r2);
        return AbstractC5184.m10125(this, AbstractC5184.m10123(r0, false), false);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final String m6481() {
        C3054 r0 = AbstractC5184.f18706;
        C3054 r1 = this.f10719;
        r1.getClass();
        int r02 = r1.mo6458(r0.mo6467());
        if (r02 != (-1)) goto L7;
        C3054 r03 = AbstractC5184.f18705;
        r1.getClass();
        r02 = r1.mo6458(r03.mo6467());
    L7:
        if (r02 == (-1)) goto L10;
        r1 = C3054.m6456(r1, r02 + 1, 0, 2);
    L15:
        return r1.m6459();
    L10:
        if (m6483() == null) goto L15;
        if (r1.mo6460() != 2) goto L15;
        r1 = C3054.f10707;
        goto L15
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final ArrayList m6482() {
        ArrayList r0 = new ArrayList();
        int r1 = AbstractC5184.m10126(this);
        C3054 r4 = this.f10719;
        if (r1 != (-1)) goto L6;
        r1 = 0;
    L10:
        int r2 = r4.mo6460();
        int r5 = r1;
    L11:
        if (r1 >= r2) goto L19;
        if (r4.mo6468(r1) != 47) goto L15;
    L16:
        r0.add(r4.mo6463(r5, r1));
        r5 = r1 + 1;
    L17:
        r1 = r1 + 1;
        goto L11
    L15:
        if (r4.mo6468(r1) != 92) goto L17;
    L19:
        if (r5 >= r4.mo6460()) goto L21;
        r0.add(r4.mo6463(r5, r4.mo6460()));
    L21:
        return r0;
    L6:
        if (r1 >= r4.mo6460()) goto L10;
        if (r4.mo6468(r1) != 92) goto L10;
        r1 = r1 + 1;
        goto L10
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final Character m6483() {
        C3054 r0 = AbstractC5184.f18706;
        C3054 r1 = this.f10719;
        if (C3054.m6457(r1, r0) == (-1)) goto L6;
        return null;
    L6:
        if (r1.mo6460() >= 2) goto L9;
        return null;
    L9:
        if (r1.mo6468(1) != 58) goto L27;
        char r02 = (char) r1.mo6468(0);
        if ('a' > r02) goto L17;
        if (r02 >= '{') goto L17;
    L21:
        return Character.valueOf(r02);
    L17:
        if ('A' <= r02) goto L19;
        return null;
    L19:
        if (r02 < '[') goto L21;
        return null;
    L27:
        return null;
    }
}
