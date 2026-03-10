package p068;

import com.bumptech.glide.ˈ;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p047.AbstractC1703;
import p133.InterfaceFutureC2514;

/* JADX INFO: renamed from: ʽﹳ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1989 implements InterfaceFutureC2514 {

    /* JADX INFO: renamed from: ˈٴ */
    public static final boolean f6901 = false;

    /* JADX INFO: renamed from: ˊʻ */
    public static final ˈ f6902 = null;

    /* JADX INFO: renamed from: ٴᵢ */
    public static final Object f6903 = null;

    /* JADX INFO: renamed from: ᴵᵔ */
    public static final Logger f6904 = null;

    /* JADX INFO: renamed from: ʽʽ */
    public volatile C1995 f6905;

    /* JADX INFO: renamed from: ʾˋ */
    public volatile Object f6906;

    /* JADX INFO: renamed from: ᴵˊ */
    public volatile C1982 f6907;

    static {
        f6901 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        f6904 = Logger.getLogger(AbstractC1989.class.getName());
        ˈ r3 = new C1984(AtomicReferenceFieldUpdater.newUpdater(C1995.class, Thread.class, "\ufe73\u0674"), AtomicReferenceFieldUpdater.newUpdater(C1995.class, C1995.class, "\u2071\u02ca"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1989.class, C1995.class, "\u02bd\u02bd"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1989.class, C1982.class, "\u1d35\u02ca"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1989.class, Object.class, "\u02be\u02cb"));     // Catch: Throwable -> L5
        th = null;
    L7:
        f6902 = r3;
        if (th == null) goto L10;
        f6904.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
    L10:
        f6903 = new Object();
        return;
    L5:
        th = th;
        r3 = new C1987();
        goto L7
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static void m5024(AbstractC1989 r4) {
    L2:
        C1995 r0 = r4.f6905;
        if (f6902.ᵎﹶ(r4, r0, C1995.f6919) == false) goto L2;
    L4:
        C1982 r1 = null;
        if (r0 == null) goto L10;
        Thread r2 = r0.f6921;
        if (r2 == null) goto L9;
        r0.f6921 = null;
        LockSupport.unpark(r2);
    L9:
        r0 = r0.f6920;
        goto L4
    L10:
        r4.mo5030();
    L11:
        C1982 r02 = r4.f6907;
        if (f6902.ˑﹳ(r4, r02, C1982.f6884) == false) goto L11;
    L13:
        C1982 r42 = r1;
        r1 = r02;
        if (r1 == null) goto L16;
        r02 = r1.f6885;
        r1.f6885 = r42;
    L16:
        if (r42 == null) goto L18;
        C1982 r03 = r42.f6885;
        m5027(r42.f6887, r42.f6886);
        r42 = r03;
        goto L16
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public static Object m5025(Object r2) {
        if ((r2 instanceof C1993) == false) goto L5;
        Throwable r22 = ((C1993) r2).f6915;
        CancellationException r0 = new CancellationException("Task was cancelled.");
        r0.initCause(r22);
        throw r0;
    L5:
        if ((r2 instanceof C1992) == true) goto L11;
        if (r2 != f6903) goto L14;
        return null;
    L14:
        return r2;
    L11:
        throw new ExecutionException(((C1992) r2).f6912);
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public static Object m5026(Future r1) {
        boolean r0 = false;
    L12:
        Object r12 = r1.get();     // Catch: Throwable -> L7 InterruptedException -> L11
    L4:
        if (r0 == false) goto L6;
        Thread.currentThread().interrupt();
    L6:
        return r12;
    L11:
        r0 = true;
    L7:
        th = move-exception;
        if (r0 == false) goto L10;
        Thread.currentThread().interrupt();
    L10:
        throw th;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static void m5027(Runnable r4, Executor r5) {
        r5.execute(r4);     // Catch: RuntimeException -> L4
        return;
    L4:
        e = move-exception;
        f6904.log(Level.SEVERE, "RuntimeException while executing runnable " + r4 + " with executor " + r5, e);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r7) {
        Object r0 = this.f6906;
        if (r0 != null) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == true) goto L8;
    L17:
        return false;
    L8:
        if (f6901 == false) goto L10;
        C1993 r32 = new C1993(new CancellationException("Future.cancel() was called."), r7);
    L14:
        if (f6902.ﾞᴵ(this, r0, r32) == false) goto L17;
        m5024(this);
        return true;
    L10:
        if (r7 == false) goto L12;
        r32 = C1993.f6913;
        goto L14
    L12:
        r32 = C1993.f6914;
        goto L14
    L5:
        r3 = false;
        goto L6
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        C1995 r0 = C1995.f6919;
        if (Thread.interrupted() == true) goto L26;
        Object r1 = this.f6906;
        if (r1 != null) goto L7;
        C1995 r12 = this.f6905;
        if (r12 == r0) goto L24;
        C1995 r2 = new C1995();
    L11:
        ˈ r3 = f6902;
        r3.ʽʽ(r2, r12);
        if (r3.ᵎﹶ(this, r12, r2) == true) goto L13;
        r12 = this.f6905;
        if (r12 != r0) goto L11;
    L13:
        LockSupport.park(this);
        if (Thread.interrupted() == true) goto L19;
        Object r02 = this.f6906;
        if (r02 == null) goto L13;
        return m5025(r02);
    L19:
        m5029(r2);
        throw new InterruptedException();
    L24:
        return m5025(this.f6906);
    L7:
        return m5025(r1);
    L26:
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long r18, TimeUnit r20) {
        C1995 r4 = C1995.f6919;
        long r5 = r20.toNanos(r18);
        if (Thread.interrupted() == true) goto L71;
        Object r7 = this.f6906;
        if (r7 == null) goto L9;
        return m5025(r7);
    L9:
        if (r5 <= 0) goto L11;
        long r9 = System.nanoTime() + r5;
    L13:
        if (r5 < 1000) goto L37;
        C1995 r13 = this.f6905;
        if (r13 == r4) goto L35;
        C1995 r14 = new C1995();
    L17:
        ˈ r15 = f6902;
        r15.ʽʽ(r14, r13);
        if (r15.ᵎﹶ(this, r13, r14) == true) goto L19;
        r13 = this.f6905;
        if (r13 != r4) goto L17;
    L19:
        LockSupport.parkNanos(this, r5);
        if (Thread.interrupted() == true) goto L30;
        Object r42 = this.f6906;
        if (r42 != null) goto L24;
        long r43 = r9 - System.nanoTime();
        if (r43 < 1000) goto L27;
        r5 = r43;
        goto L19
    L27:
        m5029(r14);
        r5 = r43;
        goto L37
    L24:
        return m5025(r42);
    L30:
        m5029(r14);
        throw new InterruptedException();
    L35:
        return m5025(this.f6906);
    L37:
        if (r5 <= 0) goto L47;
        Object r44 = this.f6906;
        if (r44 != null) goto L41;
        if (Thread.interrupted() == true) goto L46;
        r5 = r9 - System.nanoTime();
        goto L37
    L46:
        throw new InterruptedException();
    L41:
        return m5025(r44);
    L47:
        String r45 = toString();
        String r92 = r20.toString();
        Locale r10 = Locale.ROOT;
        String r93 = r92.toLowerCase(r10);
        StringBuilder r1 = AbstractC1703.m4481(r18, "Waited ", " ");
        r1.append(r20.toString().toLowerCase(r10));
        String r12 = r1.toString();
        if ((r5 + 1000) >= 0) goto L65;
        String r16 = AbstractC1703.m4502(r12, " (plus ");
        long r52 = -r5;
        long r72 = r20.convert(r52, TimeUnit.NANOSECONDS);
        long r53 = r52 - r20.toNanos(r72);
        if (r72 != 0) goto L52;
    L55:
        boolean r3 = true;
    L56:
        if (r72 <= 0) goto L61;
        String r17 = r16 + r72 + " " + r93;
        if (r3 == false) goto L60;
        r17 = AbstractC1703.m4502(r17, ",");
    L60:
        r16 = AbstractC1703.m4502(r17, " ");
    L61:
        if (r3 == false) goto L63;
        r16 = r16 + r53 + " nanoseconds ";
    L63:
        r12 = AbstractC1703.m4502(r16, "delay)");
        goto L65
    L52:
        if (r53 > 1000) goto L55;
        r3 = false;
    L65:
        if (isDone() == false) goto L69;
        throw new TimeoutException(AbstractC1703.m4502(r12, " but future completed as timeout expired"));
    L69:
        throw new TimeoutException(AbstractC1703.m4506(r12, " for ", r45));
    L11:
        r9 = 0;
        goto L13
    L71:
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6906 instanceof C1993;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.f6906 == null) goto L5;
        return true;
    L5:
        return false;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(super.toString());
        r0.append("[status=");
        if ((this.f6906 instanceof C1993) == false) goto L6;
        r0.append("CANCELLED");
    L20:
        r0.append("]");
        return r0.toString();
    L6:
        if (isDone() == false) goto L22;
        m5028(r0);
        goto L20
    L22:
        String r1 = mo5012();     // Catch: RuntimeException -> L10
    L12:
        if (r1 == null) goto L17;
        if (r1.isEmpty() == true) goto L17;
        r0.append("PENDING, info=[");
        r0.append(r1);
        r0.append("]");
    L17:
        if (isDone() == false) goto L19;
        m5028(r0);
        goto L20
    L19:
        r0.append("PENDING");
    L10:
        e = move-exception;
        r1 = "Exception thrown from implementation: " + e.getClass();
        goto L12
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ʼˎ */
    public String mo5012() {
        if ((this instanceof ScheduledFuture) == true) goto L5;
        return null;
    L5:
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m5028(StringBuilder r4) {
        Object r1 = m5026(this);     // Catch: RuntimeException -> L9 ExecutionException -> L11 CancellationException -> L14
        r4.append("SUCCESS, result=[");     // Catch: RuntimeException -> L9 ExecutionException -> L11 CancellationException -> L14
        if (r1 != this) goto L6;
        String r12 = "this future";
    L7:
        r4.append(r12);     // Catch: RuntimeException -> L9 ExecutionException -> L11 CancellationException -> L14
        r4.append("]");     // Catch: RuntimeException -> L9 ExecutionException -> L11 CancellationException -> L14
        return;
    L6:
        r12 = String.valueOf(r1);     // Catch: RuntimeException -> L9 ExecutionException -> L11 CancellationException -> L14
    L14:
        r4.append("CANCELLED");
        return;
    L9:
        e = move-exception;
        r4.append("UNKNOWN, cause=[");
        r4.append(e.getClass());
        r4.append(" thrown from get()]");
        return;
    L11:
        e = move-exception;
        r4.append("FAILURE, cause=[");
        r4.append(e.getCause());
        r4.append("]");
    }

    /* JADX INFO: renamed from: ˆʾ */
    public final void m5029(C1995 r5) {
        r5.f6921 = null;
    L3:
        C1995 r52 = this.f6905;
        if (r52 == C1995.f6919) goto L19;
        C1995 r1 = null;
    L7:
        if (r52 == null) goto L28;
        C1995 r2 = r52.f6920;
        if (r52.f6921 == null) goto L11;
        r1 = r52;
    L18:
        r52 = r2;
        goto L7
    L11:
        if (r1 == null) goto L16;
        r1.f6920 = r2;
        if (r1.f6921 != null) goto L18;
    L16:
        if (f6902.ᵎﹶ(this, r52, r2) == true) goto L18;
    L28:
        return;
    }

    /* JADX INFO: renamed from: ˈ */
    public void mo5030() {
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public boolean m5031(Object r3) {
        if (r3 != null) goto L5;
        r3 = f6903;
    L5:
        if (f6902.ﾞᴵ(this, null, r3) == false) goto L8;
        m5024(this);
        return true;
    L8:
        return false;
    }

    @Override // p133.InterfaceFutureC2514
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5023(Runnable r5, Executor r6) {
        r6.getClass();
        C1982 r0 = this.f6907;
        C1982 r1 = C1982.f6884;
        if (r0 == r1) goto L10;
        C1982 r2 = new C1982(r5, r6);
    L5:
        r2.f6885 = r0;
        if (f6902.ˑﹳ(this, r0, r2) == true) goto L7;
        r0 = this.f6907;
        if (r0 != r1) goto L5;
    L7:
        return;
    L10:
        m5027(r5, r6);
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public boolean mo5032(Throwable r3) {
        r3.getClass();
        C1992 r0 = new C1992(r3);
        if (f6902.ﾞᴵ(this, null, r0) == false) goto L6;
        m5024(this);
        return true;
    L6:
        return false;
    }
}
