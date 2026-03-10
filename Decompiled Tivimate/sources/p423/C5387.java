package p423;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p039.C1585;
import p082.C2112;
import p143.C2677;
import p157.C2888;
import p232.C3515;
import p241.C3608;
import p246.C3677;
import p264.C3794;
import p274.C3916;
import p353.C4748;
import ˊⁱ.ˑﹳ;

/* JADX INFO: renamed from: ﹳˎ.ᵔﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C5387 {

    /* JADX INFO: renamed from: ʼˎ */
    public final C3677 f19232;

    /* JADX INFO: renamed from: ʽ */
    public final C3608 f19233;

    /* JADX INFO: renamed from: ˆʾ */
    public final C4748 f19234;

    /* JADX INFO: renamed from: ˈ */
    public final long f19235;

    /* JADX INFO: renamed from: ˉʿ */
    public final C3794 f19236;

    /* JADX INFO: renamed from: ˉˆ */
    public final C2677 f19237;

    /* JADX INFO: renamed from: ˑﹳ */
    public C3916 f19238;

    /* JADX INFO: renamed from: ٴﹶ */
    public final C4748 f19239;

    /* JADX INFO: renamed from: ᵎﹶ */
    public C5377 f19240;

    /* JADX INFO: renamed from: ᵔʾ */
    public final ˑﹳ f19241;

    /* JADX INFO: renamed from: ᵔᵢ */
    public final C5370 f19242;

    /* JADX INFO: renamed from: ⁱˊ */
    public final C1585 f19243;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Context f19244;

    /* JADX INFO: renamed from: ﾞʻ */
    public final C5371 f19245;

    /* JADX INFO: renamed from: ﾞᴵ */
    public C3916 f19246;

    public C5387(C2888 r1, C5370 r2, C3794 r3, C1585 r4, C4748 r5, C4748 r6, C3677 r7, C5371 r8, ˑﹳ r9, C2677 r10) {
        this.f19243 = r4;
        r1.m6223();
        this.f19244 = r1.f10238;
        this.f19242 = r2;
        this.f19236 = r3;
        this.f19234 = r5;
        this.f19239 = r6;
        this.f19232 = r7;
        this.f19245 = r8;
        this.f19241 = r9;
        this.f19237 = r10;
        this.f19235 = System.currentTimeMillis();
        this.f19233 = new C3608(25);
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m10423() {
        C2677.m5906();
        C3916 r1 = this.f19238;     // Catch: Exception -> L7
        C3677 r2 = (C3677) r1.f14398;     // Catch: Exception -> L7
        String r12 = (String) r1.f14400;     // Catch: Exception -> L7
        r2.getClass();     // Catch: Exception -> L7
        if (new File((File) r2.f13155, r12).delete() == false) goto L6;
        return;
    L6:
        return;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m10424(C2112 r5) {
        Future<?> r52 = this.f19237.f9593.f9589.submit(new RunnableC5385(this, r5, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3) == true) goto L17;
    L17:
        r52.get(3, TimeUnit.SECONDS);     // Catch: TimeoutException -> L7 ExecutionException -> L9 InterruptedException -> L11
        return;
    L15:
        Thread.currentThread().interrupt();
        return;
    L20:
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [ﹳˎ.ˉˆ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: ﹳٴ */
    public final void m10425(C2112 r5) {
        C2677.m5906();
        C2677.m5906();
        this.f19238.m8048();
        if (Log.isLoggable("FirebaseCrashlytics", 2) == true) goto L29;
    L29:
        this.f19234.mo5548(new C5378(this));     // Catch: Throwable -> L10 Exception -> L12
        this.f19240.m10409();     // Catch: Throwable -> L10 Exception -> L12
        if (r5.m5121().f7435.f4365 == false) goto L20;
        if (this.f19240.m10405(r5) == false) goto L14;
    L14:
        this.f19240.m10407(((C3515) ((AtomicReference) r5.f7423).get()).f12502);     // Catch: Throwable -> L10 Exception -> L12
        m10423();
        return;
    L20:
        if (Log.isLoggable("FirebaseCrashlytics", 3) == true) goto L23;
    L23:
        throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");     // Catch: Throwable -> L10 Exception -> L12
    L10:
        th = move-exception;
        m10423();
        throw th;
    L25:
        m10423();
    }
}
