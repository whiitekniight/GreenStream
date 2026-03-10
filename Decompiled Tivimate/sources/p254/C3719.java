package p254;

import com.bumptech.glide.ˈ;
import java.util.HashMap;
import p048.C1754;

/* JADX INFO: renamed from: ˑﹳ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C3719 extends AbstractC3718 {

    /* JADX INFO: renamed from: ʽ */
    public final /* synthetic */ ˈ f13299;

    /* JADX INFO: renamed from: ˈ */
    public final /* synthetic */ C1754 f13300;

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ String f13301;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f13302;

    public /* synthetic */ C3719(C1754 r1, String r2, ˈ r3, int r4) {
        this.f13302 = r4;
        this.f13300 = r1;
        this.f13301 = r2;
        this.f13299 = r3;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public void m7774() {
        this.f13300.m4578(this.f13301);
    }

    @Override // p254.AbstractC3718
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo7464(Object r6) {
        switch(this.f13302) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        C1754 r0 = this.f13300;
        HashMap r1 = r0.f5876;
        String r2 = this.f13301;
        Integer r12 = (Integer) r1.get(r2);
        ˈ r3 = this.f13299;
        if (r12 == null) goto L13;
        r0.f5872.add(r2);
        r0.m4576(r12.intValue(), r3, r6);     // Catch: Exception -> L9
        return;
    L9:
        e = move-exception;
        r0.f5872.remove(r2);
        throw e;
    L13:
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + r3 + " and input " + r6 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    L14:
        C1754 r02 = this.f13300;
        HashMap r13 = r02.f5876;
        String r22 = this.f13301;
        Integer r14 = (Integer) r13.get(r22);
        ˈ r32 = this.f13299;
        if (r14 == null) goto L23;
        r02.f5872.add(r22);
        r02.m4576(r14.intValue(), r32, r6);     // Catch: Exception -> L19
        return;
    L19:
        e = move-exception;
        r02.f5872.remove(r22);
        throw e;
    L23:
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + r32 + " and input " + r6 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }
}
