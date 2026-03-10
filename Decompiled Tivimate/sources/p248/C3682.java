package p248;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import java.util.ArrayList;
import p267.C3851;

/* JADX INFO: renamed from: ˑˏ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C3682 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final C3851 f13183;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C3851 f13184;

    public C3682() {
        this.f13184 = new C3851(0);
        this.f13183 = new C3851(0);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static C3682 m7747(ArrayList r13) {
        C3682 r0 = new C3682();
        int r1 = r13.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L9;
        Animator r4 = (Animator) r13.get(r3);
        if ((r4 instanceof ObjectAnimator) == false) goto L8;
        ObjectAnimator r42 = (ObjectAnimator) r4;
        r0.f13183.put(r42.getPropertyName(), r42.getValues());
        String r5 = r42.getPropertyName();
        long r7 = r42.getStartDelay();
        long r9 = r42.getDuration();
        TimeInterpolator r11 = r42.getInterpolator();
        C3681 r6 = new C3681();
        r6.f13179 = 0;
        r6.f13180 = 1;
        r6.f13182 = r7;
        r6.f13181 = r9;
        r6.f13178 = r11;
        r6.f13179 = r42.getRepeatCount();
        r6.f13180 = r42.getRepeatMode();
        r0.f13184.put(r5, r6);
        r3 = r3 + 1;
        goto L3
    L8:
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + r4);
    L9:
        return r0;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C3682 m7748(Context r3, int r4) {
        Animator r32 = AnimatorInflater.loadAnimator(r3, r4);     // Catch: Exception -> L7
        if ((r32 instanceof AnimatorSet) == true) goto L6;
        if (r32 == null) goto L12;
        ArrayList r1 = new ArrayList();     // Catch: Exception -> L7
        r1.add(r32);     // Catch: Exception -> L7
        return m7747(r1);
    L12:
        return null;
    L6:
        return m7747(((AnimatorSet) r32).getChildAnimations());
    L13:
        String r0 = "Can't load animation resource ID #0x" + Integer.toHexString(r4);
        return null;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof C3682) == true) goto L10;
        return false;
    L10:
        return this.f13184.equals(((C3682) r2).f13184);
    }

    public final int hashCode() {
        return this.f13184.hashCode();
    }

    public final String toString() {
        return "\n" + C3682.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f13184 + "}\n";
    }
}
